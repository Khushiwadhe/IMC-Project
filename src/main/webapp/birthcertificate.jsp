<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<title>Register Birth Certificate Request</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            width: 50%;
            margin: 0 auto;
            padding: 20px;
            margin-top:50px;
            border: 4px solid #333;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .form-group label {
            display: block;
            margin-bottom: 5px;
        }
        .form-group input, .form-group textarea {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }
    </style>
</head>
<body style="background-color:#6699CC;">
    <div class="container">
        <h1>Request Birth Certificate</h1>
        <form action="submitRequest" method="post" enctype="multipart/form-data">
        <input type="hidden" name="action" value="register">
            <div class="form-group">
                <label for="childName">Child Name:</label>
                <input type="text" id="childName" name="childName" required>
            </div>
            <div class="form-group">
                <label for="parentNames">Parent Names:</label>
                <input type="text" id="parentNames" name="parentNames" required>
            </div>
            <div class="form-group">
                <label for="hospitalCertificate">Hospital Certificate:</label>
                <input type="file" id="hospitalCertificate" name="hospitalCertificate" required>
            </div>
            <button type="submit">Submit Request</button>
        </form>
    </div>
    </body>
    </html>