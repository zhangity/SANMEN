/**
 * GetSsapByKs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSsapByKs  implements java.io.Serializable {
    private java.util.Calendar timebegin;

    private java.util.Calendar timeend;

    private java.lang.String bqdm;

    public GetSsapByKs() {
    }

    public GetSsapByKs(
           java.util.Calendar timebegin,
           java.util.Calendar timeend,
           java.lang.String bqdm) {
           this.timebegin = timebegin;
           this.timeend = timeend;
           this.bqdm = bqdm;
    }


    /**
     * Gets the timebegin value for this GetSsapByKs.
     * 
     * @return timebegin
     */
    public java.util.Calendar getTimebegin() {
        return timebegin;
    }


    /**
     * Sets the timebegin value for this GetSsapByKs.
     * 
     * @param timebegin
     */
    public void setTimebegin(java.util.Calendar timebegin) {
        this.timebegin = timebegin;
    }


    /**
     * Gets the timeend value for this GetSsapByKs.
     * 
     * @return timeend
     */
    public java.util.Calendar getTimeend() {
        return timeend;
    }


    /**
     * Sets the timeend value for this GetSsapByKs.
     * 
     * @param timeend
     */
    public void setTimeend(java.util.Calendar timeend) {
        this.timeend = timeend;
    }


    /**
     * Gets the bqdm value for this GetSsapByKs.
     * 
     * @return bqdm
     */
    public java.lang.String getBqdm() {
        return bqdm;
    }


    /**
     * Sets the bqdm value for this GetSsapByKs.
     * 
     * @param bqdm
     */
    public void setBqdm(java.lang.String bqdm) {
        this.bqdm = bqdm;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSsapByKs)) return false;
        GetSsapByKs other = (GetSsapByKs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timebegin==null && other.getTimebegin()==null) || 
             (this.timebegin!=null &&
              this.timebegin.equals(other.getTimebegin()))) &&
            ((this.timeend==null && other.getTimeend()==null) || 
             (this.timeend!=null &&
              this.timeend.equals(other.getTimeend()))) &&
            ((this.bqdm==null && other.getBqdm()==null) || 
             (this.bqdm!=null &&
              this.bqdm.equals(other.getBqdm())));
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
        if (getTimebegin() != null) {
            _hashCode += getTimebegin().hashCode();
        }
        if (getTimeend() != null) {
            _hashCode += getTimeend().hashCode();
        }
        if (getBqdm() != null) {
            _hashCode += getBqdm().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSsapByKs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSsapByKs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timebegin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "timebegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "timeend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bqdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bqdm"));
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
