# Lambda

A lambda expression is an anonymous method andcommonly refered to as closure.
An abstract interface is an interface that contains only one abstract method. A
functional interface identifies the target type of a lambda expression. A
lambda can only use where a target type is specified.

```java
(n) -> (n % 2) == 0;
```

You can omit the paranthesis when there is only one parameter. You cannot
execute a lambda expression on its own. A lambda forms the implementation of an
abstract method.

In a target type context, an instance of a class is created that implements the
functional interface. The lambda then defines the behavior of the abstract
method.

The type of the abstract method and the type of the lambda expression must
match. A lambda with a single expression is refered to as an expression lambda.
A lambda with a block expression is refered to as a block lambda.

A block lambda must use the return statement. A lambda expression cannot
specify type parameters thus they cannot be generic. Functional interfaces
associated with a lambda expression can be generic.

Variables declared by the enclosing scope of a lambda are accessible within
the lambda expression. It also has access to the `this` keyword.

When a lambda uses a local variable from its enclosing scope a variable capture
occures. A lambda may then only use local variables that are final (it's value
doesn't change after it's first assignment).

A lambda can throw an exception that is compatible with the exceptions listed
in the throws clause of the abstract method.
