/**
 * MissionResultInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package push.sms;

public class MissionResultInfo  implements java.io.Serializable {
    private long missionId;

    private push.sms.MissionStatus status;

    private java.lang.String note;

    public MissionResultInfo() {
    }

    public MissionResultInfo(
           long missionId,
           push.sms.MissionStatus status,
           java.lang.String note) {
           this.missionId = missionId;
           this.status = status;
           this.note = note;
    }


    /**
     * Gets the missionId value for this MissionResultInfo.
     * 
     * @return missionId
     */
    public long getMissionId() {
        return missionId;
    }


    /**
     * Sets the missionId value for this MissionResultInfo.
     * 
     * @param missionId
     */
    public void setMissionId(long missionId) {
        this.missionId = missionId;
    }


    /**
     * Gets the status value for this MissionResultInfo.
     * 
     * @return status
     */
    public push.sms.MissionStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MissionResultInfo.
     * 
     * @param status
     */
    public void setStatus(push.sms.MissionStatus status) {
        this.status = status;
    }


    /**
     * Gets the note value for this MissionResultInfo.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this MissionResultInfo.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MissionResultInfo)) return false;
        MissionResultInfo other = (MissionResultInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.missionId == other.getMissionId() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MissionResultInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "MissionResultInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("missionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MissionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "MissionStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Note"));
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
