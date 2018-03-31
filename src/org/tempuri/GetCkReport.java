/**
 * GetCkReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCkReport  implements java.io.Serializable {
    private java.lang.String strMzlb;

    private java.lang.String strStartDate;

    private java.lang.String strEndDate;

    public GetCkReport() {
    }

    public GetCkReport(
           java.lang.String strMzlb,
           java.lang.String strStartDate,
           java.lang.String strEndDate) {
           this.strMzlb = strMzlb;
           this.strStartDate = strStartDate;
           this.strEndDate = strEndDate;
    }


    /**
     * Gets the strMzlb value for this GetCkReport.
     * 
     * @return strMzlb
     */
    public java.lang.String getStrMzlb() {
        return strMzlb;
    }


    /**
     * Sets the strMzlb value for this GetCkReport.
     * 
     * @param strMzlb
     */
    public void setStrMzlb(java.lang.String strMzlb) {
        this.strMzlb = strMzlb;
    }


    /**
     * Gets the strStartDate value for this GetCkReport.
     * 
     * @return strStartDate
     */
    public java.lang.String getStrStartDate() {
        return strStartDate;
    }


    /**
     * Sets the strStartDate value for this GetCkReport.
     * 
     * @param strStartDate
     */
    public void setStrStartDate(java.lang.String strStartDate) {
        this.strStartDate = strStartDate;
    }


    /**
     * Gets the strEndDate value for this GetCkReport.
     * 
     * @return strEndDate
     */
    public java.lang.String getStrEndDate() {
        return strEndDate;
    }


    /**
     * Sets the strEndDate value for this GetCkReport.
     * 
     * @param strEndDate
     */
    public void setStrEndDate(java.lang.String strEndDate) {
        this.strEndDate = strEndDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCkReport)) return false;
        GetCkReport other = (GetCkReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strMzlb==null && other.getStrMzlb()==null) || 
             (this.strMzlb!=null &&
              this.strMzlb.equals(other.getStrMzlb()))) &&
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
        if (getStrMzlb() != null) {
            _hashCode += getStrMzlb().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetCkReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCkReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strMzlb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strMzlb"));
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
