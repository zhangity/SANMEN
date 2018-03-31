/**
 * GetDOCTORResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDOCTORResponse  implements java.io.Serializable {
    private org.tempuri.GetDOCTORResponseGetDOCTORResult getDOCTORResult;

    public GetDOCTORResponse() {
    }

    public GetDOCTORResponse(
           org.tempuri.GetDOCTORResponseGetDOCTORResult getDOCTORResult) {
           this.getDOCTORResult = getDOCTORResult;
    }


    /**
     * Gets the getDOCTORResult value for this GetDOCTORResponse.
     * 
     * @return getDOCTORResult
     */
    public org.tempuri.GetDOCTORResponseGetDOCTORResult getGetDOCTORResult() {
        return getDOCTORResult;
    }


    /**
     * Sets the getDOCTORResult value for this GetDOCTORResponse.
     * 
     * @param getDOCTORResult
     */
    public void setGetDOCTORResult(org.tempuri.GetDOCTORResponseGetDOCTORResult getDOCTORResult) {
        this.getDOCTORResult = getDOCTORResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDOCTORResponse)) return false;
        GetDOCTORResponse other = (GetDOCTORResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDOCTORResult==null && other.getGetDOCTORResult()==null) || 
             (this.getDOCTORResult!=null &&
              this.getDOCTORResult.equals(other.getGetDOCTORResult())));
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
        if (getGetDOCTORResult() != null) {
            _hashCode += getGetDOCTORResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDOCTORResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDOCTORResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDOCTORResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDOCTORResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDOCTORResponse>GetDOCTORResult"));
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
