/**
 * GetAnnouncements.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAnnouncements  implements java.io.Serializable {
    private java.lang.String title;

    private java.lang.String sendBegin;

    private java.lang.String sendOver;

    private java.lang.String TYPE;

    public GetAnnouncements() {
    }

    public GetAnnouncements(
           java.lang.String title,
           java.lang.String sendBegin,
           java.lang.String sendOver,
           java.lang.String TYPE) {
           this.title = title;
           this.sendBegin = sendBegin;
           this.sendOver = sendOver;
           this.TYPE = TYPE;
    }


    /**
     * Gets the title value for this GetAnnouncements.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this GetAnnouncements.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the sendBegin value for this GetAnnouncements.
     * 
     * @return sendBegin
     */
    public java.lang.String getSendBegin() {
        return sendBegin;
    }


    /**
     * Sets the sendBegin value for this GetAnnouncements.
     * 
     * @param sendBegin
     */
    public void setSendBegin(java.lang.String sendBegin) {
        this.sendBegin = sendBegin;
    }


    /**
     * Gets the sendOver value for this GetAnnouncements.
     * 
     * @return sendOver
     */
    public java.lang.String getSendOver() {
        return sendOver;
    }


    /**
     * Sets the sendOver value for this GetAnnouncements.
     * 
     * @param sendOver
     */
    public void setSendOver(java.lang.String sendOver) {
        this.sendOver = sendOver;
    }


    /**
     * Gets the TYPE value for this GetAnnouncements.
     * 
     * @return TYPE
     */
    public java.lang.String getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this GetAnnouncements.
     * 
     * @param TYPE
     */
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAnnouncements)) return false;
        GetAnnouncements other = (GetAnnouncements) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.sendBegin==null && other.getSendBegin()==null) || 
             (this.sendBegin!=null &&
              this.sendBegin.equals(other.getSendBegin()))) &&
            ((this.sendOver==null && other.getSendOver()==null) || 
             (this.sendOver!=null &&
              this.sendOver.equals(other.getSendOver()))) &&
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              this.TYPE.equals(other.getTYPE())));
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
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getSendBegin() != null) {
            _hashCode += getSendBegin().hashCode();
        }
        if (getSendOver() != null) {
            _hashCode += getSendOver().hashCode();
        }
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAnnouncements.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAnnouncements"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sendBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendOver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sendOver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TYPE"));
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
