package com.AnglePlate.AnglePlate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
@Entity
@Table(name="hotelInfo")
public class Hotel {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
private Long Id;
	private String hotelName;
	private String hotelEmailString;
	private long hotelContactNumber;
	private String hotelLiscence;
	private String hotelAddressString;
	 private String foodTypeString;
	  private String foodStatus;
	  private int foodQuantity;
	
	
	
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}

	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}




	public String getHotelEmailString() {
		return hotelEmailString;
	}
	public void setHotelEmailString(String hotelEmailString) {
		this.hotelEmailString = hotelEmailString;
	}




	public long getHotelContactNumber() {
		return hotelContactNumber;
	}
	public void setHotelContactNumber(long hotelContactNumber) {
		this.hotelContactNumber = hotelContactNumber;
	}




	public String getHotelLiscence() {
		return hotelLiscence;
	}
	public void setHotelLiscence(String hotelLiscence) {
		this.hotelLiscence = hotelLiscence;
	}




	public String getHotelAddressString() {
		return hotelAddressString;
	}
	public void setHotelAddressString(String hotelAddressString) {
		this.hotelAddressString = hotelAddressString;
	}





	
	
	
	public String getFoodTypeString() {
		return foodTypeString;
	}
	public void setFoodTypeString(String foodTypeString) {
		this.foodTypeString = foodTypeString;
	}
	public String getFoodStatus() {
		return foodStatus;
	}
	public void setFoodStatus(String foodStatus) {
		this.foodStatus = foodStatus;
	}
	public int getFoodQuantity() {
		return foodQuantity;
	}
	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	
	
	
	
	
	public Hotel(Long id, String hotelName, String hotelEmailString, long hotelContactNumber, String hotelLiscence,
			String hotelAddressString, String foodTypeString, String foodStatus, int foodQuantity) {
		super();
		Id = id;
		this.hotelName = hotelName;
		this.hotelEmailString = hotelEmailString;
		this.hotelContactNumber = hotelContactNumber;
		this.hotelLiscence = hotelLiscence;
		this.hotelAddressString = hotelAddressString;
		this.foodTypeString = foodTypeString;
		this.foodStatus = foodStatus;
		this.foodQuantity = foodQuantity;
	}
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
