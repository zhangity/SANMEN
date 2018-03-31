/**
 * GetYsYjMxforReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYsYjMxforReport  implements java.io.Serializable {
    private java.lang.String strStartDate;

    private java.lang.String strEndDate;

    private java.lang.String ylxh;

    private java.lang.String ysdm;

    public GetYsYjMxforReport() {
    }

    public GetYsYjMxforReport(
           java.lang.String strStartDate,
           java.lang.String strEndDate,
           java.lang.String ylxh,
           java.lang.String ysdm) {
           this.strStartDate = strStartDate;
           this.strEndDate = strEndDate;
           this.ylxh = ylxh;
           this.ysdm = ysdm;
    }


    /**
     * Gets the strStartDate value for this GetYsYjMxforReport.
     * 
     * @return strStartDate
     */
    public java.lang.String getStrStartDate() {
        return strStartDate;
    }


    /**
     * Sets the strStartDate value for this GetYsYjMxforReport.
     * 
     * @param strStartDate
     */
    public void setStrStartDate(java.lang.String strStartDate) {
        this.strStartDate = strStartDate;
    }


    /**
     * Gets the strEndDate value for this GetYsYjMxforReport.
     * 
     * @return strEndDate
     */
    public java.lang.String getStrEndDate() {
        return strEndDate;
    }


    /**
     * Sets the strEndDate value for this GetYsYjMxforReport.
     * 
     * @param strEndDate
     */
    public void setStrEndDate(java.lang.String strEndDate) {
        this.strEndDate = strEndDate;
    }


    /**
     * Gets the ylxh value for this GetYsYjMxforReport.
     * 
     * @return ylxh
     */
    public java.lang.String getYlxh() {
        return ylxh;
    }


    /**
     * Sets the ylxh value for this GetYsYjMxforReport.
     * 
     * @param ylxh
     */
    public void setYlxh(java.lang.String ylxh) {
        this.ylxh = ylxh;
    }


    /**
     * Gets the ysdm value for this GetYsYjMxforReport.
     * 
     * @return ysdm
     */
    public java.lang.String getYsdm() {
        return ysdm;
    }


    /**
     * Sets the ysdm value for this GetYsYjMxforReport.
     * 
     * @param ysdm
     */
    public void setYsdm(java.lang.String ysdm) {
        this.ysdm = ysdm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYsYjMxforReport)) return false;
        GetYsYjMxforReport other = (GetYsYjMxforReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strStartDate==null && other.getStrStartDate()==null) || 
             (this.strStartDate!=null &&
              this.strStartDate.equals(other.getStrStartDate()))) &&
            ((this.strEndDate==null && other.getStrEndDate()==null) || 
             (this.strEndDate!=null &&
              this.strEndDate.equals(other.getStrEndDate()))) &&
            ((this.ylxh==null && other.getYlxh()==null) || 
             (this.ylxh!=null &&
              this.ylxh.equals(other.getYlxh()))) &&
            ((this.ysdm==null && other.getYsdm()==null) || 
             (this.ysdm!=null &&
              this.ysdm.equals(other.getYsdm())));
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
        if (getStrStartDate() != null) {
            _hashCode += getStrStartDate().hashCode();
        }
        if (getStrEndDate() != null) {
            _hashCode += getStrEndDate().hashCode();
        }
        if (getYlxh() != null) {
            _hashCode += getYlxh().hashCode();
        }
        if (getYsdm() != null) {
            _hashCode += getYsdm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYsYjMxforReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYsYjMxforReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ylxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ylxh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ysdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ysdm"));
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
