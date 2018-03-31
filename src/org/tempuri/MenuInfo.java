/**
 * MenuInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class MenuInfo  implements java.io.Serializable {
    private int res_ID;

    private java.lang.String res_Name;

    private java.lang.String res_Desc;

    private int parent_Res_ID;

    private java.lang.String parent_Res_Name;

    private int res_Level;

    private java.lang.String res_Url;

    private int SEQ_NO;

    private java.util.Calendar createTime;

    private java.util.Calendar updateTime;

    private java.util.Calendar deleteTime;

    private int isSee;

    private java.lang.String res_Icon;

    private java.lang.String parameter;

    public MenuInfo() {
    }

    public MenuInfo(
           int res_ID,
           java.lang.String res_Name,
           java.lang.String res_Desc,
           int parent_Res_ID,
           java.lang.String parent_Res_Name,
           int res_Level,
           java.lang.String res_Url,
           int SEQ_NO,
           java.util.Calendar createTime,
           java.util.Calendar updateTime,
           java.util.Calendar deleteTime,
           int isSee,
           java.lang.String res_Icon,
           java.lang.String parameter) {
           this.res_ID = res_ID;
           this.res_Name = res_Name;
           this.res_Desc = res_Desc;
           this.parent_Res_ID = parent_Res_ID;
           this.parent_Res_Name = parent_Res_Name;
           this.res_Level = res_Level;
           this.res_Url = res_Url;
           this.SEQ_NO = SEQ_NO;
           this.createTime = createTime;
           this.updateTime = updateTime;
           this.deleteTime = deleteTime;
           this.isSee = isSee;
           this.res_Icon = res_Icon;
           this.parameter = parameter;
    }


    /**
     * Gets the res_ID value for this MenuInfo.
     * 
     * @return res_ID
     */
    public int getRes_ID() {
        return res_ID;
    }


    /**
     * Sets the res_ID value for this MenuInfo.
     * 
     * @param res_ID
     */
    public void setRes_ID(int res_ID) {
        this.res_ID = res_ID;
    }


    /**
     * Gets the res_Name value for this MenuInfo.
     * 
     * @return res_Name
     */
    public java.lang.String getRes_Name() {
        return res_Name;
    }


    /**
     * Sets the res_Name value for this MenuInfo.
     * 
     * @param res_Name
     */
    public void setRes_Name(java.lang.String res_Name) {
        this.res_Name = res_Name;
    }


    /**
     * Gets the res_Desc value for this MenuInfo.
     * 
     * @return res_Desc
     */
    public java.lang.String getRes_Desc() {
        return res_Desc;
    }


    /**
     * Sets the res_Desc value for this MenuInfo.
     * 
     * @param res_Desc
     */
    public void setRes_Desc(java.lang.String res_Desc) {
        this.res_Desc = res_Desc;
    }


    /**
     * Gets the parent_Res_ID value for this MenuInfo.
     * 
     * @return parent_Res_ID
     */
    public int getParent_Res_ID() {
        return parent_Res_ID;
    }


    /**
     * Sets the parent_Res_ID value for this MenuInfo.
     * 
     * @param parent_Res_ID
     */
    public void setParent_Res_ID(int parent_Res_ID) {
        this.parent_Res_ID = parent_Res_ID;
    }


    /**
     * Gets the parent_Res_Name value for this MenuInfo.
     * 
     * @return parent_Res_Name
     */
    public java.lang.String getParent_Res_Name() {
        return parent_Res_Name;
    }


    /**
     * Sets the parent_Res_Name value for this MenuInfo.
     * 
     * @param parent_Res_Name
     */
    public void setParent_Res_Name(java.lang.String parent_Res_Name) {
        this.parent_Res_Name = parent_Res_Name;
    }


    /**
     * Gets the res_Level value for this MenuInfo.
     * 
     * @return res_Level
     */
    public int getRes_Level() {
        return res_Level;
    }


    /**
     * Sets the res_Level value for this MenuInfo.
     * 
     * @param res_Level
     */
    public void setRes_Level(int res_Level) {
        this.res_Level = res_Level;
    }


    /**
     * Gets the res_Url value for this MenuInfo.
     * 
     * @return res_Url
     */
    public java.lang.String getRes_Url() {
        return res_Url;
    }


    /**
     * Sets the res_Url value for this MenuInfo.
     * 
     * @param res_Url
     */
    public void setRes_Url(java.lang.String res_Url) {
        this.res_Url = res_Url;
    }


    /**
     * Gets the SEQ_NO value for this MenuInfo.
     * 
     * @return SEQ_NO
     */
    public int getSEQ_NO() {
        return SEQ_NO;
    }


    /**
     * Sets the SEQ_NO value for this MenuInfo.
     * 
     * @param SEQ_NO
     */
    public void setSEQ_NO(int SEQ_NO) {
        this.SEQ_NO = SEQ_NO;
    }


    /**
     * Gets the createTime value for this MenuInfo.
     * 
     * @return createTime
     */
    public java.util.Calendar getCreateTime() {
        return createTime;
    }


    /**
     * Sets the createTime value for this MenuInfo.
     * 
     * @param createTime
     */
    public void setCreateTime(java.util.Calendar createTime) {
        this.createTime = createTime;
    }


    /**
     * Gets the updateTime value for this MenuInfo.
     * 
     * @return updateTime
     */
    public java.util.Calendar getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this MenuInfo.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.util.Calendar updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the deleteTime value for this MenuInfo.
     * 
     * @return deleteTime
     */
    public java.util.Calendar getDeleteTime() {
        return deleteTime;
    }


    /**
     * Sets the deleteTime value for this MenuInfo.
     * 
     * @param deleteTime
     */
    public void setDeleteTime(java.util.Calendar deleteTime) {
        this.deleteTime = deleteTime;
    }


    /**
     * Gets the isSee value for this MenuInfo.
     * 
     * @return isSee
     */
    public int getIsSee() {
        return isSee;
    }


    /**
     * Sets the isSee value for this MenuInfo.
     * 
     * @param isSee
     */
    public void setIsSee(int isSee) {
        this.isSee = isSee;
    }


    /**
     * Gets the res_Icon value for this MenuInfo.
     * 
     * @return res_Icon
     */
    public java.lang.String getRes_Icon() {
        return res_Icon;
    }


    /**
     * Sets the res_Icon value for this MenuInfo.
     * 
     * @param res_Icon
     */
    public void setRes_Icon(java.lang.String res_Icon) {
        this.res_Icon = res_Icon;
    }


    /**
     * Gets the parameter value for this MenuInfo.
     * 
     * @return parameter
     */
    public java.lang.String getParameter() {
        return parameter;
    }


    /**
     * Sets the parameter value for this MenuInfo.
     * 
     * @param parameter
     */
    public void setParameter(java.lang.String parameter) {
        this.parameter = parameter;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MenuInfo)) return false;
        MenuInfo other = (MenuInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.res_ID == other.getRes_ID() &&
            ((this.res_Name==null && other.getRes_Name()==null) || 
             (this.res_Name!=null &&
              this.res_Name.equals(other.getRes_Name()))) &&
            ((this.res_Desc==null && other.getRes_Desc()==null) || 
             (this.res_Desc!=null &&
              this.res_Desc.equals(other.getRes_Desc()))) &&
            this.parent_Res_ID == other.getParent_Res_ID() &&
            ((this.parent_Res_Name==null && other.getParent_Res_Name()==null) || 
             (this.parent_Res_Name!=null &&
              this.parent_Res_Name.equals(other.getParent_Res_Name()))) &&
            this.res_Level == other.getRes_Level() &&
            ((this.res_Url==null && other.getRes_Url()==null) || 
             (this.res_Url!=null &&
              this.res_Url.equals(other.getRes_Url()))) &&
            this.SEQ_NO == other.getSEQ_NO() &&
            ((this.createTime==null && other.getCreateTime()==null) || 
             (this.createTime!=null &&
              this.createTime.equals(other.getCreateTime()))) &&
            ((this.updateTime==null && other.getUpdateTime()==null) || 
             (this.updateTime!=null &&
              this.updateTime.equals(other.getUpdateTime()))) &&
            ((this.deleteTime==null && other.getDeleteTime()==null) || 
             (this.deleteTime!=null &&
              this.deleteTime.equals(other.getDeleteTime()))) &&
            this.isSee == other.getIsSee() &&
            ((this.res_Icon==null && other.getRes_Icon()==null) || 
             (this.res_Icon!=null &&
              this.res_Icon.equals(other.getRes_Icon()))) &&
            ((this.parameter==null && other.getParameter()==null) || 
             (this.parameter!=null &&
              this.parameter.equals(other.getParameter())));
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
        _hashCode += getRes_ID();
        if (getRes_Name() != null) {
            _hashCode += getRes_Name().hashCode();
        }
        if (getRes_Desc() != null) {
            _hashCode += getRes_Desc().hashCode();
        }
        _hashCode += getParent_Res_ID();
        if (getParent_Res_Name() != null) {
            _hashCode += getParent_Res_Name().hashCode();
        }
        _hashCode += getRes_Level();
        if (getRes_Url() != null) {
            _hashCode += getRes_Url().hashCode();
        }
        _hashCode += getSEQ_NO();
        if (getCreateTime() != null) {
            _hashCode += getCreateTime().hashCode();
        }
        if (getUpdateTime() != null) {
            _hashCode += getUpdateTime().hashCode();
        }
        if (getDeleteTime() != null) {
            _hashCode += getDeleteTime().hashCode();
        }
        _hashCode += getIsSee();
        if (getRes_Icon() != null) {
            _hashCode += getRes_Icon().hashCode();
        }
        if (getParameter() != null) {
            _hashCode += getParameter().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MenuInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "MenuInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("res_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Res_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("res_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Res_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("res_Desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Res_Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_Res_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Parent_Res_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent_Res_Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Parent_Res_Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("res_Level");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Res_Level"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("res_Url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Res_Url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEQ_NO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SEQ_NO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CreateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IsSee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("res_Icon");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Res_Icon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Parameter"));
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
