/**
 * GetZJJSofYSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZJJSofYSResponse  implements java.io.Serializable {
    private org.tempuri.GetZJJSofYSResponseGetZJJSofYSResult getZJJSofYSResult;

    public GetZJJSofYSResponse() {
    }

    public GetZJJSofYSResponse(
           org.tempuri.GetZJJSofYSResponseGetZJJSofYSResult getZJJSofYSResult) {
           this.getZJJSofYSResult = getZJJSofYSResult;
    }


    /**
     * Gets the getZJJSofYSResult value for this GetZJJSofYSResponse.
     * 
     * @return getZJJSofYSResult
     */
    public org.tempuri.GetZJJSofYSResponseGetZJJSofYSResult getGetZJJSofYSResult() {
        return getZJJSofYSResult;
    }


    /**
     * Sets the getZJJSofYSResult value for this GetZJJSofYSResponse.
     * 
     * @param getZJJSofYSResult
     */
    public void setGetZJJSofYSResult(org.tempuri.GetZJJSofYSResponseGetZJJSofYSResult getZJJSofYSResult) {
        this.getZJJSofYSResult = getZJJSofYSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZJJSofYSResponse)) return false;
        GetZJJSofYSResponse other = (GetZJJSofYSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZJJSofYSResult==null && other.getGetZJJSofYSResult()==null) || 
             (this.getZJJSofYSResult!=null &&
              this.getZJJSofYSResult.equals(other.getGetZJJSofYSResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetZJJSofYSResult() != null) {
            _hashCode += getGetZJJSofYSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZJJSofYSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZJJSofYSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZJJSofYSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZJJSofYSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetZJJSofYSResponse>GetZJJSofYSResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
