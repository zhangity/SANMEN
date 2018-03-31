/**
 * GetJybgMxData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetJybgMxData  implements java.io.Serializable {
    private java.lang.String bah;

    private java.lang.String[] testid;

    private java.lang.String dateBegin;

    private java.lang.String dateOver;

    public GetJybgMxData() {
    }

    public GetJybgMxData(
           java.lang.String bah,
           java.lang.String[] testid,
           java.lang.String dateBegin,
           java.lang.String dateOver) {
           this.bah = bah;
           this.testid = testid;
           this.dateBegin = dateBegin;
           this.dateOver = dateOver;
    }


    /**
     * Gets the bah value for this GetJybgMxData.
     * 
     * @return bah
     */
    public java.lang.String getBah() {
        return bah;
    }


    /**
     * Sets the bah value for this GetJybgMxData.
     * 
     * @param bah
     */
    public void setBah(java.lang.String bah) {
        this.bah = bah;
    }


    /**
     * Gets the testid value for this GetJybgMxData.
     * 
     * @return testid
     */
    public java.lang.String[] getTestid() {
        return testid;
    }


    /**
     * Sets the testid value for this GetJybgMxData.
     * 
     * @param testid
     */
    public void setTestid(java.lang.String[] testid) {
        this.testid = testid;
    }


    /**
     * Gets the dateBegin value for this GetJybgMxData.
     * 
     * @return dateBegin
     */
    public java.lang.String getDateBegin() {
        return dateBegin;
    }


    /**
     * Sets the dateBegin value for this GetJybgMxData.
     * 
     * @param dateBegin
     */
    public void setDateBegin(java.lang.String dateBegin) {
        this.dateBegin = dateBegin;
    }


    /**
     * Gets the dateOver value for this GetJybgMxData.
     * 
     * @return dateOver
     */
    public java.lang.String getDateOver() {
        return dateOver;
    }


    /**
     * Sets the dateOver value for this GetJybgMxData.
     * 
     * @param dateOver
     */
    public void setDateOver(java.lang.String dateOver) {
        this.dateOver = dateOver;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetJybgMxData)) return false;
        GetJybgMxData other = (GetJybgMxData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bah==null && other.getBah()==null) || 
             (this.bah!=null &&
              this.bah.equals(other.getBah()))) &&
            ((this.testid==null && other.getTestid()==null) || 
             (this.testid!=null &&
              java.util.Arrays.equals(this.testid, other.getTestid()))) &&
            ((this.dateBegin==null && other.getDateBegin()==null) || 
             (this.dateBegin!=null &&
              this.dateBegin.equals(other.getDateBegin()))) &&
            ((this.dateOver==null && other.getDateOver()==null) || 
             (this.dateOver!=null &&
              this.dateOver.equals(other.getDateOver())));
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
        if (getBah() != null) {
            _hashCode += getBah().hashCode();
        }
        if (getTestid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTestid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTestid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateBegin() != null) {
            _hashCode += getDateBegin().hashCode();
        }
        if (getDateOver() != null) {
            _hashCode += getDateOver().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetJybgMxData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetJybgMxData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bah");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bah"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("testid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "testid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dateBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dateOver"));
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
