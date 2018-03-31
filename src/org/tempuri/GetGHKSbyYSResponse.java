/**
 * GetGHKSbyYSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGHKSbyYSResponse  implements java.io.Serializable {
    private org.tempuri.GetGHKSbyYSResponseGetGHKSbyYSResult getGHKSbyYSResult;

    public GetGHKSbyYSResponse() {
    }

    public GetGHKSbyYSResponse(
           org.tempuri.GetGHKSbyYSResponseGetGHKSbyYSResult getGHKSbyYSResult) {
           this.getGHKSbyYSResult = getGHKSbyYSResult;
    }


    /**
     * Gets the getGHKSbyYSResult value for this GetGHKSbyYSResponse.
     * 
     * @return getGHKSbyYSResult
     */
    public org.tempuri.GetGHKSbyYSResponseGetGHKSbyYSResult getGetGHKSbyYSResult() {
        return getGHKSbyYSResult;
    }


    /**
     * Sets the getGHKSbyYSResult value for this GetGHKSbyYSResponse.
     * 
     * @param getGHKSbyYSResult
     */
    public void setGetGHKSbyYSResult(org.tempuri.GetGHKSbyYSResponseGetGHKSbyYSResult getGHKSbyYSResult) {
        this.getGHKSbyYSResult = getGHKSbyYSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGHKSbyYSResponse)) return false;
        GetGHKSbyYSResponse other = (GetGHKSbyYSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGHKSbyYSResult==null && other.getGetGHKSbyYSResult()==null) || 
             (this.getGHKSbyYSResult!=null &&
              this.getGHKSbyYSResult.equals(other.getGetGHKSbyYSResult())));
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
        if (getGetGHKSbyYSResult() != null) {
            _hashCode += getGetGHKSbyYSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGHKSbyYSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGHKSbyYSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGHKSbyYSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGHKSbyYSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetGHKSbyYSResponse>GetGHKSbyYSResult"));
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
