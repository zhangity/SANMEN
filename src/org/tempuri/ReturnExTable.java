/**
 * ReturnExTable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ReturnExTable  implements java.io.Serializable {
    private java.lang.String _errorMess;

    private org.tempuri.ReturnExTable_infoData _infoData;

    private java.lang.String errorMess;

    private boolean success;

    private org.tempuri.ReturnExTableInfoData infoData;

    private java.lang.String exJg;

    public ReturnExTable() {
    }

    public ReturnExTable(
           java.lang.String _errorMess,
           org.tempuri.ReturnExTable_infoData _infoData,
           java.lang.String errorMess,
           boolean success,
           org.tempuri.ReturnExTableInfoData infoData,
           java.lang.String exJg) {
           this._errorMess = _errorMess;
           this._infoData = _infoData;
           this.errorMess = errorMess;
           this.success = success;
           this.infoData = infoData;
           this.exJg = exJg;
    }


    /**
     * Gets the _errorMess value for this ReturnExTable.
     * 
     * @return _errorMess
     */
    public java.lang.String get_errorMess() {
        return _errorMess;
    }


    /**
     * Sets the _errorMess value for this ReturnExTable.
     * 
     * @param _errorMess
     */
    public void set_errorMess(java.lang.String _errorMess) {
        this._errorMess = _errorMess;
    }


    /**
     * Gets the _infoData value for this ReturnExTable.
     * 
     * @return _infoData
     */
    public org.tempuri.ReturnExTable_infoData get_infoData() {
        return _infoData;
    }


    /**
     * Sets the _infoData value for this ReturnExTable.
     * 
     * @param _infoData
     */
    public void set_infoData(org.tempuri.ReturnExTable_infoData _infoData) {
        this._infoData = _infoData;
    }


    /**
     * Gets the errorMess value for this ReturnExTable.
     * 
     * @return errorMess
     */
    public java.lang.String getErrorMess() {
        return errorMess;
    }


    /**
     * Sets the errorMess value for this ReturnExTable.
     * 
     * @param errorMess
     */
    public void setErrorMess(java.lang.String errorMess) {
        this.errorMess = errorMess;
    }


    /**
     * Gets the success value for this ReturnExTable.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this ReturnExTable.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }


    /**
     * Gets the infoData value for this ReturnExTable.
     * 
     * @return infoData
     */
    public org.tempuri.ReturnExTableInfoData getInfoData() {
        return infoData;
    }


    /**
     * Sets the infoData value for this ReturnExTable.
     * 
     * @param infoData
     */
    public void setInfoData(org.tempuri.ReturnExTableInfoData infoData) {
        this.infoData = infoData;
    }


    /**
     * Gets the exJg value for this ReturnExTable.
     * 
     * @return exJg
     */
    public java.lang.String getExJg() {
        return exJg;
    }


    /**
     * Sets the exJg value for this ReturnExTable.
     * 
     * @param exJg
     */
    public void setExJg(java.lang.String exJg) {
        this.exJg = exJg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnExTable)) return false;
        ReturnExTable other = (ReturnExTable) obj;
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
            ((this._infoData==null && other.get_infoData()==null) || 
             (this._infoData!=null &&
              this._infoData.equals(other.get_infoData()))) &&
            ((this.errorMess==null && other.getErrorMess()==null) || 
             (this.errorMess!=null &&
              this.errorMess.equals(other.getErrorMess()))) &&
            this.success == other.isSuccess() &&
            ((this.infoData==null && other.getInfoData()==null) || 
             (this.infoData!=null &&
              this.infoData.equals(other.getInfoData()))) &&
            ((this.exJg==null && other.getExJg()==null) || 
             (this.exJg!=null &&
              this.exJg.equals(other.getExJg())));
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
        if (get_infoData() != null) {
            _hashCode += get_infoData().hashCode();
        }
        if (getErrorMess() != null) {
            _hashCode += getErrorMess().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInfoData() != null) {
            _hashCode += getInfoData().hashCode();
        }
        if (getExJg() != null) {
            _hashCode += getExJg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReturnExTable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExTable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_errorMess");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "_errorMess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_infoData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "_infoData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReturnExTable>_infoData"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InfoData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReturnExTable>InfoData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exJg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ExJg"));
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
