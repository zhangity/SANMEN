/**
 * ParameterSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ParameterSet  implements java.io.Serializable {
    private java.lang.String funName;

    private org.tempuri.ParameterSetParamDS paramDS;

    private org.tempuri.ParameterSetParamXml paramXml;

    public ParameterSet() {
    }

    public ParameterSet(
           java.lang.String funName,
           org.tempuri.ParameterSetParamDS paramDS,
           org.tempuri.ParameterSetParamXml paramXml) {
           this.funName = funName;
           this.paramDS = paramDS;
           this.paramXml = paramXml;
    }


    /**
     * Gets the funName value for this ParameterSet.
     * 
     * @return funName
     */
    public java.lang.String getFunName() {
        return funName;
    }


    /**
     * Sets the funName value for this ParameterSet.
     * 
     * @param funName
     */
    public void setFunName(java.lang.String funName) {
        this.funName = funName;
    }


    /**
     * Gets the paramDS value for this ParameterSet.
     * 
     * @return paramDS
     */
    public org.tempuri.ParameterSetParamDS getParamDS() {
        return paramDS;
    }


    /**
     * Sets the paramDS value for this ParameterSet.
     * 
     * @param paramDS
     */
    public void setParamDS(org.tempuri.ParameterSetParamDS paramDS) {
        this.paramDS = paramDS;
    }


    /**
     * Gets the paramXml value for this ParameterSet.
     * 
     * @return paramXml
     */
    public org.tempuri.ParameterSetParamXml getParamXml() {
        return paramXml;
    }


    /**
     * Sets the paramXml value for this ParameterSet.
     * 
     * @param paramXml
     */
    public void setParamXml(org.tempuri.ParameterSetParamXml paramXml) {
        this.paramXml = paramXml;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParameterSet)) return false;
        ParameterSet other = (ParameterSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.funName==null && other.getFunName()==null) || 
             (this.funName!=null &&
              this.funName.equals(other.getFunName()))) &&
            ((this.paramDS==null && other.getParamDS()==null) || 
             (this.paramDS!=null &&
              this.paramDS.equals(other.getParamDS()))) &&
            ((this.paramXml==null && other.getParamXml()==null) || 
             (this.paramXml!=null &&
              this.paramXml.equals(other.getParamXml())));
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
        if (getFunName() != null) {
            _hashCode += getFunName().hashCode();
        }
        if (getParamDS() != null) {
            _hashCode += getParamDS().hashCode();
        }
        if (getParamXml() != null) {
            _hashCode += getParamXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParameterSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ParameterSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FunName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramDS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ParamDS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ParameterSet>ParamDS"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ParamXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ParameterSet>ParamXml"));
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
