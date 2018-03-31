/**
 * GetDICT_COUNTRYResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDICT_COUNTRYResponse  implements java.io.Serializable {
    private org.tempuri.GetDICT_COUNTRYResponseGetDICT_COUNTRYResult getDICT_COUNTRYResult;

    public GetDICT_COUNTRYResponse() {
    }

    public GetDICT_COUNTRYResponse(
           org.tempuri.GetDICT_COUNTRYResponseGetDICT_COUNTRYResult getDICT_COUNTRYResult) {
           this.getDICT_COUNTRYResult = getDICT_COUNTRYResult;
    }


    /**
     * Gets the getDICT_COUNTRYResult value for this GetDICT_COUNTRYResponse.
     * 
     * @return getDICT_COUNTRYResult
     */
    public org.tempuri.GetDICT_COUNTRYResponseGetDICT_COUNTRYResult getGetDICT_COUNTRYResult() {
        return getDICT_COUNTRYResult;
    }


    /**
     * Sets the getDICT_COUNTRYResult value for this GetDICT_COUNTRYResponse.
     * 
     * @param getDICT_COUNTRYResult
     */
    public void setGetDICT_COUNTRYResult(org.tempuri.GetDICT_COUNTRYResponseGetDICT_COUNTRYResult getDICT_COUNTRYResult) {
        this.getDICT_COUNTRYResult = getDICT_COUNTRYResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDICT_COUNTRYResponse)) return false;
        GetDICT_COUNTRYResponse other = (GetDICT_COUNTRYResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDICT_COUNTRYResult==null && other.getGetDICT_COUNTRYResult()==null) || 
             (this.getDICT_COUNTRYResult!=null &&
              this.getDICT_COUNTRYResult.equals(other.getGetDICT_COUNTRYResult())));
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
        if (getGetDICT_COUNTRYResult() != null) {
            _hashCode += getGetDICT_COUNTRYResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDICT_COUNTRYResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDICT_COUNTRYResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDICT_COUNTRYResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDICT_COUNTRYResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDICT_COUNTRYResponse>GetDICT_COUNTRYResult"));
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
