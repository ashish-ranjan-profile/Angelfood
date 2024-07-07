package com.AnglePlate.AnglePlate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerImplementation implements ConsumerServices {

	 @Autowired
	 ConsumerRepository consumerRepository;
	 
	 
	@Override
	public Consumer saveConsumer(Consumer consumer) {
		return consumerRepository.save(consumer);
	}

	@Override
	public List<Consumer> getAllConsumers() {
		return consumerRepository.findAll();
	}

	/*@Override
	public Consumer updateConsumer(Consumer consumer, long id) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public void deleteConsumer(long id) {
		// TODO Auto-generated method stub
		consumerRepository.deleteById(id);
	}

	@Override
	public Consumer updateConsumer(Consumer consumer) {
		// TODO Auto-generated method stub
		return consumerRepository.save(consumer);
	}

	/*@Override
	public void updateConsumer(long id) {
		// TODO Auto-generated method stub
		consumerRepository.u
	}*/

}
