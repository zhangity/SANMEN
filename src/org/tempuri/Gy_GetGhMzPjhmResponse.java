/**
 * Gy_GetGhMzPjhmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gy_GetGhMzPjhmResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm gy_GetGhMzPjhmResult;

    public Gy_GetGhMzPjhmResponse() {
    }

    public Gy_GetGhMzPjhmResponse(
           org.tempuri.ReturnExComm gy_GetGhMzPjhmResult) {
           this.gy_GetGhMzPjhmResult = gy_GetGhMzPjhmResult;
    }


    /**
     * Gets the gy_GetGhMzPjhmResult value for this Gy_GetGhMzPjhmResponse.
     * 
     * @return gy_GetGhMzPjhmResult
     */
    public org.tempuri.ReturnExComm getGy_GetGhMzPjhmResult() {
        return gy_GetGhMzPjhmResult;
    }


    /**
     * Sets the gy_GetGhMzPjhmResult value for this Gy_GetGhMzPjhmResponse.
     * 
     * @param gy_GetGhMzPjhmResult
     */
    public void setGy_GetGhMzPjhmResult(org.tempuri.ReturnExComm gy_GetGhMzPjhmResult) {
        this.gy_GetGhMzPjhmResult = gy_GetGhMzPjhmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gy_GetGhMzPjhmResponse)) return false;
        Gy_GetGhMzPjhmResponse other = (Gy_GetGhMzPjhmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gy_GetGhMzPjhmResult==null && other.getGy_GetGhMzPjhmResult()==null) || 
             (this.gy_GetGhMzPjhmResult!=null &&
              this.gy_GetGhMzPjhmResult.equals(other.getGy_GetGhMzPjhmResult())));
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
        if (getGy_GetGhMzPjhmResult() != null) {
            _hashCode += getGy_GetGhMzPjhmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gy_GetGhMzPjhmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gy_GetGhMzPjhmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gy_GetGhMzPjhmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gy_GetGhMzPjhmResult"));
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
