/**
 * GetPAYMENT_EPSM_JSJLByFphmJzlxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPAYMENT_EPSM_JSJLByFphmJzlxResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExTable getPAYMENT_EPSM_JSJLByFphmJzlxResult;

    public GetPAYMENT_EPSM_JSJLByFphmJzlxResponse() {
    }

    public GetPAYMENT_EPSM_JSJLByFphmJzlxResponse(
           org.tempuri.ReturnExTable getPAYMENT_EPSM_JSJLByFphmJzlxResult) {
           this.getPAYMENT_EPSM_JSJLByFphmJzlxResult = getPAYMENT_EPSM_JSJLByFphmJzlxResult;
    }


    /**
     * Gets the getPAYMENT_EPSM_JSJLByFphmJzlxResult value for this GetPAYMENT_EPSM_JSJLByFphmJzlxResponse.
     * 
     * @return getPAYMENT_EPSM_JSJLByFphmJzlxResult
     */
    public org.tempuri.ReturnExTable getGetPAYMENT_EPSM_JSJLByFphmJzlxResult() {
        return getPAYMENT_EPSM_JSJLByFphmJzlxResult;
    }


    /**
     * Sets the getPAYMENT_EPSM_JSJLByFphmJzlxResult value for this GetPAYMENT_EPSM_JSJLByFphmJzlxResponse.
     * 
     * @param getPAYMENT_EPSM_JSJLByFphmJzlxResult
     */
    public void setGetPAYMENT_EPSM_JSJLByFphmJzlxResult(org.tempuri.ReturnExTable getPAYMENT_EPSM_JSJLByFphmJzlxResult) {
        this.getPAYMENT_EPSM_JSJLByFphmJzlxResult = getPAYMENT_EPSM_JSJLByFphmJzlxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPAYMENT_EPSM_JSJLByFphmJzlxResponse)) return false;
        GetPAYMENT_EPSM_JSJLByFphmJzlxResponse other = (GetPAYMENT_EPSM_JSJLByFphmJzlxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPAYMENT_EPSM_JSJLByFphmJzlxResult==null && other.getGetPAYMENT_EPSM_JSJLByFphmJzlxResult()==null) || 
             (this.getPAYMENT_EPSM_JSJLByFphmJzlxResult!=null &&
              this.getPAYMENT_EPSM_JSJLByFphmJzlxResult.equals(other.getGetPAYMENT_EPSM_JSJLByFphmJzlxResult())));
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
        if (getGetPAYMENT_EPSM_JSJLByFphmJzlxResult() != null) {
            _hashCode += getGetPAYMENT_EPSM_JSJLByFphmJzlxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPAYMENT_EPSM_JSJLByFphmJzlxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPAYMENT_EPSM_JSJLByFphmJzlxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPAYMENT_EPSM_JSJLByFphmJzlxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPAYMENT_EPSM_JSJLByFphmJzlxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
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
