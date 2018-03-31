/**
 * Of_regoperator_logout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Of_regoperator_logout  implements java.io.Serializable {
    private java.lang.String as_jydm;

    private java.lang.String as_qdlx;

    private java.lang.String as_dzlsh;

    public Of_regoperator_logout() {
    }

    public Of_regoperator_logout(
           java.lang.String as_jydm,
           java.lang.String as_qdlx,
           java.lang.String as_dzlsh) {
           this.as_jydm = as_jydm;
           this.as_qdlx = as_qdlx;
           this.as_dzlsh = as_dzlsh;
    }


    /**
     * Gets the as_jydm value for this Of_regoperator_logout.
     * 
     * @return as_jydm
     */
    public java.lang.String getAs_jydm() {
        return as_jydm;
    }


    /**
     * Sets the as_jydm value for this Of_regoperator_logout.
     * 
     * @param as_jydm
     */
    public void setAs_jydm(java.lang.String as_jydm) {
        this.as_jydm = as_jydm;
    }


    /**
     * Gets the as_qdlx value for this Of_regoperator_logout.
     * 
     * @return as_qdlx
     */
    public java.lang.String getAs_qdlx() {
        return as_qdlx;
    }


    /**
     * Sets the as_qdlx value for this Of_regoperator_logout.
     * 
     * @param as_qdlx
     */
    public void setAs_qdlx(java.lang.String as_qdlx) {
        this.as_qdlx = as_qdlx;
    }


    /**
     * Gets the as_dzlsh value for this Of_regoperator_logout.
     * 
     * @return as_dzlsh
     */
    public java.lang.String getAs_dzlsh() {
        return as_dzlsh;
    }


    /**
     * Sets the as_dzlsh value for this Of_regoperator_logout.
     * 
     * @param as_dzlsh
     */
    public void setAs_dzlsh(java.lang.String as_dzlsh) {
        this.as_dzlsh = as_dzlsh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Of_regoperator_logout)) return false;
        Of_regoperator_logout other = (Of_regoperator_logout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_jydm==null && other.getAs_jydm()==null) || 
             (this.as_jydm!=null &&
              this.as_jydm.equals(other.getAs_jydm()))) &&
            ((this.as_qdlx==null && other.getAs_qdlx()==null) || 
             (this.as_qdlx!=null &&
              this.as_qdlx.equals(other.getAs_qdlx()))) &&
            ((this.as_dzlsh==null && other.getAs_dzlsh()==null) || 
             (this.as_dzlsh!=null &&
              this.as_dzlsh.equals(other.getAs_dzlsh())));
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
        if (getAs_jydm() != null) {
            _hashCode += getAs_jydm().hashCode();
        }
        if (getAs_qdlx() != null) {
            _hashCode += getAs_qdlx().hashCode();
        }
        if (getAs_dzlsh() != null) {
            _hashCode += getAs_dzlsh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Of_regoperator_logout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">of_regoperator_logout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_jydm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_jydm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_qdlx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_qdlx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_dzlsh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_dzlsh"));
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
