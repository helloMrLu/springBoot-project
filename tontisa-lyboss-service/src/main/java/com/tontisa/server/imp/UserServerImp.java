package com.tontisa.server.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tontisa.dao.UserDao;
import com.tontisa.entity.User;
import com.tontisa.service.UserServer;
@Service
public class UserServerImp implements UserServer{
	@Autowired
    private UserDao userDao;

	@Override
	public User getInfo(Long id) {
		User u=userDao.findUserById(id);
		if(u==null){
			u=new User();
		}
		return u;
	}
}
