/**
 * EndVisitOrPayByIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class EndVisitOrPayByIDResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm endVisitOrPayByIDResult;

    public EndVisitOrPayByIDResponse() {
    }

    public EndVisitOrPayByIDResponse(
           org.tempuri.ReturnExComm endVisitOrPayByIDResult) {
           this.endVisitOrPayByIDResult = endVisitOrPayByIDResult;
    }


    /**
     * Gets the endVisitOrPayByIDResult value for this EndVisitOrPayByIDResponse.
     * 
     * @return endVisitOrPayByIDResult
     */
    public org.tempuri.ReturnExComm getEndVisitOrPayByIDResult() {
        return endVisitOrPayByIDResult;
    }


    /**
     * Sets the endVisitOrPayByIDResult value for this EndVisitOrPayByIDResponse.
     * 
     * @param endVisitOrPayByIDResult
     */
    public void setEndVisitOrPayByIDResult(org.tempuri.ReturnExComm endVisitOrPayByIDResult) {
        this.endVisitOrPayByIDResult = endVisitOrPayByIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EndVisitOrPayByIDResponse)) return false;
        EndVisitOrPayByIDResponse other = (EndVisitOrPayByIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endVisitOrPayByIDResult==null && other.getEndVisitOrPayByIDResult()==null) || 
             (this.endVisitOrPayByIDResult!=null &&
              this.endVisitOrPayByIDResult.equals(other.getEndVisitOrPayByIDResult())));
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
        if (getEndVisitOrPayByIDResult() != null) {
            _hashCode += getEndVisitOrPayByIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EndVisitOrPayByIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">EndVisitOrPayByIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endVisitOrPayByIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EndVisitOrPayByIDResult"));
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
