/**
 * DICT_DEPT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DICT_DEPT  implements java.io.Serializable {
    private java.lang.String DEPT_CODE;

    private java.lang.String DEPT_NAME;

    private java.lang.String DEPT_PYM;

    private java.lang.String MZSY;

    private java.lang.String YJSY;

    private java.lang.String ZYSY;

    private java.lang.String BQSY;

    private java.lang.String GLBF;

    private java.lang.String GLBQ;

    public DICT_DEPT() {
    }

    public DICT_DEPT(
           java.lang.String DEPT_CODE,
           java.lang.String DEPT_NAME,
           java.lang.String DEPT_PYM,
           java.lang.String MZSY,
           java.lang.String YJSY,
           java.lang.String ZYSY,
           java.lang.String BQSY,
           java.lang.String GLBF,
           java.lang.String GLBQ) {
           this.DEPT_CODE = DEPT_CODE;
           this.DEPT_NAME = DEPT_NAME;
           this.DEPT_PYM = DEPT_PYM;
           this.MZSY = MZSY;
           this.YJSY = YJSY;
           this.ZYSY = ZYSY;
           this.BQSY = BQSY;
           this.GLBF = GLBF;
           this.GLBQ = GLBQ;
    }


    /**
     * Gets the DEPT_CODE value for this DICT_DEPT.
     * 
     * @return DEPT_CODE
     */
    public java.lang.String getDEPT_CODE() {
        return DEPT_CODE;
    }


    /**
     * Sets the DEPT_CODE value for this DICT_DEPT.
     * 
     * @param DEPT_CODE
     */
    public void setDEPT_CODE(java.lang.String DEPT_CODE) {
        this.DEPT_CODE = DEPT_CODE;
    }


    /**
     * Gets the DEPT_NAME value for this DICT_DEPT.
     * 
     * @return DEPT_NAME
     */
    public java.lang.String getDEPT_NAME() {
        return DEPT_NAME;
    }


    /**
     * Sets the DEPT_NAME value for this DICT_DEPT.
     * 
     * @param DEPT_NAME
     */
    public void setDEPT_NAME(java.lang.String DEPT_NAME) {
        this.DEPT_NAME = DEPT_NAME;
    }


    /**
     * Gets the DEPT_PYM value for this DICT_DEPT.
     * 
     * @return DEPT_PYM
     */
    public java.lang.String getDEPT_PYM() {
        return DEPT_PYM;
    }


    /**
     * Sets the DEPT_PYM value for this DICT_DEPT.
     * 
     * @param DEPT_PYM
     */
    public void setDEPT_PYM(java.lang.String DEPT_PYM) {
        this.DEPT_PYM = DEPT_PYM;
    }


    /**
     * Gets the MZSY value for this DICT_DEPT.
     * 
     * @return MZSY
     */
    public java.lang.String getMZSY() {
        return MZSY;
    }


    /**
     * Sets the MZSY value for this DICT_DEPT.
     * 
     * @param MZSY
     */
    public void setMZSY(java.lang.String MZSY) {
        this.MZSY = MZSY;
    }


    /**
     * Gets the YJSY value for this DICT_DEPT.
     * 
     * @return YJSY
     */
    public java.lang.String getYJSY() {
        return YJSY;
    }


    /**
     * Sets the YJSY value for this DICT_DEPT.
     * 
     * @param YJSY
     */
    public void setYJSY(java.lang.String YJSY) {
        this.YJSY = YJSY;
    }


    /**
     * Gets the ZYSY value for this DICT_DEPT.
     * 
     * @return ZYSY
     */
    public java.lang.String getZYSY() {
        return ZYSY;
    }


    /**
     * Sets the ZYSY value for this DICT_DEPT.
     * 
     * @param ZYSY
     */
    public void setZYSY(java.lang.String ZYSY) {
        this.ZYSY = ZYSY;
    }


    /**
     * Gets the BQSY value for this DICT_DEPT.
     * 
     * @return BQSY
     */
    public java.lang.String getBQSY() {
        return BQSY;
    }


    /**
     * Sets the BQSY value for this DICT_DEPT.
     * 
     * @param BQSY
     */
    public void setBQSY(java.lang.String BQSY) {
        this.BQSY = BQSY;
    }


    /**
     * Gets the GLBF value for this DICT_DEPT.
     * 
     * @return GLBF
     */
    public java.lang.String getGLBF() {
        return GLBF;
    }


    /**
     * Sets the GLBF value for this DICT_DEPT.
     * 
     * @param GLBF
     */
    public void setGLBF(java.lang.String GLBF) {
        this.GLBF = GLBF;
    }


    /**
     * Gets the GLBQ value for this DICT_DEPT.
     * 
     * @return GLBQ
     */
    public java.lang.String getGLBQ() {
        return GLBQ;
    }


    /**
     * Sets the GLBQ value for this DICT_DEPT.
     * 
     * @param GLBQ
     */
    public void setGLBQ(java.lang.String GLBQ) {
        this.GLBQ = GLBQ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DICT_DEPT)) return false;
        DICT_DEPT other = (DICT_DEPT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DEPT_CODE==null && other.getDEPT_CODE()==null) || 
             (this.DEPT_CODE!=null &&
              this.DEPT_CODE.equals(other.getDEPT_CODE()))) &&
            ((this.DEPT_NAME==null && other.getDEPT_NAME()==null) || 
             (this.DEPT_NAME!=null &&
              this.DEPT_NAME.equals(other.getDEPT_NAME()))) &&
            ((this.DEPT_PYM==null && other.getDEPT_PYM()==null) || 
             (this.DEPT_PYM!=null &&
              this.DEPT_PYM.equals(other.getDEPT_PYM()))) &&
            ((this.MZSY==null && other.getMZSY()==null) || 
             (this.MZSY!=null &&
              this.MZSY.equals(other.getMZSY()))) &&
            ((this.YJSY==null && other.getYJSY()==null) || 
             (this.YJSY!=null &&
              this.YJSY.equals(other.getYJSY()))) &&
            ((this.ZYSY==null && other.getZYSY()==null) || 
             (this.ZYSY!=null &&
              this.ZYSY.equals(other.getZYSY()))) &&
            ((this.BQSY==null && other.getBQSY()==null) || 
             (this.BQSY!=null &&
              this.BQSY.equals(other.getBQSY()))) &&
            ((this.GLBF==null && other.getGLBF()==null) || 
             (this.GLBF!=null &&
              this.GLBF.equals(other.getGLBF()))) &&
            ((this.GLBQ==null && other.getGLBQ()==null) || 
             (this.GLBQ!=null &&
              this.GLBQ.equals(other.getGLBQ())));
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
        if (getDEPT_CODE() != null) {
            _hashCode += getDEPT_CODE().hashCode();
        }
        if (getDEPT_NAME() != null) {
            _hashCode += getDEPT_NAME().hashCode();
        }
        if (getDEPT_PYM() != null) {
            _hashCode += getDEPT_PYM().hashCode();
        }
        if (getMZSY() != null) {
            _hashCode += getMZSY().hashCode();
        }
        if (getYJSY() != null) {
            _hashCode += getYJSY().hashCode();
        }
        if (getZYSY() != null) {
            _hashCode += getZYSY().hashCode();
        }
        if (getBQSY() != null) {
            _hashCode += getBQSY().hashCode();
        }
        if (getGLBF() != null) {
            _hashCode += getGLBF().hashCode();
        }
        if (getGLBQ() != null) {
            _hashCode += getGLBQ().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DICT_DEPT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DICT_DEPT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPT_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEPT_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPT_NAME");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEPT_NAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPT_PYM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEPT_PYM"));
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
        elemField.setFieldName("YJSY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "YJSY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZYSY");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ZYSY"));
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
        elemField.setFieldName("GLBF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GLBF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLBQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GLBQ"));
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
