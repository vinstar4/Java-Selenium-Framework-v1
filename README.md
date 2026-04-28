# Selenium Automation Framework (Java) – README

## Overview

A Selenium framework using Page Object Model (POM) with TestNG, Maven, Excel-driven data, and logging.

---

## Structure

```text id="y7sq3v"
src/test/java
 ├── pageObjects      → Page classes + BasePage
 ├── testBase         → BaseClass (setup/teardown)
 ├── testCases        → Test scripts
 ├── utilities        → Excel, DataProviders, Reports

src/test/resources
 └── resources        → config.properties, log4j2.xml

logs/
reports/              → Extent Reports
pom.xml
master3.xml
```

---

## Key Components

* BasePage → Holds driver and initializes elements
* PageObjects → UI actions (extend BasePage)
* BaseClass → setup (@BeforeClass), teardown (@AfterClass)
* TestCases → test logic and assertions
* Utilities → Excel data, DataProvider, Extent Reports
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

```bash id="qif0kr"
mvn test
```

Using TestNG:
Run `master3.xml`

---

## Flow

```text id="ehfc47"
pom.xml → master3.xml → BaseClass → TestCases → PageObjects → Assertions
```

---
