/**
 * DelExamPbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DelExamPbResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm delExamPbResult;

    public DelExamPbResponse() {
    }

    public DelExamPbResponse(
           org.tempuri.ReturnExComm delExamPbResult) {
           this.delExamPbResult = delExamPbResult;
    }


    /**
     * Gets the delExamPbResult value for this DelExamPbResponse.
     * 
     * @return delExamPbResult
     */
    public org.tempuri.ReturnExComm getDelExamPbResult() {
        return delExamPbResult;
    }


    /**
     * Sets the delExamPbResult value for this DelExamPbResponse.
     * 
     * @param delExamPbResult
     */
    public void setDelExamPbResult(org.tempuri.ReturnExComm delExamPbResult) {
        this.delExamPbResult = delExamPbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DelExamPbResponse)) return false;
        DelExamPbResponse other = (DelExamPbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.delExamPbResult==null && other.getDelExamPbResult()==null) || 
             (this.delExamPbResult!=null &&
              this.delExamPbResult.equals(other.getDelExamPbResult())));
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
        if (getDelExamPbResult() != null) {
            _hashCode += getDelExamPbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DelExamPbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DelExamPbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delExamPbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DelExamPbResult"));
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
