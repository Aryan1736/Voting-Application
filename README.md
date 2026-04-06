# 📊 Online Voting Application

A full-stack **Voting / Poll Application** built using **Spring Boot, Angular, and MySQL**.  
Users can create polls, view them, and vote on options with real-time updates.

---

## 🚀 Features

- 📝 Create polls with multiple options  
- 📊 View all available polls  
- 🗳️ Vote on poll options  
- 🔄 Live vote count updates  
- 💾 Data stored in MySQL database  
- 🔗 REST API integration  

---

## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- MySQL

### Frontend
- Angular
- Bootstrap
- HTTPClient

---

## 📂 Project Structure

```
Voting-Application/
│
├── src/                 # Spring Boot Backend
│
├── poll-app/            # Angular Frontend
│
├── pom.xml
└── README.md
```

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Voting-Application.git
cd Voting-Application
```

---

## 🔹 Backend Setup (Spring Boot)

### Configure MySQL

Edit `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/voting_app
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### Run Backend

```bash
mvn spring-boot:run
```

Backend runs at:
```
http://localhost:8080
```

---

## 🔹 Frontend Setup (Angular)

```bash
cd poll-app
npm install
ng serve
```

Frontend runs at:
```
http://localhost:4200
```

---

## 🔗 API Endpoints

| Method | Endpoint | Description |
|--------|---------|------------|
| GET | /api/polls | Get all polls |
| POST | /api/polls | Create poll |
| POST | /api/polls/vote | Vote on poll |

---

## 🌟 Future Improvements

- Authentication (Login/Register)  
- Charts for results  
- Deployment  
- Real-time updates  

---
uilt a full-stack Voting Application using Spring Boot, Angular, and MySQL with REST APIs and dynamic UI.
