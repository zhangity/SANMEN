/**
 * GetTsbzlbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTsbzlbResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getTsbzlbResult;

    public GetTsbzlbResponse() {
    }

    public GetTsbzlbResponse(
           org.tempuri.ReturnExTable getTsbzlbResult) {
           this.getTsbzlbResult = getTsbzlbResult;
    }


    /**
     * Gets the getTsbzlbResult value for this GetTsbzlbResponse.
     * 
     * @return getTsbzlbResult
     */
    public org.tempuri.ReturnExTable getGetTsbzlbResult() {
        return getTsbzlbResult;
    }


    /**
     * Sets the getTsbzlbResult value for this GetTsbzlbResponse.
     * 
     * @param getTsbzlbResult
     */
    public void setGetTsbzlbResult(org.tempuri.ReturnExTable getTsbzlbResult) {
        this.getTsbzlbResult = getTsbzlbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTsbzlbResponse)) return false;
        GetTsbzlbResponse other = (GetTsbzlbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTsbzlbResult==null && other.getGetTsbzlbResult()==null) || 
             (this.getTsbzlbResult!=null &&
              this.getTsbzlbResult.equals(other.getGetTsbzlbResult())));
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
        if (getGetTsbzlbResult() != null) {
            _hashCode += getGetTsbzlbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTsbzlbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTsbzlbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTsbzlbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTsbzlbResult"));
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
