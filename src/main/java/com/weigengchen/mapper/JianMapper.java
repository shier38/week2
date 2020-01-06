package com.weigengchen.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.weigengchen.entity.Jian;

public interface JianMapper {

	/**
	 * 展示页面、分页、模糊
	 * @param j
	 * @return
	 */
	List<Jian> list(Jian j);

	void add(List<Jian> jianList);

	@Select("select * from jian where id=#{id}")
	Jian showJian(Integer id);

	@Update("update jian set state=#{state} where id=#{id}")
	String update(Jian j);

}
