/*	
 * file 		 : HcTimeSheet.java
 * created by    : kmyu
 * creation-date : 2016. 11. 28.
 */

package net.smartworks.model;

import java.util.Date;

public class HcTimeSheet {

	private String objId;
	
	private Date workDate;
	private String type;
	private String Dept;
	private String position;
	private String userId;
	private String userNo;
	private String name;
	private String engName;
	private String prjCode;
	private String st;
	private String ot;
	
	public String getObjId() {
		return objId;
	}
	public void setObjId(String objId) {
		this.objId = objId;
	}
	public Date getWorkDate() {
		return workDate;
	}
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public String getPrjCode() {
		return prjCode;
	}
	public void setPrjCode(String prjCode) {
		this.prjCode = prjCode;
	}
	public String getSt() {
		return st;
	}
	public void setSt(String st) {
		this.st = st;
	}
	public String getOt() {
		return ot;
	}
	public void setOt(String ot) {
		this.ot = ot;
	}
	
}

