/**
 * GetBrAllYpyzAndZlyz.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetBrAllYpyzAndZlyz  implements java.io.Serializable {
    private java.lang.String brylxh;

    private java.lang.String zybz;

    private java.lang.String yzlx;

    public GetBrAllYpyzAndZlyz() {
    }

    public GetBrAllYpyzAndZlyz(
           java.lang.String brylxh,
           java.lang.String zybz,
           java.lang.String yzlx) {
           this.brylxh = brylxh;
           this.zybz = zybz;
           this.yzlx = yzlx;
    }


    /**
     * Gets the brylxh value for this GetBrAllYpyzAndZlyz.
     * 
     * @return brylxh
     */
    public java.lang.String getBrylxh() {
        return brylxh;
    }


    /**
     * Sets the brylxh value for this GetBrAllYpyzAndZlyz.
     * 
     * @param brylxh
     */
    public void setBrylxh(java.lang.String brylxh) {
        this.brylxh = brylxh;
    }


    /**
     * Gets the zybz value for this GetBrAllYpyzAndZlyz.
     * 
     * @return zybz
     */
    public java.lang.String getZybz() {
        return zybz;
    }


    /**
     * Sets the zybz value for this GetBrAllYpyzAndZlyz.
     * 
     * @param zybz
     */
    public void setZybz(java.lang.String zybz) {
        this.zybz = zybz;
    }


    /**
     * Gets the yzlx value for this GetBrAllYpyzAndZlyz.
     * 
     * @return yzlx
     */
    public java.lang.String getYzlx() {
        return yzlx;
    }


    /**
     * Sets the yzlx value for this GetBrAllYpyzAndZlyz.
     * 
     * @param yzlx
     */
    public void setYzlx(java.lang.String yzlx) {
        this.yzlx = yzlx;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBrAllYpyzAndZlyz)) return false;
        GetBrAllYpyzAndZlyz other = (GetBrAllYpyzAndZlyz) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.brylxh==null && other.getBrylxh()==null) || 
             (this.brylxh!=null &&
              this.brylxh.equals(other.getBrylxh()))) &&
            ((this.zybz==null && other.getZybz()==null) || 
             (this.zybz!=null &&
              this.zybz.equals(other.getZybz()))) &&
            ((this.yzlx==null && other.getYzlx()==null) || 
             (this.yzlx!=null &&
              this.yzlx.equals(other.getYzlx())));
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
        if (getBrylxh() != null) {
            _hashCode += getBrylxh().hashCode();
        }
        if (getZybz() != null) {
            _hashCode += getZybz().hashCode();
        }
        if (getYzlx() != null) {
            _hashCode += getYzlx().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBrAllYpyzAndZlyz.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetBrAllYpyzAndZlyz"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brylxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "brylxh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zybz");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "zybz"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yzlx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "yzlx"));
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
