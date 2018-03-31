/**
 * ReportTheLoss.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReportTheLoss  implements java.io.Serializable {
    private java.lang.String CARD_NO;

    public ReportTheLoss() {
    }

    public ReportTheLoss(
           java.lang.String CARD_NO) {
           this.CARD_NO = CARD_NO;
    }


    /**
     * Gets the CARD_NO value for this ReportTheLoss.
     * 
     * @return CARD_NO
     */
    public java.lang.String getCARD_NO() {
        return CARD_NO;
    }


    /**
     * Sets the CARD_NO value for this ReportTheLoss.
     * 
     * @param CARD_NO
     */
    public void setCARD_NO(java.lang.String CARD_NO) {
        this.CARD_NO = CARD_NO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportTheLoss)) return false;
        ReportTheLoss other = (ReportTheLoss) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CARD_NO==null && other.getCARD_NO()==null) || 
             (this.CARD_NO!=null &&
              this.CARD_NO.equals(other.getCARD_NO())));
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
        if (getCARD_NO() != null) {
            _hashCode += getCARD_NO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportTheLoss.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReportTheLoss"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CARD_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CARD_NO"));
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
