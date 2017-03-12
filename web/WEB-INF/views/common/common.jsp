<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    pageContext.setAttribute("basePath",basePath);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" type="text/css" href="${basePath}views/jquery/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${basePath}views/jquery/themes/icon.css">
<link rel="stylesheet" type="text/css" href="${basePath}views/jquery/demo.css">
<script type="text/javascript" src="${basePath}views/jquery/jquery.min.js"></script>
<script type="text/javascript" src="${basePath}views/jquery/jquery.easyui.min.js"></script>
