/**
 * GetBgImg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBgImg  implements java.io.Serializable {
    private java.lang.String jch;

    private java.lang.String xm;

    private java.lang.String sjjcrq;

    public GetBgImg() {
    }

    public GetBgImg(
           java.lang.String jch,
           java.lang.String xm,
           java.lang.String sjjcrq) {
           this.jch = jch;
           this.xm = xm;
           this.sjjcrq = sjjcrq;
    }


    /**
     * Gets the jch value for this GetBgImg.
     * 
     * @return jch
     */
    public java.lang.String getJch() {
        return jch;
    }


    /**
     * Sets the jch value for this GetBgImg.
     * 
     * @param jch
     */
    public void setJch(java.lang.String jch) {
        this.jch = jch;
    }


    /**
     * Gets the xm value for this GetBgImg.
     * 
     * @return xm
     */
    public java.lang.String getXm() {
        return xm;
    }


    /**
     * Sets the xm value for this GetBgImg.
     * 
     * @param xm
     */
    public void setXm(java.lang.String xm) {
        this.xm = xm;
    }


    /**
     * Gets the sjjcrq value for this GetBgImg.
     * 
     * @return sjjcrq
     */
    public java.lang.String getSjjcrq() {
        return sjjcrq;
    }


    /**
     * Sets the sjjcrq value for this GetBgImg.
     * 
     * @param sjjcrq
     */
    public void setSjjcrq(java.lang.String sjjcrq) {
        this.sjjcrq = sjjcrq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBgImg)) return false;
        GetBgImg other = (GetBgImg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jch==null && other.getJch()==null) || 
             (this.jch!=null &&
              this.jch.equals(other.getJch()))) &&
            ((this.xm==null && other.getXm()==null) || 
             (this.xm!=null &&
              this.xm.equals(other.getXm()))) &&
            ((this.sjjcrq==null && other.getSjjcrq()==null) || 
             (this.sjjcrq!=null &&
              this.sjjcrq.equals(other.getSjjcrq())));
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
        if (getJch() != null) {
            _hashCode += getJch().hashCode();
        }
        if (getXm() != null) {
            _hashCode += getXm().hashCode();
        }
        if (getSjjcrq() != null) {
            _hashCode += getSjjcrq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBgImg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBgImg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "xm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sjjcrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sjjcrq"));
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
