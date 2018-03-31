/**
 * PagedItemReturnObjectDataSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PagedItemReturnObjectDataSet  implements java.io.Serializable {
    private java.lang.String _errorMess;

    private int totalRecords;

    private org.tempuri.PagedItemReturnObjectDataSetReturnDataSet returnDataSet;

    private java.lang.String errorMess;

    private boolean success;

    public PagedItemReturnObjectDataSet() {
    }

    public PagedItemReturnObjectDataSet(
           java.lang.String _errorMess,
           int totalRecords,
           org.tempuri.PagedItemReturnObjectDataSetReturnDataSet returnDataSet,
           java.lang.String errorMess,
           boolean success) {
           this._errorMess = _errorMess;
           this.totalRecords = totalRecords;
           this.returnDataSet = returnDataSet;
           this.errorMess = errorMess;
           this.success = success;
    }


    /**
     * Gets the _errorMess value for this PagedItemReturnObjectDataSet.
     * 
     * @return _errorMess
     */
    public java.lang.String get_errorMess() {
        return _errorMess;
    }


    /**
     * Sets the _errorMess value for this PagedItemReturnObjectDataSet.
     * 
     * @param _errorMess
     */
    public void set_errorMess(java.lang.String _errorMess) {
        this._errorMess = _errorMess;
    }


    /**
     * Gets the totalRecords value for this PagedItemReturnObjectDataSet.
     * 
     * @return totalRecords
     */
    public int getTotalRecords() {
        return totalRecords;
    }


    /**
     * Sets the totalRecords value for this PagedItemReturnObjectDataSet.
     * 
     * @param totalRecords
     */
    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }


    /**
     * Gets the returnDataSet value for this PagedItemReturnObjectDataSet.
     * 
     * @return returnDataSet
     */
    public org.tempuri.PagedItemReturnObjectDataSetReturnDataSet getReturnDataSet() {
        return returnDataSet;
    }


    /**
     * Sets the returnDataSet value for this PagedItemReturnObjectDataSet.
     * 
     * @param returnDataSet
     */
    public void setReturnDataSet(org.tempuri.PagedItemReturnObjectDataSetReturnDataSet returnDataSet) {
        this.returnDataSet = returnDataSet;
    }


    /**
     * Gets the errorMess value for this PagedItemReturnObjectDataSet.
     * 
     * @return errorMess
     */
    public java.lang.String getErrorMess() {
        return errorMess;
    }


    /**
     * Sets the errorMess value for this PagedItemReturnObjectDataSet.
     * 
     * @param errorMess
     */
    public void setErrorMess(java.lang.String errorMess) {
        this.errorMess = errorMess;
    }


    /**
     * Gets the success value for this PagedItemReturnObjectDataSet.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this PagedItemReturnObjectDataSet.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PagedItemReturnObjectDataSet)) return false;
        PagedItemReturnObjectDataSet other = (PagedItemReturnObjectDataSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._errorMess==null && other.get_errorMess()==null) || 
             (this._errorMess!=null &&
              this._errorMess.equals(other.get_errorMess()))) &&
            this.totalRecords == other.getTotalRecords() &&
            ((this.returnDataSet==null && other.getReturnDataSet()==null) || 
             (this.returnDataSet!=null &&
              this.returnDataSet.equals(other.getReturnDataSet()))) &&
            ((this.errorMess==null && other.getErrorMess()==null) || 
             (this.errorMess!=null &&
              this.errorMess.equals(other.getErrorMess()))) &&
            this.success == other.isSuccess();
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
        if (get_errorMess() != null) {
            _hashCode += get_errorMess().hashCode();
        }
        _hashCode += getTotalRecords();
        if (getReturnDataSet() != null) {
            _hashCode += getReturnDataSet().hashCode();
        }
        if (getErrorMess() != null) {
            _hashCode += getErrorMess().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PagedItemReturnObjectDataSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "PagedItemReturnObjectDataSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_errorMess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "_errorMess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TotalRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDataSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnDataSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PagedItemReturnObjectDataSet>ReturnDataSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ErrorMess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
