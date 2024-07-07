package com.AnglePlate.AnglePlate;


import java.util.List;

public interface HotelService {
		
		Hotel saveHotel(Hotel hotel);
		List<Hotel> getAllHotel();
	/*	Hotel getHotelById(Long id);
		Hotel updateHotel(Hotel hotel, Long id);
		void deleteHotel(Long id);*/
		Hotel getHoteleById(long id);
	//	Hotel updateEmployee(Hotel hotel, long id);
		void deleteHotel(long id);
		
		Hotel updateHotel(Hotel hotel);
		
}