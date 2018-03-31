/**
 * GetAnnouncementsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAnnouncementsResponse  implements java.io.Serializable {
    private org.tempuri.GetAnnouncementsResponseGetAnnouncementsResult getAnnouncementsResult;

    public GetAnnouncementsResponse() {
    }

    public GetAnnouncementsResponse(
           org.tempuri.GetAnnouncementsResponseGetAnnouncementsResult getAnnouncementsResult) {
           this.getAnnouncementsResult = getAnnouncementsResult;
    }


    /**
     * Gets the getAnnouncementsResult value for this GetAnnouncementsResponse.
     * 
     * @return getAnnouncementsResult
     */
    public org.tempuri.GetAnnouncementsResponseGetAnnouncementsResult getGetAnnouncementsResult() {
        return getAnnouncementsResult;
    }


    /**
     * Sets the getAnnouncementsResult value for this GetAnnouncementsResponse.
     * 
     * @param getAnnouncementsResult
     */
    public void setGetAnnouncementsResult(org.tempuri.GetAnnouncementsResponseGetAnnouncementsResult getAnnouncementsResult) {
        this.getAnnouncementsResult = getAnnouncementsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAnnouncementsResponse)) return false;
        GetAnnouncementsResponse other = (GetAnnouncementsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAnnouncementsResult==null && other.getGetAnnouncementsResult()==null) || 
             (this.getAnnouncementsResult!=null &&
              this.getAnnouncementsResult.equals(other.getGetAnnouncementsResult())));
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
        if (getGetAnnouncementsResult() != null) {
            _hashCode += getGetAnnouncementsResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAnnouncementsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAnnouncementsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAnnouncementsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAnnouncementsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAnnouncementsResponse>GetAnnouncementsResult"));
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
