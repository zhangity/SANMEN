/**
 * GetExam_ScheduleByItemIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetExam_ScheduleByItemIDResponse  implements java.io.Serializable {
    private org.tempuri.GetExam_ScheduleByItemIDResponseGetExam_ScheduleByItemIDResult getExam_ScheduleByItemIDResult;

    public GetExam_ScheduleByItemIDResponse() {
    }

    public GetExam_ScheduleByItemIDResponse(
           org.tempuri.GetExam_ScheduleByItemIDResponseGetExam_ScheduleByItemIDResult getExam_ScheduleByItemIDResult) {
           this.getExam_ScheduleByItemIDResult = getExam_ScheduleByItemIDResult;
    }


    /**
     * Gets the getExam_ScheduleByItemIDResult value for this GetExam_ScheduleByItemIDResponse.
     * 
     * @return getExam_ScheduleByItemIDResult
     */
    public org.tempuri.GetExam_ScheduleByItemIDResponseGetExam_ScheduleByItemIDResult getGetExam_ScheduleByItemIDResult() {
        return getExam_ScheduleByItemIDResult;
    }


    /**
     * Sets the getExam_ScheduleByItemIDResult value for this GetExam_ScheduleByItemIDResponse.
     * 
     * @param getExam_ScheduleByItemIDResult
     */
    public void setGetExam_ScheduleByItemIDResult(org.tempuri.GetExam_ScheduleByItemIDResponseGetExam_ScheduleByItemIDResult getExam_ScheduleByItemIDResult) {
        this.getExam_ScheduleByItemIDResult = getExam_ScheduleByItemIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExam_ScheduleByItemIDResponse)) return false;
        GetExam_ScheduleByItemIDResponse other = (GetExam_ScheduleByItemIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getExam_ScheduleByItemIDResult==null && other.getGetExam_ScheduleByItemIDResult()==null) || 
             (this.getExam_ScheduleByItemIDResult!=null &&
              this.getExam_ScheduleByItemIDResult.equals(other.getGetExam_ScheduleByItemIDResult())));
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
        if (getGetExam_ScheduleByItemIDResult() != null) {
            _hashCode += getGetExam_ScheduleByItemIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExam_ScheduleByItemIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetExam_ScheduleByItemIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getExam_ScheduleByItemIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetExam_ScheduleByItemIDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetExam_ScheduleByItemIDResponse>GetExam_ScheduleByItemIDResult"));
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
