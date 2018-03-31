/**
 * GetCLINIC_SCHEDULE_TIMEListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCLINIC_SCHEDULE_TIMEListResponse  implements java.io.Serializable {
    private org.tempuri.PagedItemReturnObjectDataSet getCLINIC_SCHEDULE_TIMEListResult;

    public GetCLINIC_SCHEDULE_TIMEListResponse() {
    }

    public GetCLINIC_SCHEDULE_TIMEListResponse(
           org.tempuri.PagedItemReturnObjectDataSet getCLINIC_SCHEDULE_TIMEListResult) {
           this.getCLINIC_SCHEDULE_TIMEListResult = getCLINIC_SCHEDULE_TIMEListResult;
    }


    /**
     * Gets the getCLINIC_SCHEDULE_TIMEListResult value for this GetCLINIC_SCHEDULE_TIMEListResponse.
     * 
     * @return getCLINIC_SCHEDULE_TIMEListResult
     */
    public org.tempuri.PagedItemReturnObjectDataSet getGetCLINIC_SCHEDULE_TIMEListResult() {
        return getCLINIC_SCHEDULE_TIMEListResult;
    }


    /**
     * Sets the getCLINIC_SCHEDULE_TIMEListResult value for this GetCLINIC_SCHEDULE_TIMEListResponse.
     * 
     * @param getCLINIC_SCHEDULE_TIMEListResult
     */
    public void setGetCLINIC_SCHEDULE_TIMEListResult(org.tempuri.PagedItemReturnObjectDataSet getCLINIC_SCHEDULE_TIMEListResult) {
        this.getCLINIC_SCHEDULE_TIMEListResult = getCLINIC_SCHEDULE_TIMEListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCLINIC_SCHEDULE_TIMEListResponse)) return false;
        GetCLINIC_SCHEDULE_TIMEListResponse other = (GetCLINIC_SCHEDULE_TIMEListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCLINIC_SCHEDULE_TIMEListResult==null && other.getGetCLINIC_SCHEDULE_TIMEListResult()==null) || 
             (this.getCLINIC_SCHEDULE_TIMEListResult!=null &&
              this.getCLINIC_SCHEDULE_TIMEListResult.equals(other.getGetCLINIC_SCHEDULE_TIMEListResult())));
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
        if (getGetCLINIC_SCHEDULE_TIMEListResult() != null) {
            _hashCode += getGetCLINIC_SCHEDULE_TIMEListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCLINIC_SCHEDULE_TIMEListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCLINIC_SCHEDULE_TIMEListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCLINIC_SCHEDULE_TIMEListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCLINIC_SCHEDULE_TIMEListResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PagedItemReturnObjectDataSet"));
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
