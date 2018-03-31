/**
 * GetZyKSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZyKSResponse  implements java.io.Serializable {
    private org.tempuri.GetZyKSResponseGetZyKSResult getZyKSResult;

    public GetZyKSResponse() {
    }

    public GetZyKSResponse(
           org.tempuri.GetZyKSResponseGetZyKSResult getZyKSResult) {
           this.getZyKSResult = getZyKSResult;
    }


    /**
     * Gets the getZyKSResult value for this GetZyKSResponse.
     * 
     * @return getZyKSResult
     */
    public org.tempuri.GetZyKSResponseGetZyKSResult getGetZyKSResult() {
        return getZyKSResult;
    }


    /**
     * Sets the getZyKSResult value for this GetZyKSResponse.
     * 
     * @param getZyKSResult
     */
    public void setGetZyKSResult(org.tempuri.GetZyKSResponseGetZyKSResult getZyKSResult) {
        this.getZyKSResult = getZyKSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZyKSResponse)) return false;
        GetZyKSResponse other = (GetZyKSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZyKSResult==null && other.getGetZyKSResult()==null) || 
             (this.getZyKSResult!=null &&
              this.getZyKSResult.equals(other.getGetZyKSResult())));
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
        if (getGetZyKSResult() != null) {
            _hashCode += getGetZyKSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZyKSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZyKSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZyKSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZyKSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetZyKSResponse>GetZyKSResult"));
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
