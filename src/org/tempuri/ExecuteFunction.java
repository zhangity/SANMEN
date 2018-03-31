/**
 * ExecuteFunction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ExecuteFunction  implements java.io.Serializable {
    private org.tempuri.ParameterSet ps;

    public ExecuteFunction() {
    }

    public ExecuteFunction(
           org.tempuri.ParameterSet ps) {
           this.ps = ps;
    }


    /**
     * Gets the ps value for this ExecuteFunction.
     * 
     * @return ps
     */
    public org.tempuri.ParameterSet getPs() {
        return ps;
    }


    /**
     * Sets the ps value for this ExecuteFunction.
     * 
     * @param ps
     */
    public void setPs(org.tempuri.ParameterSet ps) {
        this.ps = ps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteFunction)) return false;
        ExecuteFunction other = (ExecuteFunction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ps==null && other.getPs()==null) || 
             (this.ps!=null &&
              this.ps.equals(other.getPs())));
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
        if (getPs() != null) {
            _hashCode += getPs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteFunction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ExecuteFunction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ps");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ParameterSet"));
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
