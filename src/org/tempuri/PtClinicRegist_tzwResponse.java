/**
 * PtClinicRegist_tzwResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PtClinicRegist_tzwResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm ptClinicRegist_tzwResult;

    public PtClinicRegist_tzwResponse() {
    }

    public PtClinicRegist_tzwResponse(
           org.tempuri.ReturnExComm ptClinicRegist_tzwResult) {
           this.ptClinicRegist_tzwResult = ptClinicRegist_tzwResult;
    }


    /**
     * Gets the ptClinicRegist_tzwResult value for this PtClinicRegist_tzwResponse.
     * 
     * @return ptClinicRegist_tzwResult
     */
    public org.tempuri.ReturnExComm getPtClinicRegist_tzwResult() {
        return ptClinicRegist_tzwResult;
    }


    /**
     * Sets the ptClinicRegist_tzwResult value for this PtClinicRegist_tzwResponse.
     * 
     * @param ptClinicRegist_tzwResult
     */
    public void setPtClinicRegist_tzwResult(org.tempuri.ReturnExComm ptClinicRegist_tzwResult) {
        this.ptClinicRegist_tzwResult = ptClinicRegist_tzwResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PtClinicRegist_tzwResponse)) return false;
        PtClinicRegist_tzwResponse other = (PtClinicRegist_tzwResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ptClinicRegist_tzwResult==null && other.getPtClinicRegist_tzwResult()==null) || 
             (this.ptClinicRegist_tzwResult!=null &&
              this.ptClinicRegist_tzwResult.equals(other.getPtClinicRegist_tzwResult())));
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
        if (getPtClinicRegist_tzwResult() != null) {
            _hashCode += getPtClinicRegist_tzwResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PtClinicRegist_tzwResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PtClinicRegist_tzwResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ptClinicRegist_tzwResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PtClinicRegist_tzwResult"));
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
