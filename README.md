

#  Smart Grocery List Manager (JavaFX)

##  Overview

Smart Grocery List Manager is a Java-based desktop application built using JavaFX. It helps users efficiently manage grocery shopping in shared environments such as hostels, apartments, or families by organizing items, assigning responsibilities, and tracking costs.

---

##  Problem

Managing groceries in shared living spaces is often unorganized. People forget items, duplicate purchases, and lack coordination. There is also no simple way to track responsibilities or maintain a persistent list.

---

##  Solution

This application provides a centralized system where users can:

* Add grocery items
* Assign responsibility using a claiming system
* View and manage items
* Save and load grocery lists

---

##  Features

*  Add grocery items with cost
*  Claim items (assign responsibility)
*  View all items in a list
*  Save grocery list to file
*  Load saved grocery list
* \ Simple and interactive JavaFX GUI

---

## \ Concepts Used

* Object-Oriented Programming (OOP)
* Java Collections (ArrayList, synchronizedList)
* File Handling (Serialization)
* JavaFX (GUI Development)
* Exception Handling

---

##  Project Structure

```
SmartGroceryManager/
├── src/app/
│   ├── Main.java
│   ├── model/
│   │   ├── GroceryItem.java
│   │   └── GroceryList.java
│   ├── service/
│   │   └── FileService.java
│   └── ui/
│       └── MainUI.java
├── data/
├── lib/ (JavaFX SDK - not included in repo)
├── README.md
```

---

##  Setup & Installation

### 1️ Install Java

Make sure JDK 21 or higher is installed:

```
java -version
```

---

### 2️ Download JavaFX SDK

Download JavaFX and extract it into:

```
lib/javafx-sdk-21/
```

---

### 3️ Compile the Project

```
javac --module-path lib/javafx-sdk-21/lib --add-modules javafx.controls,javafx.fxml -d bin src/app/Main.java
```

---

### 4️ Run the Application

```
java --module-path lib/javafx-sdk-21/lib --add-modules javafx.controls,javafx.fxml -cp bin app.Main
```

---

##  Application Output

The application opens a JavaFX window where users can:

* Add items
* Claim items
* Save and load grocery lists


-
##  Learning Outcomes

* Applying OOP concepts in a real-world project
* Building GUI applications using JavaFX
* Implementing file persistence using serialization
* Managing projects using Git and GitHub

---

##  Challenges Faced

* Setting up JavaFX environment
* Connecting UI with backend logic
* Handling file input/output correctly
* Managing large files in version control

---

##  Future Enhancements

* Multi-user support
* Improved UI/UX design
* Total cost calculation
* Export data to CSV
* Cloud-based storage

---

##  Author

**Siya Sanjit Sawant Dessai**
