/**
 * GetMzbrCf02Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzbrCf02Response  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getMzbrCf02Result;

    public GetMzbrCf02Response() {
    }

    public GetMzbrCf02Response(
           org.tempuri.ReturnExTable getMzbrCf02Result) {
           this.getMzbrCf02Result = getMzbrCf02Result;
    }


    /**
     * Gets the getMzbrCf02Result value for this GetMzbrCf02Response.
     * 
     * @return getMzbrCf02Result
     */
    public org.tempuri.ReturnExTable getGetMzbrCf02Result() {
        return getMzbrCf02Result;
    }


    /**
     * Sets the getMzbrCf02Result value for this GetMzbrCf02Response.
     * 
     * @param getMzbrCf02Result
     */
    public void setGetMzbrCf02Result(org.tempuri.ReturnExTable getMzbrCf02Result) {
        this.getMzbrCf02Result = getMzbrCf02Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzbrCf02Response)) return false;
        GetMzbrCf02Response other = (GetMzbrCf02Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMzbrCf02Result==null && other.getGetMzbrCf02Result()==null) || 
             (this.getMzbrCf02Result!=null &&
              this.getMzbrCf02Result.equals(other.getGetMzbrCf02Result())));
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
        if (getGetMzbrCf02Result() != null) {
            _hashCode += getGetMzbrCf02Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzbrCf02Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzbrCf02Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMzbrCf02Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMzbrCf02Result"));
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
