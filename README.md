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

### Detail

1. Write unit tests.
   Think that the codes imagined the process into your head.
   Now, you are writing the story. Let's try to create the interface you want.
   Into your story, let's try to includes the elements that seem necessary.
2. Run the tests.
   Reach the green bar of all tests.
   ```
   If (you can see the simple answer):
     let's write as it is.
   else if (you take many times to realize it):
     add it to todo list, and back to the work to turn the bar in front of you green quickly.
   ```
   The idea to move anyway, anything is fine, feel against the rules of excellent engineer
     and, for the especially engineer, it may be difficult to accept as aesthetic and values.
     Even if it, quick green remission the all guilt. But it is only a short time.
3. Getting it right.
   The system is finally ready to work, but I had used lots of dirty ways..
   Repentance it, through the right way, remove the duplicates had used,
   back to the green bar quickly.