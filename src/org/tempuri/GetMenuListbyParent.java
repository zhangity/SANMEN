/**
 * GetMenuListbyParent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMenuListbyParent  implements java.io.Serializable {
    private java.lang.String parent_Res_ID;

    public GetMenuListbyParent() {
    }

    public GetMenuListbyParent(
           java.lang.String parent_Res_ID) {
           this.parent_Res_ID = parent_Res_ID;
    }


    /**
     * Gets the parent_Res_ID value for this GetMenuListbyParent.
     * 
     * @return parent_Res_ID
     */
    public java.lang.String getParent_Res_ID() {
        return parent_Res_ID;
    }


    /**
     * Sets the parent_Res_ID value for this GetMenuListbyParent.
     * 
     * @param parent_Res_ID
     */
    public void setParent_Res_ID(java.lang.String parent_Res_ID) {
        this.parent_Res_ID = parent_Res_ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMenuListbyParent)) return false;
        GetMenuListbyParent other = (GetMenuListbyParent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.parent_Res_ID==null && other.getParent_Res_ID()==null) || 
             (this.parent_Res_ID!=null &&
              this.parent_Res_ID.equals(other.getParent_Res_ID())));
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
        if (getParent_Res_ID() != null) {
            _hashCode += getParent_Res_ID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMenuListbyParent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMenuListbyParent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_Res_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Parent_Res_ID"));
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
