/**
 * GetMzbrCf01Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrCf01Response  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getMzbrCf01Result;

    public GetMzbrCf01Response() {
    }

    public GetMzbrCf01Response(
           org.tempuri.ReturnExTable getMzbrCf01Result) {
           this.getMzbrCf01Result = getMzbrCf01Result;
    }


    /**
     * Gets the getMzbrCf01Result value for this GetMzbrCf01Response.
     * 
     * @return getMzbrCf01Result
     */
    public org.tempuri.ReturnExTable getGetMzbrCf01Result() {
        return getMzbrCf01Result;
    }


    /**
     * Sets the getMzbrCf01Result value for this GetMzbrCf01Response.
     * 
     * @param getMzbrCf01Result
     */
    public void setGetMzbrCf01Result(org.tempuri.ReturnExTable getMzbrCf01Result) {
        this.getMzbrCf01Result = getMzbrCf01Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrCf01Response)) return false;
        GetMzbrCf01Response other = (GetMzbrCf01Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzbrCf01Result==null && other.getGetMzbrCf01Result()==null) || 
             (this.getMzbrCf01Result!=null &&
              this.getMzbrCf01Result.equals(other.getGetMzbrCf01Result())));
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
        if (getGetMzbrCf01Result() != null) {
            _hashCode += getGetMzbrCf01Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrCf01Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrCf01Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzbrCf01Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzbrCf01Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
