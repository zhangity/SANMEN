package com.longj.products.ea.standard.axis;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.axis.message.MessageElement;
import org.apache.commons.collections.CollectionUtils;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class ServiceUtils {

	public static ServiceProxy getProxy() {
		return ServiceProxy.getInstance();
	}

	/**
	 * @param elements
	 * @param keyMapping
	 * @return
	 * @throws JDOMException
	 * @throws IOException
	 */
	public static JSONArray messageElement2JSONArray(MessageElement[] elements, Map<String, String> keyMapping) throws JDOMException, IOException {
		JSONArray rows = new JSONArray();
		if (elements != null && elements.length > 1) {
			List flightBody = elements[1].getChildren();
			if (flightBody == null || flightBody.size() <= 0) {
				return rows;
			}
			String bodyMessage = flightBody.get(0).toString();
			// 转换消息内容为json格式
			rows = parseQueryAll(bodyMessage, keyMapping);
		}
		return rows;
	}

	/**
	 * @param bodyMessage
	 * @param keyMapping
	 * @return
	 * @throws JDOMException
	 * @throws IOException
	 */
	private static JSONArray parseQueryAll(String bodyMessage, Map<String, String> keyMapping) throws JDOMException, IOException {
		JSONArray rows = new JSONArray();
		// 创建字节流信息
		InputStream file = new ByteArrayInputStream(bodyMessage.getBytes());
		// 读取xml的信息
		SAXBuilder sb = new SAXBuilder();
		Document doc = sb.build(file);
		Element root = doc.getRootElement(); // 得到根元素
		List flightListElement = root.getChildren();
		Element flightElement = null;
		JSONObject flight = null;
		StringBuffer buffer = new StringBuffer();
		if (CollectionUtils.isNotEmpty(flightListElement)) {
			for (int i = 0; i < flightListElement.size(); i++) {
				flight = new JSONObject();
				flightElement = (Element) flightListElement.get(i);
				/*
				 * buffer.append("{enCityName=");
				 * buffer.append(flightElement.getChild
				 * ("enCityName").getText()); buffer.append(",cnCityName=");
				 * buffer
				 * .append(flightElement.getChild("cnCityName").getText());
				 * buffer.append(",Abbreviation=");
				 * buffer.append(flightElement.getChild
				 * ("Abbreviation").getText()); buffer.append("}"); if (i ==
				 * flightListElement.size() - 1) { buffer.append(","); }
				 */
				List fieldList = flightElement.getChildren();
				if (fieldList != null && fieldList.size() > 0) {
					for (int j = 0; j < fieldList.size(); j++) {
						Element flightElement2 = (Element) fieldList.get(j);
						String name = flightElement2.getName();
						if (keyMapping != null && keyMapping.size() > 0) {
							if (keyMapping.containsKey(name)) {
								flight.put(keyMapping.get(name), flightElement2.getText());
							}
						} else {
							flight.put(name, flightElement2.getText());
						}

					}
				}
				rows.add(flight);
			}
		}
		return rows;
	}
}
