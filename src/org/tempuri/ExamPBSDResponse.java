/**
 * ExamPBSDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ExamPBSDResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm examPBSDResult;

    public ExamPBSDResponse() {
    }

    public ExamPBSDResponse(
           org.tempuri.ReturnExComm examPBSDResult) {
           this.examPBSDResult = examPBSDResult;
    }


    /**
     * Gets the examPBSDResult value for this ExamPBSDResponse.
     * 
     * @return examPBSDResult
     */
    public org.tempuri.ReturnExComm getExamPBSDResult() {
        return examPBSDResult;
    }


    /**
     * Sets the examPBSDResult value for this ExamPBSDResponse.
     * 
     * @param examPBSDResult
     */
    public void setExamPBSDResult(org.tempuri.ReturnExComm examPBSDResult) {
        this.examPBSDResult = examPBSDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExamPBSDResponse)) return false;
        ExamPBSDResponse other = (ExamPBSDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.examPBSDResult==null && other.getExamPBSDResult()==null) || 
             (this.examPBSDResult!=null &&
              this.examPBSDResult.equals(other.getExamPBSDResult())));
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
        if (getExamPBSDResult() != null) {
            _hashCode += getExamPBSDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExamPBSDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ExamPBSDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("examPBSDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ExamPBSDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
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
