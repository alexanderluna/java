# Inheritance

Java allows a class inherit from another class uing the extends keyword.

```java
class House {}
class Villa extends House {}
```

Inheritance allows the class that inherits to access all of it's parent's
attributes.

> You can only inherit from one class.

Access modifiers still apply. This means that private methods can not be
accesssed by the subclass.

If no constructor exists, the constructor of the subclass constructs the
subclass and the constructor of the superclass constructs the superclass.

```java
class Villa {
  Villa(string name) {
    super(name)
  }
}
```

## Super Keyword

The super keyword can also be used to access a super class's member. This is
usefull when a subclass uses the same name for members.

```java
class House {
  int size;
}

class Villa extends House {
  int size;

  int showSize() {
    return super.size;
  }
}
```

While Java doesn't allow us to inherit from multiple classes like C++ for
example. We can create hierarchies of inheritance.

> Note that the top most superclass's constructor is called first and so on.

## Overriding and Overloading methods

A reference variable of a superclass can be assigned a reference to an object
of any subclass derrived from the superclass.

A method in a subclass can override a method from a superclass if it has the
same name and signature. However, if the signature is just different, it won't
override the method but overload it instead.

> Method overriding forms the basics of one of Java's most powerful features:
> dynamic method dispatch.

Dynamic method dispatch is a mechanism by which a call to an overriding method
is resolved at runtime rather than compile time. This is how Java implements
runtime polymorphism.

## Abstract Classes

Java allows us to create classes that define only generalized classes that will
be shared by its subclasses. An abstract method can than be created without
any implementation. The subclass would have to implement it. An abstract
method has to use the abstract type modifier. A class must also be declared
with an abstract modifier.

```java
abstract class Home {
  abstract double area() {
    return 12.5;
  }
}
```

## Final

We can prevent a method from being overriden or a class from being inherited
by using hte final keyword.

```java
final int area(int squareMeter) {};
final class Home {}
final int squareMeter = 250;
```

> Object is the implicit superclass of all classes.
