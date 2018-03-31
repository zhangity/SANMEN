/**
 * ExcuteCommandAsSql.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ExcuteCommandAsSql  implements java.io.Serializable {
    private java.lang.String[] sqls;

    private java.lang.String connection;

    public ExcuteCommandAsSql() {
    }

    public ExcuteCommandAsSql(
           java.lang.String[] sqls,
           java.lang.String connection) {
           this.sqls = sqls;
           this.connection = connection;
    }


    /**
     * Gets the sqls value for this ExcuteCommandAsSql.
     * 
     * @return sqls
     */
    public java.lang.String[] getSqls() {
        return sqls;
    }


    /**
     * Sets the sqls value for this ExcuteCommandAsSql.
     * 
     * @param sqls
     */
    public void setSqls(java.lang.String[] sqls) {
        this.sqls = sqls;
    }


    /**
     * Gets the connection value for this ExcuteCommandAsSql.
     * 
     * @return connection
     */
    public java.lang.String getConnection() {
        return connection;
    }


    /**
     * Sets the connection value for this ExcuteCommandAsSql.
     * 
     * @param connection
     */
    public void setConnection(java.lang.String connection) {
        this.connection = connection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcuteCommandAsSql)) return false;
        ExcuteCommandAsSql other = (ExcuteCommandAsSql) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sqls==null && other.getSqls()==null) || 
             (this.sqls!=null &&
              java.util.Arrays.equals(this.sqls, other.getSqls()))) &&
            ((this.connection==null && other.getConnection()==null) || 
             (this.connection!=null &&
              this.connection.equals(other.getConnection())));
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
        if (getSqls() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSqls());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSqls(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConnection() != null) {
            _hashCode += getConnection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcuteCommandAsSql.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ExcuteCommandAsSql"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqls");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sqls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "connection"));
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
