/**
 * GetYwhzForMZKSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetYwhzForMZKSResponse  implements java.io.Serializable {
    private org.tempuri.GetYwhzForMZKSResponseGetYwhzForMZKSResult getYwhzForMZKSResult;

    public GetYwhzForMZKSResponse() {
    }

    public GetYwhzForMZKSResponse(
           org.tempuri.GetYwhzForMZKSResponseGetYwhzForMZKSResult getYwhzForMZKSResult) {
           this.getYwhzForMZKSResult = getYwhzForMZKSResult;
    }


    /**
     * Gets the getYwhzForMZKSResult value for this GetYwhzForMZKSResponse.
     * 
     * @return getYwhzForMZKSResult
     */
    public org.tempuri.GetYwhzForMZKSResponseGetYwhzForMZKSResult getGetYwhzForMZKSResult() {
        return getYwhzForMZKSResult;
    }


    /**
     * Sets the getYwhzForMZKSResult value for this GetYwhzForMZKSResponse.
     * 
     * @param getYwhzForMZKSResult
     */
    public void setGetYwhzForMZKSResult(org.tempuri.GetYwhzForMZKSResponseGetYwhzForMZKSResult getYwhzForMZKSResult) {
        this.getYwhzForMZKSResult = getYwhzForMZKSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetYwhzForMZKSResponse)) return false;
        GetYwhzForMZKSResponse other = (GetYwhzForMZKSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getYwhzForMZKSResult==null && other.getGetYwhzForMZKSResult()==null) || 
             (this.getYwhzForMZKSResult!=null &&
              this.getYwhzForMZKSResult.equals(other.getGetYwhzForMZKSResult())));
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
        if (getGetYwhzForMZKSResult() != null) {
            _hashCode += getGetYwhzForMZKSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetYwhzForMZKSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetYwhzForMZKSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getYwhzForMZKSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetYwhzForMZKSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetYwhzForMZKSResponse>GetYwhzForMZKSResult"));
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
