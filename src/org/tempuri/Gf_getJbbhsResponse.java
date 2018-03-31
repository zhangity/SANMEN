/**
 * Gf_getJbbhsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_getJbbhsResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable gf_getJbbhsResult;

    public Gf_getJbbhsResponse() {
    }

    public Gf_getJbbhsResponse(
           org.tempuri.ReturnExTable gf_getJbbhsResult) {
           this.gf_getJbbhsResult = gf_getJbbhsResult;
    }


    /**
     * Gets the gf_getJbbhsResult value for this Gf_getJbbhsResponse.
     * 
     * @return gf_getJbbhsResult
     */
    public org.tempuri.ReturnExTable getGf_getJbbhsResult() {
        return gf_getJbbhsResult;
    }


    /**
     * Sets the gf_getJbbhsResult value for this Gf_getJbbhsResponse.
     * 
     * @param gf_getJbbhsResult
     */
    public void setGf_getJbbhsResult(org.tempuri.ReturnExTable gf_getJbbhsResult) {
        this.gf_getJbbhsResult = gf_getJbbhsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_getJbbhsResponse)) return false;
        Gf_getJbbhsResponse other = (Gf_getJbbhsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_getJbbhsResult==null && other.getGf_getJbbhsResult()==null) || 
             (this.gf_getJbbhsResult!=null &&
              this.gf_getJbbhsResult.equals(other.getGf_getJbbhsResult())));
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
        if (getGf_getJbbhsResult() != null) {
            _hashCode += getGf_getJbbhsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_getJbbhsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_getJbbhsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_getJbbhsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_getJbbhsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
