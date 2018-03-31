/**
 * InsertOrUpdateKblibrary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertOrUpdateKblibrary  implements java.io.Serializable {
    private java.lang.String strlistvalue;

    private org.tempuri.InsertOrUpdateKblibraryDtitem dtitem;

    private java.lang.String action;

    public InsertOrUpdateKblibrary() {
    }

    public InsertOrUpdateKblibrary(
           java.lang.String strlistvalue,
           org.tempuri.InsertOrUpdateKblibraryDtitem dtitem,
           java.lang.String action) {
           this.strlistvalue = strlistvalue;
           this.dtitem = dtitem;
           this.action = action;
    }


    /**
     * Gets the strlistvalue value for this InsertOrUpdateKblibrary.
     * 
     * @return strlistvalue
     */
    public java.lang.String getStrlistvalue() {
        return strlistvalue;
    }


    /**
     * Sets the strlistvalue value for this InsertOrUpdateKblibrary.
     * 
     * @param strlistvalue
     */
    public void setStrlistvalue(java.lang.String strlistvalue) {
        this.strlistvalue = strlistvalue;
    }


    /**
     * Gets the dtitem value for this InsertOrUpdateKblibrary.
     * 
     * @return dtitem
     */
    public org.tempuri.InsertOrUpdateKblibraryDtitem getDtitem() {
        return dtitem;
    }


    /**
     * Sets the dtitem value for this InsertOrUpdateKblibrary.
     * 
     * @param dtitem
     */
    public void setDtitem(org.tempuri.InsertOrUpdateKblibraryDtitem dtitem) {
        this.dtitem = dtitem;
    }


    /**
     * Gets the action value for this InsertOrUpdateKblibrary.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this InsertOrUpdateKblibrary.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertOrUpdateKblibrary)) return false;
        InsertOrUpdateKblibrary other = (InsertOrUpdateKblibrary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.strlistvalue==null && other.getStrlistvalue()==null) || 
             (this.strlistvalue!=null &&
              this.strlistvalue.equals(other.getStrlistvalue()))) &&
            ((this.dtitem==null && other.getDtitem()==null) || 
             (this.dtitem!=null &&
              this.dtitem.equals(other.getDtitem()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction())));
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
        if (getStrlistvalue() != null) {
            _hashCode += getStrlistvalue().hashCode();
        }
        if (getDtitem() != null) {
            _hashCode += getDtitem().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertOrUpdateKblibrary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertOrUpdateKblibrary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strlistvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "strlistvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtitem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dtitem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>InsertOrUpdateKblibrary>dtitem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "action"));
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
