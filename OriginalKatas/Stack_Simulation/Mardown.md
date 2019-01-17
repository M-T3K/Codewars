# Simulating a Stack with a Primitive Data Type

## Motivation

This kata was designed to make you find ways to simulate a Stack using only primitive data types by abusing the function call Stack.

This kata is similar to other katas about balancing braces and/or parentheses. However, the objective of this kata is not to simply solve the problem but rather to find a different, more obscure way to do so, without using a Data Structure that is capable of directly storing more than one element.

## Description

You start with a class called `Balance`, which starts with the following method:
```java
//This method acts as an entry point, and you should use it to call on a method of your own creation.
public boolean isBalanced(String str);

// I also recommend the creation of the following:

// A peek() method to be used (if you want).
private static /*type*/ peek(/*stack*/, ...);

// A pop() method to be used (if you want).
private static /*type*/ pop(/*stack*/, ...);

// A push() method to be used (if you want).
private static /*type*/ push(/*stack*/, char ch, ...);

```

The idea is that you use the Call Stack in order to check if a String of Braces is balanced, with the following limitations:

**You may not** use any complex data ype as a way to store data. That means only primitive types are allowed. These include 'char' but not 'strings', arrays, or pointers.

**You may not** modify the original String, nor create new ones to help you in the algorithm.

**You may not** use Regular Expressions.

**You may** use the 'String.charAt(int)' method provided by the Java Language.

**You may** use the 'String.indexOf(char)' method provided by the Java Language.

**You may** pass the original String without modification to any method you want, as long as its contents aren't changed before, in, or after said method.

That's all.

Examples:
```java
Balance.isBalanced("asdasdasd") -> true;
Balance.isBalanced("[{]}") -> false;
Balance.isBalanced("[[[[[[[[[[[]][]]]]]]]]]]]") -> false;
Balance.isBalanced("[<<()>>]{[]}[{(<>())}]") -> true;
Balance.isBalanced("[<<>>(}})<)>{}{}I[]()b]") -> false;
```

