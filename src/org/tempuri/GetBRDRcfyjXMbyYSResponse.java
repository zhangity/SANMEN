/**
 * GetBRDRcfyjXMbyYSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBRDRcfyjXMbyYSResponse  implements java.io.Serializable {
    private org.tempuri.GetBRDRcfyjXMbyYSResponseGetBRDRcfyjXMbyYSResult getBRDRcfyjXMbyYSResult;

    public GetBRDRcfyjXMbyYSResponse() {
    }

    public GetBRDRcfyjXMbyYSResponse(
           org.tempuri.GetBRDRcfyjXMbyYSResponseGetBRDRcfyjXMbyYSResult getBRDRcfyjXMbyYSResult) {
           this.getBRDRcfyjXMbyYSResult = getBRDRcfyjXMbyYSResult;
    }


    /**
     * Gets the getBRDRcfyjXMbyYSResult value for this GetBRDRcfyjXMbyYSResponse.
     * 
     * @return getBRDRcfyjXMbyYSResult
     */
    public org.tempuri.GetBRDRcfyjXMbyYSResponseGetBRDRcfyjXMbyYSResult getGetBRDRcfyjXMbyYSResult() {
        return getBRDRcfyjXMbyYSResult;
    }


    /**
     * Sets the getBRDRcfyjXMbyYSResult value for this GetBRDRcfyjXMbyYSResponse.
     * 
     * @param getBRDRcfyjXMbyYSResult
     */
    public void setGetBRDRcfyjXMbyYSResult(org.tempuri.GetBRDRcfyjXMbyYSResponseGetBRDRcfyjXMbyYSResult getBRDRcfyjXMbyYSResult) {
        this.getBRDRcfyjXMbyYSResult = getBRDRcfyjXMbyYSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBRDRcfyjXMbyYSResponse)) return false;
        GetBRDRcfyjXMbyYSResponse other = (GetBRDRcfyjXMbyYSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBRDRcfyjXMbyYSResult==null && other.getGetBRDRcfyjXMbyYSResult()==null) || 
             (this.getBRDRcfyjXMbyYSResult!=null &&
              this.getBRDRcfyjXMbyYSResult.equals(other.getGetBRDRcfyjXMbyYSResult())));
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
        if (getGetBRDRcfyjXMbyYSResult() != null) {
            _hashCode += getGetBRDRcfyjXMbyYSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBRDRcfyjXMbyYSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBRDRcfyjXMbyYSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBRDRcfyjXMbyYSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBRDRcfyjXMbyYSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetBRDRcfyjXMbyYSResponse>GetBRDRcfyjXMbyYSResult"));
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
