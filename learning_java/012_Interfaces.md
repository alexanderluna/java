# Interfaces

An interface allows ust o define what a class must do without actually
carrying about the implementation. We saw something similar with abstract
classes and methods but unterfaces take this concept even further.

An interface declares methods but not their implementation. Any class can
implement any number of interfaces (unlike class inheritance) by implementing
the methods in the interface.

> Starting with JDK8, interfaces can create a default implementation for
> methods.

```java
public interface IHouse {
  int getArea();
  void sell();
  void paint();
}
```

Interface methods are implicitly public and variables are public, static and
final thus constants. To implement an interface we use the **implement**
keyword. More interfaces are comma separated.

```java
class Villa extends House implements IHouse {}
```

We can declare a reference variable of an interface type. The reference variable
refers to the object that implements the interface.

A variable in an interface is a constant as we saw. This helps us define a
shared set of constants in our classes.

```java
interface IPoints {
  int MIN = 0;
  int MAX = 100;
  int DAMAGE = 5;
}
```

It is also possible for one interface to inherit from another interface through
the **extends** keyword like classes.
As mentioned earlier, interfaces can have a default implementation through the
default keyword.

```java
interface IPoints {
  default int getDamagePoints() {
    return 5;
  }
}
```

> Starting in JDK8, interfaces can have static methods.

You call static methods directly on the interface rather than through an object
that implements the interface.

```java
interface IPoints {
  static int getDamage() {
    return 5;
  }
}

IPoints.getDamage()
```

However, static methods are not inherited by either an implementing class or a
subinterface. Furthermore, JDK9 supports private methods as well.
