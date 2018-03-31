/**
 * CancelCard.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CancelCard  implements java.io.Serializable {
    private java.lang.String strPATIENT_ID;

    private java.lang.String strCARD_NO;

    private java.lang.String strUserCode;

    public CancelCard() {
    }

    public CancelCard(
           java.lang.String strPATIENT_ID,
           java.lang.String strCARD_NO,
           java.lang.String strUserCode) {
           this.strPATIENT_ID = strPATIENT_ID;
           this.strCARD_NO = strCARD_NO;
           this.strUserCode = strUserCode;
    }


    /**
     * Gets the strPATIENT_ID value for this CancelCard.
     * 
     * @return strPATIENT_ID
     */
    public java.lang.String getStrPATIENT_ID() {
        return strPATIENT_ID;
    }


    /**
     * Sets the strPATIENT_ID value for this CancelCard.
     * 
     * @param strPATIENT_ID
     */
    public void setStrPATIENT_ID(java.lang.String strPATIENT_ID) {
        this.strPATIENT_ID = strPATIENT_ID;
    }


    /**
     * Gets the strCARD_NO value for this CancelCard.
     * 
     * @return strCARD_NO
     */
    public java.lang.String getStrCARD_NO() {
        return strCARD_NO;
    }


    /**
     * Sets the strCARD_NO value for this CancelCard.
     * 
     * @param strCARD_NO
     */
    public void setStrCARD_NO(java.lang.String strCARD_NO) {
        this.strCARD_NO = strCARD_NO;
    }


    /**
     * Gets the strUserCode value for this CancelCard.
     * 
     * @return strUserCode
     */
    public java.lang.String getStrUserCode() {
        return strUserCode;
    }


    /**
     * Sets the strUserCode value for this CancelCard.
     * 
     * @param strUserCode
     */
    public void setStrUserCode(java.lang.String strUserCode) {
        this.strUserCode = strUserCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelCard)) return false;
        CancelCard other = (CancelCard) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strPATIENT_ID==null && other.getStrPATIENT_ID()==null) || 
             (this.strPATIENT_ID!=null &&
              this.strPATIENT_ID.equals(other.getStrPATIENT_ID()))) &&
            ((this.strCARD_NO==null && other.getStrCARD_NO()==null) || 
             (this.strCARD_NO!=null &&
              this.strCARD_NO.equals(other.getStrCARD_NO()))) &&
            ((this.strUserCode==null && other.getStrUserCode()==null) || 
             (this.strUserCode!=null &&
              this.strUserCode.equals(other.getStrUserCode())));
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
        if (getStrPATIENT_ID() != null) {
            _hashCode += getStrPATIENT_ID().hashCode();
        }
        if (getStrCARD_NO() != null) {
            _hashCode += getStrCARD_NO().hashCode();
        }
        if (getStrUserCode() != null) {
            _hashCode += getStrUserCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelCard.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CancelCard"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strPATIENT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strPATIENT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strCARD_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strCARD_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strUserCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strUserCode"));
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
