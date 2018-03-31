/**
 * Gf_updateYktSjJyjlInsertRegistResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateYktSjJyjlInsertRegistResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm gf_updateYktSjJyjlInsertRegistResult;

    public Gf_updateYktSjJyjlInsertRegistResponse() {
    }

    public Gf_updateYktSjJyjlInsertRegistResponse(
           org.tempuri.ReturnExComm gf_updateYktSjJyjlInsertRegistResult) {
           this.gf_updateYktSjJyjlInsertRegistResult = gf_updateYktSjJyjlInsertRegistResult;
    }


    /**
     * Gets the gf_updateYktSjJyjlInsertRegistResult value for this Gf_updateYktSjJyjlInsertRegistResponse.
     * 
     * @return gf_updateYktSjJyjlInsertRegistResult
     */
    public org.tempuri.ReturnExComm getGf_updateYktSjJyjlInsertRegistResult() {
        return gf_updateYktSjJyjlInsertRegistResult;
    }


    /**
     * Sets the gf_updateYktSjJyjlInsertRegistResult value for this Gf_updateYktSjJyjlInsertRegistResponse.
     * 
     * @param gf_updateYktSjJyjlInsertRegistResult
     */
    public void setGf_updateYktSjJyjlInsertRegistResult(org.tempuri.ReturnExComm gf_updateYktSjJyjlInsertRegistResult) {
        this.gf_updateYktSjJyjlInsertRegistResult = gf_updateYktSjJyjlInsertRegistResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateYktSjJyjlInsertRegistResponse)) return false;
        Gf_updateYktSjJyjlInsertRegistResponse other = (Gf_updateYktSjJyjlInsertRegistResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gf_updateYktSjJyjlInsertRegistResult==null && other.getGf_updateYktSjJyjlInsertRegistResult()==null) || 
             (this.gf_updateYktSjJyjlInsertRegistResult!=null &&
              this.gf_updateYktSjJyjlInsertRegistResult.equals(other.getGf_updateYktSjJyjlInsertRegistResult())));
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
        if (getGf_updateYktSjJyjlInsertRegistResult() != null) {
            _hashCode += getGf_updateYktSjJyjlInsertRegistResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateYktSjJyjlInsertRegistResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateYktSjJyjlInsertRegistResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gf_updateYktSjJyjlInsertRegistResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gf_updateYktSjJyjlInsertRegistResult"));
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
