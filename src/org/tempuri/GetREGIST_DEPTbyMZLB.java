/**
 * GetREGIST_DEPTbyMZLB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetREGIST_DEPTbyMZLB  implements java.io.Serializable {
    private java.lang.String GHLB;

    private java.lang.String MZLB;

    public GetREGIST_DEPTbyMZLB() {
    }

    public GetREGIST_DEPTbyMZLB(
           java.lang.String GHLB,
           java.lang.String MZLB) {
           this.GHLB = GHLB;
           this.MZLB = MZLB;
    }


    /**
     * Gets the GHLB value for this GetREGIST_DEPTbyMZLB.
     * 
     * @return GHLB
     */
    public java.lang.String getGHLB() {
        return GHLB;
    }


    /**
     * Sets the GHLB value for this GetREGIST_DEPTbyMZLB.
     * 
     * @param GHLB
     */
    public void setGHLB(java.lang.String GHLB) {
        this.GHLB = GHLB;
    }


    /**
     * Gets the MZLB value for this GetREGIST_DEPTbyMZLB.
     * 
     * @return MZLB
     */
    public java.lang.String getMZLB() {
        return MZLB;
    }


    /**
     * Sets the MZLB value for this GetREGIST_DEPTbyMZLB.
     * 
     * @param MZLB
     */
    public void setMZLB(java.lang.String MZLB) {
        this.MZLB = MZLB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetREGIST_DEPTbyMZLB)) return false;
        GetREGIST_DEPTbyMZLB other = (GetREGIST_DEPTbyMZLB) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GHLB==null && other.getGHLB()==null) || 
             (this.GHLB!=null &&
              this.GHLB.equals(other.getGHLB()))) &&
            ((this.MZLB==null && other.getMZLB()==null) || 
             (this.MZLB!=null &&
              this.MZLB.equals(other.getMZLB())));
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
        if (getGHLB() != null) {
            _hashCode += getGHLB().hashCode();
        }
        if (getMZLB() != null) {
            _hashCode += getMZLB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetREGIST_DEPTbyMZLB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetREGIST_DEPTbyMZLB"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GHLB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GHLB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MZLB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MZLB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
