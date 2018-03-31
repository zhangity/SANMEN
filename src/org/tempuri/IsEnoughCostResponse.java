/**
 * IsEnoughCostResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class IsEnoughCostResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm isEnoughCostResult;

    public IsEnoughCostResponse() {
    }

    public IsEnoughCostResponse(
           org.tempuri.ReturnExComm isEnoughCostResult) {
           this.isEnoughCostResult = isEnoughCostResult;
    }


    /**
     * Gets the isEnoughCostResult value for this IsEnoughCostResponse.
     * 
     * @return isEnoughCostResult
     */
    public org.tempuri.ReturnExComm getIsEnoughCostResult() {
        return isEnoughCostResult;
    }


    /**
     * Sets the isEnoughCostResult value for this IsEnoughCostResponse.
     * 
     * @param isEnoughCostResult
     */
    public void setIsEnoughCostResult(org.tempuri.ReturnExComm isEnoughCostResult) {
        this.isEnoughCostResult = isEnoughCostResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsEnoughCostResponse)) return false;
        IsEnoughCostResponse other = (IsEnoughCostResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.isEnoughCostResult==null && other.getIsEnoughCostResult()==null) || 
             (this.isEnoughCostResult!=null &&
              this.isEnoughCostResult.equals(other.getIsEnoughCostResult())));
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
        if (getIsEnoughCostResult() != null) {
            _hashCode += getIsEnoughCostResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsEnoughCostResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">IsEnoughCostResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEnoughCostResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsEnoughCostResult"));
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
