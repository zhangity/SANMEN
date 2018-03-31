/**
 * InsertTRIAGE_RECORDSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertTRIAGE_RECORDSResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertTRIAGE_RECORDSResult;

    public InsertTRIAGE_RECORDSResponse() {
    }

    public InsertTRIAGE_RECORDSResponse(
           org.tempuri.ReturnExComm insertTRIAGE_RECORDSResult) {
           this.insertTRIAGE_RECORDSResult = insertTRIAGE_RECORDSResult;
    }


    /**
     * Gets the insertTRIAGE_RECORDSResult value for this InsertTRIAGE_RECORDSResponse.
     * 
     * @return insertTRIAGE_RECORDSResult
     */
    public org.tempuri.ReturnExComm getInsertTRIAGE_RECORDSResult() {
        return insertTRIAGE_RECORDSResult;
    }


    /**
     * Sets the insertTRIAGE_RECORDSResult value for this InsertTRIAGE_RECORDSResponse.
     * 
     * @param insertTRIAGE_RECORDSResult
     */
    public void setInsertTRIAGE_RECORDSResult(org.tempuri.ReturnExComm insertTRIAGE_RECORDSResult) {
        this.insertTRIAGE_RECORDSResult = insertTRIAGE_RECORDSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertTRIAGE_RECORDSResponse)) return false;
        InsertTRIAGE_RECORDSResponse other = (InsertTRIAGE_RECORDSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertTRIAGE_RECORDSResult==null && other.getInsertTRIAGE_RECORDSResult()==null) || 
             (this.insertTRIAGE_RECORDSResult!=null &&
              this.insertTRIAGE_RECORDSResult.equals(other.getInsertTRIAGE_RECORDSResult())));
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
        if (getInsertTRIAGE_RECORDSResult() != null) {
            _hashCode += getInsertTRIAGE_RECORDSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertTRIAGE_RECORDSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertTRIAGE_RECORDSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertTRIAGE_RECORDSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertTRIAGE_RECORDSResult"));
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
