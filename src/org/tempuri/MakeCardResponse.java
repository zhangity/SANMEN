/**
 * MakeCardResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class MakeCardResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm makeCardResult;

    public MakeCardResponse() {
    }

    public MakeCardResponse(
           org.tempuri.ReturnExComm makeCardResult) {
           this.makeCardResult = makeCardResult;
    }


    /**
     * Gets the makeCardResult value for this MakeCardResponse.
     * 
     * @return makeCardResult
     */
    public org.tempuri.ReturnExComm getMakeCardResult() {
        return makeCardResult;
    }


    /**
     * Sets the makeCardResult value for this MakeCardResponse.
     * 
     * @param makeCardResult
     */
    public void setMakeCardResult(org.tempuri.ReturnExComm makeCardResult) {
        this.makeCardResult = makeCardResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MakeCardResponse)) return false;
        MakeCardResponse other = (MakeCardResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.makeCardResult==null && other.getMakeCardResult()==null) || 
             (this.makeCardResult!=null &&
              this.makeCardResult.equals(other.getMakeCardResult())));
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
        if (getMakeCardResult() != null) {
            _hashCode += getMakeCardResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MakeCardResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">MakeCardResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeCardResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MakeCardResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
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
