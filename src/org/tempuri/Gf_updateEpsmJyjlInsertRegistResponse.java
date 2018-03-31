/**
 * Gf_updateEpsmJyjlInsertRegistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateEpsmJyjlInsertRegistResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm gf_updateEpsmJyjlInsertRegistResult;

    public Gf_updateEpsmJyjlInsertRegistResponse() {
    }

    public Gf_updateEpsmJyjlInsertRegistResponse(
           org.tempuri.ReturnExComm gf_updateEpsmJyjlInsertRegistResult) {
           this.gf_updateEpsmJyjlInsertRegistResult = gf_updateEpsmJyjlInsertRegistResult;
    }


    /**
     * Gets the gf_updateEpsmJyjlInsertRegistResult value for this Gf_updateEpsmJyjlInsertRegistResponse.
     * 
     * @return gf_updateEpsmJyjlInsertRegistResult
     */
    public org.tempuri.ReturnExComm getGf_updateEpsmJyjlInsertRegistResult() {
        return gf_updateEpsmJyjlInsertRegistResult;
    }


    /**
     * Sets the gf_updateEpsmJyjlInsertRegistResult value for this Gf_updateEpsmJyjlInsertRegistResponse.
     * 
     * @param gf_updateEpsmJyjlInsertRegistResult
     */
    public void setGf_updateEpsmJyjlInsertRegistResult(org.tempuri.ReturnExComm gf_updateEpsmJyjlInsertRegistResult) {
        this.gf_updateEpsmJyjlInsertRegistResult = gf_updateEpsmJyjlInsertRegistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateEpsmJyjlInsertRegistResponse)) return false;
        Gf_updateEpsmJyjlInsertRegistResponse other = (Gf_updateEpsmJyjlInsertRegistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_updateEpsmJyjlInsertRegistResult==null && other.getGf_updateEpsmJyjlInsertRegistResult()==null) || 
             (this.gf_updateEpsmJyjlInsertRegistResult!=null &&
              this.gf_updateEpsmJyjlInsertRegistResult.equals(other.getGf_updateEpsmJyjlInsertRegistResult())));
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
        if (getGf_updateEpsmJyjlInsertRegistResult() != null) {
            _hashCode += getGf_updateEpsmJyjlInsertRegistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateEpsmJyjlInsertRegistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateEpsmJyjlInsertRegistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_updateEpsmJyjlInsertRegistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_updateEpsmJyjlInsertRegistResult"));
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
