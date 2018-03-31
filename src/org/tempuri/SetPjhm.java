/**
 * SetPjhm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SetPjhm  implements java.io.Serializable {
    private java.lang.String czgh;

    private java.lang.String pjlx;

    private java.lang.String pjhm;

    public SetPjhm() {
    }

    public SetPjhm(
           java.lang.String czgh,
           java.lang.String pjlx,
           java.lang.String pjhm) {
           this.czgh = czgh;
           this.pjlx = pjlx;
           this.pjhm = pjhm;
    }


    /**
     * Gets the czgh value for this SetPjhm.
     * 
     * @return czgh
     */
    public java.lang.String getCzgh() {
        return czgh;
    }


    /**
     * Sets the czgh value for this SetPjhm.
     * 
     * @param czgh
     */
    public void setCzgh(java.lang.String czgh) {
        this.czgh = czgh;
    }


    /**
     * Gets the pjlx value for this SetPjhm.
     * 
     * @return pjlx
     */
    public java.lang.String getPjlx() {
        return pjlx;
    }


    /**
     * Sets the pjlx value for this SetPjhm.
     * 
     * @param pjlx
     */
    public void setPjlx(java.lang.String pjlx) {
        this.pjlx = pjlx;
    }


    /**
     * Gets the pjhm value for this SetPjhm.
     * 
     * @return pjhm
     */
    public java.lang.String getPjhm() {
        return pjhm;
    }


    /**
     * Sets the pjhm value for this SetPjhm.
     * 
     * @param pjhm
     */
    public void setPjhm(java.lang.String pjhm) {
        this.pjhm = pjhm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetPjhm)) return false;
        SetPjhm other = (SetPjhm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.czgh==null && other.getCzgh()==null) || 
             (this.czgh!=null &&
              this.czgh.equals(other.getCzgh()))) &&
            ((this.pjlx==null && other.getPjlx()==null) || 
             (this.pjlx!=null &&
              this.pjlx.equals(other.getPjlx()))) &&
            ((this.pjhm==null && other.getPjhm()==null) || 
             (this.pjhm!=null &&
              this.pjhm.equals(other.getPjhm())));
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
        if (getCzgh() != null) {
            _hashCode += getCzgh().hashCode();
        }
        if (getPjlx() != null) {
            _hashCode += getPjlx().hashCode();
        }
        if (getPjhm() != null) {
            _hashCode += getPjhm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetPjhm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SetPjhm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czgh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pjlx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pjlx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pjhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pjhm"));
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
