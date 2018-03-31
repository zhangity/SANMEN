/**
 * GetDICT_OCCUPATIONResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_OCCUPATIONResponse  implements java.io.Serializable {
    private org.tempuri.GetDICT_OCCUPATIONResponseGetDICT_OCCUPATIONResult getDICT_OCCUPATIONResult;

    public GetDICT_OCCUPATIONResponse() {
    }

    public GetDICT_OCCUPATIONResponse(
           org.tempuri.GetDICT_OCCUPATIONResponseGetDICT_OCCUPATIONResult getDICT_OCCUPATIONResult) {
           this.getDICT_OCCUPATIONResult = getDICT_OCCUPATIONResult;
    }


    /**
     * Gets the getDICT_OCCUPATIONResult value for this GetDICT_OCCUPATIONResponse.
     * 
     * @return getDICT_OCCUPATIONResult
     */
    public org.tempuri.GetDICT_OCCUPATIONResponseGetDICT_OCCUPATIONResult getGetDICT_OCCUPATIONResult() {
        return getDICT_OCCUPATIONResult;
    }


    /**
     * Sets the getDICT_OCCUPATIONResult value for this GetDICT_OCCUPATIONResponse.
     * 
     * @param getDICT_OCCUPATIONResult
     */
    public void setGetDICT_OCCUPATIONResult(org.tempuri.GetDICT_OCCUPATIONResponseGetDICT_OCCUPATIONResult getDICT_OCCUPATIONResult) {
        this.getDICT_OCCUPATIONResult = getDICT_OCCUPATIONResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_OCCUPATIONResponse)) return false;
        GetDICT_OCCUPATIONResponse other = (GetDICT_OCCUPATIONResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_OCCUPATIONResult==null && other.getGetDICT_OCCUPATIONResult()==null) || 
             (this.getDICT_OCCUPATIONResult!=null &&
              this.getDICT_OCCUPATIONResult.equals(other.getGetDICT_OCCUPATIONResult())));
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
        if (getGetDICT_OCCUPATIONResult() != null) {
            _hashCode += getGetDICT_OCCUPATIONResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_OCCUPATIONResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_OCCUPATIONResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_OCCUPATIONResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_OCCUPATIONResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDICT_OCCUPATIONResponse>GetDICT_OCCUPATIONResult"));
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
