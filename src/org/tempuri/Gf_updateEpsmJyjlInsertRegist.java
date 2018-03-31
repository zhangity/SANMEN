/**
 * Gf_updateEpsmJyjlInsertRegist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Gf_updateEpsmJyjlInsertRegist  implements java.io.Serializable {
    private java.lang.String as_jyjg;

    private java.lang.String as_jssj;

    private java.lang.String as_zxlsh;

    private java.lang.String as_tradeid;

    private org.tempuri.REGIST_OF_CLINIC model;

    public Gf_updateEpsmJyjlInsertRegist() {
    }

    public Gf_updateEpsmJyjlInsertRegist(
           java.lang.String as_jyjg,
           java.lang.String as_jssj,
           java.lang.String as_zxlsh,
           java.lang.String as_tradeid,
           org.tempuri.REGIST_OF_CLINIC model) {
           this.as_jyjg = as_jyjg;
           this.as_jssj = as_jssj;
           this.as_zxlsh = as_zxlsh;
           this.as_tradeid = as_tradeid;
           this.model = model;
    }


    /**
     * Gets the as_jyjg value for this Gf_updateEpsmJyjlInsertRegist.
     * 
     * @return as_jyjg
     */
    public java.lang.String getAs_jyjg() {
        return as_jyjg;
    }


    /**
     * Sets the as_jyjg value for this Gf_updateEpsmJyjlInsertRegist.
     * 
     * @param as_jyjg
     */
    public void setAs_jyjg(java.lang.String as_jyjg) {
        this.as_jyjg = as_jyjg;
    }


    /**
     * Gets the as_jssj value for this Gf_updateEpsmJyjlInsertRegist.
     * 
     * @return as_jssj
     */
    public java.lang.String getAs_jssj() {
        return as_jssj;
    }


    /**
     * Sets the as_jssj value for this Gf_updateEpsmJyjlInsertRegist.
     * 
     * @param as_jssj
     */
    public void setAs_jssj(java.lang.String as_jssj) {
        this.as_jssj = as_jssj;
    }


    /**
     * Gets the as_zxlsh value for this Gf_updateEpsmJyjlInsertRegist.
     * 
     * @return as_zxlsh
     */
    public java.lang.String getAs_zxlsh() {
        return as_zxlsh;
    }


    /**
     * Sets the as_zxlsh value for this Gf_updateEpsmJyjlInsertRegist.
     * 
     * @param as_zxlsh
     */
    public void setAs_zxlsh(java.lang.String as_zxlsh) {
        this.as_zxlsh = as_zxlsh;
    }


    /**
     * Gets the as_tradeid value for this Gf_updateEpsmJyjlInsertRegist.
     * 
     * @return as_tradeid
     */
    public java.lang.String getAs_tradeid() {
        return as_tradeid;
    }


    /**
     * Sets the as_tradeid value for this Gf_updateEpsmJyjlInsertRegist.
     * 
     * @param as_tradeid
     */
    public void setAs_tradeid(java.lang.String as_tradeid) {
        this.as_tradeid = as_tradeid;
    }


    /**
     * Gets the model value for this Gf_updateEpsmJyjlInsertRegist.
     * 
     * @return model
     */
    public org.tempuri.REGIST_OF_CLINIC getModel() {
        return model;
    }


    /**
     * Sets the model value for this Gf_updateEpsmJyjlInsertRegist.
     * 
     * @param model
     */
    public void setModel(org.tempuri.REGIST_OF_CLINIC model) {
        this.model = model;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gf_updateEpsmJyjlInsertRegist)) return false;
        Gf_updateEpsmJyjlInsertRegist other = (Gf_updateEpsmJyjlInsertRegist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.as_jyjg==null && other.getAs_jyjg()==null) || 
             (this.as_jyjg!=null &&
              this.as_jyjg.equals(other.getAs_jyjg()))) &&
            ((this.as_jssj==null && other.getAs_jssj()==null) || 
             (this.as_jssj!=null &&
              this.as_jssj.equals(other.getAs_jssj()))) &&
            ((this.as_zxlsh==null && other.getAs_zxlsh()==null) || 
             (this.as_zxlsh!=null &&
              this.as_zxlsh.equals(other.getAs_zxlsh()))) &&
            ((this.as_tradeid==null && other.getAs_tradeid()==null) || 
             (this.as_tradeid!=null &&
              this.as_tradeid.equals(other.getAs_tradeid()))) &&
            ((this.model==null && other.getModel()==null) || 
             (this.model!=null &&
              this.model.equals(other.getModel())));
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
        if (getAs_jyjg() != null) {
            _hashCode += getAs_jyjg().hashCode();
        }
        if (getAs_jssj() != null) {
            _hashCode += getAs_jssj().hashCode();
        }
        if (getAs_zxlsh() != null) {
            _hashCode += getAs_zxlsh().hashCode();
        }
        if (getAs_tradeid() != null) {
            _hashCode += getAs_tradeid().hashCode();
        }
        if (getModel() != null) {
            _hashCode += getModel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gf_updateEpsmJyjlInsertRegist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">gf_updateEpsmJyjlInsertRegist"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_jyjg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_jyjg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_jssj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_jssj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_zxlsh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_zxlsh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("as_tradeid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "as_tradeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("model");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "REGIST_OF_CLINIC"));
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
