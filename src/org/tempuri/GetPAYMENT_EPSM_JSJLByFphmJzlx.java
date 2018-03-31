/**
 * GetPAYMENT_EPSM_JSJLByFphmJzlx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPAYMENT_EPSM_JSJLByFphmJzlx  implements java.io.Serializable {
    private java.lang.String fphm;

    private java.lang.String jzlx;

    public GetPAYMENT_EPSM_JSJLByFphmJzlx() {
    }

    public GetPAYMENT_EPSM_JSJLByFphmJzlx(
           java.lang.String fphm,
           java.lang.String jzlx) {
           this.fphm = fphm;
           this.jzlx = jzlx;
    }


    /**
     * Gets the fphm value for this GetPAYMENT_EPSM_JSJLByFphmJzlx.
     * 
     * @return fphm
     */
    public java.lang.String getFphm() {
        return fphm;
    }


    /**
     * Sets the fphm value for this GetPAYMENT_EPSM_JSJLByFphmJzlx.
     * 
     * @param fphm
     */
    public void setFphm(java.lang.String fphm) {
        this.fphm = fphm;
    }


    /**
     * Gets the jzlx value for this GetPAYMENT_EPSM_JSJLByFphmJzlx.
     * 
     * @return jzlx
     */
    public java.lang.String getJzlx() {
        return jzlx;
    }


    /**
     * Sets the jzlx value for this GetPAYMENT_EPSM_JSJLByFphmJzlx.
     * 
     * @param jzlx
     */
    public void setJzlx(java.lang.String jzlx) {
        this.jzlx = jzlx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPAYMENT_EPSM_JSJLByFphmJzlx)) return false;
        GetPAYMENT_EPSM_JSJLByFphmJzlx other = (GetPAYMENT_EPSM_JSJLByFphmJzlx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fphm==null && other.getFphm()==null) || 
             (this.fphm!=null &&
              this.fphm.equals(other.getFphm()))) &&
            ((this.jzlx==null && other.getJzlx()==null) || 
             (this.jzlx!=null &&
              this.jzlx.equals(other.getJzlx())));
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
        if (getFphm() != null) {
            _hashCode += getFphm().hashCode();
        }
        if (getJzlx() != null) {
            _hashCode += getJzlx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPAYMENT_EPSM_JSJLByFphmJzlx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPAYMENT_EPSM_JSJLByFphmJzlx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fphm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Fphm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jzlx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Jzlx"));
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
