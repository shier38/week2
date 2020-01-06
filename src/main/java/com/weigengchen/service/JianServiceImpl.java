package com.weigengchen.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.weigengchen.entity.Jian;
import com.weigengchen.mapper.JianMapper;

@Service
public class JianServiceImpl implements JianService {
	
	@Resource
	private JianMapper mapper;

	@Override
	public List<Jian> list(Jian j) {
		// TODO 
		return mapper.list(j);
	}

	@Override
	public void add(List<Jian> JianList) {
		// TODO 
		mapper.add(JianList);
	}

	@Override
	public Jian showJian(Integer id) {
		// TODO 
		return mapper.showJian(id);
	}

	@Override
	public String update(Jian j) {
		// TODO 
		return mapper.update(j);
	}
	
	

}
