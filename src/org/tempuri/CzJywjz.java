/**
 * CzJywjz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CzJywjz  implements java.io.Serializable {
    private java.lang.String jlxh;

    private java.lang.String ysxm;

    private java.lang.String czff;

    private java.lang.String czbc;

    private java.lang.String czsj;

    public CzJywjz() {
    }

    public CzJywjz(
           java.lang.String jlxh,
           java.lang.String ysxm,
           java.lang.String czff,
           java.lang.String czbc,
           java.lang.String czsj) {
           this.jlxh = jlxh;
           this.ysxm = ysxm;
           this.czff = czff;
           this.czbc = czbc;
           this.czsj = czsj;
    }


    /**
     * Gets the jlxh value for this CzJywjz.
     * 
     * @return jlxh
     */
    public java.lang.String getJlxh() {
        return jlxh;
    }


    /**
     * Sets the jlxh value for this CzJywjz.
     * 
     * @param jlxh
     */
    public void setJlxh(java.lang.String jlxh) {
        this.jlxh = jlxh;
    }


    /**
     * Gets the ysxm value for this CzJywjz.
     * 
     * @return ysxm
     */
    public java.lang.String getYsxm() {
        return ysxm;
    }


    /**
     * Sets the ysxm value for this CzJywjz.
     * 
     * @param ysxm
     */
    public void setYsxm(java.lang.String ysxm) {
        this.ysxm = ysxm;
    }


    /**
     * Gets the czff value for this CzJywjz.
     * 
     * @return czff
     */
    public java.lang.String getCzff() {
        return czff;
    }


    /**
     * Sets the czff value for this CzJywjz.
     * 
     * @param czff
     */
    public void setCzff(java.lang.String czff) {
        this.czff = czff;
    }


    /**
     * Gets the czbc value for this CzJywjz.
     * 
     * @return czbc
     */
    public java.lang.String getCzbc() {
        return czbc;
    }


    /**
     * Sets the czbc value for this CzJywjz.
     * 
     * @param czbc
     */
    public void setCzbc(java.lang.String czbc) {
        this.czbc = czbc;
    }


    /**
     * Gets the czsj value for this CzJywjz.
     * 
     * @return czsj
     */
    public java.lang.String getCzsj() {
        return czsj;
    }


    /**
     * Sets the czsj value for this CzJywjz.
     * 
     * @param czsj
     */
    public void setCzsj(java.lang.String czsj) {
        this.czsj = czsj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CzJywjz)) return false;
        CzJywjz other = (CzJywjz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jlxh==null && other.getJlxh()==null) || 
             (this.jlxh!=null &&
              this.jlxh.equals(other.getJlxh()))) &&
            ((this.ysxm==null && other.getYsxm()==null) || 
             (this.ysxm!=null &&
              this.ysxm.equals(other.getYsxm()))) &&
            ((this.czff==null && other.getCzff()==null) || 
             (this.czff!=null &&
              this.czff.equals(other.getCzff()))) &&
            ((this.czbc==null && other.getCzbc()==null) || 
             (this.czbc!=null &&
              this.czbc.equals(other.getCzbc()))) &&
            ((this.czsj==null && other.getCzsj()==null) || 
             (this.czsj!=null &&
              this.czsj.equals(other.getCzsj())));
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
        if (getJlxh() != null) {
            _hashCode += getJlxh().hashCode();
        }
        if (getYsxm() != null) {
            _hashCode += getYsxm().hashCode();
        }
        if (getCzff() != null) {
            _hashCode += getCzff().hashCode();
        }
        if (getCzbc() != null) {
            _hashCode += getCzbc().hashCode();
        }
        if (getCzsj() != null) {
            _hashCode += getCzsj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CzJywjz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CzJywjz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jlxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jlxh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ysxm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ysxm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czbc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czbc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czsj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czsj"));
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
