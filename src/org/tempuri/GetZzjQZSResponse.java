/**
 * GetZzjQZSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZzjQZSResponse  implements java.io.Serializable {
    private org.tempuri.GetZzjQZSResponseGetZzjQZSResult getZzjQZSResult;

    public GetZzjQZSResponse() {
    }

    public GetZzjQZSResponse(
           org.tempuri.GetZzjQZSResponseGetZzjQZSResult getZzjQZSResult) {
           this.getZzjQZSResult = getZzjQZSResult;
    }


    /**
     * Gets the getZzjQZSResult value for this GetZzjQZSResponse.
     * 
     * @return getZzjQZSResult
     */
    public org.tempuri.GetZzjQZSResponseGetZzjQZSResult getGetZzjQZSResult() {
        return getZzjQZSResult;
    }


    /**
     * Sets the getZzjQZSResult value for this GetZzjQZSResponse.
     * 
     * @param getZzjQZSResult
     */
    public void setGetZzjQZSResult(org.tempuri.GetZzjQZSResponseGetZzjQZSResult getZzjQZSResult) {
        this.getZzjQZSResult = getZzjQZSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZzjQZSResponse)) return false;
        GetZzjQZSResponse other = (GetZzjQZSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZzjQZSResult==null && other.getGetZzjQZSResult()==null) || 
             (this.getZzjQZSResult!=null &&
              this.getZzjQZSResult.equals(other.getGetZzjQZSResult())));
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
        if (getGetZzjQZSResult() != null) {
            _hashCode += getGetZzjQZSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZzjQZSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZzjQZSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZzjQZSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZzjQZSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetZzjQZSResponse>GetZzjQZSResult"));
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
