/**
 * GetZJJSofYS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZJJSofYS  implements java.io.Serializable {
    private java.lang.String startTime;

    private java.lang.String endTime;

    private java.lang.String mzDEPT_CODE;

    private java.lang.String YSCZGH;

    public GetZJJSofYS() {
    }

    public GetZJJSofYS(
           java.lang.String startTime,
           java.lang.String endTime,
           java.lang.String mzDEPT_CODE,
           java.lang.String YSCZGH) {
           this.startTime = startTime;
           this.endTime = endTime;
           this.mzDEPT_CODE = mzDEPT_CODE;
           this.YSCZGH = YSCZGH;
    }


    /**
     * Gets the startTime value for this GetZJJSofYS.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this GetZJJSofYS.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this GetZJJSofYS.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this GetZJJSofYS.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the mzDEPT_CODE value for this GetZJJSofYS.
     * 
     * @return mzDEPT_CODE
     */
    public java.lang.String getMzDEPT_CODE() {
        return mzDEPT_CODE;
    }


    /**
     * Sets the mzDEPT_CODE value for this GetZJJSofYS.
     * 
     * @param mzDEPT_CODE
     */
    public void setMzDEPT_CODE(java.lang.String mzDEPT_CODE) {
        this.mzDEPT_CODE = mzDEPT_CODE;
    }


    /**
     * Gets the YSCZGH value for this GetZJJSofYS.
     * 
     * @return YSCZGH
     */
    public java.lang.String getYSCZGH() {
        return YSCZGH;
    }


    /**
     * Sets the YSCZGH value for this GetZJJSofYS.
     * 
     * @param YSCZGH
     */
    public void setYSCZGH(java.lang.String YSCZGH) {
        this.YSCZGH = YSCZGH;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZJJSofYS)) return false;
        GetZJJSofYS other = (GetZJJSofYS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.mzDEPT_CODE==null && other.getMzDEPT_CODE()==null) || 
             (this.mzDEPT_CODE!=null &&
              this.mzDEPT_CODE.equals(other.getMzDEPT_CODE()))) &&
            ((this.YSCZGH==null && other.getYSCZGH()==null) || 
             (this.YSCZGH!=null &&
              this.YSCZGH.equals(other.getYSCZGH())));
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
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getMzDEPT_CODE() != null) {
            _hashCode += getMzDEPT_CODE().hashCode();
        }
        if (getYSCZGH() != null) {
            _hashCode += getYSCZGH().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZJJSofYS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZJJSofYS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzDEPT_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MzDEPT_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YSCZGH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YSCZGH"));
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
