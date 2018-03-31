/**
 * GetDeptList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDeptList  implements java.io.Serializable {
    private java.lang.String strWhere;

    private int pageSize;

    private int pageIndex;

    private java.lang.String lx;

    public GetDeptList() {
    }

    public GetDeptList(
           java.lang.String strWhere,
           int pageSize,
           int pageIndex,
           java.lang.String lx) {
           this.strWhere = strWhere;
           this.pageSize = pageSize;
           this.pageIndex = pageIndex;
           this.lx = lx;
    }


    /**
     * Gets the strWhere value for this GetDeptList.
     * 
     * @return strWhere
     */
    public java.lang.String getStrWhere() {
        return strWhere;
    }


    /**
     * Sets the strWhere value for this GetDeptList.
     * 
     * @param strWhere
     */
    public void setStrWhere(java.lang.String strWhere) {
        this.strWhere = strWhere;
    }


    /**
     * Gets the pageSize value for this GetDeptList.
     * 
     * @return pageSize
     */
    public int getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this GetDeptList.
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the pageIndex value for this GetDeptList.
     * 
     * @return pageIndex
     */
    public int getPageIndex() {
        return pageIndex;
    }


    /**
     * Sets the pageIndex value for this GetDeptList.
     * 
     * @param pageIndex
     */
    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }


    /**
     * Gets the lx value for this GetDeptList.
     * 
     * @return lx
     */
    public java.lang.String getLx() {
        return lx;
    }


    /**
     * Sets the lx value for this GetDeptList.
     * 
     * @param lx
     */
    public void setLx(java.lang.String lx) {
        this.lx = lx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDeptList)) return false;
        GetDeptList other = (GetDeptList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strWhere==null && other.getStrWhere()==null) || 
             (this.strWhere!=null &&
              this.strWhere.equals(other.getStrWhere()))) &&
            this.pageSize == other.getPageSize() &&
            this.pageIndex == other.getPageIndex() &&
            ((this.lx==null && other.getLx()==null) || 
             (this.lx!=null &&
              this.lx.equals(other.getLx())));
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
        if (getStrWhere() != null) {
            _hashCode += getStrWhere().hashCode();
        }
        _hashCode += getPageSize();
        _hashCode += getPageIndex();
        if (getLx() != null) {
            _hashCode += getLx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDeptList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDeptList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strWhere");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strWhere"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pageIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "lx"));
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
