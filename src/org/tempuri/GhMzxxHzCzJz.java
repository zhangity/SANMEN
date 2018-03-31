/**
 * GhMzxxHzCzJz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GhMzxxHzCzJz  implements java.io.Serializable {
    private java.lang.String czghtype;

    private java.lang.String mzlb;

    public GhMzxxHzCzJz() {
    }

    public GhMzxxHzCzJz(
           java.lang.String czghtype,
           java.lang.String mzlb) {
           this.czghtype = czghtype;
           this.mzlb = mzlb;
    }


    /**
     * Gets the czghtype value for this GhMzxxHzCzJz.
     * 
     * @return czghtype
     */
    public java.lang.String getCzghtype() {
        return czghtype;
    }


    /**
     * Sets the czghtype value for this GhMzxxHzCzJz.
     * 
     * @param czghtype
     */
    public void setCzghtype(java.lang.String czghtype) {
        this.czghtype = czghtype;
    }


    /**
     * Gets the mzlb value for this GhMzxxHzCzJz.
     * 
     * @return mzlb
     */
    public java.lang.String getMzlb() {
        return mzlb;
    }


    /**
     * Sets the mzlb value for this GhMzxxHzCzJz.
     * 
     * @param mzlb
     */
    public void setMzlb(java.lang.String mzlb) {
        this.mzlb = mzlb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GhMzxxHzCzJz)) return false;
        GhMzxxHzCzJz other = (GhMzxxHzCzJz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.czghtype==null && other.getCzghtype()==null) || 
             (this.czghtype!=null &&
              this.czghtype.equals(other.getCzghtype()))) &&
            ((this.mzlb==null && other.getMzlb()==null) || 
             (this.mzlb!=null &&
              this.mzlb.equals(other.getMzlb())));
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
        if (getCzghtype() != null) {
            _hashCode += getCzghtype().hashCode();
        }
        if (getMzlb() != null) {
            _hashCode += getMzlb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GhMzxxHzCzJz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GhMzxxHzCzJz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czghtype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czghtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzlb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mzlb"));
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
