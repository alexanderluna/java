# Operators

Operators allow for mathematical manipulation. Java has 4 classes of operators:

- arithmetic (+, -, *, /, %, ++, --)
- bitwise
- relational (==, <, >, <=, =>, !=)
- logical (&, &&, |, ||, !, c, ˄)

> **Short Circuit operators:** Java support a short circuit version of the
> *and/or* operators to produce more efficient code. If the first item is false
> using the && operator java will not check the second value. Similar if the
> first item is true using the || operator java will not check the second item.

```java
int a, b;

a = 10;
b = 2;

if (b != 0 && (a % b) == 0) {
 System.out.println(b + " is a factor of " + a);
}

b = 0;

if (b != 0 && (a % b) == 0) { // short circuit prevents 0 division
 System.out.println(b + " is a factor of " + a);
}

if (b != 0 & (a % b) == 0) { // 0 division error
 System.out.println(b + " is a factor of " + a);
}
```

Incrementing and decrementing can be done using the **++/--** operator. This
operator can be used as a prefix as well as a postfix:

```java
int x = 10;
int y = x++; // y = 10

int a = 10;
int b = ++a; // b = 11
```

- [Short Circuit](/learning_java/_code_examples/010_short_circuit)
