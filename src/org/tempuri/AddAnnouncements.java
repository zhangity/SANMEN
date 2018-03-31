/**
 * AddAnnouncements.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddAnnouncements  implements java.io.Serializable {
    private java.lang.String fbgh;

    private java.lang.String bqdm;

    private java.lang.String title;

    private java.lang.String note;

    private java.util.Calendar sendTime;

    private java.util.Calendar sendOverTime;

    private java.lang.String TYPE;

    public AddAnnouncements() {
    }

    public AddAnnouncements(
           java.lang.String fbgh,
           java.lang.String bqdm,
           java.lang.String title,
           java.lang.String note,
           java.util.Calendar sendTime,
           java.util.Calendar sendOverTime,
           java.lang.String TYPE) {
           this.fbgh = fbgh;
           this.bqdm = bqdm;
           this.title = title;
           this.note = note;
           this.sendTime = sendTime;
           this.sendOverTime = sendOverTime;
           this.TYPE = TYPE;
    }


    /**
     * Gets the fbgh value for this AddAnnouncements.
     * 
     * @return fbgh
     */
    public java.lang.String getFbgh() {
        return fbgh;
    }


    /**
     * Sets the fbgh value for this AddAnnouncements.
     * 
     * @param fbgh
     */
    public void setFbgh(java.lang.String fbgh) {
        this.fbgh = fbgh;
    }


    /**
     * Gets the bqdm value for this AddAnnouncements.
     * 
     * @return bqdm
     */
    public java.lang.String getBqdm() {
        return bqdm;
    }


    /**
     * Sets the bqdm value for this AddAnnouncements.
     * 
     * @param bqdm
     */
    public void setBqdm(java.lang.String bqdm) {
        this.bqdm = bqdm;
    }


    /**
     * Gets the title value for this AddAnnouncements.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this AddAnnouncements.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the note value for this AddAnnouncements.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this AddAnnouncements.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the sendTime value for this AddAnnouncements.
     * 
     * @return sendTime
     */
    public java.util.Calendar getSendTime() {
        return sendTime;
    }


    /**
     * Sets the sendTime value for this AddAnnouncements.
     * 
     * @param sendTime
     */
    public void setSendTime(java.util.Calendar sendTime) {
        this.sendTime = sendTime;
    }


    /**
     * Gets the sendOverTime value for this AddAnnouncements.
     * 
     * @return sendOverTime
     */
    public java.util.Calendar getSendOverTime() {
        return sendOverTime;
    }


    /**
     * Sets the sendOverTime value for this AddAnnouncements.
     * 
     * @param sendOverTime
     */
    public void setSendOverTime(java.util.Calendar sendOverTime) {
        this.sendOverTime = sendOverTime;
    }


    /**
     * Gets the TYPE value for this AddAnnouncements.
     * 
     * @return TYPE
     */
    public java.lang.String getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this AddAnnouncements.
     * 
     * @param TYPE
     */
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddAnnouncements)) return false;
        AddAnnouncements other = (AddAnnouncements) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fbgh==null && other.getFbgh()==null) || 
             (this.fbgh!=null &&
              this.fbgh.equals(other.getFbgh()))) &&
            ((this.bqdm==null && other.getBqdm()==null) || 
             (this.bqdm!=null &&
              this.bqdm.equals(other.getBqdm()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.sendTime==null && other.getSendTime()==null) || 
             (this.sendTime!=null &&
              this.sendTime.equals(other.getSendTime()))) &&
            ((this.sendOverTime==null && other.getSendOverTime()==null) || 
             (this.sendOverTime!=null &&
              this.sendOverTime.equals(other.getSendOverTime()))) &&
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
        if (getFbgh() != null) {
            _hashCode += getFbgh().hashCode();
        }
        if (getBqdm() != null) {
            _hashCode += getBqdm().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getSendTime() != null) {
            _hashCode += getSendTime().hashCode();
        }
        if (getSendOverTime() != null) {
            _hashCode += getSendOverTime().hashCode();
        }
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddAnnouncements.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddAnnouncements"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fbgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "fbgh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bqdm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "bqdm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SendTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendOverTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SendOverTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
