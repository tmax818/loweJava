# Chapter 8: Handling Exceptions

>This chapter is about what happens when Java encounters an error situation that it can't deal with. ... Java handles errors by using special *exception objects* that are created when an error occurs.


## Understanding exceptions

exception  
: an object that's created when an error occurs in a Java program and Java can't automatically fix the error.
: the cause of the error is indicated by the name of the exception

- here are some typical exceptions
  - `IllegalArgumentException` incorrect argument passed to a method
  - `InputMismatchException` console input doesn't match the data type expected by a method of the `Scanner` class 
  - `ArithmeticException` illegal type of arithmetic operation ie dividing by zero
  - `IOException` pretty self explanatory.
  - `ClassNotFoundException` same

- Java *throws* an exception
- Java programs can *catch* exceptions
- two types of exception:
  - checked - exception the compiler requires you to provide for it one way or another. else the program won't compile
  - unchecked - exception you can provide for, but don't have to.

### witnessing an exception

- [GuessingGameMethod.java](./GuessingGameMethod.java)


## Catching exceptions

```java

try {
  statements that can throw an exception
}
catch (exception-type identifier)
{
  statements executed when exception is thrown
}
```

- you can code more than one `catch block`

### a simple example

- [DivideByZero](./DivideByZero.java)

### another example

- [GetInteger](./GetInteger.java)

## Handling exceptions with a preemptive strike

>The best way to handle exceptions, however, is to prevent them in the first place.

## Catching all exceptions at once

## Displaying the exception message

## Using the finally block

## Handling checked exceptions

## Throwing your own exceptions

- [MyException](./MyException.java)

## Using the try-with-resources statement

- reference to bonus chapters 