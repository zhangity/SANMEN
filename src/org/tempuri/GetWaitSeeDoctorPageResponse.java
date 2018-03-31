/**
 * GetWaitSeeDoctorPageResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetWaitSeeDoctorPageResponse  implements java.io.Serializable {
    private org.tempuri.PagedItemReturnObjectDataSet getWaitSeeDoctorPageResult;

    public GetWaitSeeDoctorPageResponse() {
    }

    public GetWaitSeeDoctorPageResponse(
           org.tempuri.PagedItemReturnObjectDataSet getWaitSeeDoctorPageResult) {
           this.getWaitSeeDoctorPageResult = getWaitSeeDoctorPageResult;
    }


    /**
     * Gets the getWaitSeeDoctorPageResult value for this GetWaitSeeDoctorPageResponse.
     * 
     * @return getWaitSeeDoctorPageResult
     */
    public org.tempuri.PagedItemReturnObjectDataSet getGetWaitSeeDoctorPageResult() {
        return getWaitSeeDoctorPageResult;
    }


    /**
     * Sets the getWaitSeeDoctorPageResult value for this GetWaitSeeDoctorPageResponse.
     * 
     * @param getWaitSeeDoctorPageResult
     */
    public void setGetWaitSeeDoctorPageResult(org.tempuri.PagedItemReturnObjectDataSet getWaitSeeDoctorPageResult) {
        this.getWaitSeeDoctorPageResult = getWaitSeeDoctorPageResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWaitSeeDoctorPageResponse)) return false;
        GetWaitSeeDoctorPageResponse other = (GetWaitSeeDoctorPageResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWaitSeeDoctorPageResult==null && other.getGetWaitSeeDoctorPageResult()==null) || 
             (this.getWaitSeeDoctorPageResult!=null &&
              this.getWaitSeeDoctorPageResult.equals(other.getGetWaitSeeDoctorPageResult())));
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
        if (getGetWaitSeeDoctorPageResult() != null) {
            _hashCode += getGetWaitSeeDoctorPageResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWaitSeeDoctorPageResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetWaitSeeDoctorPageResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWaitSeeDoctorPageResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetWaitSeeDoctorPageResult"));
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
