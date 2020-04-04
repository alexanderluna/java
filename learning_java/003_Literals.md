# Literals

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
