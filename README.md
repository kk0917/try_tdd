# TDD journey to read, write and master by using Scala lang

[Test Driven Development](https://www.ohmsha.co.jp/book/9784274217883/) written by @KentBeck translation by @twada

## Scala Dev Dependencies

* Scala
  * 2.13.1
* sbt
  * 1.3.8
* Java
  * 11.0.6
* nginx
  * 1.16.1


## Memo

### TDD Cycle and the effect
  
 1. Write a test
 2. Run all tests and confirm failing the new tests
 3. Do small change (impl small)
 4. Run all tests and confirm passing the new tests
 5. Do refactoring and remove the duplicates
  
Such the following surprises will be waiting
  
 * How (Unit)Test support the gradually increased feature
 * How the new test passes with the small and square changing
 * How tdd is ran test frequently
 * How you refactor with taking small steps
  