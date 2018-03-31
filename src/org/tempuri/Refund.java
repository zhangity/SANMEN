/**
 * Refund.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Refund  implements java.io.Serializable {
    private java.lang.String PATIENT_ID;

    private java.lang.String BALANCE;

    private java.lang.String USER_CODE;

    private java.lang.String MZLB;

    public Refund() {
    }

    public Refund(
           java.lang.String PATIENT_ID,
           java.lang.String BALANCE,
           java.lang.String USER_CODE,
           java.lang.String MZLB) {
           this.PATIENT_ID = PATIENT_ID;
           this.BALANCE = BALANCE;
           this.USER_CODE = USER_CODE;
           this.MZLB = MZLB;
    }


    /**
     * Gets the PATIENT_ID value for this Refund.
     * 
     * @return PATIENT_ID
     */
    public java.lang.String getPATIENT_ID() {
        return PATIENT_ID;
    }


    /**
     * Sets the PATIENT_ID value for this Refund.
     * 
     * @param PATIENT_ID
     */
    public void setPATIENT_ID(java.lang.String PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }


    /**
     * Gets the BALANCE value for this Refund.
     * 
     * @return BALANCE
     */
    public java.lang.String getBALANCE() {
        return BALANCE;
    }


    /**
     * Sets the BALANCE value for this Refund.
     * 
     * @param BALANCE
     */
    public void setBALANCE(java.lang.String BALANCE) {
        this.BALANCE = BALANCE;
    }


    /**
     * Gets the USER_CODE value for this Refund.
     * 
     * @return USER_CODE
     */
    public java.lang.String getUSER_CODE() {
        return USER_CODE;
    }


    /**
     * Sets the USER_CODE value for this Refund.
     * 
     * @param USER_CODE
     */
    public void setUSER_CODE(java.lang.String USER_CODE) {
        this.USER_CODE = USER_CODE;
    }


    /**
     * Gets the MZLB value for this Refund.
     * 
     * @return MZLB
     */
    public java.lang.String getMZLB() {
        return MZLB;
    }


    /**
     * Sets the MZLB value for this Refund.
     * 
     * @param MZLB
     */
    public void setMZLB(java.lang.String MZLB) {
        this.MZLB = MZLB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Refund)) return false;
        Refund other = (Refund) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PATIENT_ID==null && other.getPATIENT_ID()==null) || 
             (this.PATIENT_ID!=null &&
              this.PATIENT_ID.equals(other.getPATIENT_ID()))) &&
            ((this.BALANCE==null && other.getBALANCE()==null) || 
             (this.BALANCE!=null &&
              this.BALANCE.equals(other.getBALANCE()))) &&
            ((this.USER_CODE==null && other.getUSER_CODE()==null) || 
             (this.USER_CODE!=null &&
              this.USER_CODE.equals(other.getUSER_CODE()))) &&
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
        if (getPATIENT_ID() != null) {
            _hashCode += getPATIENT_ID().hashCode();
        }
        if (getBALANCE() != null) {
            _hashCode += getBALANCE().hashCode();
        }
        if (getUSER_CODE() != null) {
            _hashCode += getUSER_CODE().hashCode();
        }
        if (getMZLB() != null) {
            _hashCode += getMZLB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Refund.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Refund"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BALANCE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BALANCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("USER_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "USER_CODE"));
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
