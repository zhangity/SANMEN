/**
 * GetPageExam_EquipmentListResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPageExam_EquipmentListResponse  implements java.io.Serializable {
    private org.tempuri.PagedItemReturnObjectDataSet getPageExam_EquipmentListResult;

    public GetPageExam_EquipmentListResponse() {
    }

    public GetPageExam_EquipmentListResponse(
           org.tempuri.PagedItemReturnObjectDataSet getPageExam_EquipmentListResult) {
           this.getPageExam_EquipmentListResult = getPageExam_EquipmentListResult;
    }


    /**
     * Gets the getPageExam_EquipmentListResult value for this GetPageExam_EquipmentListResponse.
     * 
     * @return getPageExam_EquipmentListResult
     */
    public org.tempuri.PagedItemReturnObjectDataSet getGetPageExam_EquipmentListResult() {
        return getPageExam_EquipmentListResult;
    }


    /**
     * Sets the getPageExam_EquipmentListResult value for this GetPageExam_EquipmentListResponse.
     * 
     * @param getPageExam_EquipmentListResult
     */
    public void setGetPageExam_EquipmentListResult(org.tempuri.PagedItemReturnObjectDataSet getPageExam_EquipmentListResult) {
        this.getPageExam_EquipmentListResult = getPageExam_EquipmentListResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPageExam_EquipmentListResponse)) return false;
        GetPageExam_EquipmentListResponse other = (GetPageExam_EquipmentListResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPageExam_EquipmentListResult==null && other.getGetPageExam_EquipmentListResult()==null) || 
             (this.getPageExam_EquipmentListResult!=null &&
              this.getPageExam_EquipmentListResult.equals(other.getGetPageExam_EquipmentListResult())));
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
        if (getGetPageExam_EquipmentListResult() != null) {
            _hashCode += getGetPageExam_EquipmentListResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPageExam_EquipmentListResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPageExam_EquipmentListResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPageExam_EquipmentListResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPageExam_EquipmentListResult"));
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
