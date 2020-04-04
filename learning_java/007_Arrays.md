# Arrays

In java an array is a collection of variables of the same type and are zero
index. Arrays are implemented as objects:

## One Dimentional Array

```java
type array_name = new type[size];
type array_name[] = { val1, val2, val3 };
type[] array_name = new type[size];
type array_name[] = new type[size];
int person_ages = new int[8];
```

> Arrays are zero indexed.

## Multidimentional Array

```java
int array_name[][] = new int[8][4];
int array_name[][][] = new int[8][4][5];

int ages[][] = {
  {1,2,3},
  {4,5,6}
}
```

## Irregular Arrays

```java
int array_name[][] = new int[8][];
```

## for-each loop (aka. enhanced for loop)

```java
for (type value: collection) {
  statement-block;
}
```

- [Exercise: Queue](/learning_java/_code_examples/021_queue)
