/**
 * GetGhhzForYSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGhhzForYSResponse  implements java.io.Serializable {
    private org.tempuri.GetGhhzForYSResponseGetGhhzForYSResult getGhhzForYSResult;

    public GetGhhzForYSResponse() {
    }

    public GetGhhzForYSResponse(
           org.tempuri.GetGhhzForYSResponseGetGhhzForYSResult getGhhzForYSResult) {
           this.getGhhzForYSResult = getGhhzForYSResult;
    }


    /**
     * Gets the getGhhzForYSResult value for this GetGhhzForYSResponse.
     * 
     * @return getGhhzForYSResult
     */
    public org.tempuri.GetGhhzForYSResponseGetGhhzForYSResult getGetGhhzForYSResult() {
        return getGhhzForYSResult;
    }


    /**
     * Sets the getGhhzForYSResult value for this GetGhhzForYSResponse.
     * 
     * @param getGhhzForYSResult
     */
    public void setGetGhhzForYSResult(org.tempuri.GetGhhzForYSResponseGetGhhzForYSResult getGhhzForYSResult) {
        this.getGhhzForYSResult = getGhhzForYSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGhhzForYSResponse)) return false;
        GetGhhzForYSResponse other = (GetGhhzForYSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGhhzForYSResult==null && other.getGetGhhzForYSResult()==null) || 
             (this.getGhhzForYSResult!=null &&
              this.getGhhzForYSResult.equals(other.getGetGhhzForYSResult())));
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
        if (getGetGhhzForYSResult() != null) {
            _hashCode += getGetGhhzForYSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGhhzForYSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGhhzForYSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGhhzForYSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGhhzForYSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetGhhzForYSResponse>GetGhhzForYSResult"));
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
