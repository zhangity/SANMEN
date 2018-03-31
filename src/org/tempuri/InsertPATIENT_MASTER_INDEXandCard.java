/**
 * InsertPATIENT_MASTER_INDEXandCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertPATIENT_MASTER_INDEXandCard  implements java.io.Serializable {
    private org.tempuri.Patient_Master_Index model;

    private org.tempuri.ACCOUNT_CLINIC_CARD accountcard;

    private java.lang.String addCardOper;

    public InsertPATIENT_MASTER_INDEXandCard() {
    }

    public InsertPATIENT_MASTER_INDEXandCard(
           org.tempuri.Patient_Master_Index model,
           org.tempuri.ACCOUNT_CLINIC_CARD accountcard,
           java.lang.String addCardOper) {
           this.model = model;
           this.accountcard = accountcard;
           this.addCardOper = addCardOper;
    }


    /**
     * Gets the model value for this InsertPATIENT_MASTER_INDEXandCard.
     * 
     * @return model
     */
    public org.tempuri.Patient_Master_Index getModel() {
        return model;
    }


    /**
     * Sets the model value for this InsertPATIENT_MASTER_INDEXandCard.
     * 
     * @param model
     */
    public void setModel(org.tempuri.Patient_Master_Index model) {
        this.model = model;
    }


    /**
     * Gets the accountcard value for this InsertPATIENT_MASTER_INDEXandCard.
     * 
     * @return accountcard
     */
    public org.tempuri.ACCOUNT_CLINIC_CARD getAccountcard() {
        return accountcard;
    }


    /**
     * Sets the accountcard value for this InsertPATIENT_MASTER_INDEXandCard.
     * 
     * @param accountcard
     */
    public void setAccountcard(org.tempuri.ACCOUNT_CLINIC_CARD accountcard) {
        this.accountcard = accountcard;
    }


    /**
     * Gets the addCardOper value for this InsertPATIENT_MASTER_INDEXandCard.
     * 
     * @return addCardOper
     */
    public java.lang.String getAddCardOper() {
        return addCardOper;
    }


    /**
     * Sets the addCardOper value for this InsertPATIENT_MASTER_INDEXandCard.
     * 
     * @param addCardOper
     */
    public void setAddCardOper(java.lang.String addCardOper) {
        this.addCardOper = addCardOper;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertPATIENT_MASTER_INDEXandCard)) return false;
        InsertPATIENT_MASTER_INDEXandCard other = (InsertPATIENT_MASTER_INDEXandCard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel()))) &&
            ((this.accountcard==null && other.getAccountcard()==null) || 
             (this.accountcard!=null &&
              this.accountcard.equals(other.getAccountcard()))) &&
            ((this.addCardOper==null && other.getAddCardOper()==null) || 
             (this.addCardOper!=null &&
              this.addCardOper.equals(other.getAddCardOper())));
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
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        if (getAccountcard() != null) {
            _hashCode += getAccountcard().hashCode();
        }
        if (getAddCardOper() != null) {
            _hashCode += getAddCardOper().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertPATIENT_MASTER_INDEXandCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertPATIENT_MASTER_INDEXandCard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Patient_Master_Index"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountcard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "accountcard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ACCOUNT_CLINIC_CARD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addCardOper");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddCardOper"));
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
