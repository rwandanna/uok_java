# ☕ Advanced Java Programming Notes & Practical Exercises

> Comprehensive notes covering Java Swing, JSP, Servlets, JDBC, MySQL, and Socket Programming.

---

# 📑 Table of Contents

1. [Bank of Kigali Login Form](#1-bank-of-kigali-login-form)
2. [JSP Date and Time](#2-jsp-date-and-time)
3. [Servlet: Sum and Product Calculator](#3-servlet-sum-and-product-calculator)
4. [Hello World Servlet](#4-hello-world-servlet)
5. [University of Kigali Registration System](#5-university-of-kigali-registration-system)
6. [MySQL Database Script](#6-mysql-database-script)
7. [JDBC Delete Example](#7-jdbc-delete-example)
8. [JDBC Update Example](#8-jdbc-update-example)
9. [Reading & Writing Streams](#9-reading--writing-streams)
10. [Socket API Explanation](#10-socket-api-explanation)
11. [Tasks of Java Socket Programming](#11-tasks-of-java-socket-programming)
12. [Server Connection Requirements](#12-server-connection-requirements)

---

# 1. Bank of Kigali Login Form

## Objective

Create a Java Swing login form containing:

* Username field
* Password field
* Login button
* BK title

## Source Code

```java
import javax.swing.*;
import java.awt.*;

public class BankingLoginForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Banking System");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(70,100,140));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8,8,8,8);

        JLabel title =
            new JLabel("Bank of Kigali (BK)");

        JTextField username =
            new JTextField(15);

        JPasswordField password =
            new JPasswordField(15);

        JButton login =
            new JButton("Login");

        frame.add(panel);
        frame.setVisible(true);
    }
}
```

## Components Used

| Component      | Purpose        |
| -------------- | -------------- |
| JFrame         | Main Window    |
| JPanel         | Container      |
| JLabel         | Text Display   |
| JTextField     | Username Input |
| JPasswordField | Password Input |
| JButton        | Login Action   |

---

# 2. JSP Date and Time

## Objective

Display current date and time using JSP.

## Source Code

```jsp
<%@ page language="java" %>

<html>
<body>

<h2>Hello JSP</h2>

<%
java.util.Date now =
    new java.util.Date();
%>

<h2>Now is <%= now %></h2>

</body>
</html>
```

## Output

```text
Hello JSP

Now is Wed Jun 11 14:20:30 CAT 2025
```

---

# 3. Servlet Sum and Product Calculator

## Objective

Accept two numbers and calculate:

* Sum
* Product

## Source Code

```java
package calculator_servelet;

import java.io.*;
import javax.servlet.http.*;

public class add_numbers_cmts
extends HttpServlet {

    public void service(
        HttpServletRequest request,
        HttpServletResponse response)
        throws IOException {

        int num1 =
            Integer.parseInt(
            request.getParameter("num1"));

        int num2 =
            Integer.parseInt(
            request.getParameter("num2"));

        int sum =
            num1 + num2;

        int product =
            num1 * num2;

        PrintWriter output =
            response.getWriter();

        output.println(
            "The Answer: " + sum);

        output.println(
            "The Product: " + product);
    }
}
```

---

# 4. Hello World Servlet

## Objective

Create a basic servlet that returns an HTML page.

## Source Code

```java
@WebServlet("/hello")
public class HelloServlet
extends HttpServlet {

    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response)
        throws IOException {

        response.setContentType(
            "text/html");

        PrintWriter out =
            response.getWriter();

        out.println("<h1>Hello World</h1>");
        out.println(
        "<p>This is my first Servlet</p>");
    }
}
```

## Output

```html
Hello World

This is my first Servlet
```

---

# 5. University of Kigali Registration System

## Objective

Create a complete student registration system using:

* Java Swing
* JDBC
* MySQL

## Features

✅ Full Name

✅ Gender

✅ Password Validation

✅ Date of Birth

✅ Mobile Number

✅ Email Validation

✅ Province Selection

✅ Nationality

✅ Database Storage

## Main Class

```java
public class Uk_form
extends JFrame {

    private JTextField txtFullName;
    private JTextField txtMobile;
    private JTextField txtEmail;

    private JPasswordField txtPassword;
    private JPasswordField txtConfirmPassword;

    private JButton btnSubmit;
    private JButton btnClear;
}
```

## JDBC Connection

```java
private static final String DB_URL =
"jdbc:mysql://localhost:3306/Uk_form_database";

private static final String DB_USER =
"root";

private static final String DB_PASS =
"";
```

## Insert Query

```java
String sql =
"INSERT INTO students " +
"(full_name, gender, password, " +
"date_of_birth, mobile_number, " +
"email_address, area, province, nationality)" +
" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
```

---

# 6. MySQL Database Script

## Create Database

```sql
CREATE DATABASE IF NOT EXISTS
Uk_form_database;
```

## Use Database

```sql
USE Uk_form_database;
```

## Create Table

```sql
CREATE TABLE students(

student_id INT AUTO_INCREMENT,

full_name VARCHAR(150),

gender VARCHAR(10),

password VARCHAR(255),

date_of_birth DATE,

mobile_number VARCHAR(15),

email_address VARCHAR(150),

area VARCHAR(100),

province VARCHAR(100),

nationality VARCHAR(100),

registered_at TIMESTAMP
DEFAULT CURRENT_TIMESTAMP,

PRIMARY KEY(student_id)

);
```

---

# 7. JDBC Delete Example

## SQL Statement

```sql
DELETE FROM employs
WHERE firstname='Alice';
```

## Java Code

```java
Statement stmt =
conn.createStatement();

int rowsEffected =
stmt.executeUpdate(strSQL);

System.out.println(
rowsEffected +
" rows effected");
```

---

# 8. JDBC Update Example

## SQL Statement

```sql
UPDATE employs
SET location='Kigali'
WHERE Identification='1';
```

## Java Code

```java
Statement stmt =
conn.createStatement();

int rowsEffected =
stmt.executeUpdate(strSQL);
```

---

# 9. Reading & Writing Streams

## Reading from Socket

```java
BufferedReader in =
new BufferedReader(
new InputStreamReader(
socket.getInputStream()));

String message =
in.readLine();
```

## Writing to Socket

```java
PrintWriter out =
new PrintWriter(
socket.getOutputStream(),
true);

out.println(
"Hello Server!");
```

---

# 10. Socket API Explanation

## Server Side

```text
socket()
   ↓
bind()
   ↓
listen()
   ↓
accept()
```

## Client Side

```text
socket()
   ↓
connect()
```

## Communication

```text
Client → write()

Server → read()

Server → write()

Client → read()
```

## Closing

```text
close()
```

---

# 11. Tasks of Java Socket Programming

### 1. Establish Connections

```java
Socket socket =
new Socket(host, port);
```

### 2. Exchange Data

```java
InputStream
OutputStream
```

### 3. Build Protocols

Examples:

* HTTP
* FTP
* SMTP
* Custom Protocols

### 4. Handle Multiple Clients

```java
while(true){

Socket client =
server.accept();

new Thread(
    () -> {
    }
).start();

}
```

### 5. Manage Resources

```java
socket.close();
```

---

# 12. Server Connection Requirements

Before a client connects, it must know:

## IP Address

Example:

```text
192.168.1.10
```

or

```text
www.example.com
```

## Port Number

Example:

```text
8080
```

Port Range:

```text
0 - 65535
```

## Connection Example

```java
Socket socket =
new Socket(
"192.168.1.10",
8080);
```

| Parameter    | Meaning           |
| ------------ | ----------------- |
| 192.168.1.10 | Server IP Address |
| 8080         | Server Port       |

---

# 📚 Summary

This README contains practical examples of:

* Java Swing GUI Development
* JSP Pages
* Java Servlets
* JDBC Connectivity
* MySQL Database Operations
* CRUD Operations
* Socket Programming
* Client-Server Communication
* Stream Handling

---

**Author:** Advanced Java Programming Notes
