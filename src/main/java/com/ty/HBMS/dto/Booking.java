package com.ty.HBMS.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingid;
	private String bookedfrom;
	private String bookedto;
	private String numofadults;
	private String numofchids;
	private String amount;
	@ManyToOne
	@JoinColumn
	private User user;
	@OneToMany(mappedBy = "bookings")
	private List<Rooms> rooms;

	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Rooms> getRooms() {
		return rooms;
	}

	public void setRooms(List<Rooms> rooms) {
		this.rooms = rooms;
	}

}
