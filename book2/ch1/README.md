# Chapter 1: Java Programming Basics

## Looking at the venerable 'Hello, World!' program

[listing 1-1](../code/Listing%201-1/HelloApp.java)

```java
public class HelloApp
{
    public static void main(String[] args)
    {
        System.out.println("Hello, World!");
    }
}
```

## Dealing with keywords

![](./../../keywords.png)

## Working with statements

>Java uses statements to build programs. Java doesn't use statements as its fundamental unit of code. Instead, it gives that honor to the class.

### types of statements


#### declaration statements
    - create variables to store data

```java
int i;
String name;
```

#### assignment statements
    - assigns a value to a variable

```java
i = 42;
name = "The answer";
```

#### expression statement
    - performs calculations or other operations




### white space

## Working with [block]s

- a [block] itself is a type of statement



## Creating [identifier]s

[identifier]s are most commonly used for the following:
- classes
- methods
- variable
- parameters

## Crafting [comment]s

### end-of-line comments
### traditional comments
### JavaDoc comments

- see [book 3, chapter 8](../../book3/ch8/README.md)

## Introducing object-oriented-programming

## Importing Java API classes

- Java organizes classes into *packages*


[behavior]: actions that an object can perform

[block]: a group of one or more statements enclosed in braces

[class]: code that defines the behavior of an [object]

[commnet]: a bit of text that provides explanation of code

[identifier]: a word that you make up to refer to a Java programming element by name. aka [name]s

[object]: an entity that has both state and behavior

[name]: see [identifier]