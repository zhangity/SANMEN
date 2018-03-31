/**
 * GetGhDeptResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGhDeptResponse  implements java.io.Serializable {
    private org.tempuri.GetGhDeptResponseGetGhDeptResult getGhDeptResult;

    public GetGhDeptResponse() {
    }

    public GetGhDeptResponse(
           org.tempuri.GetGhDeptResponseGetGhDeptResult getGhDeptResult) {
           this.getGhDeptResult = getGhDeptResult;
    }


    /**
     * Gets the getGhDeptResult value for this GetGhDeptResponse.
     * 
     * @return getGhDeptResult
     */
    public org.tempuri.GetGhDeptResponseGetGhDeptResult getGetGhDeptResult() {
        return getGhDeptResult;
    }


    /**
     * Sets the getGhDeptResult value for this GetGhDeptResponse.
     * 
     * @param getGhDeptResult
     */
    public void setGetGhDeptResult(org.tempuri.GetGhDeptResponseGetGhDeptResult getGhDeptResult) {
        this.getGhDeptResult = getGhDeptResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGhDeptResponse)) return false;
        GetGhDeptResponse other = (GetGhDeptResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGhDeptResult==null && other.getGetGhDeptResult()==null) || 
             (this.getGhDeptResult!=null &&
              this.getGhDeptResult.equals(other.getGetGhDeptResult())));
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
        if (getGetGhDeptResult() != null) {
            _hashCode += getGetGhDeptResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGhDeptResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGhDeptResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGhDeptResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGhDeptResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetGhDeptResponse>GetGhDeptResult"));
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
