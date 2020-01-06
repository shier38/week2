package com.weigengchen.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
/**
 * 公司年检表实体类
 * @author 十二
 */
public class Jian {

	Integer id;//编号
	String name;//关键字
	String thing;//描述
	String gname;//公司名称
	String product;//主营产品
	String address;//地址
	BigDecimal price;//注册资本（万元）
	String startdate;//成立时间
	Date showdate;//年检时间
	String state;//年检状态
	String beizhu;//备注
	
	String d1;
	String d2;
	String nd1;
	String nd2;
	Integer p1;
	Integer p2;
	
	
	
	public String getD1() {
		return d1;
	}
	public void setD1(String d1) {
		this.d1 = d1;
	}
	public String getD2() {
		return d2;
	}
	public void setD2(String d2) {
		this.d2 = d2;
	}
	public String getNd1() {
		return nd1;
	}
	public void setNd1(String nd1) {
		this.nd1 = nd1;
	}
	public String getNd2() {
		return nd2;
	}
	public void setNd2(String nd2) {
		this.nd2 = nd2;
	}
	public Integer getP1() {
		return p1;
	}
	public void setP1(Integer p1) {
		this.p1 = p1;
	}
	public Integer getP2() {
		return p2;
	}
	public void setP2(Integer p2) {
		this.p2 = p2;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThing() {
		return thing;
	}
	public void setThing(String thing) {
		this.thing = thing;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public Date getShowdate() {
		return showdate;
	}
	public void setShowdate(Date showdate) {
		this.showdate = showdate;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public Jian() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jian(Integer id, String name, String thing, String gname, String product, String address, BigDecimal price,
			String startdate, Date showdate, String state, String beizhu) {
		super();
		this.id = id;
		this.name = name;
		this.thing = thing;
		this.gname = gname;
		this.product = product;
		this.address = address;
		this.price = price;
		this.startdate = startdate;
		this.showdate = showdate;
		this.state = state;
		this.beizhu = beizhu;
	}
	@Override
	public String toString() {
		return "Jian [id=" + id + ", name=" + name + ", thing=" + thing + ", gname=" + gname + ", product=" + product
				+ ", address=" + address + ", price=" + price + ", startdate=" + startdate + ", showdate=" + showdate
				+ ", state=" + state + ", beizhu=" + beizhu + "]";
	}

	
	
	
}
