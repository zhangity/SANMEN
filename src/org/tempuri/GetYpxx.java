/**
 * GetYpxx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYpxx  implements java.io.Serializable {
    private java.lang.String pym;

    private java.lang.String yfsb;

    private java.lang.String cflx;

    private int count;

    public GetYpxx() {
    }

    public GetYpxx(
           java.lang.String pym,
           java.lang.String yfsb,
           java.lang.String cflx,
           int count) {
           this.pym = pym;
           this.yfsb = yfsb;
           this.cflx = cflx;
           this.count = count;
    }


    /**
     * Gets the pym value for this GetYpxx.
     * 
     * @return pym
     */
    public java.lang.String getPym() {
        return pym;
    }


    /**
     * Sets the pym value for this GetYpxx.
     * 
     * @param pym
     */
    public void setPym(java.lang.String pym) {
        this.pym = pym;
    }


    /**
     * Gets the yfsb value for this GetYpxx.
     * 
     * @return yfsb
     */
    public java.lang.String getYfsb() {
        return yfsb;
    }


    /**
     * Sets the yfsb value for this GetYpxx.
     * 
     * @param yfsb
     */
    public void setYfsb(java.lang.String yfsb) {
        this.yfsb = yfsb;
    }


    /**
     * Gets the cflx value for this GetYpxx.
     * 
     * @return cflx
     */
    public java.lang.String getCflx() {
        return cflx;
    }


    /**
     * Sets the cflx value for this GetYpxx.
     * 
     * @param cflx
     */
    public void setCflx(java.lang.String cflx) {
        this.cflx = cflx;
    }


    /**
     * Gets the count value for this GetYpxx.
     * 
     * @return count
     */
    public int getCount() {
        return count;
    }


    /**
     * Sets the count value for this GetYpxx.
     * 
     * @param count
     */
    public void setCount(int count) {
        this.count = count;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYpxx)) return false;
        GetYpxx other = (GetYpxx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pym==null && other.getPym()==null) || 
             (this.pym!=null &&
              this.pym.equals(other.getPym()))) &&
            ((this.yfsb==null && other.getYfsb()==null) || 
             (this.yfsb!=null &&
              this.yfsb.equals(other.getYfsb()))) &&
            ((this.cflx==null && other.getCflx()==null) || 
             (this.cflx!=null &&
              this.cflx.equals(other.getCflx()))) &&
            this.count == other.getCount();
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
        if (getPym() != null) {
            _hashCode += getPym().hashCode();
        }
        if (getYfsb() != null) {
            _hashCode += getYfsb().hashCode();
        }
        if (getCflx() != null) {
            _hashCode += getCflx().hashCode();
        }
        _hashCode += getCount();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYpxx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYpxx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pym");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yfsb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "yfsb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cflx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "cflx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
