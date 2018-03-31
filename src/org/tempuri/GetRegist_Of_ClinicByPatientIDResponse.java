/**
 * GetRegist_Of_ClinicByPatientIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetRegist_Of_ClinicByPatientIDResponse  implements java.io.Serializable {
    private org.tempuri.GetRegist_Of_ClinicByPatientIDResponseGetRegist_Of_ClinicByPatientIDResult getRegist_Of_ClinicByPatientIDResult;

    public GetRegist_Of_ClinicByPatientIDResponse() {
    }

    public GetRegist_Of_ClinicByPatientIDResponse(
           org.tempuri.GetRegist_Of_ClinicByPatientIDResponseGetRegist_Of_ClinicByPatientIDResult getRegist_Of_ClinicByPatientIDResult) {
           this.getRegist_Of_ClinicByPatientIDResult = getRegist_Of_ClinicByPatientIDResult;
    }


    /**
     * Gets the getRegist_Of_ClinicByPatientIDResult value for this GetRegist_Of_ClinicByPatientIDResponse.
     * 
     * @return getRegist_Of_ClinicByPatientIDResult
     */
    public org.tempuri.GetRegist_Of_ClinicByPatientIDResponseGetRegist_Of_ClinicByPatientIDResult getGetRegist_Of_ClinicByPatientIDResult() {
        return getRegist_Of_ClinicByPatientIDResult;
    }


    /**
     * Sets the getRegist_Of_ClinicByPatientIDResult value for this GetRegist_Of_ClinicByPatientIDResponse.
     * 
     * @param getRegist_Of_ClinicByPatientIDResult
     */
    public void setGetRegist_Of_ClinicByPatientIDResult(org.tempuri.GetRegist_Of_ClinicByPatientIDResponseGetRegist_Of_ClinicByPatientIDResult getRegist_Of_ClinicByPatientIDResult) {
        this.getRegist_Of_ClinicByPatientIDResult = getRegist_Of_ClinicByPatientIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRegist_Of_ClinicByPatientIDResponse)) return false;
        GetRegist_Of_ClinicByPatientIDResponse other = (GetRegist_Of_ClinicByPatientIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRegist_Of_ClinicByPatientIDResult==null && other.getGetRegist_Of_ClinicByPatientIDResult()==null) || 
             (this.getRegist_Of_ClinicByPatientIDResult!=null &&
              this.getRegist_Of_ClinicByPatientIDResult.equals(other.getGetRegist_Of_ClinicByPatientIDResult())));
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
        if (getGetRegist_Of_ClinicByPatientIDResult() != null) {
            _hashCode += getGetRegist_Of_ClinicByPatientIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRegist_Of_ClinicByPatientIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRegist_Of_ClinicByPatientIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRegist_Of_ClinicByPatientIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetRegist_Of_ClinicByPatientIDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetRegist_Of_ClinicByPatientIDResponse>GetRegist_Of_ClinicByPatientIDResult"));
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
