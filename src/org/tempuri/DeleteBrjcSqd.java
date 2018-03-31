/**
 * DeleteBrjcSqd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteBrjcSqd  implements java.io.Serializable {
    private java.lang.String sqdid;

    private java.lang.String hiszyxh;

    private java.lang.String scyy;

    public DeleteBrjcSqd() {
    }

    public DeleteBrjcSqd(
           java.lang.String sqdid,
           java.lang.String hiszyxh,
           java.lang.String scyy) {
           this.sqdid = sqdid;
           this.hiszyxh = hiszyxh;
           this.scyy = scyy;
    }


    /**
     * Gets the sqdid value for this DeleteBrjcSqd.
     * 
     * @return sqdid
     */
    public java.lang.String getSqdid() {
        return sqdid;
    }


    /**
     * Sets the sqdid value for this DeleteBrjcSqd.
     * 
     * @param sqdid
     */
    public void setSqdid(java.lang.String sqdid) {
        this.sqdid = sqdid;
    }


    /**
     * Gets the hiszyxh value for this DeleteBrjcSqd.
     * 
     * @return hiszyxh
     */
    public java.lang.String getHiszyxh() {
        return hiszyxh;
    }


    /**
     * Sets the hiszyxh value for this DeleteBrjcSqd.
     * 
     * @param hiszyxh
     */
    public void setHiszyxh(java.lang.String hiszyxh) {
        this.hiszyxh = hiszyxh;
    }


    /**
     * Gets the scyy value for this DeleteBrjcSqd.
     * 
     * @return scyy
     */
    public java.lang.String getScyy() {
        return scyy;
    }


    /**
     * Sets the scyy value for this DeleteBrjcSqd.
     * 
     * @param scyy
     */
    public void setScyy(java.lang.String scyy) {
        this.scyy = scyy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteBrjcSqd)) return false;
        DeleteBrjcSqd other = (DeleteBrjcSqd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sqdid==null && other.getSqdid()==null) || 
             (this.sqdid!=null &&
              this.sqdid.equals(other.getSqdid()))) &&
            ((this.hiszyxh==null && other.getHiszyxh()==null) || 
             (this.hiszyxh!=null &&
              this.hiszyxh.equals(other.getHiszyxh()))) &&
            ((this.scyy==null && other.getScyy()==null) || 
             (this.scyy!=null &&
              this.scyy.equals(other.getScyy())));
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
        if (getSqdid() != null) {
            _hashCode += getSqdid().hashCode();
        }
        if (getHiszyxh() != null) {
            _hashCode += getHiszyxh().hashCode();
        }
        if (getScyy() != null) {
            _hashCode += getScyy().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteBrjcSqd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteBrjcSqd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqdid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sqdid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hiszyxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "hiszyxh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scyy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "scyy"));
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
