/**
 * GetPatientMasterbyID_NOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPatientMasterbyID_NOResponse  implements java.io.Serializable {
    private org.tempuri.GetPatientMasterbyID_NOResponseGetPatientMasterbyID_NOResult getPatientMasterbyID_NOResult;

    public GetPatientMasterbyID_NOResponse() {
    }

    public GetPatientMasterbyID_NOResponse(
           org.tempuri.GetPatientMasterbyID_NOResponseGetPatientMasterbyID_NOResult getPatientMasterbyID_NOResult) {
           this.getPatientMasterbyID_NOResult = getPatientMasterbyID_NOResult;
    }


    /**
     * Gets the getPatientMasterbyID_NOResult value for this GetPatientMasterbyID_NOResponse.
     * 
     * @return getPatientMasterbyID_NOResult
     */
    public org.tempuri.GetPatientMasterbyID_NOResponseGetPatientMasterbyID_NOResult getGetPatientMasterbyID_NOResult() {
        return getPatientMasterbyID_NOResult;
    }


    /**
     * Sets the getPatientMasterbyID_NOResult value for this GetPatientMasterbyID_NOResponse.
     * 
     * @param getPatientMasterbyID_NOResult
     */
    public void setGetPatientMasterbyID_NOResult(org.tempuri.GetPatientMasterbyID_NOResponseGetPatientMasterbyID_NOResult getPatientMasterbyID_NOResult) {
        this.getPatientMasterbyID_NOResult = getPatientMasterbyID_NOResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPatientMasterbyID_NOResponse)) return false;
        GetPatientMasterbyID_NOResponse other = (GetPatientMasterbyID_NOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPatientMasterbyID_NOResult==null && other.getGetPatientMasterbyID_NOResult()==null) || 
             (this.getPatientMasterbyID_NOResult!=null &&
              this.getPatientMasterbyID_NOResult.equals(other.getGetPatientMasterbyID_NOResult())));
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
        if (getGetPatientMasterbyID_NOResult() != null) {
            _hashCode += getGetPatientMasterbyID_NOResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPatientMasterbyID_NOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPatientMasterbyID_NOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPatientMasterbyID_NOResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPatientMasterbyID_NOResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPatientMasterbyID_NOResponse>GetPatientMasterbyID_NOResult"));
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
