package com.weigengchen.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weigengchen.entity.Jian;
import com.weigengchen.service.JianService;
@Controller
public class JianController  {
	
	@Resource
	private JianService ss;
	
//	展示页面
	@RequestMapping("list")
	public String list(Jian j,Model model,@RequestParam(defaultValue="1")int pageNum) {
//		分页
		PageHelper.startPage(pageNum, 3);
//		展示页面
		List<Jian> list = ss.list(j);
		PageInfo<Jian> pageInfo = new PageInfo<Jian>(list);
//		封装
		model.addAttribute("list", list);
		model.addAttribute("pg", pageInfo);
		model.addAttribute("j", j);
		return "list";
	}
	
	@RequestMapping("toupdate")
	public String toupdate(@ModelAttribute("j")Jian j,Model model,Integer id) {
		Jian jian = ss.showJian(id);
		model.addAttribute("j", jian);
		return "update";
	}
	
	@RequestMapping("update")
	public String update(Jian j) {
		ss.update(j);
		return "list";
	}

}
