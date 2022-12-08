# Chapter 1: Java Programming Basics

## Looking at the infamous Hello, World! Program

- [HelloApp](HelloApp.java)

## Dealing with Keywords

keyword
: a word that has a special meaning defined by the Java programming language.
: Java has 53 keywords
: keywords are case-sensitive


## Working with Statements

>Like most programming languages, Java uses statements to build programs. Unlike most programming languages, Java doesn't use statements as its fundamental unit of code. Instead, it gives that honor to the class.

### Types of statements

declaration statements[^a]
: create variables that can store data.

assignment statements
: assigns a value to a variable

```java
int i;
String name;
```

### White space

white space
: one or more consecutive space characters, tab characters or line breaks.

## Working with Blocks

block
: a group of one or more statements that are enclosed in braces.
: a type of statement

## Creating Identifiers



## Introducing Object-Oriented Programming

### Understanding classes and objects

class
: code that defines the behavior of a Java programming element called an object

object
: an entity that has both state and behavior
: an instance of a class
state
: any data the object might keep track of

behavior
: actions that the object can perform.
: represented by methods

>The difference between a class and an object is similar to the difference between a blueprint and a house.


### Understanding static methods

`static`
: keyword in Java
: static methods are called from classes not from objects.

### Creating an object from a class

```java
ClassName variableName = new ClassName();
```

- Why do you use the `ClassName` twice?
  - the first is the *type* for the variable.
  - the second creates an object from the class.

- the statement above does three things:
  - creates a variable named `variableName`
  - creates a new object in memory 
  - assigns the new object to the variable

---

[^a]: [glossary](glossary.md)