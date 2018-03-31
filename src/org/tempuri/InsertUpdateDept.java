/**
 * InsertUpdateDept.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class InsertUpdateDept  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String deptcode;

    private java.lang.String lev;

    private java.lang.String pt1;

    private java.lang.String pt2;

    private java.lang.String pt3;

    private java.lang.String czpd;

    private java.lang.String mzlb;

    private java.lang.String pxh;

    public InsertUpdateDept() {
    }

    public InsertUpdateDept(
           java.lang.String name,
           java.lang.String deptcode,
           java.lang.String lev,
           java.lang.String pt1,
           java.lang.String pt2,
           java.lang.String pt3,
           java.lang.String czpd,
           java.lang.String mzlb,
           java.lang.String pxh) {
           this.name = name;
           this.deptcode = deptcode;
           this.lev = lev;
           this.pt1 = pt1;
           this.pt2 = pt2;
           this.pt3 = pt3;
           this.czpd = czpd;
           this.mzlb = mzlb;
           this.pxh = pxh;
    }


    /**
     * Gets the name value for this InsertUpdateDept.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this InsertUpdateDept.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the deptcode value for this InsertUpdateDept.
     * 
     * @return deptcode
     */
    public java.lang.String getDeptcode() {
        return deptcode;
    }


    /**
     * Sets the deptcode value for this InsertUpdateDept.
     * 
     * @param deptcode
     */
    public void setDeptcode(java.lang.String deptcode) {
        this.deptcode = deptcode;
    }


    /**
     * Gets the lev value for this InsertUpdateDept.
     * 
     * @return lev
     */
    public java.lang.String getLev() {
        return lev;
    }


    /**
     * Sets the lev value for this InsertUpdateDept.
     * 
     * @param lev
     */
    public void setLev(java.lang.String lev) {
        this.lev = lev;
    }


    /**
     * Gets the pt1 value for this InsertUpdateDept.
     * 
     * @return pt1
     */
    public java.lang.String getPt1() {
        return pt1;
    }


    /**
     * Sets the pt1 value for this InsertUpdateDept.
     * 
     * @param pt1
     */
    public void setPt1(java.lang.String pt1) {
        this.pt1 = pt1;
    }


    /**
     * Gets the pt2 value for this InsertUpdateDept.
     * 
     * @return pt2
     */
    public java.lang.String getPt2() {
        return pt2;
    }


    /**
     * Sets the pt2 value for this InsertUpdateDept.
     * 
     * @param pt2
     */
    public void setPt2(java.lang.String pt2) {
        this.pt2 = pt2;
    }


    /**
     * Gets the pt3 value for this InsertUpdateDept.
     * 
     * @return pt3
     */
    public java.lang.String getPt3() {
        return pt3;
    }


    /**
     * Sets the pt3 value for this InsertUpdateDept.
     * 
     * @param pt3
     */
    public void setPt3(java.lang.String pt3) {
        this.pt3 = pt3;
    }


    /**
     * Gets the czpd value for this InsertUpdateDept.
     * 
     * @return czpd
     */
    public java.lang.String getCzpd() {
        return czpd;
    }


    /**
     * Sets the czpd value for this InsertUpdateDept.
     * 
     * @param czpd
     */
    public void setCzpd(java.lang.String czpd) {
        this.czpd = czpd;
    }


    /**
     * Gets the mzlb value for this InsertUpdateDept.
     * 
     * @return mzlb
     */
    public java.lang.String getMzlb() {
        return mzlb;
    }


    /**
     * Sets the mzlb value for this InsertUpdateDept.
     * 
     * @param mzlb
     */
    public void setMzlb(java.lang.String mzlb) {
        this.mzlb = mzlb;
    }


    /**
     * Gets the pxh value for this InsertUpdateDept.
     * 
     * @return pxh
     */
    public java.lang.String getPxh() {
        return pxh;
    }


    /**
     * Sets the pxh value for this InsertUpdateDept.
     * 
     * @param pxh
     */
    public void setPxh(java.lang.String pxh) {
        this.pxh = pxh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertUpdateDept)) return false;
        InsertUpdateDept other = (InsertUpdateDept) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.deptcode==null && other.getDeptcode()==null) || 
             (this.deptcode!=null &&
              this.deptcode.equals(other.getDeptcode()))) &&
            ((this.lev==null && other.getLev()==null) || 
             (this.lev!=null &&
              this.lev.equals(other.getLev()))) &&
            ((this.pt1==null && other.getPt1()==null) || 
             (this.pt1!=null &&
              this.pt1.equals(other.getPt1()))) &&
            ((this.pt2==null && other.getPt2()==null) || 
             (this.pt2!=null &&
              this.pt2.equals(other.getPt2()))) &&
            ((this.pt3==null && other.getPt3()==null) || 
             (this.pt3!=null &&
              this.pt3.equals(other.getPt3()))) &&
            ((this.czpd==null && other.getCzpd()==null) || 
             (this.czpd!=null &&
              this.czpd.equals(other.getCzpd()))) &&
            ((this.mzlb==null && other.getMzlb()==null) || 
             (this.mzlb!=null &&
              this.mzlb.equals(other.getMzlb()))) &&
            ((this.pxh==null && other.getPxh()==null) || 
             (this.pxh!=null &&
              this.pxh.equals(other.getPxh())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDeptcode() != null) {
            _hashCode += getDeptcode().hashCode();
        }
        if (getLev() != null) {
            _hashCode += getLev().hashCode();
        }
        if (getPt1() != null) {
            _hashCode += getPt1().hashCode();
        }
        if (getPt2() != null) {
            _hashCode += getPt2().hashCode();
        }
        if (getPt3() != null) {
            _hashCode += getPt3().hashCode();
        }
        if (getCzpd() != null) {
            _hashCode += getCzpd().hashCode();
        }
        if (getMzlb() != null) {
            _hashCode += getMzlb().hashCode();
        }
        if (getPxh() != null) {
            _hashCode += getPxh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertUpdateDept.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">InsertUpdateDept"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptcode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "deptcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lev");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "lev"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pt1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pt1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pt2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pt2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pt3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pt3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("czpd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "czpd"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pxh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "pxh"));
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
