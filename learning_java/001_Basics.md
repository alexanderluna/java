# The Main function

All java programs start with a main function which gets called immediatly.

```java
public static void main(String args[])
```

- [Main function](/learning_java/_code_examples/001_system_out)

## Variables

- byte (8 bits)
- short (16 bits)
- int (32 bits)
- long (64 bits)
- float (32 bits)
- double (64 bits) -> prefered over float
- boolean ()
- char (16 bits unsigned int unicode)

Java has different data types and they have to be declared when defining a
variable. The following 8 primitive data types exist.

- [Declaring Variables](/learning_java/_code_examples/002_declare_variables)
- [Exercise: Double](/learning_java/_code_examples/003_exercise_with_double)
- [Data Types](/learning_java/007_data_types)
- [Exercise: Data Types](/learning_java/008_exercise_data_types)

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

[Code Examples](/learning_java/_code_examples/011_type_conversion)

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

- [Working with Scope](/learning_java/_code_examples/009_working_with_scope)

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
