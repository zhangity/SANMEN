/**
 * GetBrAllYpyzAndZlyzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBrAllYpyzAndZlyzResponse  implements java.io.Serializable {
    private org.tempuri.GetBrAllYpyzAndZlyzResponseGetBrAllYpyzAndZlyzResult getBrAllYpyzAndZlyzResult;

    public GetBrAllYpyzAndZlyzResponse() {
    }

    public GetBrAllYpyzAndZlyzResponse(
           org.tempuri.GetBrAllYpyzAndZlyzResponseGetBrAllYpyzAndZlyzResult getBrAllYpyzAndZlyzResult) {
           this.getBrAllYpyzAndZlyzResult = getBrAllYpyzAndZlyzResult;
    }


    /**
     * Gets the getBrAllYpyzAndZlyzResult value for this GetBrAllYpyzAndZlyzResponse.
     * 
     * @return getBrAllYpyzAndZlyzResult
     */
    public org.tempuri.GetBrAllYpyzAndZlyzResponseGetBrAllYpyzAndZlyzResult getGetBrAllYpyzAndZlyzResult() {
        return getBrAllYpyzAndZlyzResult;
    }


    /**
     * Sets the getBrAllYpyzAndZlyzResult value for this GetBrAllYpyzAndZlyzResponse.
     * 
     * @param getBrAllYpyzAndZlyzResult
     */
    public void setGetBrAllYpyzAndZlyzResult(org.tempuri.GetBrAllYpyzAndZlyzResponseGetBrAllYpyzAndZlyzResult getBrAllYpyzAndZlyzResult) {
        this.getBrAllYpyzAndZlyzResult = getBrAllYpyzAndZlyzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBrAllYpyzAndZlyzResponse)) return false;
        GetBrAllYpyzAndZlyzResponse other = (GetBrAllYpyzAndZlyzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBrAllYpyzAndZlyzResult==null && other.getGetBrAllYpyzAndZlyzResult()==null) || 
             (this.getBrAllYpyzAndZlyzResult!=null &&
              this.getBrAllYpyzAndZlyzResult.equals(other.getGetBrAllYpyzAndZlyzResult())));
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
        if (getGetBrAllYpyzAndZlyzResult() != null) {
            _hashCode += getGetBrAllYpyzAndZlyzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBrAllYpyzAndZlyzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBrAllYpyzAndZlyzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBrAllYpyzAndZlyzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetBrAllYpyzAndZlyzResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetBrAllYpyzAndZlyzResponse>GetBrAllYpyzAndZlyzResult"));
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
