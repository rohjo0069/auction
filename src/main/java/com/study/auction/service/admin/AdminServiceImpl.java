package com.study.auction.service.admin;


import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.auction.dao.admin.AdminDao;


@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	
	@Autowired
	private SqlSession sqlSession;
	

	@Override
	public ArrayList<HashMap<String, Object>> getList(HashMap<String, Object> param) throws Exception {
		AdminDao dao = sqlSession.getMapper(AdminDao.class);
		return dao.getList(param);
	}

	

}
