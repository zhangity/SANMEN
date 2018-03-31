/**
 * AddJZJLResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class AddJZJLResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm addJZJLResult;

    public AddJZJLResponse() {
    }

    public AddJZJLResponse(
           org.tempuri.ReturnExComm addJZJLResult) {
           this.addJZJLResult = addJZJLResult;
    }


    /**
     * Gets the addJZJLResult value for this AddJZJLResponse.
     * 
     * @return addJZJLResult
     */
    public org.tempuri.ReturnExComm getAddJZJLResult() {
        return addJZJLResult;
    }


    /**
     * Sets the addJZJLResult value for this AddJZJLResponse.
     * 
     * @param addJZJLResult
     */
    public void setAddJZJLResult(org.tempuri.ReturnExComm addJZJLResult) {
        this.addJZJLResult = addJZJLResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddJZJLResponse)) return false;
        AddJZJLResponse other = (AddJZJLResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addJZJLResult==null && other.getAddJZJLResult()==null) || 
             (this.addJZJLResult!=null &&
              this.addJZJLResult.equals(other.getAddJZJLResult())));
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
        if (getAddJZJLResult() != null) {
            _hashCode += getAddJZJLResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddJZJLResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddJZJLResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addJZJLResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddJZJLResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReturnExComm"));
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
