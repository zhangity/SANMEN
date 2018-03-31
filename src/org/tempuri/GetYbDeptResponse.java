/**
 * GetYbDeptResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYbDeptResponse  implements java.io.Serializable {
    private org.tempuri.GetYbDeptResponseGetYbDeptResult getYbDeptResult;

    public GetYbDeptResponse() {
    }

    public GetYbDeptResponse(
           org.tempuri.GetYbDeptResponseGetYbDeptResult getYbDeptResult) {
           this.getYbDeptResult = getYbDeptResult;
    }


    /**
     * Gets the getYbDeptResult value for this GetYbDeptResponse.
     * 
     * @return getYbDeptResult
     */
    public org.tempuri.GetYbDeptResponseGetYbDeptResult getGetYbDeptResult() {
        return getYbDeptResult;
    }


    /**
     * Sets the getYbDeptResult value for this GetYbDeptResponse.
     * 
     * @param getYbDeptResult
     */
    public void setGetYbDeptResult(org.tempuri.GetYbDeptResponseGetYbDeptResult getYbDeptResult) {
        this.getYbDeptResult = getYbDeptResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYbDeptResponse)) return false;
        GetYbDeptResponse other = (GetYbDeptResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYbDeptResult==null && other.getGetYbDeptResult()==null) || 
             (this.getYbDeptResult!=null &&
              this.getYbDeptResult.equals(other.getGetYbDeptResult())));
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
        if (getGetYbDeptResult() != null) {
            _hashCode += getGetYbDeptResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYbDeptResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYbDeptResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYbDeptResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYbDeptResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYbDeptResponse>GetYbDeptResult"));
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
