/**
 * InsertSsjl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertSsjl  implements java.io.Serializable {
    private java.lang.String[] ssnr;

    private int bj;

    private java.lang.String infos;

    public InsertSsjl() {
    }

    public InsertSsjl(
           java.lang.String[] ssnr,
           int bj,
           java.lang.String infos) {
           this.ssnr = ssnr;
           this.bj = bj;
           this.infos = infos;
    }


    /**
     * Gets the ssnr value for this InsertSsjl.
     * 
     * @return ssnr
     */
    public java.lang.String[] getSsnr() {
        return ssnr;
    }


    /**
     * Sets the ssnr value for this InsertSsjl.
     * 
     * @param ssnr
     */
    public void setSsnr(java.lang.String[] ssnr) {
        this.ssnr = ssnr;
    }


    /**
     * Gets the bj value for this InsertSsjl.
     * 
     * @return bj
     */
    public int getBj() {
        return bj;
    }


    /**
     * Sets the bj value for this InsertSsjl.
     * 
     * @param bj
     */
    public void setBj(int bj) {
        this.bj = bj;
    }


    /**
     * Gets the infos value for this InsertSsjl.
     * 
     * @return infos
     */
    public java.lang.String getInfos() {
        return infos;
    }


    /**
     * Sets the infos value for this InsertSsjl.
     * 
     * @param infos
     */
    public void setInfos(java.lang.String infos) {
        this.infos = infos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertSsjl)) return false;
        InsertSsjl other = (InsertSsjl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ssnr==null && other.getSsnr()==null) || 
             (this.ssnr!=null &&
              java.util.Arrays.equals(this.ssnr, other.getSsnr()))) &&
            this.bj == other.getBj() &&
            ((this.infos==null && other.getInfos()==null) || 
             (this.infos!=null &&
              this.infos.equals(other.getInfos())));
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
        if (getSsnr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSsnr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSsnr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getBj();
        if (getInfos() != null) {
            _hashCode += getInfos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertSsjl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertSsjl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ssnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "infos"));
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
