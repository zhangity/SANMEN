/**
 * InsertUserLogin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertUserLogin  implements java.io.Serializable {
    private java.lang.String gh;

    private java.lang.String xm;

    private java.lang.String ip;

    public InsertUserLogin() {
    }

    public InsertUserLogin(
           java.lang.String gh,
           java.lang.String xm,
           java.lang.String ip) {
           this.gh = gh;
           this.xm = xm;
           this.ip = ip;
    }


    /**
     * Gets the gh value for this InsertUserLogin.
     * 
     * @return gh
     */
    public java.lang.String getGh() {
        return gh;
    }


    /**
     * Sets the gh value for this InsertUserLogin.
     * 
     * @param gh
     */
    public void setGh(java.lang.String gh) {
        this.gh = gh;
    }


    /**
     * Gets the xm value for this InsertUserLogin.
     * 
     * @return xm
     */
    public java.lang.String getXm() {
        return xm;
    }


    /**
     * Sets the xm value for this InsertUserLogin.
     * 
     * @param xm
     */
    public void setXm(java.lang.String xm) {
        this.xm = xm;
    }


    /**
     * Gets the ip value for this InsertUserLogin.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this InsertUserLogin.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertUserLogin)) return false;
        InsertUserLogin other = (InsertUserLogin) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.gh==null && other.getGh()==null) || 
             (this.gh!=null &&
              this.gh.equals(other.getGh()))) &&
            ((this.xm==null && other.getXm()==null) || 
             (this.xm!=null &&
              this.xm.equals(other.getXm()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp())));
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
        if (getGh() != null) {
            _hashCode += getGh().hashCode();
        }
        if (getXm() != null) {
            _hashCode += getXm().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertUserLogin.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertUserLogin"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "xm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ip"));
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
