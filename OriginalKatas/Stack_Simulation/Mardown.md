# Stack Simulation with an Integer

## Motivation

This kata was designed to make you find ways to simulate the behaviour of a Stack by using primitive data type (i.e. an Integer) and abusing the function call Stack.

## Description

You are tasked with completing the following `Stack` class. This class has 2 attributes:
```java 
private int stack; // The Integer we are using to store data.
private int base;  // Represents the different types of data that can be pushed onto the stack.
                   // To Understand this, imagine a map where each key has a corresponding value. 
                   // <base> represents the different values that a key can have, in the interval [0, base - 1]
```

To complete the object you must implement the following:

- Constructor: Receives an argument of type `int`, which represents the base of the stack. It must initialize the attributes of the class.
- isEmpty(): Must return `true` if the Stack object contains no elements. Returns `false` otherwise.
- push(): Receives an argument of type `int`. This method must push this element onto the Stack. It returns `true` if the operation is completed successfully, and `false` if it can't push an element onto the Stack. It won't be able to `push` whenever the Stack is full or when the argument is greater than the base.
- peek(): Returns the top-most element of the Stack, without removing it.
- pop(): Returns the top-most element and removes it from the Stack.

## Limitations

You are not allowed to use any non-primitive data Structure. This include actual Stacks, Queues, Lists, arrays, Strings, Sets, Maps, or any other structure that allows you to directly store several elements.

## Testing

The Tester will check several parts of the code. First, it will make sure you are not using imports or arrays to try to prevent cheating. It will also check the methods. Then it will check that the Stack is working by using it to solve a problem. Only if all of these requirements are met, will the solution be valid.