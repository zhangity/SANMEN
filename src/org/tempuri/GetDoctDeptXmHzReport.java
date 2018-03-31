/**
 * GetDoctDeptXmHzReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDoctDeptXmHzReport  implements java.io.Serializable {
    private java.lang.String bbbh;

    private java.lang.String type;

    private java.lang.String mzlb;

    private java.lang.String strStartDate;

    private java.lang.String strEndDate;

    private java.lang.String strDeptCode;

    public GetDoctDeptXmHzReport() {
    }

    public GetDoctDeptXmHzReport(
           java.lang.String bbbh,
           java.lang.String type,
           java.lang.String mzlb,
           java.lang.String strStartDate,
           java.lang.String strEndDate,
           java.lang.String strDeptCode) {
           this.bbbh = bbbh;
           this.type = type;
           this.mzlb = mzlb;
           this.strStartDate = strStartDate;
           this.strEndDate = strEndDate;
           this.strDeptCode = strDeptCode;
    }


    /**
     * Gets the bbbh value for this GetDoctDeptXmHzReport.
     * 
     * @return bbbh
     */
    public java.lang.String getBbbh() {
        return bbbh;
    }


    /**
     * Sets the bbbh value for this GetDoctDeptXmHzReport.
     * 
     * @param bbbh
     */
    public void setBbbh(java.lang.String bbbh) {
        this.bbbh = bbbh;
    }


    /**
     * Gets the type value for this GetDoctDeptXmHzReport.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this GetDoctDeptXmHzReport.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the mzlb value for this GetDoctDeptXmHzReport.
     * 
     * @return mzlb
     */
    public java.lang.String getMzlb() {
        return mzlb;
    }


    /**
     * Sets the mzlb value for this GetDoctDeptXmHzReport.
     * 
     * @param mzlb
     */
    public void setMzlb(java.lang.String mzlb) {
        this.mzlb = mzlb;
    }


    /**
     * Gets the strStartDate value for this GetDoctDeptXmHzReport.
     * 
     * @return strStartDate
     */
    public java.lang.String getStrStartDate() {
        return strStartDate;
    }


    /**
     * Sets the strStartDate value for this GetDoctDeptXmHzReport.
     * 
     * @param strStartDate
     */
    public void setStrStartDate(java.lang.String strStartDate) {
        this.strStartDate = strStartDate;
    }


    /**
     * Gets the strEndDate value for this GetDoctDeptXmHzReport.
     * 
     * @return strEndDate
     */
    public java.lang.String getStrEndDate() {
        return strEndDate;
    }


    /**
     * Sets the strEndDate value for this GetDoctDeptXmHzReport.
     * 
     * @param strEndDate
     */
    public void setStrEndDate(java.lang.String strEndDate) {
        this.strEndDate = strEndDate;
    }


    /**
     * Gets the strDeptCode value for this GetDoctDeptXmHzReport.
     * 
     * @return strDeptCode
     */
    public java.lang.String getStrDeptCode() {
        return strDeptCode;
    }


    /**
     * Sets the strDeptCode value for this GetDoctDeptXmHzReport.
     * 
     * @param strDeptCode
     */
    public void setStrDeptCode(java.lang.String strDeptCode) {
        this.strDeptCode = strDeptCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDoctDeptXmHzReport)) return false;
        GetDoctDeptXmHzReport other = (GetDoctDeptXmHzReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bbbh==null && other.getBbbh()==null) || 
             (this.bbbh!=null &&
              this.bbbh.equals(other.getBbbh()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.mzlb==null && other.getMzlb()==null) || 
             (this.mzlb!=null &&
              this.mzlb.equals(other.getMzlb()))) &&
            ((this.strStartDate==null && other.getStrStartDate()==null) || 
             (this.strStartDate!=null &&
              this.strStartDate.equals(other.getStrStartDate()))) &&
            ((this.strEndDate==null && other.getStrEndDate()==null) || 
             (this.strEndDate!=null &&
              this.strEndDate.equals(other.getStrEndDate()))) &&
            ((this.strDeptCode==null && other.getStrDeptCode()==null) || 
             (this.strDeptCode!=null &&
              this.strDeptCode.equals(other.getStrDeptCode())));
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
        if (getBbbh() != null) {
            _hashCode += getBbbh().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getMzlb() != null) {
            _hashCode += getMzlb().hashCode();
        }
        if (getStrStartDate() != null) {
            _hashCode += getStrStartDate().hashCode();
        }
        if (getStrEndDate() != null) {
            _hashCode += getStrEndDate().hashCode();
        }
        if (getStrDeptCode() != null) {
            _hashCode += getStrDeptCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDoctDeptXmHzReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDoctDeptXmHzReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bbbh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bbbh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzlb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mzlb"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strDeptCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strDeptCode"));
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
