# Modules

Modules allow us to describe the relationships and dependencies of the code of
an application. They let you control which parts of the module is accessible.
(JDK7).

A module is a grouping of packages and resources that can be collectively
referred to by the module's name. A module declaration specifies the name of a
module and defines the relation a module has to other modules.

```java
// module-info.java file
module moduleName {};
```

One module can specify it relies on another module with the require keyword.
The export keyword is used to define which parts of a module are accessible.

```java
requires moduleName;
exports packageName;
```

Java supports legacy code through:

- (unnamed modules) code that is not part of a named module
- automatic use of class path rather than module path.

When exporting a package it is possible to specify the module we want to export
to with the to clause.

```java
exports packageName to moduleName;
```

Java has support for pluggable application architecture through services and
service providers. Service providers are supported by the service loader class
(a generic class).

```java
class ServiceLoad<S>
```

The keywords used for working with services:

- provides: a module specifies it provides
- uses: a module indicates what it requires
- with: declares the specific type of service provider

```java
provides ServiceType with ImplementationType;
```

By prefixing a module with the open keyword it allows access to all packages in
the module. By using the opens statement we can open a specific package for run
time.

```java
open module moduleName;
opens packageName;
```

Using the requires statement with static makes it so a module isn't required
at runtime.

```java
requires static myModule;
```
