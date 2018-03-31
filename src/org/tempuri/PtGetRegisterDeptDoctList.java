/**
 * PtGetRegisterDeptDoctList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class PtGetRegisterDeptDoctList  implements java.io.Serializable {
    private java.lang.String userID;

    private java.lang.String password;

    private java.lang.String registDate;

    private java.lang.String registType;

    private java.lang.String MZLB;

    public PtGetRegisterDeptDoctList() {
    }

    public PtGetRegisterDeptDoctList(
           java.lang.String userID,
           java.lang.String password,
           java.lang.String registDate,
           java.lang.String registType,
           java.lang.String MZLB) {
           this.userID = userID;
           this.password = password;
           this.registDate = registDate;
           this.registType = registType;
           this.MZLB = MZLB;
    }


    /**
     * Gets the userID value for this PtGetRegisterDeptDoctList.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this PtGetRegisterDeptDoctList.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the password value for this PtGetRegisterDeptDoctList.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this PtGetRegisterDeptDoctList.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the registDate value for this PtGetRegisterDeptDoctList.
     * 
     * @return registDate
     */
    public java.lang.String getRegistDate() {
        return registDate;
    }


    /**
     * Sets the registDate value for this PtGetRegisterDeptDoctList.
     * 
     * @param registDate
     */
    public void setRegistDate(java.lang.String registDate) {
        this.registDate = registDate;
    }


    /**
     * Gets the registType value for this PtGetRegisterDeptDoctList.
     * 
     * @return registType
     */
    public java.lang.String getRegistType() {
        return registType;
    }


    /**
     * Sets the registType value for this PtGetRegisterDeptDoctList.
     * 
     * @param registType
     */
    public void setRegistType(java.lang.String registType) {
        this.registType = registType;
    }


    /**
     * Gets the MZLB value for this PtGetRegisterDeptDoctList.
     * 
     * @return MZLB
     */
    public java.lang.String getMZLB() {
        return MZLB;
    }


    /**
     * Sets the MZLB value for this PtGetRegisterDeptDoctList.
     * 
     * @param MZLB
     */
    public void setMZLB(java.lang.String MZLB) {
        this.MZLB = MZLB;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PtGetRegisterDeptDoctList)) return false;
        PtGetRegisterDeptDoctList other = (PtGetRegisterDeptDoctList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.registDate==null && other.getRegistDate()==null) || 
             (this.registDate!=null &&
              this.registDate.equals(other.getRegistDate()))) &&
            ((this.registType==null && other.getRegistType()==null) || 
             (this.registType!=null &&
              this.registType.equals(other.getRegistType()))) &&
            ((this.MZLB==null && other.getMZLB()==null) || 
             (this.MZLB!=null &&
              this.MZLB.equals(other.getMZLB())));
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
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getRegistDate() != null) {
            _hashCode += getRegistDate().hashCode();
        }
        if (getRegistType() != null) {
            _hashCode += getRegistType().hashCode();
        }
        if (getMZLB() != null) {
            _hashCode += getMZLB().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PtGetRegisterDeptDoctList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">PtGetRegisterDeptDoctList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegistDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RegistType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MZLB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MZLB"));
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
