/**
 * InsertYzRegistOfClinicResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertYzRegistOfClinicResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertYzRegistOfClinicResult;

    public InsertYzRegistOfClinicResponse() {
    }

    public InsertYzRegistOfClinicResponse(
           org.tempuri.ReturnExComm insertYzRegistOfClinicResult) {
           this.insertYzRegistOfClinicResult = insertYzRegistOfClinicResult;
    }


    /**
     * Gets the insertYzRegistOfClinicResult value for this InsertYzRegistOfClinicResponse.
     * 
     * @return insertYzRegistOfClinicResult
     */
    public org.tempuri.ReturnExComm getInsertYzRegistOfClinicResult() {
        return insertYzRegistOfClinicResult;
    }


    /**
     * Sets the insertYzRegistOfClinicResult value for this InsertYzRegistOfClinicResponse.
     * 
     * @param insertYzRegistOfClinicResult
     */
    public void setInsertYzRegistOfClinicResult(org.tempuri.ReturnExComm insertYzRegistOfClinicResult) {
        this.insertYzRegistOfClinicResult = insertYzRegistOfClinicResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertYzRegistOfClinicResponse)) return false;
        InsertYzRegistOfClinicResponse other = (InsertYzRegistOfClinicResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertYzRegistOfClinicResult==null && other.getInsertYzRegistOfClinicResult()==null) || 
             (this.insertYzRegistOfClinicResult!=null &&
              this.insertYzRegistOfClinicResult.equals(other.getInsertYzRegistOfClinicResult())));
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
        if (getInsertYzRegistOfClinicResult() != null) {
            _hashCode += getInsertYzRegistOfClinicResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertYzRegistOfClinicResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertYzRegistOfClinicResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertYzRegistOfClinicResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertYzRegistOfClinicResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
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
