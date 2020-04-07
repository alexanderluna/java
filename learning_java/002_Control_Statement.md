# Control Statements

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

- [Control Statements](/learning_java/_code_examples/004_control_statements)
- [Exercise: Control Statement](/learning_java/_code_examples/005_exercise_with_control)
- [Exercise: Conversion](/learning_java/_code_examples/006_challenge_conversion)

We learned about **if/for loop** control statements before now we will look at
the rest of the control statements:

## if/else statement

```java
if (condition) {
  // do something
} else if (condition2) {
  // do something else
} else {
  // default
}
```

## switch statement

A switch statement can be used to avoid chaining together if else if statements.

```java
String command = "close";

switch(command) {
  case "open":
    System.out.print("Opening connection");
    break;
  case "close":
    System.out.print("Closing connection");
    break;
  case "kill":
    System.out.print("Killing unresponsive connection");
    break;
}
```

## for loop

```java
for(initialization; condition; iteration) {
  // statement
}

for(;;) {
  // infinite loop
}

int j = 0;
for(int i = 0; i < 5; j += i++); // empty loop
```

## while loop

```java
char i = 'a';

while(i <= 'z') {
  System.out.println(i);
  i++;
}
```

## do/while loop

> This loop will execute at least once

```java
do {
  // something
} while (condition)
```

## Break

> Loops will execute until their exit condition is met. But we can stop
> a loop with the *break* keyword.

The break keyword can also be used as a form of goto by labeling blocks.
**GOTO** allows us to break out of inner blocks up to a different blocks. For
this to work, the loop have to be part of a loop or a switch.

```java
for (int i = 1; i < 4; i++) {
  one: {
    two: {
      three: {
        System.out.println("\ni is -> " + i);
        if (i == 1) break one;
        if (i == 2) break two;
        if (i == 3) break three;
        System.out.println("won't print");
      }
      System.out.println("After block three");
    }
    System.out.println("After block two");
  }
  System.out.println("After block one")
}
System.out.println("After for loop");
```

## Continue

It is possible to skip an interation entire using the continue keyword:

```java
// count 0 to 4 and skip 2;
for(int i = 0; i < 5; i++) {
  if (i == 2) {
    continue;
  }
  System.out.print("i is " + i);
}
```

And just as with **break** we can use **continue** as a form of **GOTO**:

```java
continueHere: for(int i = 0; i < 5; i++) {
  for (int y = 0; y < 5; y++)
    if (i == 2) {
      continue continueHere;
    }
  }
  System.out.print("i is " + i);
}
```

- [Exercise: Switch](/learning_java/_code_examples/014_exercise_switch/)
- [Exercise: Break](/learning_java/_code_examples/015_break_out)
- [Exercise: Nested Loops](/learning_java/_code_examples/016_nested_loops)
