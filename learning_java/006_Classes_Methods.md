# Classes

The general form of a class

```java
class ClassName {

 type var_name;

 ClassName(String initial_value) {
   var_name = initial_value;
 }
 return_type method_name(type paramaters) {
   // body
 }
}
```

The ClassName inside the ClassName class is a constructor which takes any
arguments to initialize its values such as name in this case. In order to create
an instance of the vehicle Class we create a new object:

```java
Vehicle my_car = new Vehicle();
Person me = new Person("Alexander");
```

> Java's Garbage Collection system reclaims objects automatically. It does this
> by freeing that have no current reference. Generally the Garbage Collector
> will run if there are object to reclaim or if there is a lack of space.

Finally all classes get an implicit first argument called **this** which holds
a reference to the current objects. This becomes useful when you want the name
of a parameter to be the same as the instance variable:

```java
class Person {
  String name;
  Person(String name) {
    this.name = name;
  }
}
```

## finalize()

Given that objects can be garbage collected at any point in time, we can do some
cleanup before they are removed by using the **finalize()** method.

- [Classes](/learning_java/_code_examples/017_classes)
- [Garbage Collector](/learning_java/_code_examples/018_garbage_collector)

## Methods

A methods and functionality to a class and follows this structure:

```java
return_type method_name(type paramaters) {
 // body
}
```

> If the your method doesn't return anything you have to specify so by using
> void.

## Access Modifiers

Classes allow us to restrict access through access modifiers.

- public: any code can access it (default)
- private: only memebers of the class can access it
- protected

```java
private String secretMessage;
public String hello;
String hello; # same as public
```

## Arguments

Arguments in Java can get passed by value and by reference:

- primitive types: by value
- objects: by reference

> if you pass an object keep in mind you will alter the object outside your
> function as well when you make changes to it.

A funtion can return any data type including objects. If a function creates an
objectsand reutns it, that objects will not be garbage collected until it's
reference disappears. Thus although the function that created it terminated the
object won't be destroyed.

## Method and Construct Overloading

Two or more methods can share the same name in a class as long as their
signature is different.

> A different return type is not enough to overload a method

Constructs can also be overloaded allowing us to initialize object with
different parameters.

## Static

The static keyword allows us to create a member that can be accessed by itself.
This means we don't have to create an object but call the member on the class
itself. This applies to methods and variables. Thus, static variables are
essentially glocal variables.

> Static methods can only call static methods in their code. They can only
> access static variables and they can't use the **this** reference.

Java allows us to create a static block which is executed when the class is
first loaded and executed before it can be used for anything else.

```java
class Home {
  static {
    # connecto to an API first
  }
}
```

## Nested Classes

In java we can declare nested classes. A nested class's scope is bound to the
outer class. Nested classes can be static and non-static. The non-static classes
are called inner classes. An inner class has access to all the variables and
methods of its outer class. An inner class can be used to provide a set of
services used only by the outer class. It is also possible to create an inner
class without a name. This is called an anonymous inner class.

## VARARGS

Functions in java can recive a variable length of arguments thanks to VARARGS.

```java
void takeALotOfArguments(int ... lotsOfArgs)
```

The (...) is what makes the argument a vararg. A vararg is passed to a method
as an array. This also means the metho can be called without any arguments.
When declaring a metho with various arguments, the vararg has to go last. Just
like other methods you can overload varargs as well.

```java
void randomNumbers(int ... numbers)
void randomNumbers(double ... numbers)
void randomNumbers(int first, int ... numbers)
```

> Keep in mind that overloading varargs methods can result in ambigous errors.
