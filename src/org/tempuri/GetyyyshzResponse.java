/**
 * GetyyyshzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetyyyshzResponse  implements java.io.Serializable {
    private org.tempuri.GetyyyshzResponseGetyyyshzResult getyyyshzResult;

    public GetyyyshzResponse() {
    }

    public GetyyyshzResponse(
           org.tempuri.GetyyyshzResponseGetyyyshzResult getyyyshzResult) {
           this.getyyyshzResult = getyyyshzResult;
    }


    /**
     * Gets the getyyyshzResult value for this GetyyyshzResponse.
     * 
     * @return getyyyshzResult
     */
    public org.tempuri.GetyyyshzResponseGetyyyshzResult getGetyyyshzResult() {
        return getyyyshzResult;
    }


    /**
     * Sets the getyyyshzResult value for this GetyyyshzResponse.
     * 
     * @param getyyyshzResult
     */
    public void setGetyyyshzResult(org.tempuri.GetyyyshzResponseGetyyyshzResult getyyyshzResult) {
        this.getyyyshzResult = getyyyshzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetyyyshzResponse)) return false;
        GetyyyshzResponse other = (GetyyyshzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getyyyshzResult==null && other.getGetyyyshzResult()==null) || 
             (this.getyyyshzResult!=null &&
              this.getyyyshzResult.equals(other.getGetyyyshzResult())));
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
        if (getGetyyyshzResult() != null) {
            _hashCode += getGetyyyshzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetyyyshzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetyyyshzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getyyyshzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetyyyshzResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetyyyshzResponse>GetyyyshzResult"));
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
