/**
 * MissionStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package push.sms;

public class MissionStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MissionStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "99";
    public static final java.lang.String _value2 = "0";
    public static final java.lang.String _value3 = "1";
    public static final java.lang.String _value4 = "2";
    public static final java.lang.String _value5 = "3";
    public static final java.lang.String _value6 = "4";
    public static final java.lang.String _value7 = "5";
    public static final java.lang.String _value8 = "6";
    public static final java.lang.String _value9 = "7";
    public static final java.lang.String _value10 = "8";
    public static final java.lang.String _value11 = "11";
    public static final java.lang.String _value12 = "9";
    public static final java.lang.String _value13 = "17";
    public static final java.lang.String _value14 = "15";
    public static final java.lang.String _value15 = "16";
    public static final java.lang.String _value16 = "21";
    public static final MissionStatus value1 = new MissionStatus(_value1);
    public static final MissionStatus value2 = new MissionStatus(_value2);
    public static final MissionStatus value3 = new MissionStatus(_value3);
    public static final MissionStatus value4 = new MissionStatus(_value4);
    public static final MissionStatus value5 = new MissionStatus(_value5);
    public static final MissionStatus value6 = new MissionStatus(_value6);
    public static final MissionStatus value7 = new MissionStatus(_value7);
    public static final MissionStatus value8 = new MissionStatus(_value8);
    public static final MissionStatus value9 = new MissionStatus(_value9);
    public static final MissionStatus value10 = new MissionStatus(_value10);
    public static final MissionStatus value11 = new MissionStatus(_value11);
    public static final MissionStatus value12 = new MissionStatus(_value12);
    public static final MissionStatus value13 = new MissionStatus(_value13);
    public static final MissionStatus value14 = new MissionStatus(_value14);
    public static final MissionStatus value15 = new MissionStatus(_value15);
    public static final MissionStatus value16 = new MissionStatus(_value16);
    public java.lang.String getValue() { return _value_;}
    public static MissionStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MissionStatus enumeration = (MissionStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MissionStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MissionStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "MissionStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
