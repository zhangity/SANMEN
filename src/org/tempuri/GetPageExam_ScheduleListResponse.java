/**
 * GetPageExam_ScheduleListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPageExam_ScheduleListResponse  implements java.io.Serializable {
    private org.tempuri.PagedItemReturnObjectDataSet getPageExam_ScheduleListResult;

    public GetPageExam_ScheduleListResponse() {
    }

    public GetPageExam_ScheduleListResponse(
           org.tempuri.PagedItemReturnObjectDataSet getPageExam_ScheduleListResult) {
           this.getPageExam_ScheduleListResult = getPageExam_ScheduleListResult;
    }


    /**
     * Gets the getPageExam_ScheduleListResult value for this GetPageExam_ScheduleListResponse.
     * 
     * @return getPageExam_ScheduleListResult
     */
    public org.tempuri.PagedItemReturnObjectDataSet getGetPageExam_ScheduleListResult() {
        return getPageExam_ScheduleListResult;
    }


    /**
     * Sets the getPageExam_ScheduleListResult value for this GetPageExam_ScheduleListResponse.
     * 
     * @param getPageExam_ScheduleListResult
     */
    public void setGetPageExam_ScheduleListResult(org.tempuri.PagedItemReturnObjectDataSet getPageExam_ScheduleListResult) {
        this.getPageExam_ScheduleListResult = getPageExam_ScheduleListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPageExam_ScheduleListResponse)) return false;
        GetPageExam_ScheduleListResponse other = (GetPageExam_ScheduleListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPageExam_ScheduleListResult==null && other.getGetPageExam_ScheduleListResult()==null) || 
             (this.getPageExam_ScheduleListResult!=null &&
              this.getPageExam_ScheduleListResult.equals(other.getGetPageExam_ScheduleListResult())));
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
        if (getGetPageExam_ScheduleListResult() != null) {
            _hashCode += getGetPageExam_ScheduleListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPageExam_ScheduleListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPageExam_ScheduleListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPageExam_ScheduleListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPageExam_ScheduleListResult"));
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
