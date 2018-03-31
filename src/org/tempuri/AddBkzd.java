/**
 * AddBkzd.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddBkzd  implements java.io.Serializable {
    private org.tempuri.AddBkzdDs ds;

    public AddBkzd() {
    }

    public AddBkzd(
           org.tempuri.AddBkzdDs ds) {
           this.ds = ds;
    }


    /**
     * Gets the ds value for this AddBkzd.
     * 
     * @return ds
     */
    public org.tempuri.AddBkzdDs getDs() {
        return ds;
    }


    /**
     * Sets the ds value for this AddBkzd.
     * 
     * @param ds
     */
    public void setDs(org.tempuri.AddBkzdDs ds) {
        this.ds = ds;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddBkzd)) return false;
        AddBkzd other = (AddBkzd) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ds==null && other.getDs()==null) || 
             (this.ds!=null &&
              this.ds.equals(other.getDs())));
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
        if (getDs() != null) {
            _hashCode += getDs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddBkzd.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddBkzd"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ds");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>AddBkzd>ds"));
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
