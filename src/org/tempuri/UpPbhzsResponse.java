/**
 * UpPbhzsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpPbhzsResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm upPbhzsResult;

    public UpPbhzsResponse() {
    }

    public UpPbhzsResponse(
           org.tempuri.ReturnExComm upPbhzsResult) {
           this.upPbhzsResult = upPbhzsResult;
    }


    /**
     * Gets the upPbhzsResult value for this UpPbhzsResponse.
     * 
     * @return upPbhzsResult
     */
    public org.tempuri.ReturnExComm getUpPbhzsResult() {
        return upPbhzsResult;
    }


    /**
     * Sets the upPbhzsResult value for this UpPbhzsResponse.
     * 
     * @param upPbhzsResult
     */
    public void setUpPbhzsResult(org.tempuri.ReturnExComm upPbhzsResult) {
        this.upPbhzsResult = upPbhzsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpPbhzsResponse)) return false;
        UpPbhzsResponse other = (UpPbhzsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.upPbhzsResult==null && other.getUpPbhzsResult()==null) || 
             (this.upPbhzsResult!=null &&
              this.upPbhzsResult.equals(other.getUpPbhzsResult())));
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
        if (getUpPbhzsResult() != null) {
            _hashCode += getUpPbhzsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpPbhzsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpPbhzsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upPbhzsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpPbhzsResult"));
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
