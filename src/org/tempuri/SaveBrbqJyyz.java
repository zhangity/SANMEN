/**
 * SaveBrbqJyyz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SaveBrbqJyyz  implements java.io.Serializable {
    private org.tempuri.SaveBrbqJyyzDsSqd dsSqd;

    private org.tempuri.SaveBrbqJyyzDsMx dsMx;

    private java.lang.String doctrequestno;

    private java.lang.String CLINIC_ID;

    private java.lang.String deptcode;

    public SaveBrbqJyyz() {
    }

    public SaveBrbqJyyz(
           org.tempuri.SaveBrbqJyyzDsSqd dsSqd,
           org.tempuri.SaveBrbqJyyzDsMx dsMx,
           java.lang.String doctrequestno,
           java.lang.String CLINIC_ID,
           java.lang.String deptcode) {
           this.dsSqd = dsSqd;
           this.dsMx = dsMx;
           this.doctrequestno = doctrequestno;
           this.CLINIC_ID = CLINIC_ID;
           this.deptcode = deptcode;
    }


    /**
     * Gets the dsSqd value for this SaveBrbqJyyz.
     * 
     * @return dsSqd
     */
    public org.tempuri.SaveBrbqJyyzDsSqd getDsSqd() {
        return dsSqd;
    }


    /**
     * Sets the dsSqd value for this SaveBrbqJyyz.
     * 
     * @param dsSqd
     */
    public void setDsSqd(org.tempuri.SaveBrbqJyyzDsSqd dsSqd) {
        this.dsSqd = dsSqd;
    }


    /**
     * Gets the dsMx value for this SaveBrbqJyyz.
     * 
     * @return dsMx
     */
    public org.tempuri.SaveBrbqJyyzDsMx getDsMx() {
        return dsMx;
    }


    /**
     * Sets the dsMx value for this SaveBrbqJyyz.
     * 
     * @param dsMx
     */
    public void setDsMx(org.tempuri.SaveBrbqJyyzDsMx dsMx) {
        this.dsMx = dsMx;
    }


    /**
     * Gets the doctrequestno value for this SaveBrbqJyyz.
     * 
     * @return doctrequestno
     */
    public java.lang.String getDoctrequestno() {
        return doctrequestno;
    }


    /**
     * Sets the doctrequestno value for this SaveBrbqJyyz.
     * 
     * @param doctrequestno
     */
    public void setDoctrequestno(java.lang.String doctrequestno) {
        this.doctrequestno = doctrequestno;
    }


    /**
     * Gets the CLINIC_ID value for this SaveBrbqJyyz.
     * 
     * @return CLINIC_ID
     */
    public java.lang.String getCLINIC_ID() {
        return CLINIC_ID;
    }


    /**
     * Sets the CLINIC_ID value for this SaveBrbqJyyz.
     * 
     * @param CLINIC_ID
     */
    public void setCLINIC_ID(java.lang.String CLINIC_ID) {
        this.CLINIC_ID = CLINIC_ID;
    }


    /**
     * Gets the deptcode value for this SaveBrbqJyyz.
     * 
     * @return deptcode
     */
    public java.lang.String getDeptcode() {
        return deptcode;
    }


    /**
     * Sets the deptcode value for this SaveBrbqJyyz.
     * 
     * @param deptcode
     */
    public void setDeptcode(java.lang.String deptcode) {
        this.deptcode = deptcode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveBrbqJyyz)) return false;
        SaveBrbqJyyz other = (SaveBrbqJyyz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dsSqd==null && other.getDsSqd()==null) || 
             (this.dsSqd!=null &&
              this.dsSqd.equals(other.getDsSqd()))) &&
            ((this.dsMx==null && other.getDsMx()==null) || 
             (this.dsMx!=null &&
              this.dsMx.equals(other.getDsMx()))) &&
            ((this.doctrequestno==null && other.getDoctrequestno()==null) || 
             (this.doctrequestno!=null &&
              this.doctrequestno.equals(other.getDoctrequestno()))) &&
            ((this.CLINIC_ID==null && other.getCLINIC_ID()==null) || 
             (this.CLINIC_ID!=null &&
              this.CLINIC_ID.equals(other.getCLINIC_ID()))) &&
            ((this.deptcode==null && other.getDeptcode()==null) || 
             (this.deptcode!=null &&
              this.deptcode.equals(other.getDeptcode())));
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
        if (getDsSqd() != null) {
            _hashCode += getDsSqd().hashCode();
        }
        if (getDsMx() != null) {
            _hashCode += getDsMx().hashCode();
        }
        if (getDoctrequestno() != null) {
            _hashCode += getDoctrequestno().hashCode();
        }
        if (getCLINIC_ID() != null) {
            _hashCode += getCLINIC_ID().hashCode();
        }
        if (getDeptcode() != null) {
            _hashCode += getDeptcode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveBrbqJyyz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SaveBrbqJyyz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsSqd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dsSqd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SaveBrbqJyyz>dsSqd"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dsMx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dsMx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>SaveBrbqJyyz>dsMx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctrequestno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "doctrequestno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CLINIC_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CLINIC_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deptcode"));
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
