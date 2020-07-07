<%--
  Created by IntelliJ IDEA.
  User: xieziwei99
  Date: 2020/7/5
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="hello">HelloWorld</a>
  <hr/>
  <a href="product/1">get product</a>
  <form action="product" method="post">
    <button type="submit">add product</button>
  </form>
  <form action="product/2" method="post">
    <input type="hidden" name="_method" value="PUT" />
    <button type="submit">update product</button>
  </form>
  <form action="product/3" method="post">
    <input type="hidden" name="_method" value="DELETE" />
    <button type="submit">delete product</button>
  </form>
  </body>
</html>
