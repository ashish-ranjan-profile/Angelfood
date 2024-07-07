package com.AnglePlate.AnglePlate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ConsumerInfo")
public class Consumer {
	@Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String consumerNameString;
	private String consumerEmail;
	private String consumerContactString;
	private String consumerLicense;
	private String consumerAddressString;
	private long numberOfChildren=1;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getConsumerNameString() {
		return consumerNameString;
	}
	public void setConsumerNameString(String consumerNameString) {
		this.consumerNameString = consumerNameString;
	}
	public String getConsumerEmail() {
		return consumerEmail;
	}
	public void setConsumerEmail(String consumerEmail) {
		this.consumerEmail = consumerEmail;
	}
	public String getConsumerContactString() {
		return consumerContactString;
	}
	public void setConsumerContactString(String consumerContactString) {
		this.consumerContactString = consumerContactString;
	}
	public String getConsumerLicense() {
		return consumerLicense;
	}
	public void setConsumerLicense(String consumerLicense) {
		this.consumerLicense = consumerLicense;
	}
	public String getConsumerAddressString() {
		return consumerAddressString;
	}
	public void setConsumerAddressString(String consumerAddressString) {
		this.consumerAddressString = consumerAddressString;
	}
	public long getNumberOfChildren() {
		return numberOfChildren;
	}
	public void setNumberOfChildren(long numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
	
	
	
	
	
	public Consumer(long id, String consumerNameString, String consumerEmail, String consumerContactString,
			String consumerLicense, String consumerAddressString, long numberOfChildren) {
		super();
		this.id = id;
		this.consumerNameString = consumerNameString;
		this.consumerEmail = consumerEmail;
		this.consumerContactString = consumerContactString;
		this.consumerLicense = consumerLicense;
		this.consumerAddressString = consumerAddressString;
		this.numberOfChildren = numberOfChildren;
	}
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

