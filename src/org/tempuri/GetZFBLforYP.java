/**
 * GetZFBLforYP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZFBLforYP  implements java.io.Serializable {
    private java.lang.String YPXH;

    private java.lang.String YPCD;

    private java.lang.String BRXZ;

    public GetZFBLforYP() {
    }

    public GetZFBLforYP(
           java.lang.String YPXH,
           java.lang.String YPCD,
           java.lang.String BRXZ) {
           this.YPXH = YPXH;
           this.YPCD = YPCD;
           this.BRXZ = BRXZ;
    }


    /**
     * Gets the YPXH value for this GetZFBLforYP.
     * 
     * @return YPXH
     */
    public java.lang.String getYPXH() {
        return YPXH;
    }


    /**
     * Sets the YPXH value for this GetZFBLforYP.
     * 
     * @param YPXH
     */
    public void setYPXH(java.lang.String YPXH) {
        this.YPXH = YPXH;
    }


    /**
     * Gets the YPCD value for this GetZFBLforYP.
     * 
     * @return YPCD
     */
    public java.lang.String getYPCD() {
        return YPCD;
    }


    /**
     * Sets the YPCD value for this GetZFBLforYP.
     * 
     * @param YPCD
     */
    public void setYPCD(java.lang.String YPCD) {
        this.YPCD = YPCD;
    }


    /**
     * Gets the BRXZ value for this GetZFBLforYP.
     * 
     * @return BRXZ
     */
    public java.lang.String getBRXZ() {
        return BRXZ;
    }


    /**
     * Sets the BRXZ value for this GetZFBLforYP.
     * 
     * @param BRXZ
     */
    public void setBRXZ(java.lang.String BRXZ) {
        this.BRXZ = BRXZ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZFBLforYP)) return false;
        GetZFBLforYP other = (GetZFBLforYP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.YPXH==null && other.getYPXH()==null) || 
             (this.YPXH!=null &&
              this.YPXH.equals(other.getYPXH()))) &&
            ((this.YPCD==null && other.getYPCD()==null) || 
             (this.YPCD!=null &&
              this.YPCD.equals(other.getYPCD()))) &&
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
        if (getYPXH() != null) {
            _hashCode += getYPXH().hashCode();
        }
        if (getYPCD() != null) {
            _hashCode += getYPCD().hashCode();
        }
        if (getBRXZ() != null) {
            _hashCode += getBRXZ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZFBLforYP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZFBLforYP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YPXH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YPXH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YPCD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YPCD"));
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
