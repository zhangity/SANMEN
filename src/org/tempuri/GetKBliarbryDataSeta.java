/**
 * GetKBliarbryDataSeta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetKBliarbryDataSeta  implements java.io.Serializable {
    private java.lang.String ywid;

    private java.lang.String gh;

    private java.lang.String ks;

    public GetKBliarbryDataSeta() {
    }

    public GetKBliarbryDataSeta(
           java.lang.String ywid,
           java.lang.String gh,
           java.lang.String ks) {
           this.ywid = ywid;
           this.gh = gh;
           this.ks = ks;
    }


    /**
     * Gets the ywid value for this GetKBliarbryDataSeta.
     * 
     * @return ywid
     */
    public java.lang.String getYwid() {
        return ywid;
    }


    /**
     * Sets the ywid value for this GetKBliarbryDataSeta.
     * 
     * @param ywid
     */
    public void setYwid(java.lang.String ywid) {
        this.ywid = ywid;
    }


    /**
     * Gets the gh value for this GetKBliarbryDataSeta.
     * 
     * @return gh
     */
    public java.lang.String getGh() {
        return gh;
    }


    /**
     * Sets the gh value for this GetKBliarbryDataSeta.
     * 
     * @param gh
     */
    public void setGh(java.lang.String gh) {
        this.gh = gh;
    }


    /**
     * Gets the ks value for this GetKBliarbryDataSeta.
     * 
     * @return ks
     */
    public java.lang.String getKs() {
        return ks;
    }


    /**
     * Sets the ks value for this GetKBliarbryDataSeta.
     * 
     * @param ks
     */
    public void setKs(java.lang.String ks) {
        this.ks = ks;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKBliarbryDataSeta)) return false;
        GetKBliarbryDataSeta other = (GetKBliarbryDataSeta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ywid==null && other.getYwid()==null) || 
             (this.ywid!=null &&
              this.ywid.equals(other.getYwid()))) &&
            ((this.gh==null && other.getGh()==null) || 
             (this.gh!=null &&
              this.gh.equals(other.getGh()))) &&
            ((this.ks==null && other.getKs()==null) || 
             (this.ks!=null &&
              this.ks.equals(other.getKs())));
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
        if (getYwid() != null) {
            _hashCode += getYwid().hashCode();
        }
        if (getGh() != null) {
            _hashCode += getGh().hashCode();
        }
        if (getKs() != null) {
            _hashCode += getKs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKBliarbryDataSeta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetKBliarbryDataSeta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ywid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ywid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ks"));
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
