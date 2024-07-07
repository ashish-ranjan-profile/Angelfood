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

@RestController
public class ConsumerController {
	@Autowired
	ConsumerServices consumerServices;
	
	@GetMapping("/Consumers")
	public List<Consumer>getConsumers(){
		return consumerServices.getAllConsumers();
	}
	
	@PostMapping("/Consumers")
	public Consumer addConsumer(@RequestBody Consumer consumer)
	{
		return consumerServices.saveConsumer(consumer);
	}
	
	@DeleteMapping("/Consumers/delete/{id}")
	public void deleteStudent(@PathVariable long id)
	
	{
		consumerServices.deleteConsumer(id);
	}
	
	
	@PutMapping("/Consumer/update")
	public Consumer updateConsumer(@RequestBody Consumer consumer)
	{
		return consumerServices.updateConsumer(consumer);
		
	}
	
}

