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
	<form:form  action="update" id="id"  method="post" modelAttribute="j">
		编号：<form:input path="id" readonly="true"/><br>
		关键字：<form:input path="name" readonly="true"/><br>
		描述：<form:input path="thing" readonly="true"/><br>
		公司名称：<form:input path="gname" readonly="true"/><br>
		主营产品：<form:input path="product" readonly="true"/><br>
		地址：<form:input path="address" readonly="true"/><br>
		注册资本(万元)：<form:input path="price" readonly="true"/><br>
		成立时间：<form:input path="startdate"  readonly="true"/><br>
		年检日期：<form:input path="showdate" readonly="true"/><br>
		年检状态：<form:select path="state">
			<form:option value="${j.state }">通过</form:option>
			<form:option value="待年检">待年检</form:option>
			<form:option value="${j.state }">未年检</form:option>
		</form:select><br>
		备注：<form:input path="beizhu" readonly="true"/><br>
		<form:button>修改</form:button>
		<!-- <a href="update"><input type="button" value="修改"></a> -->
	</form:form>
</body>
<script type="text/javascript">
/* 	function update(){
		$.ajax({
			type:"post",
			date:$("#id").serialize(),
			success:function(obj){
				if(obj){
					alert("修改成功")
					location.href = "list";
				}else{
					alert("修改失败")
				}
			}
		})
	} */
</script>
</html>

