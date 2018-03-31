/**
 * GetDICT_SEXResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_SEXResponse  implements java.io.Serializable {
    private org.tempuri.GetDICT_SEXResponseGetDICT_SEXResult getDICT_SEXResult;

    public GetDICT_SEXResponse() {
    }

    public GetDICT_SEXResponse(
           org.tempuri.GetDICT_SEXResponseGetDICT_SEXResult getDICT_SEXResult) {
           this.getDICT_SEXResult = getDICT_SEXResult;
    }


    /**
     * Gets the getDICT_SEXResult value for this GetDICT_SEXResponse.
     * 
     * @return getDICT_SEXResult
     */
    public org.tempuri.GetDICT_SEXResponseGetDICT_SEXResult getGetDICT_SEXResult() {
        return getDICT_SEXResult;
    }


    /**
     * Sets the getDICT_SEXResult value for this GetDICT_SEXResponse.
     * 
     * @param getDICT_SEXResult
     */
    public void setGetDICT_SEXResult(org.tempuri.GetDICT_SEXResponseGetDICT_SEXResult getDICT_SEXResult) {
        this.getDICT_SEXResult = getDICT_SEXResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_SEXResponse)) return false;
        GetDICT_SEXResponse other = (GetDICT_SEXResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_SEXResult==null && other.getGetDICT_SEXResult()==null) || 
             (this.getDICT_SEXResult!=null &&
              this.getDICT_SEXResult.equals(other.getGetDICT_SEXResult())));
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
        if (getGetDICT_SEXResult() != null) {
            _hashCode += getGetDICT_SEXResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_SEXResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_SEXResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_SEXResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_SEXResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDICT_SEXResponse>GetDICT_SEXResult"));
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
