/**
 * GetPaymentZFFPLXGroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPaymentZFFPLXGroup  implements java.io.Serializable {
    private java.lang.String FPHM;

    private java.lang.String ZFPB;

    public GetPaymentZFFPLXGroup() {
    }

    public GetPaymentZFFPLXGroup(
           java.lang.String FPHM,
           java.lang.String ZFPB) {
           this.FPHM = FPHM;
           this.ZFPB = ZFPB;
    }


    /**
     * Gets the FPHM value for this GetPaymentZFFPLXGroup.
     * 
     * @return FPHM
     */
    public java.lang.String getFPHM() {
        return FPHM;
    }


    /**
     * Sets the FPHM value for this GetPaymentZFFPLXGroup.
     * 
     * @param FPHM
     */
    public void setFPHM(java.lang.String FPHM) {
        this.FPHM = FPHM;
    }


    /**
     * Gets the ZFPB value for this GetPaymentZFFPLXGroup.
     * 
     * @return ZFPB
     */
    public java.lang.String getZFPB() {
        return ZFPB;
    }


    /**
     * Sets the ZFPB value for this GetPaymentZFFPLXGroup.
     * 
     * @param ZFPB
     */
    public void setZFPB(java.lang.String ZFPB) {
        this.ZFPB = ZFPB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentZFFPLXGroup)) return false;
        GetPaymentZFFPLXGroup other = (GetPaymentZFFPLXGroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FPHM==null && other.getFPHM()==null) || 
             (this.FPHM!=null &&
              this.FPHM.equals(other.getFPHM()))) &&
            ((this.ZFPB==null && other.getZFPB()==null) || 
             (this.ZFPB!=null &&
              this.ZFPB.equals(other.getZFPB())));
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
        if (getFPHM() != null) {
            _hashCode += getFPHM().hashCode();
        }
        if (getZFPB() != null) {
            _hashCode += getZFPB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPaymentZFFPLXGroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPaymentZFFPLXGroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FPHM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FPHM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZFPB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZFPB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
