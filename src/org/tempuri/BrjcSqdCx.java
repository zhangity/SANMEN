/**
 * BrjcSqdCx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class BrjcSqdCx  implements java.io.Serializable {
    private java.lang.String sqdnum;

    private java.lang.String ysgh;

    private java.lang.String jcmc;

    public BrjcSqdCx() {
    }

    public BrjcSqdCx(
           java.lang.String sqdnum,
           java.lang.String ysgh,
           java.lang.String jcmc) {
           this.sqdnum = sqdnum;
           this.ysgh = ysgh;
           this.jcmc = jcmc;
    }


    /**
     * Gets the sqdnum value for this BrjcSqdCx.
     * 
     * @return sqdnum
     */
    public java.lang.String getSqdnum() {
        return sqdnum;
    }


    /**
     * Sets the sqdnum value for this BrjcSqdCx.
     * 
     * @param sqdnum
     */
    public void setSqdnum(java.lang.String sqdnum) {
        this.sqdnum = sqdnum;
    }


    /**
     * Gets the ysgh value for this BrjcSqdCx.
     * 
     * @return ysgh
     */
    public java.lang.String getYsgh() {
        return ysgh;
    }


    /**
     * Sets the ysgh value for this BrjcSqdCx.
     * 
     * @param ysgh
     */
    public void setYsgh(java.lang.String ysgh) {
        this.ysgh = ysgh;
    }


    /**
     * Gets the jcmc value for this BrjcSqdCx.
     * 
     * @return jcmc
     */
    public java.lang.String getJcmc() {
        return jcmc;
    }


    /**
     * Sets the jcmc value for this BrjcSqdCx.
     * 
     * @param jcmc
     */
    public void setJcmc(java.lang.String jcmc) {
        this.jcmc = jcmc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BrjcSqdCx)) return false;
        BrjcSqdCx other = (BrjcSqdCx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sqdnum==null && other.getSqdnum()==null) || 
             (this.sqdnum!=null &&
              this.sqdnum.equals(other.getSqdnum()))) &&
            ((this.ysgh==null && other.getYsgh()==null) || 
             (this.ysgh!=null &&
              this.ysgh.equals(other.getYsgh()))) &&
            ((this.jcmc==null && other.getJcmc()==null) || 
             (this.jcmc!=null &&
              this.jcmc.equals(other.getJcmc())));
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
        if (getSqdnum() != null) {
            _hashCode += getSqdnum().hashCode();
        }
        if (getYsgh() != null) {
            _hashCode += getYsgh().hashCode();
        }
        if (getJcmc() != null) {
            _hashCode += getJcmc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BrjcSqdCx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">BrjcSqdCx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqdnum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sqdnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ysgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ysgh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jcmc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jcmc"));
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
