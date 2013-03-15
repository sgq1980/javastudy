<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<jsp:include page="inc/header.jsp"/>
失败或遇到异常！
 <s:debug></s:debug>
 <s:property value="exception"/>
<jsp:include page="inc/footer.jsp"/>