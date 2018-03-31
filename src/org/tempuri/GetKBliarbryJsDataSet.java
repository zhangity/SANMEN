/**
 * GetKBliarbryJsDataSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetKBliarbryJsDataSet  implements java.io.Serializable {
    private java.lang.String ywid;

    private java.lang.String ks;

    private java.lang.String gh;

    private java.lang.String lx;

    private java.lang.String qy;

    private java.lang.String jsmc;

    public GetKBliarbryJsDataSet() {
    }

    public GetKBliarbryJsDataSet(
           java.lang.String ywid,
           java.lang.String ks,
           java.lang.String gh,
           java.lang.String lx,
           java.lang.String qy,
           java.lang.String jsmc) {
           this.ywid = ywid;
           this.ks = ks;
           this.gh = gh;
           this.lx = lx;
           this.qy = qy;
           this.jsmc = jsmc;
    }


    /**
     * Gets the ywid value for this GetKBliarbryJsDataSet.
     * 
     * @return ywid
     */
    public java.lang.String getYwid() {
        return ywid;
    }


    /**
     * Sets the ywid value for this GetKBliarbryJsDataSet.
     * 
     * @param ywid
     */
    public void setYwid(java.lang.String ywid) {
        this.ywid = ywid;
    }


    /**
     * Gets the ks value for this GetKBliarbryJsDataSet.
     * 
     * @return ks
     */
    public java.lang.String getKs() {
        return ks;
    }


    /**
     * Sets the ks value for this GetKBliarbryJsDataSet.
     * 
     * @param ks
     */
    public void setKs(java.lang.String ks) {
        this.ks = ks;
    }


    /**
     * Gets the gh value for this GetKBliarbryJsDataSet.
     * 
     * @return gh
     */
    public java.lang.String getGh() {
        return gh;
    }


    /**
     * Sets the gh value for this GetKBliarbryJsDataSet.
     * 
     * @param gh
     */
    public void setGh(java.lang.String gh) {
        this.gh = gh;
    }


    /**
     * Gets the lx value for this GetKBliarbryJsDataSet.
     * 
     * @return lx
     */
    public java.lang.String getLx() {
        return lx;
    }


    /**
     * Sets the lx value for this GetKBliarbryJsDataSet.
     * 
     * @param lx
     */
    public void setLx(java.lang.String lx) {
        this.lx = lx;
    }


    /**
     * Gets the qy value for this GetKBliarbryJsDataSet.
     * 
     * @return qy
     */
    public java.lang.String getQy() {
        return qy;
    }


    /**
     * Sets the qy value for this GetKBliarbryJsDataSet.
     * 
     * @param qy
     */
    public void setQy(java.lang.String qy) {
        this.qy = qy;
    }


    /**
     * Gets the jsmc value for this GetKBliarbryJsDataSet.
     * 
     * @return jsmc
     */
    public java.lang.String getJsmc() {
        return jsmc;
    }


    /**
     * Sets the jsmc value for this GetKBliarbryJsDataSet.
     * 
     * @param jsmc
     */
    public void setJsmc(java.lang.String jsmc) {
        this.jsmc = jsmc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetKBliarbryJsDataSet)) return false;
        GetKBliarbryJsDataSet other = (GetKBliarbryJsDataSet) obj;
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
            ((this.ks==null && other.getKs()==null) || 
             (this.ks!=null &&
              this.ks.equals(other.getKs()))) &&
            ((this.gh==null && other.getGh()==null) || 
             (this.gh!=null &&
              this.gh.equals(other.getGh()))) &&
            ((this.lx==null && other.getLx()==null) || 
             (this.lx!=null &&
              this.lx.equals(other.getLx()))) &&
            ((this.qy==null && other.getQy()==null) || 
             (this.qy!=null &&
              this.qy.equals(other.getQy()))) &&
            ((this.jsmc==null && other.getJsmc()==null) || 
             (this.jsmc!=null &&
              this.jsmc.equals(other.getJsmc())));
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
        if (getKs() != null) {
            _hashCode += getKs().hashCode();
        }
        if (getGh() != null) {
            _hashCode += getGh().hashCode();
        }
        if (getLx() != null) {
            _hashCode += getLx().hashCode();
        }
        if (getQy() != null) {
            _hashCode += getQy().hashCode();
        }
        if (getJsmc() != null) {
            _hashCode += getJsmc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetKBliarbryJsDataSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetKBliarbryJsDataSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ywid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ywid"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "gh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "lx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "qy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jsmc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jsmc"));
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
