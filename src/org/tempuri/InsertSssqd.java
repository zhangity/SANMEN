/**
 * InsertSssqd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertSssqd  implements java.io.Serializable {
    private org.tempuri.PatientSssqdClass model;

    private java.lang.String[] str;

    public InsertSssqd() {
    }

    public InsertSssqd(
           org.tempuri.PatientSssqdClass model,
           java.lang.String[] str) {
           this.model = model;
           this.str = str;
    }


    /**
     * Gets the model value for this InsertSssqd.
     * 
     * @return model
     */
    public org.tempuri.PatientSssqdClass getModel() {
        return model;
    }


    /**
     * Sets the model value for this InsertSssqd.
     * 
     * @param model
     */
    public void setModel(org.tempuri.PatientSssqdClass model) {
        this.model = model;
    }


    /**
     * Gets the str value for this InsertSssqd.
     * 
     * @return str
     */
    public java.lang.String[] getStr() {
        return str;
    }


    /**
     * Sets the str value for this InsertSssqd.
     * 
     * @param str
     */
    public void setStr(java.lang.String[] str) {
        this.str = str;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertSssqd)) return false;
        InsertSssqd other = (InsertSssqd) obj;
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
            ((this.str==null && other.getStr()==null) || 
             (this.str!=null &&
              java.util.Arrays.equals(this.str, other.getStr())));
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
        if (getStr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertSssqd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertSssqd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PatientSssqdClass"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("str");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
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
