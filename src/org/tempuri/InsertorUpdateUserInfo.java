/**
 * InsertorUpdateUserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertorUpdateUserInfo  implements java.io.Serializable {
    private java.lang.String gh;

    private java.lang.String jj;

    private byte[] picture;

    public InsertorUpdateUserInfo() {
    }

    public InsertorUpdateUserInfo(
           java.lang.String gh,
           java.lang.String jj,
           byte[] picture) {
           this.gh = gh;
           this.jj = jj;
           this.picture = picture;
    }


    /**
     * Gets the gh value for this InsertorUpdateUserInfo.
     * 
     * @return gh
     */
    public java.lang.String getGh() {
        return gh;
    }


    /**
     * Sets the gh value for this InsertorUpdateUserInfo.
     * 
     * @param gh
     */
    public void setGh(java.lang.String gh) {
        this.gh = gh;
    }


    /**
     * Gets the jj value for this InsertorUpdateUserInfo.
     * 
     * @return jj
     */
    public java.lang.String getJj() {
        return jj;
    }


    /**
     * Sets the jj value for this InsertorUpdateUserInfo.
     * 
     * @param jj
     */
    public void setJj(java.lang.String jj) {
        this.jj = jj;
    }


    /**
     * Gets the picture value for this InsertorUpdateUserInfo.
     * 
     * @return picture
     */
    public byte[] getPicture() {
        return picture;
    }


    /**
     * Sets the picture value for this InsertorUpdateUserInfo.
     * 
     * @param picture
     */
    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertorUpdateUserInfo)) return false;
        InsertorUpdateUserInfo other = (InsertorUpdateUserInfo) obj;
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
            ((this.jj==null && other.getJj()==null) || 
             (this.jj!=null &&
              this.jj.equals(other.getJj()))) &&
            ((this.picture==null && other.getPicture()==null) || 
             (this.picture!=null &&
              java.util.Arrays.equals(this.picture, other.getPicture())));
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
        if (getJj() != null) {
            _hashCode += getJj().hashCode();
        }
        if (getPicture() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPicture());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPicture(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertorUpdateUserInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertorUpdateUserInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("picture");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "picture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
