package com.weigengchen.service;

import java.util.List;

import com.weigengchen.entity.Jian;

public interface JianService {

	List<Jian> list(Jian j);

	void add(List<Jian> JianList);

	Jian showJian(Integer id);

	String update(Jian j);

}
