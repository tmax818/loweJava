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

#### Objects have state

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

1. an object's class must be **loaded**. The runtime locates the `.class` file and reads it into memory. It then looks for **static initializers**.
2. an object is created when you use the `new` keyword. 
3. the object lives its life.
4. the object is **garbage collected**

## Working with related classes

>The real power of oop lies in its ability to create classes that describe closely related objects.

## Inheritance

lets you use one class as the basis for another.

## Interfaces

- a set of methods and fields that a class must provide to implement the interface.

- interfaces are closely related to inheritance except:
  - interface doesn't provide code, it is just a set of methods and field signatures
  - a class can implement as many interfaces as needed.

## Designing a program with objects

- an oop program is a group of objects that work together to get a job done.
- most important part is designing the classes used to create objects.
  
>The basic idea is to break a large problem into a set of classes, each of which is manageable in size and complexity.

steps:

1. decide what classes the app requires
2. what are the public interfaces of those classes

- a common approach in oop design is to divide the app into **layers** or **teirs** that provide distinct functions.

- presentation: objects in this layer handle interaction with users.
- logic: core objects of the application. business entities (i.e. customers, products, orders) this layer's aka **business rules layer** it is responsible for carrying out the rules that govern the application.
- database: objects in this layer interact with data storage.

## Diagramming class4es with UML

- **class diagrams**
- UML(unified modeling language)