package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.BookingBean;
import com.cg.bean.BusBean;
import com.cg.bus.exception.BookingException;
import com.cg.bus.util.DBUtil;

public class BusDaoImpl implements BusDao{

	@Override
	public ArrayList<BusBean> retrieveBusDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int bookTicket(BookingBean bookingBean) throws BookingException {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void close() {
		DBUtil.closeConnection();		
	}

	@Override
	public boolean bookticket(BusBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BusBean getBusBean(int busId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getBusBean(long busId) throws BookingException {
		// TODO Auto-generated method stub
		return 0;
	}

}
