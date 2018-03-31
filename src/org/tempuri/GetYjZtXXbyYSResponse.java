/**
 * GetYjZtXXbyYSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYjZtXXbyYSResponse  implements java.io.Serializable {
    private org.tempuri.GetYjZtXXbyYSResponseGetYjZtXXbyYSResult getYjZtXXbyYSResult;

    public GetYjZtXXbyYSResponse() {
    }

    public GetYjZtXXbyYSResponse(
           org.tempuri.GetYjZtXXbyYSResponseGetYjZtXXbyYSResult getYjZtXXbyYSResult) {
           this.getYjZtXXbyYSResult = getYjZtXXbyYSResult;
    }


    /**
     * Gets the getYjZtXXbyYSResult value for this GetYjZtXXbyYSResponse.
     * 
     * @return getYjZtXXbyYSResult
     */
    public org.tempuri.GetYjZtXXbyYSResponseGetYjZtXXbyYSResult getGetYjZtXXbyYSResult() {
        return getYjZtXXbyYSResult;
    }


    /**
     * Sets the getYjZtXXbyYSResult value for this GetYjZtXXbyYSResponse.
     * 
     * @param getYjZtXXbyYSResult
     */
    public void setGetYjZtXXbyYSResult(org.tempuri.GetYjZtXXbyYSResponseGetYjZtXXbyYSResult getYjZtXXbyYSResult) {
        this.getYjZtXXbyYSResult = getYjZtXXbyYSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYjZtXXbyYSResponse)) return false;
        GetYjZtXXbyYSResponse other = (GetYjZtXXbyYSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYjZtXXbyYSResult==null && other.getGetYjZtXXbyYSResult()==null) || 
             (this.getYjZtXXbyYSResult!=null &&
              this.getYjZtXXbyYSResult.equals(other.getGetYjZtXXbyYSResult())));
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
        if (getGetYjZtXXbyYSResult() != null) {
            _hashCode += getGetYjZtXXbyYSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYjZtXXbyYSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYjZtXXbyYSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYjZtXXbyYSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYjZtXXbyYSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYjZtXXbyYSResponse>GetYjZtXXbyYSResult"));
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
