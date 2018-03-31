/**
 * GetSingleTableValuedb.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetSingleTableValuedb  implements java.io.Serializable {
    private java.lang.String tablename;

    private java.lang.String top;

    private java.lang.String columns;

    private java.lang.String where;

    private java.lang.String dbname;

    public GetSingleTableValuedb() {
    }

    public GetSingleTableValuedb(
           java.lang.String tablename,
           java.lang.String top,
           java.lang.String columns,
           java.lang.String where,
           java.lang.String dbname) {
           this.tablename = tablename;
           this.top = top;
           this.columns = columns;
           this.where = where;
           this.dbname = dbname;
    }


    /**
     * Gets the tablename value for this GetSingleTableValuedb.
     * 
     * @return tablename
     */
    public java.lang.String getTablename() {
        return tablename;
    }


    /**
     * Sets the tablename value for this GetSingleTableValuedb.
     * 
     * @param tablename
     */
    public void setTablename(java.lang.String tablename) {
        this.tablename = tablename;
    }


    /**
     * Gets the top value for this GetSingleTableValuedb.
     * 
     * @return top
     */
    public java.lang.String getTop() {
        return top;
    }


    /**
     * Sets the top value for this GetSingleTableValuedb.
     * 
     * @param top
     */
    public void setTop(java.lang.String top) {
        this.top = top;
    }


    /**
     * Gets the columns value for this GetSingleTableValuedb.
     * 
     * @return columns
     */
    public java.lang.String getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this GetSingleTableValuedb.
     * 
     * @param columns
     */
    public void setColumns(java.lang.String columns) {
        this.columns = columns;
    }


    /**
     * Gets the where value for this GetSingleTableValuedb.
     * 
     * @return where
     */
    public java.lang.String getWhere() {
        return where;
    }


    /**
     * Sets the where value for this GetSingleTableValuedb.
     * 
     * @param where
     */
    public void setWhere(java.lang.String where) {
        this.where = where;
    }


    /**
     * Gets the dbname value for this GetSingleTableValuedb.
     * 
     * @return dbname
     */
    public java.lang.String getDbname() {
        return dbname;
    }


    /**
     * Sets the dbname value for this GetSingleTableValuedb.
     * 
     * @param dbname
     */
    public void setDbname(java.lang.String dbname) {
        this.dbname = dbname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSingleTableValuedb)) return false;
        GetSingleTableValuedb other = (GetSingleTableValuedb) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tablename==null && other.getTablename()==null) || 
             (this.tablename!=null &&
              this.tablename.equals(other.getTablename()))) &&
            ((this.top==null && other.getTop()==null) || 
             (this.top!=null &&
              this.top.equals(other.getTop()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              this.columns.equals(other.getColumns()))) &&
            ((this.where==null && other.getWhere()==null) || 
             (this.where!=null &&
              this.where.equals(other.getWhere()))) &&
            ((this.dbname==null && other.getDbname()==null) || 
             (this.dbname!=null &&
              this.dbname.equals(other.getDbname())));
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
        if (getTablename() != null) {
            _hashCode += getTablename().hashCode();
        }
        if (getTop() != null) {
            _hashCode += getTop().hashCode();
        }
        if (getColumns() != null) {
            _hashCode += getColumns().hashCode();
        }
        if (getWhere() != null) {
            _hashCode += getWhere().hashCode();
        }
        if (getDbname() != null) {
            _hashCode += getDbname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSingleTableValuedb.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSingleTableValuedb"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tablename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "tablename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "top"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("where");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "where"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "dbname"));
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
