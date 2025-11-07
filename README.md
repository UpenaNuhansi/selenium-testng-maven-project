# 🧪 Selenium TestNG Maven Project

A complete **automation testing project** built using **Selenium WebDriver**, **TestNG**, and **Maven** in **IntelliJ IDEA**.  
This project demonstrates practical hands-on testing of various web components such as **buttons, dropdowns, links, checkboxes, and text boxes** — using structured test cases with TestNG annotations.

---

## 🚀 Project Overview

This project was created to learn and practice **Web UI Automation Testing** using Selenium with Java.  
It automates interactions with real web pages, performs validations, and outputs results using assertions and console logs.

The project is organized as a **Maven project** for easy dependency management and **TestNG** for test execution and reporting.

---

## 🧰 Tools & Technologies Used

| Tool / Library | Purpose |
|-----------------|----------|
| **Java** | Main programming language |
| **Selenium WebDriver** | Web automation framework |
| **TestNG** | Test management and execution framework |
| **Maven** | Build and dependency management |
| **IntelliJ IDEA** | IDE used for development |
| **Git & GitHub** | Version control and code hosting |

---

## 🧩 Project Structure

```
selenium-testng-maven-project/
│
├── src/
│ ├── main/java/ # Application logic (if any)
│ └── test/java/ # Test classes
│ ├── ButtonExample.java
│ ├── DropdownExample.java
│ ├── LinkExample.java
│ ├── OpenGoogleTest.java
│ ├── Rdio_CheckBox_Example.java
│ └── TextBoxExample.java
│
├── pom.xml # Maven dependencies
├── .gitignore
└── README.md
```

---

## ⚙️ Test Scenarios

Each test class targets a specific web UI component:

| Test Class | Description |
|-------------|-------------|
| **ButtonExample.java** | Clicks and validates button states and actions |
| **DropdownExample.java** | Selects and verifies dropdown values using `Select` class |
| **LinkExample.java** | Automates clicking on web links and checking redirections |
| **OpenGoogleTest.java** | Opens Google page and verifies title/search bar |
| **Rdio_CheckBox_Example.java** | Selects multiple checkboxes, validates selection status |
| **TextBoxExample.java** | Enters and clears text fields, validates input results |

---

## 🧠 Selenium Methods & Features Used

Some of the key Selenium concepts and methods applied:

| Category | Example Methods / Features |
|-----------|----------------------------|
| **Browser Actions** | `driver.get()`, `driver.navigate()`, `driver.quit()` |
| **Element Locators** | `By.id()`, `By.name()`, `By.xpath()`, `By.cssSelector()` |
| **WebElement Methods** | `click()`, `sendKeys()`, `getText()`, `isDisplayed()`, `isEnabled()`, `isSelected()` |
| **Dropdown Handling** | `Select select = new Select(element)`, `selectByVisibleText()`, `getOptions()` |
| **Waits** | `Thread.sleep()`, `WebDriverWait`, `ExpectedConditions` (optional for complex flows) |
| **Assertions (TestNG)** | `Assert.assertEquals()`, `Assert.assertTrue()` |
| **Loops & Lists** | Used `List<WebElement>` to iterate over elements like checkboxes and links |

---

## 🧪 How to Run the Tests

### 🛠️ Prerequisites
- Java 8 or later  
- Maven installed (`mvn -v` to verify)
- Chrome or preferred browser installed

### ▶️ Run Using IntelliJ
1. Open project in IntelliJ  
2. Right-click on the test class (e.g., `Rdio_CheckBox_Example.java`)  
3. Select **Run 'CheckBoxTest()'**

### ▶️ Run Using Command Line
```bash
mvn test
```
This will execute all TestNG test cases and show results in the console.

---

## 📊 Example Output (Console Log)

```
CheckBox 1 selected status is: false
CheckBox 2 selected status is: true
CheckBox 3 selected status is: true
CheckBox 4 selected status is: false
```
All executed test results are displayed in IntelliJ’s Run window or terminal.

---

## 🌱 Learning Outcomes

- Through this project, I practiced:
- Writing Selenium test scripts using Java
- Using TestNG annotations like @Test, @BeforeTest, @AfterTest
- Managing dependencies with Maven
- Validating UI elements dynamically
- Handling multiple web elements using loops and lists
- Understanding real QA automation workflows

---

## 💡 Future Improvements

- Add page object model (POM) structure for better scalability
- Integrate with Jenkins CI/CD for automated test runs
- Generate HTML test reports using TestNG or ExtentReports
- Include cross-browser testing (Firefox, Edge, etc.)

---

## 👩‍💻 Author

 Upena Nuhansi Samaranayake

🎓 Undergraduate at Sabaragamuwa University of Sri Lanka

💼 Aspiring QA Engineer | Passionate about Test Automation

🔗 [LinkedIn Profile](https://www.linkedin.com/in/upena-nuhansi-2a8bba234/) | [GitHub](https://github.com/UpenaNuhansi)

---
