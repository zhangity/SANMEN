/**
 * GetBrdaxxbResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBrdaxxbResponse  implements java.io.Serializable {
    private org.tempuri.GetBrdaxxbResponseGetBrdaxxbResult getBrdaxxbResult;

    public GetBrdaxxbResponse() {
    }

    public GetBrdaxxbResponse(
           org.tempuri.GetBrdaxxbResponseGetBrdaxxbResult getBrdaxxbResult) {
           this.getBrdaxxbResult = getBrdaxxbResult;
    }


    /**
     * Gets the getBrdaxxbResult value for this GetBrdaxxbResponse.
     * 
     * @return getBrdaxxbResult
     */
    public org.tempuri.GetBrdaxxbResponseGetBrdaxxbResult getGetBrdaxxbResult() {
        return getBrdaxxbResult;
    }


    /**
     * Sets the getBrdaxxbResult value for this GetBrdaxxbResponse.
     * 
     * @param getBrdaxxbResult
     */
    public void setGetBrdaxxbResult(org.tempuri.GetBrdaxxbResponseGetBrdaxxbResult getBrdaxxbResult) {
        this.getBrdaxxbResult = getBrdaxxbResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBrdaxxbResponse)) return false;
        GetBrdaxxbResponse other = (GetBrdaxxbResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBrdaxxbResult==null && other.getGetBrdaxxbResult()==null) || 
             (this.getBrdaxxbResult!=null &&
              this.getBrdaxxbResult.equals(other.getGetBrdaxxbResult())));
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
        if (getGetBrdaxxbResult() != null) {
            _hashCode += getGetBrdaxxbResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBrdaxxbResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBrdaxxbResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBrdaxxbResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBrdaxxbResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetBrdaxxbResponse>GetBrdaxxbResult"));
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
