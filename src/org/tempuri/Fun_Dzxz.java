/**
 * Fun_Dzxz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Fun_Dzxz  implements java.io.Serializable {
    private java.lang.String as_dzrq;

    private java.lang.String as_mxlb;

    private java.lang.String as_qslsh;

    public Fun_Dzxz() {
    }

    public Fun_Dzxz(
           java.lang.String as_dzrq,
           java.lang.String as_mxlb,
           java.lang.String as_qslsh) {
           this.as_dzrq = as_dzrq;
           this.as_mxlb = as_mxlb;
           this.as_qslsh = as_qslsh;
    }


    /**
     * Gets the as_dzrq value for this Fun_Dzxz.
     * 
     * @return as_dzrq
     */
    public java.lang.String getAs_dzrq() {
        return as_dzrq;
    }


    /**
     * Sets the as_dzrq value for this Fun_Dzxz.
     * 
     * @param as_dzrq
     */
    public void setAs_dzrq(java.lang.String as_dzrq) {
        this.as_dzrq = as_dzrq;
    }


    /**
     * Gets the as_mxlb value for this Fun_Dzxz.
     * 
     * @return as_mxlb
     */
    public java.lang.String getAs_mxlb() {
        return as_mxlb;
    }


    /**
     * Sets the as_mxlb value for this Fun_Dzxz.
     * 
     * @param as_mxlb
     */
    public void setAs_mxlb(java.lang.String as_mxlb) {
        this.as_mxlb = as_mxlb;
    }


    /**
     * Gets the as_qslsh value for this Fun_Dzxz.
     * 
     * @return as_qslsh
     */
    public java.lang.String getAs_qslsh() {
        return as_qslsh;
    }


    /**
     * Sets the as_qslsh value for this Fun_Dzxz.
     * 
     * @param as_qslsh
     */
    public void setAs_qslsh(java.lang.String as_qslsh) {
        this.as_qslsh = as_qslsh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Fun_Dzxz)) return false;
        Fun_Dzxz other = (Fun_Dzxz) obj;
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
            ((this.as_mxlb==null && other.getAs_mxlb()==null) || 
             (this.as_mxlb!=null &&
              this.as_mxlb.equals(other.getAs_mxlb()))) &&
            ((this.as_qslsh==null && other.getAs_qslsh()==null) || 
             (this.as_qslsh!=null &&
              this.as_qslsh.equals(other.getAs_qslsh())));
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
        if (getAs_mxlb() != null) {
            _hashCode += getAs_mxlb().hashCode();
        }
        if (getAs_qslsh() != null) {
            _hashCode += getAs_qslsh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Fun_Dzxz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Fun_Dzxz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_dzrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_dzrq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_mxlb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_mxlb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_qslsh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_qslsh"));
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
