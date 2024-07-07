package com.AnglePlate.AnglePlate;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Id;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;
	
	@GetMapping("/hotel")
	public List<Hotel>getHotels(){
		return hotelService.getAllHotel();
	}
	
	@PostMapping("/hotel")
	public Hotel addHotel(@RequestBody Hotel hotel)
	{
		return hotelService.saveHotel(hotel);
	}
	
	@DeleteMapping("/hotel/delete/{id}")
	public void deleteHotel(@PathVariable long id)
	{
		hotelService.deleteHotel(id);
	}
	
	@PutMapping("/hotel/update")
	public Hotel upHotel(@RequestBody Hotel hotel) {
		return hotelService.updateHotel(hotel);
	}
	
	
}
