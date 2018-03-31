/**
 * GetRegistOfClinicByJzhmResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetRegistOfClinicByJzhmResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getRegistOfClinicByJzhmResult;

    public GetRegistOfClinicByJzhmResponse() {
    }

    public GetRegistOfClinicByJzhmResponse(
           org.tempuri.ReturnExTable getRegistOfClinicByJzhmResult) {
           this.getRegistOfClinicByJzhmResult = getRegistOfClinicByJzhmResult;
    }


    /**
     * Gets the getRegistOfClinicByJzhmResult value for this GetRegistOfClinicByJzhmResponse.
     * 
     * @return getRegistOfClinicByJzhmResult
     */
    public org.tempuri.ReturnExTable getGetRegistOfClinicByJzhmResult() {
        return getRegistOfClinicByJzhmResult;
    }


    /**
     * Sets the getRegistOfClinicByJzhmResult value for this GetRegistOfClinicByJzhmResponse.
     * 
     * @param getRegistOfClinicByJzhmResult
     */
    public void setGetRegistOfClinicByJzhmResult(org.tempuri.ReturnExTable getRegistOfClinicByJzhmResult) {
        this.getRegistOfClinicByJzhmResult = getRegistOfClinicByJzhmResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRegistOfClinicByJzhmResponse)) return false;
        GetRegistOfClinicByJzhmResponse other = (GetRegistOfClinicByJzhmResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRegistOfClinicByJzhmResult==null && other.getGetRegistOfClinicByJzhmResult()==null) || 
             (this.getRegistOfClinicByJzhmResult!=null &&
              this.getRegistOfClinicByJzhmResult.equals(other.getGetRegistOfClinicByJzhmResult())));
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
        if (getGetRegistOfClinicByJzhmResult() != null) {
            _hashCode += getGetRegistOfClinicByJzhmResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRegistOfClinicByJzhmResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRegistOfClinicByJzhmResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRegistOfClinicByJzhmResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetRegistOfClinicByJzhmResult"));
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
