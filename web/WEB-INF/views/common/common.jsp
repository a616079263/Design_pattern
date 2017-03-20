<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    pageContext.setAttribute("basePath",basePath);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jquery/jquery-easyui-1.5.1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${basePath}jquery/jquery-easyui-1.5.1/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${basePath}jquery/jquery-easyui-1.5.1/demo.css">
<script type="text/javascript" src="${basePath}jquery/jquery-easyui-1.5.1/jquery.min.js"></script>
<script type="text/javascript" src="${basePath}jquery/jquery-easyui-1.5.1/jquery.easyui.min.js"></script>
