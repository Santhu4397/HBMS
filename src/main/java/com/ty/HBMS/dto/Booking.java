package com.ty.HBMS.dto;

public class Booking {
	private int bookingid;
	private String roomid;
	private String uid;
	private String bookedfrom;
	private String bookedto;
	private String numofadults;
	private String numofchids;
	private String amount;
	public Booking() {
		super();
	}
	public Booking(int bookingid, String roomid, String uid, String bookedfrom, String bookedto, String numofadults,
			String numofchids, String amount) {
		super();
		this.bookingid = bookingid;
		this.roomid = roomid;
		this.uid = uid;
		this.bookedfrom = bookedfrom;
		this.bookedto = bookedto;
		this.numofadults = numofadults;
		this.numofchids = numofchids;
		this.amount = amount;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getBookedfrom() {
		return bookedfrom;
	}
	public void setBookedfrom(String bookedfrom) {
		this.bookedfrom = bookedfrom;
	}
	public String getBookedto() {
		return bookedto;
	}
	public void setBookedto(String bookedto) {
		this.bookedto = bookedto;
	}
	public String getNumofadults() {
		return numofadults;
	}
	public void setNumofadults(String numofadults) {
		this.numofadults = numofadults;
	}
	public String getNumofchids() {
		return numofchids;
	}
	public void setNumofchids(String numofchids) {
		this.numofchids = numofchids;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
