<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Welcome to Mom's Cafe</title>
    </head>
    <body>
        <h1 style="text-align: center">Welcome to Mom's Cafe</h1><hr/>

        <form action="/order" method="post">
            <label for="item_name">Item Name: </label>
            <input type="text" name="foodType" placeholder="food type" id="item_name" />
            <input type="submit" value="Order" />
        </form>
    </body>
</html>
