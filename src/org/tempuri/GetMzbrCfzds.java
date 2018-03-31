/**
 * GetMzbrCfzds.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrCfzds  implements java.io.Serializable {
    private java.lang.String jzxh;

    private java.lang.String brid;

    private java.lang.String cfsb;

    public GetMzbrCfzds() {
    }

    public GetMzbrCfzds(
           java.lang.String jzxh,
           java.lang.String brid,
           java.lang.String cfsb) {
           this.jzxh = jzxh;
           this.brid = brid;
           this.cfsb = cfsb;
    }


    /**
     * Gets the jzxh value for this GetMzbrCfzds.
     * 
     * @return jzxh
     */
    public java.lang.String getJzxh() {
        return jzxh;
    }


    /**
     * Sets the jzxh value for this GetMzbrCfzds.
     * 
     * @param jzxh
     */
    public void setJzxh(java.lang.String jzxh) {
        this.jzxh = jzxh;
    }


    /**
     * Gets the brid value for this GetMzbrCfzds.
     * 
     * @return brid
     */
    public java.lang.String getBrid() {
        return brid;
    }


    /**
     * Sets the brid value for this GetMzbrCfzds.
     * 
     * @param brid
     */
    public void setBrid(java.lang.String brid) {
        this.brid = brid;
    }


    /**
     * Gets the cfsb value for this GetMzbrCfzds.
     * 
     * @return cfsb
     */
    public java.lang.String getCfsb() {
        return cfsb;
    }


    /**
     * Sets the cfsb value for this GetMzbrCfzds.
     * 
     * @param cfsb
     */
    public void setCfsb(java.lang.String cfsb) {
        this.cfsb = cfsb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrCfzds)) return false;
        GetMzbrCfzds other = (GetMzbrCfzds) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jzxh==null && other.getJzxh()==null) || 
             (this.jzxh!=null &&
              this.jzxh.equals(other.getJzxh()))) &&
            ((this.brid==null && other.getBrid()==null) || 
             (this.brid!=null &&
              this.brid.equals(other.getBrid()))) &&
            ((this.cfsb==null && other.getCfsb()==null) || 
             (this.cfsb!=null &&
              this.cfsb.equals(other.getCfsb())));
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
        if (getJzxh() != null) {
            _hashCode += getJzxh().hashCode();
        }
        if (getBrid() != null) {
            _hashCode += getBrid().hashCode();
        }
        if (getCfsb() != null) {
            _hashCode += getCfsb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrCfzds.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrCfzds"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jzxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jzxh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "brid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cfsb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "cfsb"));
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
