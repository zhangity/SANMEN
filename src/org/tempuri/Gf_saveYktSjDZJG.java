/**
 * Gf_saveYktSjDZJG.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_saveYktSjDZJG  implements java.io.Serializable {
    private java.lang.String as_dzrq;

    private java.lang.String as_error;

    private java.lang.String as_tclx;

    public Gf_saveYktSjDZJG() {
    }

    public Gf_saveYktSjDZJG(
           java.lang.String as_dzrq,
           java.lang.String as_error,
           java.lang.String as_tclx) {
           this.as_dzrq = as_dzrq;
           this.as_error = as_error;
           this.as_tclx = as_tclx;
    }


    /**
     * Gets the as_dzrq value for this Gf_saveYktSjDZJG.
     * 
     * @return as_dzrq
     */
    public java.lang.String getAs_dzrq() {
        return as_dzrq;
    }


    /**
     * Sets the as_dzrq value for this Gf_saveYktSjDZJG.
     * 
     * @param as_dzrq
     */
    public void setAs_dzrq(java.lang.String as_dzrq) {
        this.as_dzrq = as_dzrq;
    }


    /**
     * Gets the as_error value for this Gf_saveYktSjDZJG.
     * 
     * @return as_error
     */
    public java.lang.String getAs_error() {
        return as_error;
    }


    /**
     * Sets the as_error value for this Gf_saveYktSjDZJG.
     * 
     * @param as_error
     */
    public void setAs_error(java.lang.String as_error) {
        this.as_error = as_error;
    }


    /**
     * Gets the as_tclx value for this Gf_saveYktSjDZJG.
     * 
     * @return as_tclx
     */
    public java.lang.String getAs_tclx() {
        return as_tclx;
    }


    /**
     * Sets the as_tclx value for this Gf_saveYktSjDZJG.
     * 
     * @param as_tclx
     */
    public void setAs_tclx(java.lang.String as_tclx) {
        this.as_tclx = as_tclx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_saveYktSjDZJG)) return false;
        Gf_saveYktSjDZJG other = (Gf_saveYktSjDZJG) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_dzrq==null && other.getAs_dzrq()==null) || 
             (this.as_dzrq!=null &&
              this.as_dzrq.equals(other.getAs_dzrq()))) &&
            ((this.as_error==null && other.getAs_error()==null) || 
             (this.as_error!=null &&
              this.as_error.equals(other.getAs_error()))) &&
            ((this.as_tclx==null && other.getAs_tclx()==null) || 
             (this.as_tclx!=null &&
              this.as_tclx.equals(other.getAs_tclx())));
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
        if (getAs_dzrq() != null) {
            _hashCode += getAs_dzrq().hashCode();
        }
        if (getAs_error() != null) {
            _hashCode += getAs_error().hashCode();
        }
        if (getAs_tclx() != null) {
            _hashCode += getAs_tclx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_saveYktSjDZJG.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_saveYktSjDZJG"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_dzrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_dzrq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_error");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_error"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_tclx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_tclx"));
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
