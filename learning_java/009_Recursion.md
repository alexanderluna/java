# Recursion

Java supports recursion which means that a function in java can call itself.

```java
int factorial(int number) {
  int result;
  if (number == 1) return 1;
  result = factorial(number - 1) * number;
  return result;
}
```
