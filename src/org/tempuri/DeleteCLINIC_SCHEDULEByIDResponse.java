/**
 * DeleteCLINIC_SCHEDULEByIDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteCLINIC_SCHEDULEByIDResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm deleteCLINIC_SCHEDULEByIDResult;

    public DeleteCLINIC_SCHEDULEByIDResponse() {
    }

    public DeleteCLINIC_SCHEDULEByIDResponse(
           org.tempuri.ReturnExComm deleteCLINIC_SCHEDULEByIDResult) {
           this.deleteCLINIC_SCHEDULEByIDResult = deleteCLINIC_SCHEDULEByIDResult;
    }


    /**
     * Gets the deleteCLINIC_SCHEDULEByIDResult value for this DeleteCLINIC_SCHEDULEByIDResponse.
     * 
     * @return deleteCLINIC_SCHEDULEByIDResult
     */
    public org.tempuri.ReturnExComm getDeleteCLINIC_SCHEDULEByIDResult() {
        return deleteCLINIC_SCHEDULEByIDResult;
    }


    /**
     * Sets the deleteCLINIC_SCHEDULEByIDResult value for this DeleteCLINIC_SCHEDULEByIDResponse.
     * 
     * @param deleteCLINIC_SCHEDULEByIDResult
     */
    public void setDeleteCLINIC_SCHEDULEByIDResult(org.tempuri.ReturnExComm deleteCLINIC_SCHEDULEByIDResult) {
        this.deleteCLINIC_SCHEDULEByIDResult = deleteCLINIC_SCHEDULEByIDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteCLINIC_SCHEDULEByIDResponse)) return false;
        DeleteCLINIC_SCHEDULEByIDResponse other = (DeleteCLINIC_SCHEDULEByIDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deleteCLINIC_SCHEDULEByIDResult==null && other.getDeleteCLINIC_SCHEDULEByIDResult()==null) || 
             (this.deleteCLINIC_SCHEDULEByIDResult!=null &&
              this.deleteCLINIC_SCHEDULEByIDResult.equals(other.getDeleteCLINIC_SCHEDULEByIDResult())));
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
        if (getDeleteCLINIC_SCHEDULEByIDResult() != null) {
            _hashCode += getDeleteCLINIC_SCHEDULEByIDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteCLINIC_SCHEDULEByIDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteCLINIC_SCHEDULEByIDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteCLINIC_SCHEDULEByIDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteCLINIC_SCHEDULEByIDResult"));
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
