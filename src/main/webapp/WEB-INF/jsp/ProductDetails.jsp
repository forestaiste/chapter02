<%@ page import="com.forest.chapter02.domain.Product" %>
<!DOCTYPE HTML>
<html>
<head>
  <title>Save Product</title>
  <%--<style type="text/css">@import url(css/main.css);</style>--%>
</head>
<body>
<div id="global">
  <h4>The product has been saved.</h4>
  <p>
  <h5>Details:</h5>
  <%
    Product p = (Product) request.getAttribute("product");
  %>
  Product Name: <%=p.getName()%><br/>
  Description: <%=p.getDescription()%><br/>
  Price: $<%=p.getPrice()%>
  </p>
</div>
</body>
</html>