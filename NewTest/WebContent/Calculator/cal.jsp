<%@page import="cn.calculator.calculator"%>
<%@ page language="java" import="java.util.*,cn.calculator.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'calculator.jsp' starting page</title>
   
   <style>
   
	   body{
		text-align : center;
	   }
		body table tr td input{
			width:100%;
			height : 100%;
		}
		.container{
			align:center;
		}
   </style>
   
  </head>
  
  <body >
  	<div>
	<jsp:useBean id="calculatorBean" class = "cn.calculator.calculator"></jsp:useBean>
	  	
	  	<jsp:setProperty property="*" name="calculatorBean"/>
	  	 
	  	<%

	  	calculatorBean.calculate();
	  	 %> 
	  	<hr>
	  		The result is：
	  	 <jsp:getProperty property="firstNum" name="calculatorBean"/>
	  		<jsp:getProperty property="oper" name="calculatorBean"/>
	  		<jsp:getProperty property="secondNum" name="calculatorBean"/> 
	  		=
	  		<jsp:getProperty property="result" name="calculatorBean"/> 
	  	<hr>
		  <form action = "cal.jsp" method = "get">
		    <table style="margin-right: auto;margin-left: auto;" width = "40%" border="1">
		    	
		    	<tr>
		    		<td colspan="2">A simple calculator</td>
		    	</tr>
		    
		    	<tr>
		    		<td>The first parameter:</td>
		    		<td><input type="text" name = "firstNum"> </td>
		    	</tr>
		    	
		    	<tr>
		    		<td>operator</td>
		    		<td>
		    			<select name = "oper">
		    				<option value = "+">+</option>
		    				<option value = "-">-</option>
		    				<option value = "*">*</option>
		    				<option value = "/">/</option>
		    			</select>
		    		</td>
		    	</tr>
		    	
		    	<tr>
		    		<td>The second parameter:</td>
		    		<td><input type="text" name = "secondNum"></td>
		    		
		    	</tr>
		    	
		    	<tr>
		    		<td colspan = 2 ><input type= "submit" value = "calculate" name = "submit" style = "text-align:center"></td>
		    	</tr>
		    </table>
		   </form>

	  </div>
  </body>
</html>