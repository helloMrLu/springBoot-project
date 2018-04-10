package com.tontisa.common;

import org.springframework.beans.factory.annotation.Autowired;

import com.tontisa.service.UserServer;


public class BaseController {
	@Autowired
	protected UserServer userServer;
}
