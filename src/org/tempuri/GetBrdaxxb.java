/**
 * GetBrdaxxb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBrdaxxb  implements java.io.Serializable {
    private java.lang.String jzhm;

    private java.lang.String mzhm;

    private java.lang.String brxm;

    public GetBrdaxxb() {
    }

    public GetBrdaxxb(
           java.lang.String jzhm,
           java.lang.String mzhm,
           java.lang.String brxm) {
           this.jzhm = jzhm;
           this.mzhm = mzhm;
           this.brxm = brxm;
    }


    /**
     * Gets the jzhm value for this GetBrdaxxb.
     * 
     * @return jzhm
     */
    public java.lang.String getJzhm() {
        return jzhm;
    }


    /**
     * Sets the jzhm value for this GetBrdaxxb.
     * 
     * @param jzhm
     */
    public void setJzhm(java.lang.String jzhm) {
        this.jzhm = jzhm;
    }


    /**
     * Gets the mzhm value for this GetBrdaxxb.
     * 
     * @return mzhm
     */
    public java.lang.String getMzhm() {
        return mzhm;
    }


    /**
     * Sets the mzhm value for this GetBrdaxxb.
     * 
     * @param mzhm
     */
    public void setMzhm(java.lang.String mzhm) {
        this.mzhm = mzhm;
    }


    /**
     * Gets the brxm value for this GetBrdaxxb.
     * 
     * @return brxm
     */
    public java.lang.String getBrxm() {
        return brxm;
    }


    /**
     * Sets the brxm value for this GetBrdaxxb.
     * 
     * @param brxm
     */
    public void setBrxm(java.lang.String brxm) {
        this.brxm = brxm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBrdaxxb)) return false;
        GetBrdaxxb other = (GetBrdaxxb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jzhm==null && other.getJzhm()==null) || 
             (this.jzhm!=null &&
              this.jzhm.equals(other.getJzhm()))) &&
            ((this.mzhm==null && other.getMzhm()==null) || 
             (this.mzhm!=null &&
              this.mzhm.equals(other.getMzhm()))) &&
            ((this.brxm==null && other.getBrxm()==null) || 
             (this.brxm!=null &&
              this.brxm.equals(other.getBrxm())));
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
        if (getJzhm() != null) {
            _hashCode += getJzhm().hashCode();
        }
        if (getMzhm() != null) {
            _hashCode += getMzhm().hashCode();
        }
        if (getBrxm() != null) {
            _hashCode += getBrxm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBrdaxxb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBrdaxxb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jzhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jzhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mzhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brxm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "brxm"));
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
