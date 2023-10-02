# Chapter 2: Making Your Own Classes

## Declaring a class

### picking class names

```java

public class ClassName { class-body }

```

### knowing what goes in the class body

### seeing where classes live

- [Dice.java](./Dice.java)
- [DiceGame.java](./DiceGame.java)


## Working with members

members  
: fields and methods (classes and interfaces) defined in the class body.

### understanding fields

field  
: a variable that's defined in the body of a class outside the class's methods

## Using getters and setters

- creating classes with accessors rather than simple public fields offers several benefits:
    - you can create a read-only property by providing a `get` but no `set`
    - you can calculate a property each time the `get` method is called instead of storing it in a field
    - you can protect the class from bad data via validation in the `set` method

### [the accessor pattern](../../patterns/accessor/README.md)

## Overloading methods

method signature  
: method name and the number and type of its parameters

- two things are not part of the method's signature
  - the return type
  - names of the parameters
  - these two methods have the same signature:

```java
double someMethod(double x, boolean y);
double someMethod(double param1, boolean param2);
```

## Creating constructors

constructor  
: a block of code that's called when an instance of an object is created. 

- a constructor doesn't have a return type
- constructor name matches the class name
- constructors are not members of a class (inheritance)
- called by the `new` keyword
- there are reasons to make a private constructor



## Finding more uses for the `this` keyword

## Using initializers

## Using records

- the record feature was introduced in Java 14 as a preview. They were promoted to full-feature status with Java 16