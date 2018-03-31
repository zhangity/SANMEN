/**
 * GetNbZdsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetNbZdsResponse  implements java.io.Serializable {
    private org.tempuri.GetNbZdsResponseGetNbZdsResult getNbZdsResult;

    public GetNbZdsResponse() {
    }

    public GetNbZdsResponse(
           org.tempuri.GetNbZdsResponseGetNbZdsResult getNbZdsResult) {
           this.getNbZdsResult = getNbZdsResult;
    }


    /**
     * Gets the getNbZdsResult value for this GetNbZdsResponse.
     * 
     * @return getNbZdsResult
     */
    public org.tempuri.GetNbZdsResponseGetNbZdsResult getGetNbZdsResult() {
        return getNbZdsResult;
    }


    /**
     * Sets the getNbZdsResult value for this GetNbZdsResponse.
     * 
     * @param getNbZdsResult
     */
    public void setGetNbZdsResult(org.tempuri.GetNbZdsResponseGetNbZdsResult getNbZdsResult) {
        this.getNbZdsResult = getNbZdsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetNbZdsResponse)) return false;
        GetNbZdsResponse other = (GetNbZdsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getNbZdsResult==null && other.getGetNbZdsResult()==null) || 
             (this.getNbZdsResult!=null &&
              this.getNbZdsResult.equals(other.getGetNbZdsResult())));
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
        if (getGetNbZdsResult() != null) {
            _hashCode += getGetNbZdsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetNbZdsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetNbZdsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getNbZdsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetNbZdsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetNbZdsResponse>GetNbZdsResult"));
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
