# Complete Java Masterclass - Notes

## Questions

- Why byte is 2^7 not 2^8
  - first bit is -(x)*2^8, last is x*2^0
- Binary vs hexadecimal <<< learn
- Detailed difference between statement and expression
- Flashcards on
  - [coercion, conversion and casting](https://en.wikipedia.org/wiki/Type_conversion)
  - variable
  - constant
  - literal
  - repository

## Notes to elaborate (visualize) on paper

## Concurency

- Process == application (only 1 process per application)
  - process uses heap as it's data structure
- Thread - application has at least one (main thread) and can create new threads
  - thread uses stack as it's data structure
  - we can create new threads by:
    - instantiating classes that extend Thread class and running it's start() method (which starts code placed in overwritten run() method)
      - the same instance can't be started more than once
