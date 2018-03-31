/**
 * ChangePWD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ChangePWD  implements java.io.Serializable {
    private java.lang.String user_CODE;

    private java.lang.String oldPWD;

    private java.lang.String newPWD;

    public ChangePWD() {
    }

    public ChangePWD(
           java.lang.String user_CODE,
           java.lang.String oldPWD,
           java.lang.String newPWD) {
           this.user_CODE = user_CODE;
           this.oldPWD = oldPWD;
           this.newPWD = newPWD;
    }


    /**
     * Gets the user_CODE value for this ChangePWD.
     * 
     * @return user_CODE
     */
    public java.lang.String getUser_CODE() {
        return user_CODE;
    }


    /**
     * Sets the user_CODE value for this ChangePWD.
     * 
     * @param user_CODE
     */
    public void setUser_CODE(java.lang.String user_CODE) {
        this.user_CODE = user_CODE;
    }


    /**
     * Gets the oldPWD value for this ChangePWD.
     * 
     * @return oldPWD
     */
    public java.lang.String getOldPWD() {
        return oldPWD;
    }


    /**
     * Sets the oldPWD value for this ChangePWD.
     * 
     * @param oldPWD
     */
    public void setOldPWD(java.lang.String oldPWD) {
        this.oldPWD = oldPWD;
    }


    /**
     * Gets the newPWD value for this ChangePWD.
     * 
     * @return newPWD
     */
    public java.lang.String getNewPWD() {
        return newPWD;
    }


    /**
     * Sets the newPWD value for this ChangePWD.
     * 
     * @param newPWD
     */
    public void setNewPWD(java.lang.String newPWD) {
        this.newPWD = newPWD;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangePWD)) return false;
        ChangePWD other = (ChangePWD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user_CODE==null && other.getUser_CODE()==null) || 
             (this.user_CODE!=null &&
              this.user_CODE.equals(other.getUser_CODE()))) &&
            ((this.oldPWD==null && other.getOldPWD()==null) || 
             (this.oldPWD!=null &&
              this.oldPWD.equals(other.getOldPWD()))) &&
            ((this.newPWD==null && other.getNewPWD()==null) || 
             (this.newPWD!=null &&
              this.newPWD.equals(other.getNewPWD())));
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
        if (getUser_CODE() != null) {
            _hashCode += getUser_CODE().hashCode();
        }
        if (getOldPWD() != null) {
            _hashCode += getOldPWD().hashCode();
        }
        if (getNewPWD() != null) {
            _hashCode += getNewPWD().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangePWD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ChangePWD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "User_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldPWD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OldPWD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPWD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NewPWD"));
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
