/**
 * GetGhMzxxJzTj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetGhMzxxJzTj  implements java.io.Serializable {
    private java.lang.String czgh;

    private java.lang.String jzrq;

    private java.lang.String mzlb;

    public GetGhMzxxJzTj() {
    }

    public GetGhMzxxJzTj(
           java.lang.String czgh,
           java.lang.String jzrq,
           java.lang.String mzlb) {
           this.czgh = czgh;
           this.jzrq = jzrq;
           this.mzlb = mzlb;
    }


    /**
     * Gets the czgh value for this GetGhMzxxJzTj.
     * 
     * @return czgh
     */
    public java.lang.String getCzgh() {
        return czgh;
    }


    /**
     * Sets the czgh value for this GetGhMzxxJzTj.
     * 
     * @param czgh
     */
    public void setCzgh(java.lang.String czgh) {
        this.czgh = czgh;
    }


    /**
     * Gets the jzrq value for this GetGhMzxxJzTj.
     * 
     * @return jzrq
     */
    public java.lang.String getJzrq() {
        return jzrq;
    }


    /**
     * Sets the jzrq value for this GetGhMzxxJzTj.
     * 
     * @param jzrq
     */
    public void setJzrq(java.lang.String jzrq) {
        this.jzrq = jzrq;
    }


    /**
     * Gets the mzlb value for this GetGhMzxxJzTj.
     * 
     * @return mzlb
     */
    public java.lang.String getMzlb() {
        return mzlb;
    }


    /**
     * Sets the mzlb value for this GetGhMzxxJzTj.
     * 
     * @param mzlb
     */
    public void setMzlb(java.lang.String mzlb) {
        this.mzlb = mzlb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetGhMzxxJzTj)) return false;
        GetGhMzxxJzTj other = (GetGhMzxxJzTj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.czgh==null && other.getCzgh()==null) || 
             (this.czgh!=null &&
              this.czgh.equals(other.getCzgh()))) &&
            ((this.jzrq==null && other.getJzrq()==null) || 
             (this.jzrq!=null &&
              this.jzrq.equals(other.getJzrq()))) &&
            ((this.mzlb==null && other.getMzlb()==null) || 
             (this.mzlb!=null &&
              this.mzlb.equals(other.getMzlb())));
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
        if (getCzgh() != null) {
            _hashCode += getCzgh().hashCode();
        }
        if (getJzrq() != null) {
            _hashCode += getJzrq().hashCode();
        }
        if (getMzlb() != null) {
            _hashCode += getMzlb().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetGhMzxxJzTj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetGhMzxxJzTj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czgh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czgh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jzrq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "jzrq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mzlb");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "mzlb"));
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
