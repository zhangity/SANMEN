/**
 * GetCLINICAndMZRZbyIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetCLINICAndMZRZbyIDResponse  implements java.io.Serializable {
    private org.tempuri.GetCLINICAndMZRZbyIDResponseGetCLINICAndMZRZbyIDResult getCLINICAndMZRZbyIDResult;

    public GetCLINICAndMZRZbyIDResponse() {
    }

    public GetCLINICAndMZRZbyIDResponse(
           org.tempuri.GetCLINICAndMZRZbyIDResponseGetCLINICAndMZRZbyIDResult getCLINICAndMZRZbyIDResult) {
           this.getCLINICAndMZRZbyIDResult = getCLINICAndMZRZbyIDResult;
    }


    /**
     * Gets the getCLINICAndMZRZbyIDResult value for this GetCLINICAndMZRZbyIDResponse.
     * 
     * @return getCLINICAndMZRZbyIDResult
     */
    public org.tempuri.GetCLINICAndMZRZbyIDResponseGetCLINICAndMZRZbyIDResult getGetCLINICAndMZRZbyIDResult() {
        return getCLINICAndMZRZbyIDResult;
    }


    /**
     * Sets the getCLINICAndMZRZbyIDResult value for this GetCLINICAndMZRZbyIDResponse.
     * 
     * @param getCLINICAndMZRZbyIDResult
     */
    public void setGetCLINICAndMZRZbyIDResult(org.tempuri.GetCLINICAndMZRZbyIDResponseGetCLINICAndMZRZbyIDResult getCLINICAndMZRZbyIDResult) {
        this.getCLINICAndMZRZbyIDResult = getCLINICAndMZRZbyIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetCLINICAndMZRZbyIDResponse)) return false;
        GetCLINICAndMZRZbyIDResponse other = (GetCLINICAndMZRZbyIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getCLINICAndMZRZbyIDResult==null && other.getGetCLINICAndMZRZbyIDResult()==null) || 
             (this.getCLINICAndMZRZbyIDResult!=null &&
              this.getCLINICAndMZRZbyIDResult.equals(other.getGetCLINICAndMZRZbyIDResult())));
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
        if (getGetCLINICAndMZRZbyIDResult() != null) {
            _hashCode += getGetCLINICAndMZRZbyIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetCLINICAndMZRZbyIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetCLINICAndMZRZbyIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCLINICAndMZRZbyIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetCLINICAndMZRZbyIDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetCLINICAndMZRZbyIDResponse>GetCLINICAndMZRZbyIDResult"));
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
