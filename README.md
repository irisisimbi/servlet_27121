\# 📘 Java Servlets Assignments



\*\*Student Name:\*\* Isimbi Mushimire Iris  

\*\*Student ID:\*\* 27121  

\*\*Course:\*\* Java Web Programming  

\*\*Technology:\*\* Java Servlets, Maven, Apache Tomcat  



---



\## 📌 Project Overview



This repository contains \*\*two Java Servlet assignments\*\* developed using \*\*Maven\*\* and deployed on \*\*Apache Tomcat\*\*.  

The assignments demonstrate understanding of:



\- HTML form handling  

\- Servlet request processing  

\- Conditional logic  

\- HTTP redirection  

\- Java web application structure  



---



\## 🗂 Project Structure



servlets\_assignment

│

├── pom.xml

└── src

└── main

├── java

│ └── com/iris/servlets

│ ├── LoginServlet.java

│ └── RedirectServlet.java

└── webapp

├── login.html

├── redirect.html

└── WEB-INF



---



\## 🧪 Assignment 1: Login Servlet



\### 🔹 Description

A login page that accepts:

\- \*\*Username\*\*

\- \*\*Password\*\*



The servlet processes the submitted data and validates the password length.



\### 🔹 Logic

\- If password length is \*\*less than 8 characters\*\*, the browser displays:



Hello <username>, your password is too short



\- If password length is \*\*8 or more characters\*\*, the browser displays:



Welcome <username>





\### 🔹 Files Involved

\- `login.html`

\- `LoginServlet.java`



\### 🔹 URL (after deployment on Tomcat)

http://localhost:8080/servlets\_assignment/login.html





---



\## 🔁 Assignment 2: Redirect Servlet



\### 🔹 Description

This assignment demonstrates \*\*HTTP redirection\*\* using a servlet.



\- A user accesses a page

\- The servlet redirects the user to another HTML page



\### 🔹 Files Involved

\- `redirect.html`

\- `RedirectServlet.java`



\### 🔹 URL (after deployment on Tomcat)

http://localhost:8080/servlets\_assignment/redirect.html





---



\## ⚙️ Technologies Used



\- Java (JDK 8)

\- Java Servlets API

\- Maven

\- Apache Tomcat 8.5

\- HTML



---



\## 🚀 How to Run the Project



1\. Clone the repository:

&nbsp;  ```bash

&nbsp;  git clone https://github.com/irisisimbi/servlet\_27121.git





---



\### ✅ Final steps (important)

After pasting the file:



```bash

git add README.md

git commit -m "Add README for servlet assignments"

git push origin servlet\_27121





