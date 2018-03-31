/**
 * GetJcbg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetJcbg  implements java.io.Serializable {
    private java.lang.String PATIENT_ID;

    private java.lang.String dateBegin;

    private java.lang.String dateOver;

    private java.lang.String jcmc;

    public GetJcbg() {
    }

    public GetJcbg(
           java.lang.String PATIENT_ID,
           java.lang.String dateBegin,
           java.lang.String dateOver,
           java.lang.String jcmc) {
           this.PATIENT_ID = PATIENT_ID;
           this.dateBegin = dateBegin;
           this.dateOver = dateOver;
           this.jcmc = jcmc;
    }


    /**
     * Gets the PATIENT_ID value for this GetJcbg.
     * 
     * @return PATIENT_ID
     */
    public java.lang.String getPATIENT_ID() {
        return PATIENT_ID;
    }


    /**
     * Sets the PATIENT_ID value for this GetJcbg.
     * 
     * @param PATIENT_ID
     */
    public void setPATIENT_ID(java.lang.String PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }


    /**
     * Gets the dateBegin value for this GetJcbg.
     * 
     * @return dateBegin
     */
    public java.lang.String getDateBegin() {
        return dateBegin;
    }


    /**
     * Sets the dateBegin value for this GetJcbg.
     * 
     * @param dateBegin
     */
    public void setDateBegin(java.lang.String dateBegin) {
        this.dateBegin = dateBegin;
    }


    /**
     * Gets the dateOver value for this GetJcbg.
     * 
     * @return dateOver
     */
    public java.lang.String getDateOver() {
        return dateOver;
    }


    /**
     * Sets the dateOver value for this GetJcbg.
     * 
     * @param dateOver
     */
    public void setDateOver(java.lang.String dateOver) {
        this.dateOver = dateOver;
    }


    /**
     * Gets the jcmc value for this GetJcbg.
     * 
     * @return jcmc
     */
    public java.lang.String getJcmc() {
        return jcmc;
    }


    /**
     * Sets the jcmc value for this GetJcbg.
     * 
     * @param jcmc
     */
    public void setJcmc(java.lang.String jcmc) {
        this.jcmc = jcmc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetJcbg)) return false;
        GetJcbg other = (GetJcbg) obj;
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
            ((this.dateBegin==null && other.getDateBegin()==null) || 
             (this.dateBegin!=null &&
              this.dateBegin.equals(other.getDateBegin()))) &&
            ((this.dateOver==null && other.getDateOver()==null) || 
             (this.dateOver!=null &&
              this.dateOver.equals(other.getDateOver()))) &&
            ((this.jcmc==null && other.getJcmc()==null) || 
             (this.jcmc!=null &&
              this.jcmc.equals(other.getJcmc())));
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
        if (getDateBegin() != null) {
            _hashCode += getDateBegin().hashCode();
        }
        if (getDateOver() != null) {
            _hashCode += getDateOver().hashCode();
        }
        if (getJcmc() != null) {
            _hashCode += getJcmc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetJcbg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetJcbg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dateBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dateOver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jcmc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jcmc"));
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
