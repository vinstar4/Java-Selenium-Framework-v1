# Selenium Automation Framework (Java) – README

## Overview

A Selenium framework using Page Object Model (POM) with TestNG, Maven, Excel-driven data, and logging.

---

## Structure

```text
src/test/java
 ├── pageObjects      → Page classes + BasePage
 ├── testBase         → BaseClass (setup/teardown)
 ├── testCases        → Test scripts
 ├── utilities        → Excel, DataProviders, Reports
 └── resources        → config.properties, log4j2.xml

logs/
pom.xml
master3.xml
```

---

## Key Components

* BasePage → Holds driver and initializes elements
* PageObjects → UI actions (extend BasePage)
* BaseClass → setup (@BeforeClass), teardown (@AfterClass)
* TestCases → test logic and assertions
* Utilities → Excel data, DataProvider, reporting
* Resources → configuration and logging

---

## Config

`config.properties` contains:

* URL
* credentials
* environment data

---

## Execution

Using Maven:

```bash
mvn test
```

Using TestNG:
Run `master3.xml`

---

## Flow

```text
pom.xml → master3.xml → BaseClass → TestCases → PageObjects → Assertions
```

