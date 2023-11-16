package com.cg.service;

import com.cg.BusClient;
import com.cg.bean.BookingBean;

public interface BusService {
	void close();

	
	boolean create(BusClient cust);


	boolean bookticket();
}
