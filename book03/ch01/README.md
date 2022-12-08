# Chapter 1: Understanding Object-Oriented Programming

## What is Object-Oriented Programming?

object-oriented programming
: a type of programming based on the premise that all programs are essentially computer-based simulations of real-world objects or abstract concepts.

|language|paradigm|
|---|---|
|C|computerized implementations of actual step-by-step procedures|
|LISP| programing problems are different ways of manipulating lists|
|SQL| programing problems are ways to manipulate mathematical sets|

- sometimes the simulation is better than the real thing.


### Understanding Objects

Basic characteristics of objects:
  - identity
  - type
  - state
  - behavior

#### Objects have identity

- every object is an *instance* of a class
- like type/token distinction
- invoices have numbers/ OOP objects have memory location

- Lowe says "there's no easy way to get the memory address of an object; Java figures it's none of your business." That doesn't seem to be the case.
- with objects the equality operator tests the identity of the two objects 
- objects have a *hash code* that may be what I am referring to above

#### Objects have type

- types are defined by classes 

```java
Invoice i = new Invoice();
```
makes sense because,
```java 
class Invoice {}
```
exists.

#### Objects have type

state
: the combination of the values for all the attributes of an object
: known as fields in Java

#### Objects have behavior

behavior
: things the object can do
: known as methods

interface
: the set of methods and fields (i.e. state and behavior) that the class makes public so that other objects can use
: not to be confused with Java interfaces

implementation
: the Java code that determines exactly how an object behaves. 
: this should be hidden.


## Understanding the Life Cycle of an Object