/**
 * GetGhMzxxJzTjResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGhMzxxJzTjResponse  implements java.io.Serializable {
    private org.tempuri.GetGhMzxxJzTjResponseGetGhMzxxJzTjResult getGhMzxxJzTjResult;

    public GetGhMzxxJzTjResponse() {
    }

    public GetGhMzxxJzTjResponse(
           org.tempuri.GetGhMzxxJzTjResponseGetGhMzxxJzTjResult getGhMzxxJzTjResult) {
           this.getGhMzxxJzTjResult = getGhMzxxJzTjResult;
    }


    /**
     * Gets the getGhMzxxJzTjResult value for this GetGhMzxxJzTjResponse.
     * 
     * @return getGhMzxxJzTjResult
     */
    public org.tempuri.GetGhMzxxJzTjResponseGetGhMzxxJzTjResult getGetGhMzxxJzTjResult() {
        return getGhMzxxJzTjResult;
    }


    /**
     * Sets the getGhMzxxJzTjResult value for this GetGhMzxxJzTjResponse.
     * 
     * @param getGhMzxxJzTjResult
     */
    public void setGetGhMzxxJzTjResult(org.tempuri.GetGhMzxxJzTjResponseGetGhMzxxJzTjResult getGhMzxxJzTjResult) {
        this.getGhMzxxJzTjResult = getGhMzxxJzTjResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGhMzxxJzTjResponse)) return false;
        GetGhMzxxJzTjResponse other = (GetGhMzxxJzTjResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getGhMzxxJzTjResult==null && other.getGetGhMzxxJzTjResult()==null) || 
             (this.getGhMzxxJzTjResult!=null &&
              this.getGhMzxxJzTjResult.equals(other.getGetGhMzxxJzTjResult())));
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
        if (getGetGhMzxxJzTjResult() != null) {
            _hashCode += getGetGhMzxxJzTjResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGhMzxxJzTjResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGhMzxxJzTjResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getGhMzxxJzTjResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetGhMzxxJzTjResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetGhMzxxJzTjResponse>GetGhMzxxJzTjResult"));
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
