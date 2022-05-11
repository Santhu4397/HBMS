package com.ty.HBMS.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.HBMS.dto.Hotel;
import com.ty.HBMS.dto.Rooms;

@Repository
public class RoomDao {
	@Autowired
	private EntityManager entityManager;
	@Autowired
	private EntityTransaction entityTransaction;
	@Autowired
	private HotelDao hotelDao;;

	public void saveRoom(Rooms rooms, int hotelid) {
		Hotel hotel = hotelDao.getHotelById(hotelid);
		entityTransaction.begin();
		rooms.setHotel(hotel);
		entityManager.persist(rooms);
		entityTransaction.commit();
	}

	public Rooms getById(int id) {
		System.out.println(id);
		return entityManager.find(Rooms.class, id);
	}

	public List<Rooms> getRooms() {
		Query query = entityManager.createQuery("select s from Rooms s");
		return query.getResultList();
	}

	public void updateRoom(Rooms rooms) {
		entityTransaction.begin();
		entityManager.merge(rooms);
		entityTransaction.commit();
	}

	public void removeRoom(int id) {
		entityTransaction.begin();
		entityManager.remove(getById(id));
		entityTransaction.commit();
	}
}
