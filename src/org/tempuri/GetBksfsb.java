/**
 * GetBksfsb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBksfsb  implements java.io.Serializable {
    private java.lang.String ICD10;

    private java.lang.String brid;

    private java.lang.String zdrq1;

    private java.lang.String zdrq2;

    public GetBksfsb() {
    }

    public GetBksfsb(
           java.lang.String ICD10,
           java.lang.String brid,
           java.lang.String zdrq1,
           java.lang.String zdrq2) {
           this.ICD10 = ICD10;
           this.brid = brid;
           this.zdrq1 = zdrq1;
           this.zdrq2 = zdrq2;
    }


    /**
     * Gets the ICD10 value for this GetBksfsb.
     * 
     * @return ICD10
     */
    public java.lang.String getICD10() {
        return ICD10;
    }


    /**
     * Sets the ICD10 value for this GetBksfsb.
     * 
     * @param ICD10
     */
    public void setICD10(java.lang.String ICD10) {
        this.ICD10 = ICD10;
    }


    /**
     * Gets the brid value for this GetBksfsb.
     * 
     * @return brid
     */
    public java.lang.String getBrid() {
        return brid;
    }


    /**
     * Sets the brid value for this GetBksfsb.
     * 
     * @param brid
     */
    public void setBrid(java.lang.String brid) {
        this.brid = brid;
    }


    /**
     * Gets the zdrq1 value for this GetBksfsb.
     * 
     * @return zdrq1
     */
    public java.lang.String getZdrq1() {
        return zdrq1;
    }


    /**
     * Sets the zdrq1 value for this GetBksfsb.
     * 
     * @param zdrq1
     */
    public void setZdrq1(java.lang.String zdrq1) {
        this.zdrq1 = zdrq1;
    }


    /**
     * Gets the zdrq2 value for this GetBksfsb.
     * 
     * @return zdrq2
     */
    public java.lang.String getZdrq2() {
        return zdrq2;
    }


    /**
     * Sets the zdrq2 value for this GetBksfsb.
     * 
     * @param zdrq2
     */
    public void setZdrq2(java.lang.String zdrq2) {
        this.zdrq2 = zdrq2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBksfsb)) return false;
        GetBksfsb other = (GetBksfsb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ICD10==null && other.getICD10()==null) || 
             (this.ICD10!=null &&
              this.ICD10.equals(other.getICD10()))) &&
            ((this.brid==null && other.getBrid()==null) || 
             (this.brid!=null &&
              this.brid.equals(other.getBrid()))) &&
            ((this.zdrq1==null && other.getZdrq1()==null) || 
             (this.zdrq1!=null &&
              this.zdrq1.equals(other.getZdrq1()))) &&
            ((this.zdrq2==null && other.getZdrq2()==null) || 
             (this.zdrq2!=null &&
              this.zdrq2.equals(other.getZdrq2())));
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
        if (getICD10() != null) {
            _hashCode += getICD10().hashCode();
        }
        if (getBrid() != null) {
            _hashCode += getBrid().hashCode();
        }
        if (getZdrq1() != null) {
            _hashCode += getZdrq1().hashCode();
        }
        if (getZdrq2() != null) {
            _hashCode += getZdrq2().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBksfsb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBksfsb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICD10");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ICD10"));
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
        elemField.setFieldName("zdrq1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "zdrq1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zdrq2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "zdrq2"));
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
