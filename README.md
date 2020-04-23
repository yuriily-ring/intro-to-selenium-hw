# intro-to-selenium-hw

This is a homework for the Intro to Selenium

## IntelliJ IDEA project configuration
1. Clone this project to your local environment

    ```git clone https://github.com/kermek/jintro-to-selenium-hw.git```
2. Open in IntelliJ IDEA

    ```./gradlew openIdea```

3. Press `Ctrl+Alt+Shift+S` and check in your `Project Structure`
    value of `Project language level` is set to `8 - Lambdas, type annotations et.`.
4. Complete all TODO tasks.
5. Execute tests.

## Selenium assignment

`PlainLoginTest` is already implemented as a script.
You task is to refactor it with the PageObject, PageFactory, and FluentInterface patterns.
Boilerplate code for pages, steps, and tests also provided.
Complete all TODOs.

## Unit testing
There are number of different ways to run your unit tests, e.g.:
* In test class put your cursor on its definition, right click and choose `Run ...`
* Right click on a little green triangle near the class definition and choose `Run ...`
* In test class put your cursor on its definition and press `Ctrl+Shift+F10` (`Control+Shift+R`)
* Once you executed your test you could re-run it again by pressing `Shift+F10` (`Control+R`)
* from command line ```./gradlew clean test```