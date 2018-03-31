/**
 * GetGhhzForGHKSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGhhzForGHKSResponse  implements java.io.Serializable {
    private org.tempuri.GetGhhzForGHKSResponseGetGhhzForGHKSResult getGhhzForGHKSResult;

    public GetGhhzForGHKSResponse() {
    }

    public GetGhhzForGHKSResponse(
           org.tempuri.GetGhhzForGHKSResponseGetGhhzForGHKSResult getGhhzForGHKSResult) {
           this.getGhhzForGHKSResult = getGhhzForGHKSResult;
    }


    /**
     * Gets the getGhhzForGHKSResult value for this GetGhhzForGHKSResponse.
     * 
     * @return getGhhzForGHKSResult
     */
    public org.tempuri.GetGhhzForGHKSResponseGetGhhzForGHKSResult getGetGhhzForGHKSResult() {
        return getGhhzForGHKSResult;
    }


    /**
     * Sets the getGhhzForGHKSResult value for this GetGhhzForGHKSResponse.
     * 
     * @param getGhhzForGHKSResult
     */
    public void setGetGhhzForGHKSResult(org.tempuri.GetGhhzForGHKSResponseGetGhhzForGHKSResult getGhhzForGHKSResult) {
        this.getGhhzForGHKSResult = getGhhzForGHKSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGhhzForGHKSResponse)) return false;
        GetGhhzForGHKSResponse other = (GetGhhzForGHKSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGhhzForGHKSResult==null && other.getGetGhhzForGHKSResult()==null) || 
             (this.getGhhzForGHKSResult!=null &&
              this.getGhhzForGHKSResult.equals(other.getGetGhhzForGHKSResult())));
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
        if (getGetGhhzForGHKSResult() != null) {
            _hashCode += getGetGhhzForGHKSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGhhzForGHKSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGhhzForGHKSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGhhzForGHKSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGhhzForGHKSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetGhhzForGHKSResponse>GetGhhzForGHKSResult"));
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
