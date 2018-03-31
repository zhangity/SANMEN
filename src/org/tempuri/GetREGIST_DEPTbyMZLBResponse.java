/**
 * GetREGIST_DEPTbyMZLBResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetREGIST_DEPTbyMZLBResponse  implements java.io.Serializable {
    private org.tempuri.GetREGIST_DEPTbyMZLBResponseGetREGIST_DEPTbyMZLBResult getREGIST_DEPTbyMZLBResult;

    public GetREGIST_DEPTbyMZLBResponse() {
    }

    public GetREGIST_DEPTbyMZLBResponse(
           org.tempuri.GetREGIST_DEPTbyMZLBResponseGetREGIST_DEPTbyMZLBResult getREGIST_DEPTbyMZLBResult) {
           this.getREGIST_DEPTbyMZLBResult = getREGIST_DEPTbyMZLBResult;
    }


    /**
     * Gets the getREGIST_DEPTbyMZLBResult value for this GetREGIST_DEPTbyMZLBResponse.
     * 
     * @return getREGIST_DEPTbyMZLBResult
     */
    public org.tempuri.GetREGIST_DEPTbyMZLBResponseGetREGIST_DEPTbyMZLBResult getGetREGIST_DEPTbyMZLBResult() {
        return getREGIST_DEPTbyMZLBResult;
    }


    /**
     * Sets the getREGIST_DEPTbyMZLBResult value for this GetREGIST_DEPTbyMZLBResponse.
     * 
     * @param getREGIST_DEPTbyMZLBResult
     */
    public void setGetREGIST_DEPTbyMZLBResult(org.tempuri.GetREGIST_DEPTbyMZLBResponseGetREGIST_DEPTbyMZLBResult getREGIST_DEPTbyMZLBResult) {
        this.getREGIST_DEPTbyMZLBResult = getREGIST_DEPTbyMZLBResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetREGIST_DEPTbyMZLBResponse)) return false;
        GetREGIST_DEPTbyMZLBResponse other = (GetREGIST_DEPTbyMZLBResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getREGIST_DEPTbyMZLBResult==null && other.getGetREGIST_DEPTbyMZLBResult()==null) || 
             (this.getREGIST_DEPTbyMZLBResult!=null &&
              this.getREGIST_DEPTbyMZLBResult.equals(other.getGetREGIST_DEPTbyMZLBResult())));
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
        if (getGetREGIST_DEPTbyMZLBResult() != null) {
            _hashCode += getGetREGIST_DEPTbyMZLBResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetREGIST_DEPTbyMZLBResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetREGIST_DEPTbyMZLBResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getREGIST_DEPTbyMZLBResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetREGIST_DEPTbyMZLBResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetREGIST_DEPTbyMZLBResponse>GetREGIST_DEPTbyMZLBResult"));
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
