/**
 * InesntRolesQx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InesntRolesQx  implements java.io.Serializable {
    private java.lang.String jsid;

    private java.lang.String cdid;

    public InesntRolesQx() {
    }

    public InesntRolesQx(
           java.lang.String jsid,
           java.lang.String cdid) {
           this.jsid = jsid;
           this.cdid = cdid;
    }


    /**
     * Gets the jsid value for this InesntRolesQx.
     * 
     * @return jsid
     */
    public java.lang.String getJsid() {
        return jsid;
    }


    /**
     * Sets the jsid value for this InesntRolesQx.
     * 
     * @param jsid
     */
    public void setJsid(java.lang.String jsid) {
        this.jsid = jsid;
    }


    /**
     * Gets the cdid value for this InesntRolesQx.
     * 
     * @return cdid
     */
    public java.lang.String getCdid() {
        return cdid;
    }


    /**
     * Sets the cdid value for this InesntRolesQx.
     * 
     * @param cdid
     */
    public void setCdid(java.lang.String cdid) {
        this.cdid = cdid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InesntRolesQx)) return false;
        InesntRolesQx other = (InesntRolesQx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jsid==null && other.getJsid()==null) || 
             (this.jsid!=null &&
              this.jsid.equals(other.getJsid()))) &&
            ((this.cdid==null && other.getCdid()==null) || 
             (this.cdid!=null &&
              this.cdid.equals(other.getCdid())));
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
        if (getJsid() != null) {
            _hashCode += getJsid().hashCode();
        }
        if (getCdid() != null) {
            _hashCode += getCdid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InesntRolesQx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InesntRolesQx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jsid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jsid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cdid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "cdid"));
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
