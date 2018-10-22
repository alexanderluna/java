# Learning Java

## The Main function

All java programs start with a main function which gets called immediatly.

```java
public static void main(String args[])
```

[Code Examples](/001_system_out)

## Variables

Java has different data types and they have to be declared when defining a
variable. The following 8 primitive data types exist.

- byte (8 bits)
- short (16 bits)
- int (32 bits)
- long (64 bits)
- float (32 bits)
- double (64 bits) -> prefered over float
- boolean ()
- char (16 bits unsigned int unicode)

[Code Examples 1](/002_declare_variables)
[Code Examples 2](/003_excersise_with_double)

## Control Statements

Java has several ways of controlling the flow of a program through control
statements:

```java
if (10 < 15) System.out.print("10 is smaller than 15");
```

Java uses common relational operators:

- **<** less than
- **>** greater than
- **<=** less than equal to
- **>=** greater than equal to
- **==** equal to
- **!=** not equal to

```java
int count;
for(count = 0; count < 5; count = count + 1) {
    System.out.println("This is iteration: " + count);
}
```

[Code Examples 1](/004_control_statements)
[Code Examples 2](/005_exercise_with_control)
[Code Examples 3](/006_challenge_conversion)
[Code Examples 4](/007_data_types)
[Code Examples 5](/008_exercise_data_types)

## Style Guide

Java doesn't care about white but it requires every statement to end with a
semicolon.

## Keywords

Java has 50 keywords which cannot be used as names for variables, classes or
methods.

## Identifiers

Identifier are the names given to variables and methods. Variables can start
with any letter in the alphabet, an underscore or a dollar sign. Keep in mind
that java is case sensitive. You cannot use any of the 50 keywords as names.
Also use descriptive names which make it clear what the variable hold and what
the method does

## Literals

Java allows the use of literal values in a human readable form. Interger
literals are of type **int** by default unless appended with **l/L** in which
case the integer is of type long (12L, 8L, 5L). Similar floating point numbers
are of type **double** by default unless appended with **f/F** in which case it
is considered a **float**.

Furthermore java allows to use hexadecimals, octal and binary literals by
prepending **0x, 0 and 0b** respectively:

- 0xFF -> hexal
- 011 -> octal
- 0b1100 -> binary

It also possible to use escape characters using the **\** character to create
a new line, tab, etc. in a string:

```java
chr = '\t' // tab
chr = '\n' // new line
```

> Attention: String with a single character is not the same as a character.

## Variable Scope

In Java variables can be either global or local. If a variable is delcared
outside a method a it is globally acessable while a variables decelared inside a
method is only accessable inside the given method. Furthermore, the garbage
collector removes the variable once it is out of scope.

> The arguments of a method are alos copied to the local scope of the method.

**Alert:** *If a variable `x` is declared in an outer scope, you cannot declare*
*another variable in the inner scope with the same name*

```java
public static void main(String args[]) {
 int x = 10;
 for(int y = 0; y < 5; y++) {
  int x = 20; // illegal
 }
}
```

[Code Examples](/009_working_with_scope)

## Operators

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

[Code Examples](/010_short_circuit)

## Type Conversion

Java automatically converts compatible types as long as the destination is
bigger the source. It takes the type on the right and converts it to the type
declared on the left:

```java
int i = 10;
float b = i; // i is converted to a float
```

This works as long as the type on the right is smaller than the one on the left.
For that reason a conversion from double to long is not possible. However, there
is a way of converting incompatible types using casting which will lose
information if the conversion is narrowing:

```java
double a, b;
(int) (a/b); // precision is lost
```