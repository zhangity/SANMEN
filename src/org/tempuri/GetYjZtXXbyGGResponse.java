/**
 * GetYjZtXXbyGGResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYjZtXXbyGGResponse  implements java.io.Serializable {
    private org.tempuri.GetYjZtXXbyGGResponseGetYjZtXXbyGGResult getYjZtXXbyGGResult;

    public GetYjZtXXbyGGResponse() {
    }

    public GetYjZtXXbyGGResponse(
           org.tempuri.GetYjZtXXbyGGResponseGetYjZtXXbyGGResult getYjZtXXbyGGResult) {
           this.getYjZtXXbyGGResult = getYjZtXXbyGGResult;
    }


    /**
     * Gets the getYjZtXXbyGGResult value for this GetYjZtXXbyGGResponse.
     * 
     * @return getYjZtXXbyGGResult
     */
    public org.tempuri.GetYjZtXXbyGGResponseGetYjZtXXbyGGResult getGetYjZtXXbyGGResult() {
        return getYjZtXXbyGGResult;
    }


    /**
     * Sets the getYjZtXXbyGGResult value for this GetYjZtXXbyGGResponse.
     * 
     * @param getYjZtXXbyGGResult
     */
    public void setGetYjZtXXbyGGResult(org.tempuri.GetYjZtXXbyGGResponseGetYjZtXXbyGGResult getYjZtXXbyGGResult) {
        this.getYjZtXXbyGGResult = getYjZtXXbyGGResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYjZtXXbyGGResponse)) return false;
        GetYjZtXXbyGGResponse other = (GetYjZtXXbyGGResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYjZtXXbyGGResult==null && other.getGetYjZtXXbyGGResult()==null) || 
             (this.getYjZtXXbyGGResult!=null &&
              this.getYjZtXXbyGGResult.equals(other.getGetYjZtXXbyGGResult())));
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
        if (getGetYjZtXXbyGGResult() != null) {
            _hashCode += getGetYjZtXXbyGGResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYjZtXXbyGGResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYjZtXXbyGGResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYjZtXXbyGGResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYjZtXXbyGGResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYjZtXXbyGGResponse>GetYjZtXXbyGGResult"));
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
