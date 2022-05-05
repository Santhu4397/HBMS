package com.ty.HBMS.dto;

public class Hotel {
	  private String hotelid;
	   private String hotelcity;
	   private String hotelname;
	   private String hoteladdress;
	   private String hoteldesc;
	   private String hotelcost;
	   private String hotelphone1;
	   private String hotelphone2;
	   private String hoterating;
	   private String hotelemail;
	public String getHotelid() {
		return hotelid;
	}
	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}
	public Hotel() {
		super();
	}
	public Hotel(String hotelid, String hotelcity, String hotelname, String hoteladdress, String hoteldesc,
			String hotelcost, String hotelphone1, String hotelphone2, String hoterating, String hotelemail) {
		super();
		this.hotelid = hotelid;
		this.hotelcity = hotelcity;
		this.hotelname = hotelname;
		this.hoteladdress = hoteladdress;
		this.hoteldesc = hoteldesc;
		this.hotelcost = hotelcost;
		this.hotelphone1 = hotelphone1;
		this.hotelphone2 = hotelphone2;
		this.hoterating = hoterating;
		this.hotelemail = hotelemail;
	}
	public String getHotelcity() {
		return hotelcity;
	}
	public void setHotelcity(String hotelcity) {
		this.hotelcity = hotelcity;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getHoteladdress() {
		return hoteladdress;
	}
	public void setHoteladdress(String hoteladdress) {
		this.hoteladdress = hoteladdress;
	}
	public String getHoteldesc() {
		return hoteldesc;
	}
	public void setHoteldesc(String hoteldesc) {
		this.hoteldesc = hoteldesc;
	}
	public String getHotelcost() {
		return hotelcost;
	}
	public void setHotelcost(String hotelcost) {
		this.hotelcost = hotelcost;
	}
	public String getHotelphone1() {
		return hotelphone1;
	}
	public void setHotelphone1(String hotelphone1) {
		this.hotelphone1 = hotelphone1;
	}
	public String getHotelphone2() {
		return hotelphone2;
	}
	public void setHotelphone2(String hotelphone2) {
		this.hotelphone2 = hotelphone2;
	}
	public String getHoterating() {
		return hoterating;
	}
	public void setHoterating(String hoterating) {
		this.hoterating = hoterating;
	}
	public String getHotelemail() {
		return hotelemail;
	}
	public void setHotelemail(String hotelemail) {
		this.hotelemail = hotelemail;
	}

}
