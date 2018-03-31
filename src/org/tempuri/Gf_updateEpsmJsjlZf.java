/**
 * Gf_updateEpsmJsjlZf.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateEpsmJsjlZf  implements java.io.Serializable {
    private java.lang.String as_zflsh;

    private java.lang.String as_zfrq;

    private java.lang.String as_zxlsh;

    public Gf_updateEpsmJsjlZf() {
    }

    public Gf_updateEpsmJsjlZf(
           java.lang.String as_zflsh,
           java.lang.String as_zfrq,
           java.lang.String as_zxlsh) {
           this.as_zflsh = as_zflsh;
           this.as_zfrq = as_zfrq;
           this.as_zxlsh = as_zxlsh;
    }


    /**
     * Gets the as_zflsh value for this Gf_updateEpsmJsjlZf.
     * 
     * @return as_zflsh
     */
    public java.lang.String getAs_zflsh() {
        return as_zflsh;
    }


    /**
     * Sets the as_zflsh value for this Gf_updateEpsmJsjlZf.
     * 
     * @param as_zflsh
     */
    public void setAs_zflsh(java.lang.String as_zflsh) {
        this.as_zflsh = as_zflsh;
    }


    /**
     * Gets the as_zfrq value for this Gf_updateEpsmJsjlZf.
     * 
     * @return as_zfrq
     */
    public java.lang.String getAs_zfrq() {
        return as_zfrq;
    }


    /**
     * Sets the as_zfrq value for this Gf_updateEpsmJsjlZf.
     * 
     * @param as_zfrq
     */
    public void setAs_zfrq(java.lang.String as_zfrq) {
        this.as_zfrq = as_zfrq;
    }


    /**
     * Gets the as_zxlsh value for this Gf_updateEpsmJsjlZf.
     * 
     * @return as_zxlsh
     */
    public java.lang.String getAs_zxlsh() {
        return as_zxlsh;
    }


    /**
     * Sets the as_zxlsh value for this Gf_updateEpsmJsjlZf.
     * 
     * @param as_zxlsh
     */
    public void setAs_zxlsh(java.lang.String as_zxlsh) {
        this.as_zxlsh = as_zxlsh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateEpsmJsjlZf)) return false;
        Gf_updateEpsmJsjlZf other = (Gf_updateEpsmJsjlZf) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_zflsh==null && other.getAs_zflsh()==null) || 
             (this.as_zflsh!=null &&
              this.as_zflsh.equals(other.getAs_zflsh()))) &&
            ((this.as_zfrq==null && other.getAs_zfrq()==null) || 
             (this.as_zfrq!=null &&
              this.as_zfrq.equals(other.getAs_zfrq()))) &&
            ((this.as_zxlsh==null && other.getAs_zxlsh()==null) || 
             (this.as_zxlsh!=null &&
              this.as_zxlsh.equals(other.getAs_zxlsh())));
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
        if (getAs_zflsh() != null) {
            _hashCode += getAs_zflsh().hashCode();
        }
        if (getAs_zfrq() != null) {
            _hashCode += getAs_zfrq().hashCode();
        }
        if (getAs_zxlsh() != null) {
            _hashCode += getAs_zxlsh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateEpsmJsjlZf.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateEpsmJsjlZf"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_zflsh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_zflsh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_zfrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_zfrq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_zxlsh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_zxlsh"));
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
