# Exception Handling

We can use Java's exception handling subsystem to handle runtime errors. This
way we avoid using error codes and manual checking.

In java all exceptions are derrived from the **Throwable** class. The Throwable
class 2 subclasses:

- Exception: errors in our code
- Error: JVM specific errors

Exception handling in java is managed via 5 keywords:

| keyword | description                                  |
| ------- | -------------------------------------------- |
| try     | block of code to watch for                   |
| catch   | handle an exception                          |
| throw   | manually throw and exception                 |
| throws  | throw an exception outside a method          |
| finally | code that needs to execute at the end of try |

```java
try {
  doSomething();
} catch (ExceptionType exceptionObject) {
  // handle exception
}
```

Exception handling is vital to keep a program from terminating prematurely.
Exceptions allow us to handle errors gracefully. We can also catch multiple
exceptions. By catching an exception's superclass we also catch all its
subclasses. Thats why subclass catches need to preced superclass catches.

If we want, we can also nest try blocks. We can throw errors as well but they
have to be an object derrived from the Throwable class.

```java
throw new ArithemticException();
```

When our methods don't handle errors but they throw errors, we must specify
the execptions it throws using the **throws** keyword.

```java
int setDate(int date) throws CannotGetDate {}
```

Using catch, we can also catch multiple exceptions:

```java
catch(Exception1 | Exception2 | Exception3 errorObject) {}
```

The power of Java's exceptions ist hat we can create our own exceptions by
inheriting from the exception class. Our exception classes don't have to
implement anything for us to use them as Exceptions.
