package com.ty.HBMS.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Rooms {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomId;
	private String roomno;
	private String roomtype;
	private String rommcost;
	private String roomavilable;
	private int roomCapacity;
	@ManyToOne
	@JoinColumn
	private Hotel hotel;
	@ManyToOne
	@JoinColumn
	private Booking bookings;

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
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

	public int getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Booking getBookings() {
		return bookings;
	}

	public void setBookings(Booking bookings) {
		this.bookings = bookings;
	}

}
