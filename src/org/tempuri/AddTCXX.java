/**
 * AddTCXX.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddTCXX  implements java.io.Serializable {
    private java.lang.String TCMC;

    private java.lang.String PYDM;

    private java.lang.String MZSY;

    private java.lang.String BQSY;

    private java.lang.String TCLX;

    public AddTCXX() {
    }

    public AddTCXX(
           java.lang.String TCMC,
           java.lang.String PYDM,
           java.lang.String MZSY,
           java.lang.String BQSY,
           java.lang.String TCLX) {
           this.TCMC = TCMC;
           this.PYDM = PYDM;
           this.MZSY = MZSY;
           this.BQSY = BQSY;
           this.TCLX = TCLX;
    }


    /**
     * Gets the TCMC value for this AddTCXX.
     * 
     * @return TCMC
     */
    public java.lang.String getTCMC() {
        return TCMC;
    }


    /**
     * Sets the TCMC value for this AddTCXX.
     * 
     * @param TCMC
     */
    public void setTCMC(java.lang.String TCMC) {
        this.TCMC = TCMC;
    }


    /**
     * Gets the PYDM value for this AddTCXX.
     * 
     * @return PYDM
     */
    public java.lang.String getPYDM() {
        return PYDM;
    }


    /**
     * Sets the PYDM value for this AddTCXX.
     * 
     * @param PYDM
     */
    public void setPYDM(java.lang.String PYDM) {
        this.PYDM = PYDM;
    }


    /**
     * Gets the MZSY value for this AddTCXX.
     * 
     * @return MZSY
     */
    public java.lang.String getMZSY() {
        return MZSY;
    }


    /**
     * Sets the MZSY value for this AddTCXX.
     * 
     * @param MZSY
     */
    public void setMZSY(java.lang.String MZSY) {
        this.MZSY = MZSY;
    }


    /**
     * Gets the BQSY value for this AddTCXX.
     * 
     * @return BQSY
     */
    public java.lang.String getBQSY() {
        return BQSY;
    }


    /**
     * Sets the BQSY value for this AddTCXX.
     * 
     * @param BQSY
     */
    public void setBQSY(java.lang.String BQSY) {
        this.BQSY = BQSY;
    }


    /**
     * Gets the TCLX value for this AddTCXX.
     * 
     * @return TCLX
     */
    public java.lang.String getTCLX() {
        return TCLX;
    }


    /**
     * Sets the TCLX value for this AddTCXX.
     * 
     * @param TCLX
     */
    public void setTCLX(java.lang.String TCLX) {
        this.TCLX = TCLX;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddTCXX)) return false;
        AddTCXX other = (AddTCXX) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TCMC==null && other.getTCMC()==null) || 
             (this.TCMC!=null &&
              this.TCMC.equals(other.getTCMC()))) &&
            ((this.PYDM==null && other.getPYDM()==null) || 
             (this.PYDM!=null &&
              this.PYDM.equals(other.getPYDM()))) &&
            ((this.MZSY==null && other.getMZSY()==null) || 
             (this.MZSY!=null &&
              this.MZSY.equals(other.getMZSY()))) &&
            ((this.BQSY==null && other.getBQSY()==null) || 
             (this.BQSY!=null &&
              this.BQSY.equals(other.getBQSY()))) &&
            ((this.TCLX==null && other.getTCLX()==null) || 
             (this.TCLX!=null &&
              this.TCLX.equals(other.getTCLX())));
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
        if (getTCMC() != null) {
            _hashCode += getTCMC().hashCode();
        }
        if (getPYDM() != null) {
            _hashCode += getPYDM().hashCode();
        }
        if (getMZSY() != null) {
            _hashCode += getMZSY().hashCode();
        }
        if (getBQSY() != null) {
            _hashCode += getBQSY().hashCode();
        }
        if (getTCLX() != null) {
            _hashCode += getTCLX().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddTCXX.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddTCXX"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCMC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TCMC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PYDM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PYDM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MZSY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MZSY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BQSY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "BQSY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCLX");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TCLX"));
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
