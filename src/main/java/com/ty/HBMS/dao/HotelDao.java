package com.ty.HBMS.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.HBMS.dto.Hotel;

@Repository
public class HotelDao {
	@Autowired
	private EntityManager manager;
	@Autowired
	private EntityTransaction transaction;

	public void saveHotel(Hotel hotel) {
		transaction.begin();
		manager.persist(hotel);
		transaction.commit();
	}

	public Hotel getHotelById(int id) {
		return manager.find(Hotel.class, id);
	}

	public List<Hotel> getAllHotels() {
		Query query = manager.createQuery("Select h from Hotel h");
		return query.getResultList();
	}

	public void updateHotel(Hotel hotel) {
		Hotel existingHotel = getHotelById(hotel.getHotelid());
		if (existingHotel != null) {
			transaction.begin();
			manager.merge(hotel);
			transaction.commit();
		}
	}
	public void deleteHotel(int id) {
		Hotel hotel=getHotelById(id);
		if(hotel!=null) {
			transaction.begin();
			manager.remove(hotel);
			transaction.commit();
		}
	}

}
