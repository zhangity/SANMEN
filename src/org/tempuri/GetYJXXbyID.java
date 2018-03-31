/**
 * GetYJXXbyID.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYJXXbyID  implements java.io.Serializable {
    private java.lang.String BRID;

    private java.lang.String JZXH;

    private java.lang.String KSSJ;

    private java.lang.String JZSJ;

    public GetYJXXbyID() {
    }

    public GetYJXXbyID(
           java.lang.String BRID,
           java.lang.String JZXH,
           java.lang.String KSSJ,
           java.lang.String JZSJ) {
           this.BRID = BRID;
           this.JZXH = JZXH;
           this.KSSJ = KSSJ;
           this.JZSJ = JZSJ;
    }


    /**
     * Gets the BRID value for this GetYJXXbyID.
     * 
     * @return BRID
     */
    public java.lang.String getBRID() {
        return BRID;
    }


    /**
     * Sets the BRID value for this GetYJXXbyID.
     * 
     * @param BRID
     */
    public void setBRID(java.lang.String BRID) {
        this.BRID = BRID;
    }


    /**
     * Gets the JZXH value for this GetYJXXbyID.
     * 
     * @return JZXH
     */
    public java.lang.String getJZXH() {
        return JZXH;
    }


    /**
     * Sets the JZXH value for this GetYJXXbyID.
     * 
     * @param JZXH
     */
    public void setJZXH(java.lang.String JZXH) {
        this.JZXH = JZXH;
    }


    /**
     * Gets the KSSJ value for this GetYJXXbyID.
     * 
     * @return KSSJ
     */
    public java.lang.String getKSSJ() {
        return KSSJ;
    }


    /**
     * Sets the KSSJ value for this GetYJXXbyID.
     * 
     * @param KSSJ
     */
    public void setKSSJ(java.lang.String KSSJ) {
        this.KSSJ = KSSJ;
    }


    /**
     * Gets the JZSJ value for this GetYJXXbyID.
     * 
     * @return JZSJ
     */
    public java.lang.String getJZSJ() {
        return JZSJ;
    }


    /**
     * Sets the JZSJ value for this GetYJXXbyID.
     * 
     * @param JZSJ
     */
    public void setJZSJ(java.lang.String JZSJ) {
        this.JZSJ = JZSJ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYJXXbyID)) return false;
        GetYJXXbyID other = (GetYJXXbyID) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BRID==null && other.getBRID()==null) || 
             (this.BRID!=null &&
              this.BRID.equals(other.getBRID()))) &&
            ((this.JZXH==null && other.getJZXH()==null) || 
             (this.JZXH!=null &&
              this.JZXH.equals(other.getJZXH()))) &&
            ((this.KSSJ==null && other.getKSSJ()==null) || 
             (this.KSSJ!=null &&
              this.KSSJ.equals(other.getKSSJ()))) &&
            ((this.JZSJ==null && other.getJZSJ()==null) || 
             (this.JZSJ!=null &&
              this.JZSJ.equals(other.getJZSJ())));
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
        if (getBRID() != null) {
            _hashCode += getBRID().hashCode();
        }
        if (getJZXH() != null) {
            _hashCode += getJZXH().hashCode();
        }
        if (getKSSJ() != null) {
            _hashCode += getKSSJ().hashCode();
        }
        if (getJZSJ() != null) {
            _hashCode += getJZSJ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYJXXbyID.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYJXXbyID"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BRID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JZXH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "JZXH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KSSJ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "KSSJ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JZSJ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "JZSJ"));
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
