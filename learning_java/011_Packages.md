# Packages

In java, we can groupd related pieces of a program together through packages. A
package provides a unified name which has to be used to access these related
classes. Furthermore, a package provides access control this providing
encapsulation. A class defined within a package gets its name attached with the
package name which avoids collision of names.

To define a package declare a package at the top of the source file.

```java
package mypackage;
```

Java uses the file system to manage packages. All classes of a package must be
created within a directory named after your package.

[Previously](006_Classes_Methods.md) we looked at access modifiers and we
skipped the protected access modifier. The protected access modifier makes a
member accessible within a package and to subclasses in other packages. Thus it
is protected from being accessed outside its package.

To import a package in java we use the **import** statement.

```java
// import a specific class from a package
import mypackage.MyClass;

// import everything from within a package
import mypackage.*;
```

Java's class library is contained in packages as well like the `java.lang`,
`java.io` and `java.net` packages.
