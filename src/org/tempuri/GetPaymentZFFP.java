/**
 * GetPaymentZFFP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPaymentZFFP  implements java.io.Serializable {
    private java.lang.String CZGH;

    private java.lang.String queryDateS;

    private java.lang.String queryDateE;

    public GetPaymentZFFP() {
    }

    public GetPaymentZFFP(
           java.lang.String CZGH,
           java.lang.String queryDateS,
           java.lang.String queryDateE) {
           this.CZGH = CZGH;
           this.queryDateS = queryDateS;
           this.queryDateE = queryDateE;
    }


    /**
     * Gets the CZGH value for this GetPaymentZFFP.
     * 
     * @return CZGH
     */
    public java.lang.String getCZGH() {
        return CZGH;
    }


    /**
     * Sets the CZGH value for this GetPaymentZFFP.
     * 
     * @param CZGH
     */
    public void setCZGH(java.lang.String CZGH) {
        this.CZGH = CZGH;
    }


    /**
     * Gets the queryDateS value for this GetPaymentZFFP.
     * 
     * @return queryDateS
     */
    public java.lang.String getQueryDateS() {
        return queryDateS;
    }


    /**
     * Sets the queryDateS value for this GetPaymentZFFP.
     * 
     * @param queryDateS
     */
    public void setQueryDateS(java.lang.String queryDateS) {
        this.queryDateS = queryDateS;
    }


    /**
     * Gets the queryDateE value for this GetPaymentZFFP.
     * 
     * @return queryDateE
     */
    public java.lang.String getQueryDateE() {
        return queryDateE;
    }


    /**
     * Sets the queryDateE value for this GetPaymentZFFP.
     * 
     * @param queryDateE
     */
    public void setQueryDateE(java.lang.String queryDateE) {
        this.queryDateE = queryDateE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPaymentZFFP)) return false;
        GetPaymentZFFP other = (GetPaymentZFFP) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CZGH==null && other.getCZGH()==null) || 
             (this.CZGH!=null &&
              this.CZGH.equals(other.getCZGH()))) &&
            ((this.queryDateS==null && other.getQueryDateS()==null) || 
             (this.queryDateS!=null &&
              this.queryDateS.equals(other.getQueryDateS()))) &&
            ((this.queryDateE==null && other.getQueryDateE()==null) || 
             (this.queryDateE!=null &&
              this.queryDateE.equals(other.getQueryDateE())));
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
        if (getCZGH() != null) {
            _hashCode += getCZGH().hashCode();
        }
        if (getQueryDateS() != null) {
            _hashCode += getQueryDateS().hashCode();
        }
        if (getQueryDateE() != null) {
            _hashCode += getQueryDateE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPaymentZFFP.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPaymentZFFP"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CZGH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CZGH"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryDateS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryDateS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryDateE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryDateE"));
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
