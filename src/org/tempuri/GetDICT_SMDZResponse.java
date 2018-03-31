/**
 * GetDICT_SMDZResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_SMDZResponse  implements java.io.Serializable {
    private org.tempuri.GetDICT_SMDZResponseGetDICT_SMDZResult getDICT_SMDZResult;

    public GetDICT_SMDZResponse() {
    }

    public GetDICT_SMDZResponse(
           org.tempuri.GetDICT_SMDZResponseGetDICT_SMDZResult getDICT_SMDZResult) {
           this.getDICT_SMDZResult = getDICT_SMDZResult;
    }


    /**
     * Gets the getDICT_SMDZResult value for this GetDICT_SMDZResponse.
     * 
     * @return getDICT_SMDZResult
     */
    public org.tempuri.GetDICT_SMDZResponseGetDICT_SMDZResult getGetDICT_SMDZResult() {
        return getDICT_SMDZResult;
    }


    /**
     * Sets the getDICT_SMDZResult value for this GetDICT_SMDZResponse.
     * 
     * @param getDICT_SMDZResult
     */
    public void setGetDICT_SMDZResult(org.tempuri.GetDICT_SMDZResponseGetDICT_SMDZResult getDICT_SMDZResult) {
        this.getDICT_SMDZResult = getDICT_SMDZResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_SMDZResponse)) return false;
        GetDICT_SMDZResponse other = (GetDICT_SMDZResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_SMDZResult==null && other.getGetDICT_SMDZResult()==null) || 
             (this.getDICT_SMDZResult!=null &&
              this.getDICT_SMDZResult.equals(other.getGetDICT_SMDZResult())));
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
        if (getGetDICT_SMDZResult() != null) {
            _hashCode += getGetDICT_SMDZResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_SMDZResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_SMDZResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_SMDZResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_SMDZResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDICT_SMDZResponse>GetDICT_SMDZResult"));
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
