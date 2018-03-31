/**
 * GetPatientMasterInfobyCARD_NOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPatientMasterInfobyCARD_NOResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getPatientMasterInfobyCARD_NOResult;

    public GetPatientMasterInfobyCARD_NOResponse() {
    }

    public GetPatientMasterInfobyCARD_NOResponse(
           org.tempuri.ReturnExTable getPatientMasterInfobyCARD_NOResult) {
           this.getPatientMasterInfobyCARD_NOResult = getPatientMasterInfobyCARD_NOResult;
    }


    /**
     * Gets the getPatientMasterInfobyCARD_NOResult value for this GetPatientMasterInfobyCARD_NOResponse.
     * 
     * @return getPatientMasterInfobyCARD_NOResult
     */
    public org.tempuri.ReturnExTable getGetPatientMasterInfobyCARD_NOResult() {
        return getPatientMasterInfobyCARD_NOResult;
    }


    /**
     * Sets the getPatientMasterInfobyCARD_NOResult value for this GetPatientMasterInfobyCARD_NOResponse.
     * 
     * @param getPatientMasterInfobyCARD_NOResult
     */
    public void setGetPatientMasterInfobyCARD_NOResult(org.tempuri.ReturnExTable getPatientMasterInfobyCARD_NOResult) {
        this.getPatientMasterInfobyCARD_NOResult = getPatientMasterInfobyCARD_NOResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPatientMasterInfobyCARD_NOResponse)) return false;
        GetPatientMasterInfobyCARD_NOResponse other = (GetPatientMasterInfobyCARD_NOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPatientMasterInfobyCARD_NOResult==null && other.getGetPatientMasterInfobyCARD_NOResult()==null) || 
             (this.getPatientMasterInfobyCARD_NOResult!=null &&
              this.getPatientMasterInfobyCARD_NOResult.equals(other.getGetPatientMasterInfobyCARD_NOResult())));
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
        if (getGetPatientMasterInfobyCARD_NOResult() != null) {
            _hashCode += getGetPatientMasterInfobyCARD_NOResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPatientMasterInfobyCARD_NOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPatientMasterInfobyCARD_NOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPatientMasterInfobyCARD_NOResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPatientMasterInfobyCARD_NOResult"));
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
