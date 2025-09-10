# 🐾 Animal Shelter System

Java console application developed as a final project for Object-Oriented Programming (ООП).  
It simulates a registry system for an animal shelter, managing pets and pack animals.

---

## 📖 Project Overview
The system is designed around OOP principles with clear separation of concerns:

- **View (MenuView)** → Handles menu display, user input, and output messages.  
- **Controller (AnimalShelterController)** → Contains the program logic, coordinates service and view.  
- **Service (AnimalService)** → Manages adding animals, working with the counter, and (future) DB logic.  
- **Model (Animal, Dog, Cat, Horse, etc.)** → Defines animals and their characteristics.  

The project also includes a **Counter** class for tracking the total number of animals created.

---

## ✨ Features (current & planned)
- ➕ Add new animals to the registry  
- 📋 List available commands for each animal  
- 🎓 Train animals with new commands  
- 📅 View animals by birth date  
- 🧮 Count total animals in the system  
- 🗂️ Console menu navigation  

---

## 🛠️ Tech Stack
- **Java** (OOP principles, console-based UI)  
- **MySQL (planned)** for storing animal data  
- **Linux utilities** (cat, dpkg, directories) used in the broader coursework  

---

## 📂 Project Structure

/src
/controller
AnimalShelterController.java
/model
Animal.java
/packAnimals
Horse.java
/pets
Dog.java
Cat.java
/service
AnimalService.java
Counter.java
/view
MenuView.java
Main.java

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/YOUR-USERNAME/AnimalShelterSystem.git
   ```
2.	Open the project in your IDE (IntelliJ IDEA, Eclipse, VS Code, etc.).
3.	Run Main.java to start the console program.

⸻

📌 Notes
	•	This project was originally created as a final coursework assignment.
	•	Current version runs in the console; database integration and UI improvements are planned.
	•	UML class diagram available in the repository (diagram.png).

⸻

👩‍💻 Author
Veranika Lis
