/**
 * GetYjZtXXbyKSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYjZtXXbyKSResponse  implements java.io.Serializable {
    private org.tempuri.GetYjZtXXbyKSResponseGetYjZtXXbyKSResult getYjZtXXbyKSResult;

    public GetYjZtXXbyKSResponse() {
    }

    public GetYjZtXXbyKSResponse(
           org.tempuri.GetYjZtXXbyKSResponseGetYjZtXXbyKSResult getYjZtXXbyKSResult) {
           this.getYjZtXXbyKSResult = getYjZtXXbyKSResult;
    }


    /**
     * Gets the getYjZtXXbyKSResult value for this GetYjZtXXbyKSResponse.
     * 
     * @return getYjZtXXbyKSResult
     */
    public org.tempuri.GetYjZtXXbyKSResponseGetYjZtXXbyKSResult getGetYjZtXXbyKSResult() {
        return getYjZtXXbyKSResult;
    }


    /**
     * Sets the getYjZtXXbyKSResult value for this GetYjZtXXbyKSResponse.
     * 
     * @param getYjZtXXbyKSResult
     */
    public void setGetYjZtXXbyKSResult(org.tempuri.GetYjZtXXbyKSResponseGetYjZtXXbyKSResult getYjZtXXbyKSResult) {
        this.getYjZtXXbyKSResult = getYjZtXXbyKSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYjZtXXbyKSResponse)) return false;
        GetYjZtXXbyKSResponse other = (GetYjZtXXbyKSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYjZtXXbyKSResult==null && other.getGetYjZtXXbyKSResult()==null) || 
             (this.getYjZtXXbyKSResult!=null &&
              this.getYjZtXXbyKSResult.equals(other.getGetYjZtXXbyKSResult())));
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
        if (getGetYjZtXXbyKSResult() != null) {
            _hashCode += getGetYjZtXXbyKSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYjZtXXbyKSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYjZtXXbyKSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYjZtXXbyKSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYjZtXXbyKSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYjZtXXbyKSResponse>GetYjZtXXbyKSResult"));
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
