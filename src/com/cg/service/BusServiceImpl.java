package com.cg.service;

import com.cg.BusClient;
import com.cg.bean.BookingBean;
import com.cg.dao.BusDaoImpl;

public class BusServiceImpl implements BusService{
	private BusDaoImpl busDao;

	public BusServiceImpl() {
		busDao = new BusDaoImpl();
	}
	@Override
	public void close() {
		busDao.close();
	}
	

	public boolean bookticket(BookingBean book) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean bookticket() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean create(BusClient cust) {
		// TODO Auto-generated method stub
		return false;
	}
}
