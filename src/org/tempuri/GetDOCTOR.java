/**
 * GetDOCTOR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDOCTOR  implements java.io.Serializable {
    private java.lang.String ysgh;

    private java.lang.String apsj;

    public GetDOCTOR() {
    }

    public GetDOCTOR(
           java.lang.String ysgh,
           java.lang.String apsj) {
           this.ysgh = ysgh;
           this.apsj = apsj;
    }


    /**
     * Gets the ysgh value for this GetDOCTOR.
     * 
     * @return ysgh
     */
    public java.lang.String getYsgh() {
        return ysgh;
    }


    /**
     * Sets the ysgh value for this GetDOCTOR.
     * 
     * @param ysgh
     */
    public void setYsgh(java.lang.String ysgh) {
        this.ysgh = ysgh;
    }


    /**
     * Gets the apsj value for this GetDOCTOR.
     * 
     * @return apsj
     */
    public java.lang.String getApsj() {
        return apsj;
    }


    /**
     * Sets the apsj value for this GetDOCTOR.
     * 
     * @param apsj
     */
    public void setApsj(java.lang.String apsj) {
        this.apsj = apsj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDOCTOR)) return false;
        GetDOCTOR other = (GetDOCTOR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ysgh==null && other.getYsgh()==null) || 
             (this.ysgh!=null &&
              this.ysgh.equals(other.getYsgh()))) &&
            ((this.apsj==null && other.getApsj()==null) || 
             (this.apsj!=null &&
              this.apsj.equals(other.getApsj())));
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
        if (getYsgh() != null) {
            _hashCode += getYsgh().hashCode();
        }
        if (getApsj() != null) {
            _hashCode += getApsj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDOCTOR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDOCTOR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ysgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ysgh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apsj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "apsj"));
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
