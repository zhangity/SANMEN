/**
 * AddOverTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddOverTime  implements java.io.Serializable {
    private org.tempuri.CLINIC_SCHEDULE model;

    private java.lang.String strAmPm;

    private int nums;

    private int numMinute;

    private int jjr;

    public AddOverTime() {
    }

    public AddOverTime(
           org.tempuri.CLINIC_SCHEDULE model,
           java.lang.String strAmPm,
           int nums,
           int numMinute,
           int jjr) {
           this.model = model;
           this.strAmPm = strAmPm;
           this.nums = nums;
           this.numMinute = numMinute;
           this.jjr = jjr;
    }


    /**
     * Gets the model value for this AddOverTime.
     * 
     * @return model
     */
    public org.tempuri.CLINIC_SCHEDULE getModel() {
        return model;
    }


    /**
     * Sets the model value for this AddOverTime.
     * 
     * @param model
     */
    public void setModel(org.tempuri.CLINIC_SCHEDULE model) {
        this.model = model;
    }


    /**
     * Gets the strAmPm value for this AddOverTime.
     * 
     * @return strAmPm
     */
    public java.lang.String getStrAmPm() {
        return strAmPm;
    }


    /**
     * Sets the strAmPm value for this AddOverTime.
     * 
     * @param strAmPm
     */
    public void setStrAmPm(java.lang.String strAmPm) {
        this.strAmPm = strAmPm;
    }


    /**
     * Gets the nums value for this AddOverTime.
     * 
     * @return nums
     */
    public int getNums() {
        return nums;
    }


    /**
     * Sets the nums value for this AddOverTime.
     * 
     * @param nums
     */
    public void setNums(int nums) {
        this.nums = nums;
    }


    /**
     * Gets the numMinute value for this AddOverTime.
     * 
     * @return numMinute
     */
    public int getNumMinute() {
        return numMinute;
    }


    /**
     * Sets the numMinute value for this AddOverTime.
     * 
     * @param numMinute
     */
    public void setNumMinute(int numMinute) {
        this.numMinute = numMinute;
    }


    /**
     * Gets the jjr value for this AddOverTime.
     * 
     * @return jjr
     */
    public int getJjr() {
        return jjr;
    }


    /**
     * Sets the jjr value for this AddOverTime.
     * 
     * @param jjr
     */
    public void setJjr(int jjr) {
        this.jjr = jjr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddOverTime)) return false;
        AddOverTime other = (AddOverTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.strAmPm==null && other.getStrAmPm()==null) || 
             (this.strAmPm!=null &&
              this.strAmPm.equals(other.getStrAmPm()))) &&
            this.nums == other.getNums() &&
            this.numMinute == other.getNumMinute() &&
            this.jjr == other.getJjr();
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
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getStrAmPm() != null) {
            _hashCode += getStrAmPm().hashCode();
        }
        _hashCode += getNums();
        _hashCode += getNumMinute();
        _hashCode += getJjr();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddOverTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddOverTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_SCHEDULE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strAmPm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strAmPm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nums");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "nums"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "numMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jjr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jjr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
