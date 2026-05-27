# 📚 Console-Based Library Management System

A Java-based console application designed to manage library operations efficiently using Object-Oriented Programming (OOP) concepts and file handling techniques.

This system allows librarians to:
- manage books
- register members
- borrow and return books
- maintain persistent records using text files

---

# 🚀 Features

## 📖 Book Management
- Add new books
- Remove books
- View all books
- Search books by title or author

## 👤 Member Management
- Register new library members
- Manage borrowed books

## 🔄 Borrow & Return System
- Borrow books with due dates
- Return borrowed books
- Track availability status

## 💾 File Handling
- Save books permanently in `books.txt`
- Save members permanently in `members.txt`
- Automatically load saved data when application starts

## 📊 Library Statistics
- Total books
- Available books
- Borrowed books
- Registered members

---

# 🛠 Technologies Used

| Technology | Purpose |
|---|---|
| Java | Core programming language |
| OOP Concepts | Encapsulation, classes, objects |
| ArrayList | Dynamic data storage |
| File Handling | Data persistence |
| VS Code | Development environment |
| Git & GitHub | Version control |

---

# 📂 Project Structure

```text
week3-library-system/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── library/
│       │       ├── Main.java
│       │       ├── Book.java
│       │       ├── Member.java
│       │       ├── Library.java
│       │       └── FileHandler.java
│       │
│       └── resources/
│
├── data/
│   ├── books.txt
│   └── members.txt
│
├── bin/
│
├── README.md
├── .gitignore
└── pom.xml
```

---

# ⚙️ System Workflow

1. User selects an option from the menu.
2. System processes the selected operation.
3. Data is stored using ArrayLists.
4. Updated information is saved into text files.
5. Saved records are loaded automatically on the next execution.

---

# 🧠 OOP Concepts Used

## Encapsulation
Private variables with public getter methods.

## Classes and Objects
- `Book`
- `Member`
- `Library`
- `FileHandler`

## Constructors
Used to initialize objects.

## Methods
Used for:
- adding books
- borrowing books
- searching books
- returning books

---

# ⚙ Algorithms and Data Structures

## Data Structures Used
- `ArrayList<Book>`
- `ArrayList<Member>`

## Algorithms Used

### Linear Search
Used for:
- finding books
- finding members
- searching by ISBN

### File Processing
Used:
- `BufferedReader`
- `BufferedWriter`

for reading and writing data files.

---

# ▶️ How to Run the Project

## Step 1: Compile

```bash
javac -d bin src/main/java/library/*.java
```

## Step 2: Run

```bash
java -cp bin library.Main
```

---

# 📸 Sample Menu

```text
=== LIBRARY MANAGEMENT SYSTEM ===

1. Add New Book
2. View All Books
3. Search Books
4. Register Member
5. Borrow Book
6. Return Book
7. View Library Statistics
8. Remove Book
9. Exit
```

---

# 💾 Data Persistence

The system stores data permanently using text files:

- `books.txt`
- `members.txt`

This ensures that data remains available even after the application closes.

---

# 🚀 Future Enhancements

- GUI-based version using JavaFX
- Database integration using MySQL
- Admin authentication system
- Reservation system
- Fine calculation system
- Email notifications

---

# 👩‍💻 Author

**Priyanka Solanki**

B.Tech Student | AI & Machine Learning Enthusiast

---