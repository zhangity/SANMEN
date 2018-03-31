/**
 * GetWaitSeeDoctorPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetWaitSeeDoctorPage  implements java.io.Serializable {
    private java.lang.String visit_no;

    private java.lang.String brxm;

    private java.lang.String deptcode;

    private java.lang.String mzks;

    private java.lang.String doctor_code;

    private java.lang.String dpB;

    private java.lang.String dpO;

    private java.lang.String regist_status;

    private int pageIndex;

    private int pageSize;

    public GetWaitSeeDoctorPage() {
    }

    public GetWaitSeeDoctorPage(
           java.lang.String visit_no,
           java.lang.String brxm,
           java.lang.String deptcode,
           java.lang.String mzks,
           java.lang.String doctor_code,
           java.lang.String dpB,
           java.lang.String dpO,
           java.lang.String regist_status,
           int pageIndex,
           int pageSize) {
           this.visit_no = visit_no;
           this.brxm = brxm;
           this.deptcode = deptcode;
           this.mzks = mzks;
           this.doctor_code = doctor_code;
           this.dpB = dpB;
           this.dpO = dpO;
           this.regist_status = regist_status;
           this.pageIndex = pageIndex;
           this.pageSize = pageSize;
    }


    /**
     * Gets the visit_no value for this GetWaitSeeDoctorPage.
     * 
     * @return visit_no
     */
    public java.lang.String getVisit_no() {
        return visit_no;
    }


    /**
     * Sets the visit_no value for this GetWaitSeeDoctorPage.
     * 
     * @param visit_no
     */
    public void setVisit_no(java.lang.String visit_no) {
        this.visit_no = visit_no;
    }


    /**
     * Gets the brxm value for this GetWaitSeeDoctorPage.
     * 
     * @return brxm
     */
    public java.lang.String getBrxm() {
        return brxm;
    }


    /**
     * Sets the brxm value for this GetWaitSeeDoctorPage.
     * 
     * @param brxm
     */
    public void setBrxm(java.lang.String brxm) {
        this.brxm = brxm;
    }


    /**
     * Gets the deptcode value for this GetWaitSeeDoctorPage.
     * 
     * @return deptcode
     */
    public java.lang.String getDeptcode() {
        return deptcode;
    }


    /**
     * Sets the deptcode value for this GetWaitSeeDoctorPage.
     * 
     * @param deptcode
     */
    public void setDeptcode(java.lang.String deptcode) {
        this.deptcode = deptcode;
    }


    /**
     * Gets the mzks value for this GetWaitSeeDoctorPage.
     * 
     * @return mzks
     */
    public java.lang.String getMzks() {
        return mzks;
    }


    /**
     * Sets the mzks value for this GetWaitSeeDoctorPage.
     * 
     * @param mzks
     */
    public void setMzks(java.lang.String mzks) {
        this.mzks = mzks;
    }


    /**
     * Gets the doctor_code value for this GetWaitSeeDoctorPage.
     * 
     * @return doctor_code
     */
    public java.lang.String getDoctor_code() {
        return doctor_code;
    }


    /**
     * Sets the doctor_code value for this GetWaitSeeDoctorPage.
     * 
     * @param doctor_code
     */
    public void setDoctor_code(java.lang.String doctor_code) {
        this.doctor_code = doctor_code;
    }


    /**
     * Gets the dpB value for this GetWaitSeeDoctorPage.
     * 
     * @return dpB
     */
    public java.lang.String getDpB() {
        return dpB;
    }


    /**
     * Sets the dpB value for this GetWaitSeeDoctorPage.
     * 
     * @param dpB
     */
    public void setDpB(java.lang.String dpB) {
        this.dpB = dpB;
    }


    /**
     * Gets the dpO value for this GetWaitSeeDoctorPage.
     * 
     * @return dpO
     */
    public java.lang.String getDpO() {
        return dpO;
    }


    /**
     * Sets the dpO value for this GetWaitSeeDoctorPage.
     * 
     * @param dpO
     */
    public void setDpO(java.lang.String dpO) {
        this.dpO = dpO;
    }


    /**
     * Gets the regist_status value for this GetWaitSeeDoctorPage.
     * 
     * @return regist_status
     */
    public java.lang.String getRegist_status() {
        return regist_status;
    }


    /**
     * Sets the regist_status value for this GetWaitSeeDoctorPage.
     * 
     * @param regist_status
     */
    public void setRegist_status(java.lang.String regist_status) {
        this.regist_status = regist_status;
    }


    /**
     * Gets the pageIndex value for this GetWaitSeeDoctorPage.
     * 
     * @return pageIndex
     */
    public int getPageIndex() {
        return pageIndex;
    }


    /**
     * Sets the pageIndex value for this GetWaitSeeDoctorPage.
     * 
     * @param pageIndex
     */
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * Gets the pageSize value for this GetWaitSeeDoctorPage.
     * 
     * @return pageSize
     */
    public int getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this GetWaitSeeDoctorPage.
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWaitSeeDoctorPage)) return false;
        GetWaitSeeDoctorPage other = (GetWaitSeeDoctorPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.visit_no==null && other.getVisit_no()==null) || 
             (this.visit_no!=null &&
              this.visit_no.equals(other.getVisit_no()))) &&
            ((this.brxm==null && other.getBrxm()==null) || 
             (this.brxm!=null &&
              this.brxm.equals(other.getBrxm()))) &&
            ((this.deptcode==null && other.getDeptcode()==null) || 
             (this.deptcode!=null &&
              this.deptcode.equals(other.getDeptcode()))) &&
            ((this.mzks==null && other.getMzks()==null) || 
             (this.mzks!=null &&
              this.mzks.equals(other.getMzks()))) &&
            ((this.doctor_code==null && other.getDoctor_code()==null) || 
             (this.doctor_code!=null &&
              this.doctor_code.equals(other.getDoctor_code()))) &&
            ((this.dpB==null && other.getDpB()==null) || 
             (this.dpB!=null &&
              this.dpB.equals(other.getDpB()))) &&
            ((this.dpO==null && other.getDpO()==null) || 
             (this.dpO!=null &&
              this.dpO.equals(other.getDpO()))) &&
            ((this.regist_status==null && other.getRegist_status()==null) || 
             (this.regist_status!=null &&
              this.regist_status.equals(other.getRegist_status()))) &&
            this.pageIndex == other.getPageIndex() &&
            this.pageSize == other.getPageSize();
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
        if (getVisit_no() != null) {
            _hashCode += getVisit_no().hashCode();
        }
        if (getBrxm() != null) {
            _hashCode += getBrxm().hashCode();
        }
        if (getDeptcode() != null) {
            _hashCode += getDeptcode().hashCode();
        }
        if (getMzks() != null) {
            _hashCode += getMzks().hashCode();
        }
        if (getDoctor_code() != null) {
            _hashCode += getDoctor_code().hashCode();
        }
        if (getDpB() != null) {
            _hashCode += getDpB().hashCode();
        }
        if (getDpO() != null) {
            _hashCode += getDpO().hashCode();
        }
        if (getRegist_status() != null) {
            _hashCode += getRegist_status().hashCode();
        }
        _hashCode += getPageIndex();
        _hashCode += getPageSize();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWaitSeeDoctorPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetWaitSeeDoctorPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visit_no");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "visit_no"));
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
        elemField.setFieldName("deptcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deptcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mzks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doctor_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "doctor_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dpB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dpO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regist_status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "regist_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pageIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
