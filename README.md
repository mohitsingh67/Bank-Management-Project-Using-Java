# Bank-Management-Project-Using-Java
💳 Bank Management System – Java OOP Project
A terminal-based Bank Management System built using Java and Object-Oriented Programming (OOP) concepts. This project allows users to create bank accounts, deposit or withdraw money, apply interest, and check balances—all using basic Java in a single file.

🧠 Key Features
Create Savings or Checking bank accounts

Deposit and Withdraw money

Display current balance

Apply interest (only on Savings accounts)

Demonstrates all core OOP concepts in Java

📌 Functionalities
Functionality	Description
Create Account	Create a new Savings or Checking account
Deposit Money	Add funds to an account
Withdraw Money	Withdraw funds from an account
Display Balance	Show current account balance
Apply Interest	Apply 3% interest to Savings Accounts
Exit	Exit the system

🧱 OOP Concepts Used
Concept	Description	Applied In
Class & Object	Define structure and behavior	Account, SavingsAccount, CheckingAccount, BankOOP
Encapsulation	Protects data using private/protected members and public methods	Fields like balance, accountNumber
Inheritance	SavingsAccount and CheckingAccount extend Account	Code reuse and specific behavior
Polymorphism	Overriding applyInterest() method differently in subclasses	SavingsAccount, CheckingAccount

🧾 Project Structure
This is a single file project:


BankOOP.java
No external libraries or frameworks are used. Only basic Java is required.


🖥️ Output Screenshot
![image](https://github.com/user-attachments/assets/8e409793-dbbe-45c1-b5e1-327bec9e6637)



==== Bank Management System ====
1. Create Account
2. Deposit
3. Withdraw
4. Display Balance
5. Apply Interest
6. Exit
Enter choice: 1
Enter Account Number: 123
Enter Account Holder Name: Mohit
Enter Initial Balance: 1000
Enter Account Type (savings/checking): savings
Account created successfully.

(Replace with your own screenshot if you'd like)

⚙️ How to Setup & Run
🛠️ Prerequisites
Java installed (JDK 8 or higher)

Terminal/Command Prompt

🚀 Run the Program
bash
Copy code
javac BankOOP.java
java BankOOP
✅ Sample Test Flow
Create an account

Deposit some money

Withdraw some money

Display balance

Apply interest (only for savings)

🏁 Conclusion
This Bank Management System is a basic but complete demonstration of how OOP principles can be applied in real-world problems using Java. It is beginner-friendly 
