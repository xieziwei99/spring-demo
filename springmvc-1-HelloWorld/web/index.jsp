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

<!-- ====================================== -->
<a href="product/1">get product</a>
<form action="product" method="post">
    <button type="submit">add product</button>
</form>
<form action="product/2" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <button type="submit">update product</button>
</form>
<form action="product/3" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <button type="submit">delete product</button>
</form>
<hr/>

<!-- ====================================== -->
<form action="testPojo" method="post">
    <div>
        <label for="product_name">
            product name:
            <input type="text" name="name" id="product_name">
        </label>
    </div>
    <div>
        <label for="product_price">
            product price:
            <input type="text" name="price" id="product_price">
        </label>
    </div>
    <div>
        <label for="category_name">
            category name:
            <input type="text" name="category.name" id="category_name">
        </label>
    </div>
    <div>
        <button>submit</button>
    </div>
</form>
<hr/>

<!-- ====================================== -->
<form action="testModelAttribute" method="post">
    <input type="hidden" name="id" value="1">
    <div>
        <label>
            name: <input type="text" name="name" value="Jack">
        </label>
    </div>
    <button>submit</button>
</form>

</body>
</html>
