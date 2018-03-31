/**
 * InsertMeassage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertMeassage  implements java.io.Serializable {
    private java.lang.String czgh;

    private java.lang.String dxnr;

    private java.lang.String dhhm;

    private java.lang.String sbcg;

    public InsertMeassage() {
    }

    public InsertMeassage(
           java.lang.String czgh,
           java.lang.String dxnr,
           java.lang.String dhhm,
           java.lang.String sbcg) {
           this.czgh = czgh;
           this.dxnr = dxnr;
           this.dhhm = dhhm;
           this.sbcg = sbcg;
    }


    /**
     * Gets the czgh value for this InsertMeassage.
     * 
     * @return czgh
     */
    public java.lang.String getCzgh() {
        return czgh;
    }


    /**
     * Sets the czgh value for this InsertMeassage.
     * 
     * @param czgh
     */
    public void setCzgh(java.lang.String czgh) {
        this.czgh = czgh;
    }


    /**
     * Gets the dxnr value for this InsertMeassage.
     * 
     * @return dxnr
     */
    public java.lang.String getDxnr() {
        return dxnr;
    }


    /**
     * Sets the dxnr value for this InsertMeassage.
     * 
     * @param dxnr
     */
    public void setDxnr(java.lang.String dxnr) {
        this.dxnr = dxnr;
    }


    /**
     * Gets the dhhm value for this InsertMeassage.
     * 
     * @return dhhm
     */
    public java.lang.String getDhhm() {
        return dhhm;
    }


    /**
     * Sets the dhhm value for this InsertMeassage.
     * 
     * @param dhhm
     */
    public void setDhhm(java.lang.String dhhm) {
        this.dhhm = dhhm;
    }


    /**
     * Gets the sbcg value for this InsertMeassage.
     * 
     * @return sbcg
     */
    public java.lang.String getSbcg() {
        return sbcg;
    }


    /**
     * Sets the sbcg value for this InsertMeassage.
     * 
     * @param sbcg
     */
    public void setSbcg(java.lang.String sbcg) {
        this.sbcg = sbcg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertMeassage)) return false;
        InsertMeassage other = (InsertMeassage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.czgh==null && other.getCzgh()==null) || 
             (this.czgh!=null &&
              this.czgh.equals(other.getCzgh()))) &&
            ((this.dxnr==null && other.getDxnr()==null) || 
             (this.dxnr!=null &&
              this.dxnr.equals(other.getDxnr()))) &&
            ((this.dhhm==null && other.getDhhm()==null) || 
             (this.dhhm!=null &&
              this.dhhm.equals(other.getDhhm()))) &&
            ((this.sbcg==null && other.getSbcg()==null) || 
             (this.sbcg!=null &&
              this.sbcg.equals(other.getSbcg())));
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
        if (getCzgh() != null) {
            _hashCode += getCzgh().hashCode();
        }
        if (getDxnr() != null) {
            _hashCode += getDxnr().hashCode();
        }
        if (getDhhm() != null) {
            _hashCode += getDhhm().hashCode();
        }
        if (getSbcg() != null) {
            _hashCode += getSbcg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertMeassage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertMeassage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czgh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dxnr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dxnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dhhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sbcg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sbcg"));
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
