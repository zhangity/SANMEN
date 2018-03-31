/**
 * GetYbhbbReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYbhbbReport  implements java.io.Serializable {
    private java.lang.String strJzlx;

    private java.lang.String strStartDate;

    private java.lang.String strEndDate;

    public GetYbhbbReport() {
    }

    public GetYbhbbReport(
           java.lang.String strJzlx,
           java.lang.String strStartDate,
           java.lang.String strEndDate) {
           this.strJzlx = strJzlx;
           this.strStartDate = strStartDate;
           this.strEndDate = strEndDate;
    }


    /**
     * Gets the strJzlx value for this GetYbhbbReport.
     * 
     * @return strJzlx
     */
    public java.lang.String getStrJzlx() {
        return strJzlx;
    }


    /**
     * Sets the strJzlx value for this GetYbhbbReport.
     * 
     * @param strJzlx
     */
    public void setStrJzlx(java.lang.String strJzlx) {
        this.strJzlx = strJzlx;
    }


    /**
     * Gets the strStartDate value for this GetYbhbbReport.
     * 
     * @return strStartDate
     */
    public java.lang.String getStrStartDate() {
        return strStartDate;
    }


    /**
     * Sets the strStartDate value for this GetYbhbbReport.
     * 
     * @param strStartDate
     */
    public void setStrStartDate(java.lang.String strStartDate) {
        this.strStartDate = strStartDate;
    }


    /**
     * Gets the strEndDate value for this GetYbhbbReport.
     * 
     * @return strEndDate
     */
    public java.lang.String getStrEndDate() {
        return strEndDate;
    }


    /**
     * Sets the strEndDate value for this GetYbhbbReport.
     * 
     * @param strEndDate
     */
    public void setStrEndDate(java.lang.String strEndDate) {
        this.strEndDate = strEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYbhbbReport)) return false;
        GetYbhbbReport other = (GetYbhbbReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strJzlx==null && other.getStrJzlx()==null) || 
             (this.strJzlx!=null &&
              this.strJzlx.equals(other.getStrJzlx()))) &&
            ((this.strStartDate==null && other.getStrStartDate()==null) || 
             (this.strStartDate!=null &&
              this.strStartDate.equals(other.getStrStartDate()))) &&
            ((this.strEndDate==null && other.getStrEndDate()==null) || 
             (this.strEndDate!=null &&
              this.strEndDate.equals(other.getStrEndDate())));
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
        if (getStrJzlx() != null) {
            _hashCode += getStrJzlx().hashCode();
        }
        if (getStrStartDate() != null) {
            _hashCode += getStrStartDate().hashCode();
        }
        if (getStrEndDate() != null) {
            _hashCode += getStrEndDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYbhbbReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYbhbbReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strJzlx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strJzlx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strEndDate"));
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
