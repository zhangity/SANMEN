/**
 * GhMzxxCzJzResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GhMzxxCzJzResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm ghMzxxCzJzResult;

    public GhMzxxCzJzResponse() {
    }

    public GhMzxxCzJzResponse(
           org.tempuri.ReturnExComm ghMzxxCzJzResult) {
           this.ghMzxxCzJzResult = ghMzxxCzJzResult;
    }


    /**
     * Gets the ghMzxxCzJzResult value for this GhMzxxCzJzResponse.
     * 
     * @return ghMzxxCzJzResult
     */
    public org.tempuri.ReturnExComm getGhMzxxCzJzResult() {
        return ghMzxxCzJzResult;
    }


    /**
     * Sets the ghMzxxCzJzResult value for this GhMzxxCzJzResponse.
     * 
     * @param ghMzxxCzJzResult
     */
    public void setGhMzxxCzJzResult(org.tempuri.ReturnExComm ghMzxxCzJzResult) {
        this.ghMzxxCzJzResult = ghMzxxCzJzResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GhMzxxCzJzResponse)) return false;
        GhMzxxCzJzResponse other = (GhMzxxCzJzResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ghMzxxCzJzResult==null && other.getGhMzxxCzJzResult()==null) || 
             (this.ghMzxxCzJzResult!=null &&
              this.ghMzxxCzJzResult.equals(other.getGhMzxxCzJzResult())));
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
        if (getGhMzxxCzJzResult() != null) {
            _hashCode += getGhMzxxCzJzResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GhMzxxCzJzResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GhMzxxCzJzResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ghMzxxCzJzResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GhMzxxCzJzResult"));
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
