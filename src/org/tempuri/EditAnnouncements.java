/**
 * EditAnnouncements.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class EditAnnouncements  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String xggh;

    private java.lang.String bqdm;

    private java.lang.String title;

    private java.lang.String note;

    private java.util.Calendar sendTime;

    private java.util.Calendar sendOverTime;

    private java.lang.String TYPE;

    public EditAnnouncements() {
    }

    public EditAnnouncements(
           java.lang.String id,
           java.lang.String xggh,
           java.lang.String bqdm,
           java.lang.String title,
           java.lang.String note,
           java.util.Calendar sendTime,
           java.util.Calendar sendOverTime,
           java.lang.String TYPE) {
           this.id = id;
           this.xggh = xggh;
           this.bqdm = bqdm;
           this.title = title;
           this.note = note;
           this.sendTime = sendTime;
           this.sendOverTime = sendOverTime;
           this.TYPE = TYPE;
    }


    /**
     * Gets the id value for this EditAnnouncements.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this EditAnnouncements.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the xggh value for this EditAnnouncements.
     * 
     * @return xggh
     */
    public java.lang.String getXggh() {
        return xggh;
    }


    /**
     * Sets the xggh value for this EditAnnouncements.
     * 
     * @param xggh
     */
    public void setXggh(java.lang.String xggh) {
        this.xggh = xggh;
    }


    /**
     * Gets the bqdm value for this EditAnnouncements.
     * 
     * @return bqdm
     */
    public java.lang.String getBqdm() {
        return bqdm;
    }


    /**
     * Sets the bqdm value for this EditAnnouncements.
     * 
     * @param bqdm
     */
    public void setBqdm(java.lang.String bqdm) {
        this.bqdm = bqdm;
    }


    /**
     * Gets the title value for this EditAnnouncements.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this EditAnnouncements.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the note value for this EditAnnouncements.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this EditAnnouncements.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the sendTime value for this EditAnnouncements.
     * 
     * @return sendTime
     */
    public java.util.Calendar getSendTime() {
        return sendTime;
    }


    /**
     * Sets the sendTime value for this EditAnnouncements.
     * 
     * @param sendTime
     */
    public void setSendTime(java.util.Calendar sendTime) {
        this.sendTime = sendTime;
    }


    /**
     * Gets the sendOverTime value for this EditAnnouncements.
     * 
     * @return sendOverTime
     */
    public java.util.Calendar getSendOverTime() {
        return sendOverTime;
    }


    /**
     * Sets the sendOverTime value for this EditAnnouncements.
     * 
     * @param sendOverTime
     */
    public void setSendOverTime(java.util.Calendar sendOverTime) {
        this.sendOverTime = sendOverTime;
    }


    /**
     * Gets the TYPE value for this EditAnnouncements.
     * 
     * @return TYPE
     */
    public java.lang.String getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this EditAnnouncements.
     * 
     * @param TYPE
     */
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EditAnnouncements)) return false;
        EditAnnouncements other = (EditAnnouncements) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.xggh==null && other.getXggh()==null) || 
             (this.xggh!=null &&
              this.xggh.equals(other.getXggh()))) &&
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getXggh() != null) {
            _hashCode += getXggh().hashCode();
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
        new org.apache.axis.description.TypeDesc(EditAnnouncements.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">EditAnnouncements"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xggh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "xggh"));
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
