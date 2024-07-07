package com.AnglePlate.AnglePlate;

import java.util.List;


public interface ConsumerServices {
		
		Consumer saveConsumer(Consumer consumer);
		List<Consumer> getAllConsumers();
		//Consumer updateConsumer(Consumer consumer,long id);
		void deleteConsumer(long id);
		//void updateConsumer(long id);
		Consumer updateConsumer(Consumer consumer);
}