
 MTTPP - Selenium Test on webshop
=================================================
This framework was created for college coursework. It helps to test webshop with Selenium WebDriver. 

[Selenium](https://selenium.dev/)
-----
Free open source automated testing suite for web applications across different browsers and platforms.

[Selenium WebDriver](https://selenium.dev/projects/) 
-----
An API that allows to write automated tests for web applications. Selenium WebDriver automated tests are run by using a web browser. 
Selenium WebDriver helps to verify that application is working as expected when it is used by a real user. Through a simple setup, 
WebDriver can be used with all major browsers. Automate real user interactions in Firefox, Safari, Edge, Chrome, Internet Explorer 
and more! Selenium WebDriver refers to both the language bindings and the implementations of the individual browser controlling code. 
This is commonly referred to as just WebDriver. This framework allows the user [cross browser testing](https://www.softwaretestinghelp.com/how-is-cross-browser-testing-performed).

[TestNG](https://testng.org/doc/)
-----
Testing framework inspired from JUnit and NUnit with functionalities :

- Annotations.
- Run your tests in arbitrarily big thread pools with various policies available (all methods in their own thread, one thread per test class, etc...).
- Test that your code is multithread safe.
- Flexible test configuration.
- Support for data-driven testing (with @DataProvider).
- Support for parameters.
- Powerful execution model (no more TestSuite).
- Supported by a variety of tools and plug-ins (Eclipse, IDEA, Maven, etc...).
- Embeds BeanShell for further flexibility.
- Default JDK functions for runtime and logging (no dependencies).
- Dependent methods for application server testing.

TestNG is designed to cover all categories of tests:  unit, functional, end-to-end, integration, etc...

WebDriverManager [![][Logo]][GitHub Repository]
-----
WebDriverManager allows to automate the management of the binary drivers (e.g. *chromedriver*, *geckodriver*, etc.) required by Selenium WebDriver.

[Page Object Model (POM)](https://qxf2.com/blog/page-object-model-selenium-python/)
-----
The framework was coded using the Page Object Model (POM) design pattern. Page Object Model is a design pattern that allows better performance and reduces duplicate code. One page object is a Java class that serves as an interface with a page in an application under test (AUT). Page class contains all web elements and methods for interacting with them.

![Photo was taken from Page Object Model (POM) | Design Pattern](https://qxf2.com/blog/wp-content/uploads/2015/06/Gmail_POM-1.jpg)

**The benefits of POM are:**
1. Readability - All tests and web elements are inside smaller classes which increase code readability.
2. Reusability - One page class can be used within one or more tests, which means that the developer does not have to write the same code multiple times.
3. Maintainability - Due to the modularity of the code, the developer can easily make a new update that will reflect on code that uses the updated class.

Installation
-----
1. [Install Java JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
2. [Install IntelliJ](https://www.jetbrains.com/idea/download/)
3. Download web driver (use web driver for the web browser you use!):

|Driver |URL |
|----------------|--------------------------------------------------------------|
|Chrome |https://chromedriver.chromium.org/downloads |
|Firefox |https://www.mozilla.org/hr/firefox/new/ |
4. Find testing webshop URL

Available tests
-----
For testing this framework I have used [Mikronis webshop](https://www.mikronis.hr/). If you want to change testing URL's edit Inputs classes.
 

| Class Name | Description |
|-----------------|-------------------------------------------------------------------------------------------------------------------------------------|
| RegistrationTest | Allows testing the registration of new accounts by completing a simple registration form without a captcha test. |
| LoginTest | Allows testing the logging of users into an existing webshop account by filling out the login form on the loginpage. |
| QueryTest | Allows testing searching particulr item on webshop. |
| AddToCartTest | Allows testing adding item into shopping cart. |
| RemoveFromCartTest | Allows testing removing item from shopping cart. |

References
-----
[LV 2 - Automatsko testiranje Web aplikacija (Frontend) - Selenium
Web Driver (FERIT)](https://www.ferit.unios.hr/studiji/sveucilisni-diplomski-studij/DRac1-06-18/38#anc)

[Page Object Model (POM)](https://qxf2.com/blog/page-object-model-selenium-python/)



[Logo]: http://bonigarcia.github.io/img/webdrivermanager.png
[GitHub Repository]: https://github.com/bonigarcia/webdrivermanager
