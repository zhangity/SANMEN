/**
 * UpdateTRIAGE_RECORDSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class UpdateTRIAGE_RECORDSResponse  implements java.io.Serializable {
    private org.tempuri.ReturnExComm updateTRIAGE_RECORDSResult;

    public UpdateTRIAGE_RECORDSResponse() {
    }

    public UpdateTRIAGE_RECORDSResponse(
           org.tempuri.ReturnExComm updateTRIAGE_RECORDSResult) {
           this.updateTRIAGE_RECORDSResult = updateTRIAGE_RECORDSResult;
    }


    /**
     * Gets the updateTRIAGE_RECORDSResult value for this UpdateTRIAGE_RECORDSResponse.
     * 
     * @return updateTRIAGE_RECORDSResult
     */
    public org.tempuri.ReturnExComm getUpdateTRIAGE_RECORDSResult() {
        return updateTRIAGE_RECORDSResult;
    }


    /**
     * Sets the updateTRIAGE_RECORDSResult value for this UpdateTRIAGE_RECORDSResponse.
     * 
     * @param updateTRIAGE_RECORDSResult
     */
    public void setUpdateTRIAGE_RECORDSResult(org.tempuri.ReturnExComm updateTRIAGE_RECORDSResult) {
        this.updateTRIAGE_RECORDSResult = updateTRIAGE_RECORDSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateTRIAGE_RECORDSResponse)) return false;
        UpdateTRIAGE_RECORDSResponse other = (UpdateTRIAGE_RECORDSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateTRIAGE_RECORDSResult==null && other.getUpdateTRIAGE_RECORDSResult()==null) || 
             (this.updateTRIAGE_RECORDSResult!=null &&
              this.updateTRIAGE_RECORDSResult.equals(other.getUpdateTRIAGE_RECORDSResult())));
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
        if (getUpdateTRIAGE_RECORDSResult() != null) {
            _hashCode += getUpdateTRIAGE_RECORDSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateTRIAGE_RECORDSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateTRIAGE_RECORDSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTRIAGE_RECORDSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateTRIAGE_RECORDSResult"));
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
