/**
 * GetBqWczJywjzxm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBqWczJywjzxm  implements java.io.Serializable {
    private java.lang.String ksdm;

    private java.lang.String kssj;

    private java.lang.String jssj;

    public GetBqWczJywjzxm() {
    }

    public GetBqWczJywjzxm(
           java.lang.String ksdm,
           java.lang.String kssj,
           java.lang.String jssj) {
           this.ksdm = ksdm;
           this.kssj = kssj;
           this.jssj = jssj;
    }


    /**
     * Gets the ksdm value for this GetBqWczJywjzxm.
     * 
     * @return ksdm
     */
    public java.lang.String getKsdm() {
        return ksdm;
    }


    /**
     * Sets the ksdm value for this GetBqWczJywjzxm.
     * 
     * @param ksdm
     */
    public void setKsdm(java.lang.String ksdm) {
        this.ksdm = ksdm;
    }


    /**
     * Gets the kssj value for this GetBqWczJywjzxm.
     * 
     * @return kssj
     */
    public java.lang.String getKssj() {
        return kssj;
    }


    /**
     * Sets the kssj value for this GetBqWczJywjzxm.
     * 
     * @param kssj
     */
    public void setKssj(java.lang.String kssj) {
        this.kssj = kssj;
    }


    /**
     * Gets the jssj value for this GetBqWczJywjzxm.
     * 
     * @return jssj
     */
    public java.lang.String getJssj() {
        return jssj;
    }


    /**
     * Sets the jssj value for this GetBqWczJywjzxm.
     * 
     * @param jssj
     */
    public void setJssj(java.lang.String jssj) {
        this.jssj = jssj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBqWczJywjzxm)) return false;
        GetBqWczJywjzxm other = (GetBqWczJywjzxm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ksdm==null && other.getKsdm()==null) || 
             (this.ksdm!=null &&
              this.ksdm.equals(other.getKsdm()))) &&
            ((this.kssj==null && other.getKssj()==null) || 
             (this.kssj!=null &&
              this.kssj.equals(other.getKssj()))) &&
            ((this.jssj==null && other.getJssj()==null) || 
             (this.jssj!=null &&
              this.jssj.equals(other.getJssj())));
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
        if (getKsdm() != null) {
            _hashCode += getKsdm().hashCode();
        }
        if (getKssj() != null) {
            _hashCode += getKssj().hashCode();
        }
        if (getJssj() != null) {
            _hashCode += getJssj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBqWczJywjzxm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBqWczJywjzxm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ksdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ksdm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kssj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "kssj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jssj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jssj"));
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
