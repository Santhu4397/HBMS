package com.ty.HBMS.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.HBMS.dto.Booking;

@Repository
public class BookingDao {
	@Autowired
	private EntityManager entityManager;
	@Autowired
	private EntityTransaction entityTransaction;

	public void saveBooking(Booking booking) {
		entityTransaction.begin();
		entityManager.persist(booking);
		entityTransaction.commit();
	}

	public List<Booking> getAllBooking() {
		Query query = entityManager.createQuery("select b from Booking b");
		return query.getResultList();
	}

	public Booking getBookingById(int id) {
		return entityManager.find(Booking.class, id);
	}

	public void updateBooking(Booking booking) {
		Booking booking2 = getBookingById(booking.getBookingid());
		if (booking2 != null) {
			entityTransaction.begin();
			entityManager.merge(booking2);
			entityTransaction.commit();
		}
	}

	public void deleteBooking(int id) {
		Booking booking = getBookingById(id);
		if (booking != null) {
			entityTransaction.begin();
			entityManager.remove(booking);
			entityTransaction.commit();
		}
	}
}
