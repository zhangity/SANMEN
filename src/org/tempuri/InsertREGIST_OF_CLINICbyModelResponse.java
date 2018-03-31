/**
 * InsertREGIST_OF_CLINICbyModelResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertREGIST_OF_CLINICbyModelResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm insertREGIST_OF_CLINICbyModelResult;

    public InsertREGIST_OF_CLINICbyModelResponse() {
    }

    public InsertREGIST_OF_CLINICbyModelResponse(
           org.tempuri.ReturnExComm insertREGIST_OF_CLINICbyModelResult) {
           this.insertREGIST_OF_CLINICbyModelResult = insertREGIST_OF_CLINICbyModelResult;
    }


    /**
     * Gets the insertREGIST_OF_CLINICbyModelResult value for this InsertREGIST_OF_CLINICbyModelResponse.
     * 
     * @return insertREGIST_OF_CLINICbyModelResult
     */
    public org.tempuri.ReturnExComm getInsertREGIST_OF_CLINICbyModelResult() {
        return insertREGIST_OF_CLINICbyModelResult;
    }


    /**
     * Sets the insertREGIST_OF_CLINICbyModelResult value for this InsertREGIST_OF_CLINICbyModelResponse.
     * 
     * @param insertREGIST_OF_CLINICbyModelResult
     */
    public void setInsertREGIST_OF_CLINICbyModelResult(org.tempuri.ReturnExComm insertREGIST_OF_CLINICbyModelResult) {
        this.insertREGIST_OF_CLINICbyModelResult = insertREGIST_OF_CLINICbyModelResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertREGIST_OF_CLINICbyModelResponse)) return false;
        InsertREGIST_OF_CLINICbyModelResponse other = (InsertREGIST_OF_CLINICbyModelResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertREGIST_OF_CLINICbyModelResult==null && other.getInsertREGIST_OF_CLINICbyModelResult()==null) || 
             (this.insertREGIST_OF_CLINICbyModelResult!=null &&
              this.insertREGIST_OF_CLINICbyModelResult.equals(other.getInsertREGIST_OF_CLINICbyModelResult())));
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
        if (getInsertREGIST_OF_CLINICbyModelResult() != null) {
            _hashCode += getInsertREGIST_OF_CLINICbyModelResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertREGIST_OF_CLINICbyModelResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertREGIST_OF_CLINICbyModelResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertREGIST_OF_CLINICbyModelResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertREGIST_OF_CLINICbyModelResult"));
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
