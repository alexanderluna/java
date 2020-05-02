# Enumeration

Enumerations allow us to create a list of named constants that define a new data
type.

```java
enum year {
  JAN, FEB, MAR
};
```

Each enumeration constant is public and static. We can also use a switch
statement on an enum. In java, enums are implemented as class types. We can thus
give them constructors, instance variavles, methods and implement interfaces.

All values of an enumeration can be fetched with the `values()` method.
`valueOf()`returns the associated value of an enum.

```java
enum Europe {
  GERMANY(83);
  SPAIN(47);

  private int population;

  Europe(int popu) {
    population = popu;
  }

  int getPopulation() {
    return population;
  }
};
```

Enums don't support class inheritance and can't be a super class either.
However, all enums inherit from `java.lang.Enum`

- ordinal: return a constant's position (ordinal) value
- compareTo: compare the ordinal value of 2 enums
