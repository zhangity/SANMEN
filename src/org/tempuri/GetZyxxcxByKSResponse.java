/**
 * GetZyxxcxByKSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetZyxxcxByKSResponse  implements java.io.Serializable {
    private org.tempuri.GetZyxxcxByKSResponseGetZyxxcxByKSResult getZyxxcxByKSResult;

    public GetZyxxcxByKSResponse() {
    }

    public GetZyxxcxByKSResponse(
           org.tempuri.GetZyxxcxByKSResponseGetZyxxcxByKSResult getZyxxcxByKSResult) {
           this.getZyxxcxByKSResult = getZyxxcxByKSResult;
    }


    /**
     * Gets the getZyxxcxByKSResult value for this GetZyxxcxByKSResponse.
     * 
     * @return getZyxxcxByKSResult
     */
    public org.tempuri.GetZyxxcxByKSResponseGetZyxxcxByKSResult getGetZyxxcxByKSResult() {
        return getZyxxcxByKSResult;
    }


    /**
     * Sets the getZyxxcxByKSResult value for this GetZyxxcxByKSResponse.
     * 
     * @param getZyxxcxByKSResult
     */
    public void setGetZyxxcxByKSResult(org.tempuri.GetZyxxcxByKSResponseGetZyxxcxByKSResult getZyxxcxByKSResult) {
        this.getZyxxcxByKSResult = getZyxxcxByKSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetZyxxcxByKSResponse)) return false;
        GetZyxxcxByKSResponse other = (GetZyxxcxByKSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getZyxxcxByKSResult==null && other.getGetZyxxcxByKSResult()==null) || 
             (this.getZyxxcxByKSResult!=null &&
              this.getZyxxcxByKSResult.equals(other.getGetZyxxcxByKSResult())));
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
        if (getGetZyxxcxByKSResult() != null) {
            _hashCode += getGetZyxxcxByKSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetZyxxcxByKSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetZyxxcxByKSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getZyxxcxByKSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetZyxxcxByKSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetZyxxcxByKSResponse>GetZyxxcxByKSResult"));
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
