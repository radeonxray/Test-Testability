# Test-Testability
Assignment 3 for the Test course - Testability

Assignment:https://github.com/datsoftlyngby/soft2019spring-test/blob/master/Assignments/03%20Testability%20assignment.pdf 

Slides: https://github.com/datsoftlyngby/soft2019spring-test/blob/master/Slides/03%20Testability.pdf

https://github.com/datsoftlyngby/soft2019spring-test/blob/master/Slides/03%20Test%20Design%20Techniques.pdf 

---- 
## Assignment

- Write a program where you illustrate what non-testable code could look like. Make sure to include
some code smells that you can refactor away later.
- Static analysis:
  - Use a tool to automatically check for code smells, e.g. CheckStyle and FindBugs for Java. You can
use JaCoCo to calculate Cyclomatic Complexity. Document the result.
- Rewrite the program with testability in mind and write automated unit tests for the program.
In the transformation of the code structure, you can get inspiration from Martin Fowler’s refactory
pattern catalogue1
, e.g.
https://refactoring.com/catalog/extractFunction.html
https://refactoring.com/catalog/removeDeadCode.html
https://refactoring.com/catalog/inlineVariable.html
https://refactoring.com/catalog/introduceParameterObject.html
https://refactoring.com/catalog/replaceConstructorWithFactoryFunction.html
https://refactoring.com/catalog/replaceExceptionWithPrecheck.html
- Static analysis - again:
Use the same tool(s) as in 2) to automatically check your code again. Document the result
