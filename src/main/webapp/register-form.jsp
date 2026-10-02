<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Website Mua Bán Xe Máy & Phụ Tùng</title>
</head>
<body>
    <h1>Đăng ký tài khoản</h1>

    <form action = "register" method = "post">
        <label>Email:</label>
        <input type = "email" name = "email" required><br>

        <label>Password:</label>
        <input type = "password" name = "password" required><br>

        <label>Phone:</label>
        <input type = "text" name = "phone" required><br>

        <input type = "submit" value = "Đăng ký">

        <p>${error}</p>
    </form>
</body>
</html>