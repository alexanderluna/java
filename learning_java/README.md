# Learning Java

## The Main function

All java programs start with a main function which gets called immediatly.

```java
public static void main(String args[])
```

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