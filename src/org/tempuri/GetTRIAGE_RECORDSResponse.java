/**
 * GetTRIAGE_RECORDSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTRIAGE_RECORDSResponse  implements java.io.Serializable {
    private org.tempuri.GetTRIAGE_RECORDSResponseGetTRIAGE_RECORDSResult getTRIAGE_RECORDSResult;

    public GetTRIAGE_RECORDSResponse() {
    }

    public GetTRIAGE_RECORDSResponse(
           org.tempuri.GetTRIAGE_RECORDSResponseGetTRIAGE_RECORDSResult getTRIAGE_RECORDSResult) {
           this.getTRIAGE_RECORDSResult = getTRIAGE_RECORDSResult;
    }


    /**
     * Gets the getTRIAGE_RECORDSResult value for this GetTRIAGE_RECORDSResponse.
     * 
     * @return getTRIAGE_RECORDSResult
     */
    public org.tempuri.GetTRIAGE_RECORDSResponseGetTRIAGE_RECORDSResult getGetTRIAGE_RECORDSResult() {
        return getTRIAGE_RECORDSResult;
    }


    /**
     * Sets the getTRIAGE_RECORDSResult value for this GetTRIAGE_RECORDSResponse.
     * 
     * @param getTRIAGE_RECORDSResult
     */
    public void setGetTRIAGE_RECORDSResult(org.tempuri.GetTRIAGE_RECORDSResponseGetTRIAGE_RECORDSResult getTRIAGE_RECORDSResult) {
        this.getTRIAGE_RECORDSResult = getTRIAGE_RECORDSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTRIAGE_RECORDSResponse)) return false;
        GetTRIAGE_RECORDSResponse other = (GetTRIAGE_RECORDSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTRIAGE_RECORDSResult==null && other.getGetTRIAGE_RECORDSResult()==null) || 
             (this.getTRIAGE_RECORDSResult!=null &&
              this.getTRIAGE_RECORDSResult.equals(other.getGetTRIAGE_RECORDSResult())));
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
        if (getGetTRIAGE_RECORDSResult() != null) {
            _hashCode += getGetTRIAGE_RECORDSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTRIAGE_RECORDSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTRIAGE_RECORDSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTRIAGE_RECORDSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTRIAGE_RECORDSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetTRIAGE_RECORDSResponse>GetTRIAGE_RECORDSResult"));
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
