# Java-Selenium
# 🧪 Selenium Automation Project - DEMOQA

This is a Selenium WebDriver project built using Java in Eclipse IDE.  
The test scripts are written to automate various UI components of the [DEMOQA site](https://demoqa.com/) – a public web application designed for QA practice.

---

## 📌 Project Overview

- 🔍 **Website Under Test**: https://demoqa.com/
- 🧰 **Tools & Tech Stack**:
  - Java (Core Java, OOPs, Exception Handling)
  - Selenium WebDriver
  - TestNG (for assertions and test structure)
  - Eclipse IDE
  - Maven (if applicable)
  - ChromeDriver for browser automation

---

## 🎯 What I Automated

| Feature | Description |
|--------|-------------|
| Elements | Buttons, Text Boxes, Radio Buttons |
| Forms | Fill and submit forms |
| Alerts & Frames | Handling alerts, nested frames, modals |
| Browser Windows | Switching between tabs/windows |
| Widgets | Date Pickers, Accordions, Sliders |
| Interactions | Drag and Drop, Resize, Click-hold |

---

## 🛠 Folder Structure
DEMOQA-Automation/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/            # All Page Object classes (HomePage, LoginPage, etc.)
│   │       └── utils/            # Utility classes like ConfigReader, ExcelReader
│
│   └── test/
│       └── java/
│           └── tests/            # All your test cases (TestNG classes)
│           └── base/             # Base class (setup, teardown methods)
│
├── drivers/                      # Browser driver executables (like chromedriver.exe)
├── test-output/                  # TestNG results (auto-generated)
├── testng.xml                    # TestNG suite config file
├── pom.xml                       # Maven dependencies (if using Maven)
└── README.md                     # Project description


