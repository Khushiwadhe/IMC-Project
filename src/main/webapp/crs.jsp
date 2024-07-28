<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complaint Registration Chatbot</title>
    <link rel="stylesheet" href="folder\styles.css">
</head>
<body>
<head>  
</head>
<body>
    <div class="container">
        <header>
            <h1>Complaint Registration Chatbot</h1>
        </header>
        <main>
            <div class="chatbot">
                <div id="chatbot-messages" class="chatbot-messages"></div>
                <form id="chatbot-form">
                <h1>Register your Complaint Here</h1>
                    <input type="text" id="name" placeholder="Your Name" required>
                    <input type="email" id="email" placeholder="Your Email" required>
                    <select id="complaint-type" required>
                        <option value="">Select Complaint Type</option>
                        <option value="Service">Service</option>
                        <option value="Product">Product</option>
                        <option value="Other">Other</option>
                    </select>
                    <textarea id="complaint-details" placeholder="Describe your complaint" required></textarea>
                    <button type="submit">Send</button>
                </form>
            </div>
        </main>
        <footer>
        </footer>
    </div>
    <script src="folder/script.js"></script>
</body>
</html>
</body>
</html>