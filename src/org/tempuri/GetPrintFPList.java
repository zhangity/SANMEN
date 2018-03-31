/**
 * GetPrintFPList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPrintFPList  implements java.io.Serializable {
    private java.lang.String BRID;

    private java.lang.String KSRQ;

    private java.lang.String JSRQ;

    public GetPrintFPList() {
    }

    public GetPrintFPList(
           java.lang.String BRID,
           java.lang.String KSRQ,
           java.lang.String JSRQ) {
           this.BRID = BRID;
           this.KSRQ = KSRQ;
           this.JSRQ = JSRQ;
    }


    /**
     * Gets the BRID value for this GetPrintFPList.
     * 
     * @return BRID
     */
    public java.lang.String getBRID() {
        return BRID;
    }


    /**
     * Sets the BRID value for this GetPrintFPList.
     * 
     * @param BRID
     */
    public void setBRID(java.lang.String BRID) {
        this.BRID = BRID;
    }


    /**
     * Gets the KSRQ value for this GetPrintFPList.
     * 
     * @return KSRQ
     */
    public java.lang.String getKSRQ() {
        return KSRQ;
    }


    /**
     * Sets the KSRQ value for this GetPrintFPList.
     * 
     * @param KSRQ
     */
    public void setKSRQ(java.lang.String KSRQ) {
        this.KSRQ = KSRQ;
    }


    /**
     * Gets the JSRQ value for this GetPrintFPList.
     * 
     * @return JSRQ
     */
    public java.lang.String getJSRQ() {
        return JSRQ;
    }


    /**
     * Sets the JSRQ value for this GetPrintFPList.
     * 
     * @param JSRQ
     */
    public void setJSRQ(java.lang.String JSRQ) {
        this.JSRQ = JSRQ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPrintFPList)) return false;
        GetPrintFPList other = (GetPrintFPList) obj;
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
            ((this.KSRQ==null && other.getKSRQ()==null) || 
             (this.KSRQ!=null &&
              this.KSRQ.equals(other.getKSRQ()))) &&
            ((this.JSRQ==null && other.getJSRQ()==null) || 
             (this.JSRQ!=null &&
              this.JSRQ.equals(other.getJSRQ())));
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
        if (getKSRQ() != null) {
            _hashCode += getKSRQ().hashCode();
        }
        if (getJSRQ() != null) {
            _hashCode += getJSRQ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPrintFPList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPrintFPList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BRID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BRID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KSRQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "KSRQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JSRQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "JSRQ"));
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
