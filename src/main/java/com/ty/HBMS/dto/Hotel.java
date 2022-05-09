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
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hotelid;
	private String hotelcity;
	private String hotelname;
	private String hoteladdress;
	private String hoteldesc;
	private String hotelcost;
	private String hotelphone1;
	private String hotelphone2;
	private String hoterating;
	private String hotelemail;
	@ManyToOne
	@JoinColumn
	private User users;
	@OneToMany(mappedBy = "hotel")
	private List<Rooms> rooms;

	public int getHotelid() {
		return hotelid;
	}

	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}

	public User getUsers() {
		return users;
	}

	public void setUsers(User users) {
		this.users = users;
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

	public List<Rooms> getRooms() {
		return rooms;
	}

	public void setRooms(List<Rooms> rooms) {
		this.rooms = rooms;
	}

}
