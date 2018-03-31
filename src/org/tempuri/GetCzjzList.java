/**
 * GetCzjzList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCzjzList  implements java.io.Serializable {
    private java.lang.String czoper;

    private java.lang.String mzlb;

    private java.lang.String strStartTime;

    private java.lang.String strEndTime;

    public GetCzjzList() {
    }

    public GetCzjzList(
           java.lang.String czoper,
           java.lang.String mzlb,
           java.lang.String strStartTime,
           java.lang.String strEndTime) {
           this.czoper = czoper;
           this.mzlb = mzlb;
           this.strStartTime = strStartTime;
           this.strEndTime = strEndTime;
    }


    /**
     * Gets the czoper value for this GetCzjzList.
     * 
     * @return czoper
     */
    public java.lang.String getCzoper() {
        return czoper;
    }


    /**
     * Sets the czoper value for this GetCzjzList.
     * 
     * @param czoper
     */
    public void setCzoper(java.lang.String czoper) {
        this.czoper = czoper;
    }


    /**
     * Gets the mzlb value for this GetCzjzList.
     * 
     * @return mzlb
     */
    public java.lang.String getMzlb() {
        return mzlb;
    }


    /**
     * Sets the mzlb value for this GetCzjzList.
     * 
     * @param mzlb
     */
    public void setMzlb(java.lang.String mzlb) {
        this.mzlb = mzlb;
    }


    /**
     * Gets the strStartTime value for this GetCzjzList.
     * 
     * @return strStartTime
     */
    public java.lang.String getStrStartTime() {
        return strStartTime;
    }


    /**
     * Sets the strStartTime value for this GetCzjzList.
     * 
     * @param strStartTime
     */
    public void setStrStartTime(java.lang.String strStartTime) {
        this.strStartTime = strStartTime;
    }


    /**
     * Gets the strEndTime value for this GetCzjzList.
     * 
     * @return strEndTime
     */
    public java.lang.String getStrEndTime() {
        return strEndTime;
    }


    /**
     * Sets the strEndTime value for this GetCzjzList.
     * 
     * @param strEndTime
     */
    public void setStrEndTime(java.lang.String strEndTime) {
        this.strEndTime = strEndTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCzjzList)) return false;
        GetCzjzList other = (GetCzjzList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.czoper==null && other.getCzoper()==null) || 
             (this.czoper!=null &&
              this.czoper.equals(other.getCzoper()))) &&
            ((this.mzlb==null && other.getMzlb()==null) || 
             (this.mzlb!=null &&
              this.mzlb.equals(other.getMzlb()))) &&
            ((this.strStartTime==null && other.getStrStartTime()==null) || 
             (this.strStartTime!=null &&
              this.strStartTime.equals(other.getStrStartTime()))) &&
            ((this.strEndTime==null && other.getStrEndTime()==null) || 
             (this.strEndTime!=null &&
              this.strEndTime.equals(other.getStrEndTime())));
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
        if (getCzoper() != null) {
            _hashCode += getCzoper().hashCode();
        }
        if (getMzlb() != null) {
            _hashCode += getMzlb().hashCode();
        }
        if (getStrStartTime() != null) {
            _hashCode += getStrStartTime().hashCode();
        }
        if (getStrEndTime() != null) {
            _hashCode += getStrEndTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCzjzList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCzjzList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czoper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czoper"));
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
        elemField.setFieldName("strStartTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strStartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strEndTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strEndTime"));
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
