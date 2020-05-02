# Auto boxing and Auto unboxing

Auto boxing and auto unboxing simplifies the code to convert primitive types to
objects. They are related to Java's type wrappers.

Java uses primitive types to avoid creating objects and gain performance. Type
wrappers allow us to pass a primitive and set an object representation of the
primitive.

```java
Integer iOb = new Integer.valueOf(10); // box value
int i = iOb.intValue(); // unbox value
```

> This process is manual and error prone. We can use auto boxing and auto
> unboxing instead

```java
Integer iOb = 100; // auto boxing
int i  = iOb; // auto unboxing
```

## Static Imports

They allow us to use methods without specifying the class itself.

```java
import static java.lang.Math.pow;
pow(2,2);

import static java.lang.Math.*;
Math.pow(2,2);
```

## Annotations

Java provides a feature that allows us to define supplemental information about
a source file called annotation.

```java
@interface MyAnnotation {
  String str();
  int val();
}
```

Java has build in annotations for general use.
