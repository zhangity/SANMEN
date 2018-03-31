/**
 * GetHzList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetHzList  implements java.io.Serializable {
    private java.lang.String kssj;

    private java.lang.String jssj;

    private java.lang.String xzlx;

    private java.lang.String clinic_id;

    private java.lang.String userid;

    private java.lang.String ksid;

    private int pageIndex;

    private int pageSize;

    public GetHzList() {
    }

    public GetHzList(
           java.lang.String kssj,
           java.lang.String jssj,
           java.lang.String xzlx,
           java.lang.String clinic_id,
           java.lang.String userid,
           java.lang.String ksid,
           int pageIndex,
           int pageSize) {
           this.kssj = kssj;
           this.jssj = jssj;
           this.xzlx = xzlx;
           this.clinic_id = clinic_id;
           this.userid = userid;
           this.ksid = ksid;
           this.pageIndex = pageIndex;
           this.pageSize = pageSize;
    }


    /**
     * Gets the kssj value for this GetHzList.
     * 
     * @return kssj
     */
    public java.lang.String getKssj() {
        return kssj;
    }


    /**
     * Sets the kssj value for this GetHzList.
     * 
     * @param kssj
     */
    public void setKssj(java.lang.String kssj) {
        this.kssj = kssj;
    }


    /**
     * Gets the jssj value for this GetHzList.
     * 
     * @return jssj
     */
    public java.lang.String getJssj() {
        return jssj;
    }


    /**
     * Sets the jssj value for this GetHzList.
     * 
     * @param jssj
     */
    public void setJssj(java.lang.String jssj) {
        this.jssj = jssj;
    }


    /**
     * Gets the xzlx value for this GetHzList.
     * 
     * @return xzlx
     */
    public java.lang.String getXzlx() {
        return xzlx;
    }


    /**
     * Sets the xzlx value for this GetHzList.
     * 
     * @param xzlx
     */
    public void setXzlx(java.lang.String xzlx) {
        this.xzlx = xzlx;
    }


    /**
     * Gets the clinic_id value for this GetHzList.
     * 
     * @return clinic_id
     */
    public java.lang.String getClinic_id() {
        return clinic_id;
    }


    /**
     * Sets the clinic_id value for this GetHzList.
     * 
     * @param clinic_id
     */
    public void setClinic_id(java.lang.String clinic_id) {
        this.clinic_id = clinic_id;
    }


    /**
     * Gets the userid value for this GetHzList.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this GetHzList.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }


    /**
     * Gets the ksid value for this GetHzList.
     * 
     * @return ksid
     */
    public java.lang.String getKsid() {
        return ksid;
    }


    /**
     * Sets the ksid value for this GetHzList.
     * 
     * @param ksid
     */
    public void setKsid(java.lang.String ksid) {
        this.ksid = ksid;
    }


    /**
     * Gets the pageIndex value for this GetHzList.
     * 
     * @return pageIndex
     */
    public int getPageIndex() {
        return pageIndex;
    }


    /**
     * Sets the pageIndex value for this GetHzList.
     * 
     * @param pageIndex
     */
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * Gets the pageSize value for this GetHzList.
     * 
     * @return pageSize
     */
    public int getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this GetHzList.
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHzList)) return false;
        GetHzList other = (GetHzList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kssj==null && other.getKssj()==null) || 
             (this.kssj!=null &&
              this.kssj.equals(other.getKssj()))) &&
            ((this.jssj==null && other.getJssj()==null) || 
             (this.jssj!=null &&
              this.jssj.equals(other.getJssj()))) &&
            ((this.xzlx==null && other.getXzlx()==null) || 
             (this.xzlx!=null &&
              this.xzlx.equals(other.getXzlx()))) &&
            ((this.clinic_id==null && other.getClinic_id()==null) || 
             (this.clinic_id!=null &&
              this.clinic_id.equals(other.getClinic_id()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid()))) &&
            ((this.ksid==null && other.getKsid()==null) || 
             (this.ksid!=null &&
              this.ksid.equals(other.getKsid()))) &&
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
        if (getKssj() != null) {
            _hashCode += getKssj().hashCode();
        }
        if (getJssj() != null) {
            _hashCode += getJssj().hashCode();
        }
        if (getXzlx() != null) {
            _hashCode += getXzlx().hashCode();
        }
        if (getClinic_id() != null) {
            _hashCode += getClinic_id().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        if (getKsid() != null) {
            _hashCode += getKsid().hashCode();
        }
        _hashCode += getPageIndex();
        _hashCode += getPageSize();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHzList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetHzList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kssj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "kssj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jssj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jssj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xzlx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "xzlx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clinic_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "clinic_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "userid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ksid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ksid"));
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
