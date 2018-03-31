/**
 * GetZFBLforYJ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZFBLforYJ  implements java.io.Serializable {
    private java.lang.String YJXH;

    private java.lang.String BRXZ;

    public GetZFBLforYJ() {
    }

    public GetZFBLforYJ(
           java.lang.String YJXH,
           java.lang.String BRXZ) {
           this.YJXH = YJXH;
           this.BRXZ = BRXZ;
    }


    /**
     * Gets the YJXH value for this GetZFBLforYJ.
     * 
     * @return YJXH
     */
    public java.lang.String getYJXH() {
        return YJXH;
    }


    /**
     * Sets the YJXH value for this GetZFBLforYJ.
     * 
     * @param YJXH
     */
    public void setYJXH(java.lang.String YJXH) {
        this.YJXH = YJXH;
    }


    /**
     * Gets the BRXZ value for this GetZFBLforYJ.
     * 
     * @return BRXZ
     */
    public java.lang.String getBRXZ() {
        return BRXZ;
    }


    /**
     * Sets the BRXZ value for this GetZFBLforYJ.
     * 
     * @param BRXZ
     */
    public void setBRXZ(java.lang.String BRXZ) {
        this.BRXZ = BRXZ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZFBLforYJ)) return false;
        GetZFBLforYJ other = (GetZFBLforYJ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.YJXH==null && other.getYJXH()==null) || 
             (this.YJXH!=null &&
              this.YJXH.equals(other.getYJXH()))) &&
            ((this.BRXZ==null && other.getBRXZ()==null) || 
             (this.BRXZ!=null &&
              this.BRXZ.equals(other.getBRXZ())));
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
        if (getYJXH() != null) {
            _hashCode += getYJXH().hashCode();
        }
        if (getBRXZ() != null) {
            _hashCode += getBRXZ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZFBLforYJ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZFBLforYJ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YJXH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YJXH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRXZ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BRXZ"));
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
