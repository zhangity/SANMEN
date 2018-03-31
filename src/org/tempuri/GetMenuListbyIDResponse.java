/**
 * GetMenuListbyIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMenuListbyIDResponse  implements java.io.Serializable {
    private org.tempuri.GetMenuListbyIDResponseGetMenuListbyIDResult getMenuListbyIDResult;

    public GetMenuListbyIDResponse() {
    }

    public GetMenuListbyIDResponse(
           org.tempuri.GetMenuListbyIDResponseGetMenuListbyIDResult getMenuListbyIDResult) {
           this.getMenuListbyIDResult = getMenuListbyIDResult;
    }


    /**
     * Gets the getMenuListbyIDResult value for this GetMenuListbyIDResponse.
     * 
     * @return getMenuListbyIDResult
     */
    public org.tempuri.GetMenuListbyIDResponseGetMenuListbyIDResult getGetMenuListbyIDResult() {
        return getMenuListbyIDResult;
    }


    /**
     * Sets the getMenuListbyIDResult value for this GetMenuListbyIDResponse.
     * 
     * @param getMenuListbyIDResult
     */
    public void setGetMenuListbyIDResult(org.tempuri.GetMenuListbyIDResponseGetMenuListbyIDResult getMenuListbyIDResult) {
        this.getMenuListbyIDResult = getMenuListbyIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMenuListbyIDResponse)) return false;
        GetMenuListbyIDResponse other = (GetMenuListbyIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMenuListbyIDResult==null && other.getGetMenuListbyIDResult()==null) || 
             (this.getMenuListbyIDResult!=null &&
              this.getMenuListbyIDResult.equals(other.getGetMenuListbyIDResult())));
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
        if (getGetMenuListbyIDResult() != null) {
            _hashCode += getGetMenuListbyIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMenuListbyIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMenuListbyIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMenuListbyIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMenuListbyIDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetMenuListbyIDResponse>GetMenuListbyIDResult"));
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
