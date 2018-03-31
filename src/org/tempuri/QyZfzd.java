/**
 * QyZfzd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QyZfzd  implements java.io.Serializable {
    private java.lang.String isQY;

    private java.lang.String JBXH;

    public QyZfzd() {
    }

    public QyZfzd(
           java.lang.String isQY,
           java.lang.String JBXH) {
           this.isQY = isQY;
           this.JBXH = JBXH;
    }


    /**
     * Gets the isQY value for this QyZfzd.
     * 
     * @return isQY
     */
    public java.lang.String getIsQY() {
        return isQY;
    }


    /**
     * Sets the isQY value for this QyZfzd.
     * 
     * @param isQY
     */
    public void setIsQY(java.lang.String isQY) {
        this.isQY = isQY;
    }


    /**
     * Gets the JBXH value for this QyZfzd.
     * 
     * @return JBXH
     */
    public java.lang.String getJBXH() {
        return JBXH;
    }


    /**
     * Sets the JBXH value for this QyZfzd.
     * 
     * @param JBXH
     */
    public void setJBXH(java.lang.String JBXH) {
        this.JBXH = JBXH;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QyZfzd)) return false;
        QyZfzd other = (QyZfzd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isQY==null && other.getIsQY()==null) || 
             (this.isQY!=null &&
              this.isQY.equals(other.getIsQY()))) &&
            ((this.JBXH==null && other.getJBXH()==null) || 
             (this.JBXH!=null &&
              this.JBXH.equals(other.getJBXH())));
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
        if (getIsQY() != null) {
            _hashCode += getIsQY().hashCode();
        }
        if (getJBXH() != null) {
            _hashCode += getJBXH().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QyZfzd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QyZfzd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isQY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsQY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("JBXH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "JBXH"));
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
