/**
 * APISoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package push.sms;

public interface APISoap_PortType extends java.rmi.Remote {

    /**
     * 发送短消息给指定的手机号码<br />uid:帐号<br />pwd:密码<br />msg:发送的内容<br />mobiles:发送的手机号码，多个以英文逗号隔开<br
     * />sendtime:发送的时间，不填写表示立即发送
     */
    public push.sms.MissionResultInfo sendSms(java.lang.String uid, java.lang.String pwd, java.lang.String msg, java.lang.String mobiles, java.lang.String sendtime) throws java.rmi.RemoteException;

    /**
     * 修改帐号的密码<br />uid:访问帐号<br />oldpwd:旧密码<br />newpwd:新密码
     */
    public push.sms.ModifyPasswordStatus updatePasswd(java.lang.String uid, java.lang.String oldpwd, java.lang.String newpwd) throws java.rmi.RemoteException;

    /**
     * 查询账户的余额<br />uid:访问帐号<br />pwd:访问密码
     */
    public push.sms.QueryAccountStatus queryAccount(java.lang.String uid, java.lang.String pwd) throws java.rmi.RemoteException;

    /**
     * 查询用户的回复信息，无数据返回空内容<br />uid:访问帐号<br />pwd:访问密码
     */
    public push.sms.QueryMoStatus queryMo(java.lang.String uid, java.lang.String pwd) throws java.rmi.RemoteException;

    /**
     * 请求发送的号码的状态报告，无数据返回空内容<br />uid:访问帐号<br />pwd:访问密码
     */
    public push.sms.QueryReportStatus queryReport(java.lang.String uid, java.lang.String pwd) throws java.rmi.RemoteException;
}
