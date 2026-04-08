package com.anudip.model;

public class Customer {

	private int cid;
	private String cname;
	private long mobno;
	private String addrs;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mobno=" + mobno + ", addrs=" + addrs + "]";
	}
	public Customer(int cid, String cname, long mobno, String addrs) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mobno = mobno;
		this.addrs = addrs;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	
	
	//setter and getter
	//param constr and non param constr
	//toString
}
