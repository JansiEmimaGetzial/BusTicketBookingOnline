package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.BookingBean;
import com.cg.bean.BusBean;
import com.cg.bus.exception.BookingException;


public interface BusDao {
	ArrayList<BusBean> retrieveBusDetails(); 
	int bookTicket(BookingBean bookingBean) throws BookingException; 
	void close();
	boolean bookticket(BusBean bean);
	BusBean getBusBean(int busId);
	double getBusBean(long busId) throws BookingException;

}