# Generics

A generic is a parameterized type. They enable us to create classes, interfaces
and methods in which the type of data they operate is specified as a parameter.

The advantage of generic code is that it will automatically work with the type
of data passed to its type parameter.

```java
class Gen<T> {};
```

We can use any identifier but **T** is traditional. It is recommended to use a
single character and capital letter. Generics only work with reference types. A
generic of one type is not compatible with a generic of a different type. It is
possible to declare more than one type paramtere in the generic type.

```java
class Gen<T,V> {};
```

Sometimes it is useful to limit the types that can be passed to a type
parameter. To handle this, java has bounded types. You can create an upper
bound by specifying the super class which the generic class extends.

```java
// create upper bound
class Pair<T, V extends T> {};

// ? represents an unknown type
boolean absEqual(NumericFunction<?> obj) {};

// upper bound a wildcard
static void test(Gen<? extends A> obj) {};

// lower bound a wildcard
static void test(Gen<? super A> obj) {};
```

The wildcard doesn't affect the type of generic objects that can be created.
This is determined by the extends clause. The wildcard simply matches any valid
generic object.

Methods in a generic class can make use of the type parameter and are also
automatically generic relative to the type parameter. Generic methods don't
need to be enclosed by a generic class. The type parameters are declared before
the return type of the method.

```java
static <T extends Comparable<T>, V extends T> boolean arrayEquals(T[] x, V[] y)
```

The constructor of a class can be generic as well even if the class itself
isn't generic.

```java
class Summation {
  <T extends Number> Summation(T args) {};
}

// generic interface
interface iShipping <T> {}
```

Generics allow us to build reliable and reusable code. Many algorithms are the
same no matter what type of data they are used on.

Java provides a transition path for generics since support didn't exist prior
to JDK5. Java allows the use of a generic without a type called raw type.
However, with the loss of type safety.

With JDK7 it is possible to shorten the syntax used to create an instance of a
generic type.

```java
TwoGen<Integer, String> obj = new TwoGen<>(42, "Hello");
var obj = new TwoGen<Integer, String>(42, "Hello");
```

Java's constriant with generics was backward compatible. Java archives this with
erasure. When the java code is compiled all generic type information is removed.

## Things to keep in mind with generics

- type parameters can't be instantiated
- no static memeber can use the type param declared in the enclosing class
- can't instantiate an arary when element type is a type parameter
- cannot create arrays of type specific generic reference.
- a generic class cannot extend `Throwable`.
