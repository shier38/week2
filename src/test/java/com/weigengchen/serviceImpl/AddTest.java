package com.weigengchen.serviceImpl;

import static org.junit.Assert.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.druid.pool.GetConnectionTimeoutException;
import com.weigengchen.entity.Jian;
import com.weigengchen.service.JianService;
import com.weigengchen.utils.DateUtil;
import com.weigengchen.utils.NumberUtil;
import com.weigengchen.utils.StreamUtil;
import com.weigengchen.utils.StringUtil;

@ContextConfiguration(locations="classpath:spring.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AddTest {
	
	@Resource
	private JianService ss;
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void addtest() {
		//创建JianList集合对象
		List<Jian> JianList = new ArrayList<Jian>();
		//获取文件内容
		List<String> list = StreamUtil.readLine(this.getClass().getResourceAsStream("/week2.txt"));
		for (int i = 1; i < list.size(); i++) {
//			分隔
			String[] s = list.get(i).split("\t");
//			创建Jian类对象
			Jian jian = new Jian();
			/**
			 * 判断是否为空 填入数值 有必要的类型转换
			 */
			if(StringUtil.hasText(s[0])) {
				jian.setId(Integer.parseInt(s[0]));
			}
			if(StringUtil.hasText(s[1])) {
				jian.setName(s[1]);
			}
			if(StringUtil.hasText(s[2])) {
				jian.setThing(s[2]);
			}
			if(StringUtil.hasText(s[3])) {
				jian.setGname(s[3]);
			}
			if(StringUtil.hasText(s[4])) {
				jian.setProduct(s[4]);
			}
			if(StringUtil.hasText(s[5])) {
				jian.setAddress(s[5]);
			}
			if(StringUtil.hasText(s[6]) && NumberUtil.isNumber(s[6])) {
				BigDecimal price = new BigDecimal(Integer.parseInt(s[6]));
				jian.setPrice(price);
			}
			if(StringUtil.hasText(s[7])) {
				jian.setStartdate(s[7]);
			}
			if(StringUtil.hasText(s[10])) {
				jian.setState(s[10]);
			}
//			添加到集合
			JianList.add(jian);
		}
//		添加方法
		ss.add(JianList);
	}

}
