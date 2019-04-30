<%--
  Created by IntelliJ IDEA.
  User: rongduojun
  Date: 2019/3/26
  Time: 下午3:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" isELIgnored="false" %>
<h1>${message}</h1>
rdjhhj
<form action="login.do" method="post">
  username:<input type="text" name = "username" ><p>
  password:<input type="password" name = "password" ><p>
  <input type="submit" value="登录">
</form>
