package com.tontisa.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tontisa.lyboss.base.Result;

import com.tontisa.common.BaseController;
import com.tontisa.entity.User;
import com.tontisa.util.Exception;
import com.tontisa.util.ResultUtil;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController{
	
	@RequestMapping("/getInfo/{id}")
	public Result getInfo(@PathVariable Long id){
		User u=userServer.getInfo(id);
		if(u==null){
			throw Exception.makeServiceException("10001");
		}
		return ResultUtil.success(u);
	}
}
