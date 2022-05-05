package com.ty.HBMS.dto;

public class Rooms {
	   private String hotelid;
	   private String roomid;
	   private String roomno;
	   private String roomtype;
	   private String rommcost;
	   private String roomavilable;
	public String getHotelid() {
		return hotelid;
	}
	public void setHotelid(String hotelid) {
		this.hotelid = hotelid;
	}
	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public String getRoomno() {
		return roomno;
	}
	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getRommcost() {
		return rommcost;
	}
	public void setRommcost(String rommcost) {
		this.rommcost = rommcost;
	}
	public String getRoomavilable() {
		return roomavilable;
	}
	public void setRoomavilable(String roomavilable) {
		this.roomavilable = roomavilable;
	}
	public Rooms(String hotelid, String roomid, String roomno, String roomtype, String rommcost, String roomavilable) {
		super();
		this.hotelid = hotelid;
		this.roomid = roomid;
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.rommcost = rommcost;
		this.roomavilable = roomavilable;
	}
	public Rooms() {
		super();
	}
	   
}
