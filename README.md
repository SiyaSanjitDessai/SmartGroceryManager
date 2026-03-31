
SMART GROCERY LIST MANAGER (JavaFX)

---

1. PROJECT OVERVIEW

The Smart Grocery List Manager is a Java-based desktop application developed using JavaFX. It is designed to help users efficiently manage grocery shopping in shared living environments such as hostels, apartments, or families.

The application allows users to create a shared grocery list, assign responsibility for items, and track costs. It solves common problems like duplicate purchases, forgotten items, and lack of coordination among users.

---

2. PROBLEM STATEMENT

In real-life scenarios, especially in shared accommodations, managing grocery shopping is often unorganized. People may forget to buy essential items, purchase duplicates, or fail to coordinate responsibilities. Additionally, tracking expenses becomes difficult without a structured system.

This project addresses these issues by providing a centralized and easy-to-use digital solution.

---

3. SOLUTION

The Smart Grocery List Manager provides a graphical interface where users can:

* Add grocery items along with their price
* View the list of items
* Claim responsibility for purchasing items
* Save and load the grocery list using file storage

This ensures better organization, accountability, and efficiency.

---

4. FEATURES

* Add grocery items with name and cost
* Claim items to indicate responsibility
* Display list of all items
* Save data using file handling
* Load previously saved data
* Simple and user-friendly JavaFX interface

---

5. TECHNOLOGIES USED

* Java (JDK 21 or higher)
* JavaFX (GUI framework)
* Java Collections (ArrayList)
* File Handling using Serialization
* VS Code (development environment)
* Git and GitHub for version control

---

6. PROJECT STRUCTURE

SmartGroceryManager/

src/app/

* Main.java (entry point)
* model/

  * GroceryItem.java
  * GroceryList.java
* service/

  * FileService.java
* ui/

  * MainUI.java

data/ (stores saved files)
lib/ (JavaFX SDK - not included in GitHub)

---

7. HOW TO RUN THE PROJECT

Step 1: Install Java (JDK 21 or higher)
Check installation using:
java -version

Step 2: Download JavaFX SDK and extract it into:
lib/javafx-sdk-21/

Step 3: Compile the project:
javac --module-path lib/javafx-sdk-21/lib --add-modules javafx.controls,javafx.fxml -d bin src/app/Main.java

Step 4: Run the project:
java --module-path lib/javafx-sdk-21/lib --add-modules javafx.controls,javafx.fxml -cp bin app.Main

---

8. OUTPUT

The application opens a JavaFX window where users can:

* Add grocery items
* Claim items
* Save and load the list

---

9. LEARNING OUTCOMES

* Understanding of Object-Oriented Programming concepts
* Practical use of Java Collections
* Implementation of file handling using serialization
* Building graphical user interfaces with JavaFX
* Using Git and GitHub for version control

---

10. CHALLENGES FACED

* Setting up JavaFX environment
* Handling file input/output operations
* Connecting UI with backend logic
* Managing large files in GitHub repository

---

11. FUTURE ENHANCEMENTS

* Add multi-user login system
* Improve UI design and styling
* Add total cost calculation
* Export data to CSV format
* Cloud-based data storage

---

12. AUTHOR

Siya Sanjit Sawant Dessai
24BHI10083



Just tell me 👍
