<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/functions"  prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resource/css/list.css">
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<form action="list" method="post">
	<div align="left">
		审核记录<hr>
		关键字 <input name="name" value="${j.name }"> 概述 <input name="thing" value="${j.thing }"><br>
		编号 <input name="id" value="${j.id }"> 公司名称 <input name="gname" value="${j.gname }"><br>
		主要产品 <input name="product" value="${j.product }"> 地址 <input name="address" value="${j.address }"> 注册资本 <input name="p1" value="${j.p1 }">- <input name="p2" value="${j.p2 }"> <br>
		成立日期  <input name="d1" value="${j.d1 }" onclick="WdatePicker()">- <input name="d2" value="${j.d2 }" onclick="WdatePicker()"> 年检日期  <input name="nd1" value="${j.nd1 }" onclick="WdatePicker()">- <input name="nd2" value="${j.nd2 }" onclick="WdatePicker()"><br>
		年检状态 <select name="state">
			<option value="">请选择</option>
			<option value="通过">通过</option>
			<option value="未年检">未年检</option>
		</select>
		备注 <input name="beizhu" value="${j.beizhu }">
		<button>查询</button><a href="list"><input type="button" value="重置"></a>
	<hr>
	</div>
		<table >
			<tr>
				<td>编号</td>
				<td>关键字</td>
				<td>概述</td>
				<td>公司名称</td>
				<td>主营产品</td>
				<td>地址</td>
				<td>注册资本(万元)</td>
				<td>成立时间</td>
				<td>年检时间</td>
				<td>年检状态</td>
				<td>备注</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${list }" var="j">
				<tr>
					<td>${j.id }</td>
					<td>${j.name }</td>
					<td>${j.thing }</td>
					<td>${j.gname }</td>
					<td>${j.product }</td>
					<td>${j.address }</td>
					<td>${j.price }</td>
					<td>${j.startdate }</td>
					<td>${j.showdate }</td>
					<td>${j.state }</td>
					<td>${j.beizhu }</td>
					<td><a href="toupdate?id=${j.id }"><input type="button" value="年检审核"></a></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="15">
					<button name="pageNum" value="1">首页</button>
					<button name="pageNum" value="${pg.prePage==0?1:pg.prePage }">上一页</button>
					<button name="pageNum" value="${pg.nextPage==0?pg.pages:pg.nextPage }">下一页</button>
					<button name="pageNum" value="${pg.pages }">末页</button>
					总记录:/总页数:${pg.pages }
				</td>
			</tr>
		</table>
	</form>
</body>
</html>

