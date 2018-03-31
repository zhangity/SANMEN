/**
 * GetMzzhxxb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMzzhxxb  implements java.io.Serializable {
    private java.lang.String jzhm;

    private java.lang.String brxm;

    private java.lang.String ID_NO;

    private java.lang.String RELATION_ID;

    public GetMzzhxxb() {
    }

    public GetMzzhxxb(
           java.lang.String jzhm,
           java.lang.String brxm,
           java.lang.String ID_NO,
           java.lang.String RELATION_ID) {
           this.jzhm = jzhm;
           this.brxm = brxm;
           this.ID_NO = ID_NO;
           this.RELATION_ID = RELATION_ID;
    }


    /**
     * Gets the jzhm value for this GetMzzhxxb.
     * 
     * @return jzhm
     */
    public java.lang.String getJzhm() {
        return jzhm;
    }


    /**
     * Sets the jzhm value for this GetMzzhxxb.
     * 
     * @param jzhm
     */
    public void setJzhm(java.lang.String jzhm) {
        this.jzhm = jzhm;
    }


    /**
     * Gets the brxm value for this GetMzzhxxb.
     * 
     * @return brxm
     */
    public java.lang.String getBrxm() {
        return brxm;
    }


    /**
     * Sets the brxm value for this GetMzzhxxb.
     * 
     * @param brxm
     */
    public void setBrxm(java.lang.String brxm) {
        this.brxm = brxm;
    }


    /**
     * Gets the ID_NO value for this GetMzzhxxb.
     * 
     * @return ID_NO
     */
    public java.lang.String getID_NO() {
        return ID_NO;
    }


    /**
     * Sets the ID_NO value for this GetMzzhxxb.
     * 
     * @param ID_NO
     */
    public void setID_NO(java.lang.String ID_NO) {
        this.ID_NO = ID_NO;
    }


    /**
     * Gets the RELATION_ID value for this GetMzzhxxb.
     * 
     * @return RELATION_ID
     */
    public java.lang.String getRELATION_ID() {
        return RELATION_ID;
    }


    /**
     * Sets the RELATION_ID value for this GetMzzhxxb.
     * 
     * @param RELATION_ID
     */
    public void setRELATION_ID(java.lang.String RELATION_ID) {
        this.RELATION_ID = RELATION_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMzzhxxb)) return false;
        GetMzzhxxb other = (GetMzzhxxb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jzhm==null && other.getJzhm()==null) || 
             (this.jzhm!=null &&
              this.jzhm.equals(other.getJzhm()))) &&
            ((this.brxm==null && other.getBrxm()==null) || 
             (this.brxm!=null &&
              this.brxm.equals(other.getBrxm()))) &&
            ((this.ID_NO==null && other.getID_NO()==null) || 
             (this.ID_NO!=null &&
              this.ID_NO.equals(other.getID_NO()))) &&
            ((this.RELATION_ID==null && other.getRELATION_ID()==null) || 
             (this.RELATION_ID!=null &&
              this.RELATION_ID.equals(other.getRELATION_ID())));
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
        if (getJzhm() != null) {
            _hashCode += getJzhm().hashCode();
        }
        if (getBrxm() != null) {
            _hashCode += getBrxm().hashCode();
        }
        if (getID_NO() != null) {
            _hashCode += getID_NO().hashCode();
        }
        if (getRELATION_ID() != null) {
            _hashCode += getRELATION_ID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMzzhxxb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMzzhxxb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jzhm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jzhm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brxm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "brxm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ID_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RELATION_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RELATION_ID"));
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
