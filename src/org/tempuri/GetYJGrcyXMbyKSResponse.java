/**
 * GetYJGrcyXMbyKSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYJGrcyXMbyKSResponse  implements java.io.Serializable {
    private org.tempuri.GetYJGrcyXMbyKSResponseGetYJGrcyXMbyKSResult getYJGrcyXMbyKSResult;

    public GetYJGrcyXMbyKSResponse() {
    }

    public GetYJGrcyXMbyKSResponse(
           org.tempuri.GetYJGrcyXMbyKSResponseGetYJGrcyXMbyKSResult getYJGrcyXMbyKSResult) {
           this.getYJGrcyXMbyKSResult = getYJGrcyXMbyKSResult;
    }


    /**
     * Gets the getYJGrcyXMbyKSResult value for this GetYJGrcyXMbyKSResponse.
     * 
     * @return getYJGrcyXMbyKSResult
     */
    public org.tempuri.GetYJGrcyXMbyKSResponseGetYJGrcyXMbyKSResult getGetYJGrcyXMbyKSResult() {
        return getYJGrcyXMbyKSResult;
    }


    /**
     * Sets the getYJGrcyXMbyKSResult value for this GetYJGrcyXMbyKSResponse.
     * 
     * @param getYJGrcyXMbyKSResult
     */
    public void setGetYJGrcyXMbyKSResult(org.tempuri.GetYJGrcyXMbyKSResponseGetYJGrcyXMbyKSResult getYJGrcyXMbyKSResult) {
        this.getYJGrcyXMbyKSResult = getYJGrcyXMbyKSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYJGrcyXMbyKSResponse)) return false;
        GetYJGrcyXMbyKSResponse other = (GetYJGrcyXMbyKSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYJGrcyXMbyKSResult==null && other.getGetYJGrcyXMbyKSResult()==null) || 
             (this.getYJGrcyXMbyKSResult!=null &&
              this.getYJGrcyXMbyKSResult.equals(other.getGetYJGrcyXMbyKSResult())));
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
        if (getGetYJGrcyXMbyKSResult() != null) {
            _hashCode += getGetYJGrcyXMbyKSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYJGrcyXMbyKSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYJGrcyXMbyKSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYJGrcyXMbyKSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYJGrcyXMbyKSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYJGrcyXMbyKSResponse>GetYJGrcyXMbyKSResult"));
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
