/**
 * MobileReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package push.sms;

public class MobileReport  implements java.io.Serializable {
    private long missionId;

    private java.lang.String mobile;

    private java.lang.String report;

    public MobileReport() {
    }

    public MobileReport(
           long missionId,
           java.lang.String mobile,
           java.lang.String report) {
           this.missionId = missionId;
           this.mobile = mobile;
           this.report = report;
    }


    /**
     * Gets the missionId value for this MobileReport.
     * 
     * @return missionId
     */
    public long getMissionId() {
        return missionId;
    }


    /**
     * Sets the missionId value for this MobileReport.
     * 
     * @param missionId
     */
    public void setMissionId(long missionId) {
        this.missionId = missionId;
    }


    /**
     * Gets the mobile value for this MobileReport.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this MobileReport.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the report value for this MobileReport.
     * 
     * @return report
     */
    public java.lang.String getReport() {
        return report;
    }


    /**
     * Sets the report value for this MobileReport.
     * 
     * @param report
     */
    public void setReport(java.lang.String report) {
        this.report = report;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MobileReport)) return false;
        MobileReport other = (MobileReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.missionId == other.getMissionId() &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.report==null && other.getReport()==null) || 
             (this.report!=null &&
              this.report.equals(other.getReport())));
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
        _hashCode += new Long(getMissionId()).hashCode();
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getReport() != null) {
            _hashCode += getReport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MobileReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "MobileReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MissionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("report");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Report"));
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
