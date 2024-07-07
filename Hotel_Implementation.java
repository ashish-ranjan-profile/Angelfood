package com.AnglePlate.AnglePlate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Hotel_Implementation implements HotelService{

	

	@Autowired
	HotelRepository hotelRepository;
	
     
	
	public Hotel saveHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepository.save(hotel);
	}

	
	
	@Override
	public Hotel getHoteleById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

/*	@Override
	public Hotel updateEmployee(Hotel hotel, long id) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public void deleteHotel(long id) {
		// TODO Auto-generated method stub
		hotelRepository.deleteById(id);
	}



	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}



	@Override
	public Hotel updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepository.save(hotel);
	}

	

	
	

}
