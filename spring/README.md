# Spring

As of Spring 5, the entire framework is based on the java 8 source code level
making Java 8 the mininum requirement. Kotlin is also now supported. Spring 5
has now also support for Reactive Programming.

## What is Maven

Maven is a software project management tool to manage build automation of a
project. It does this through a Project Object Model (POM). The main purpose is
help developers get a quick idea of a project by:

- making the build process easy
- providing project information
- providing guidlines for best practices developemt
- allowing migration
- managing dependencies

A typical maven project has a `pom.xml` file at the root and a `src` folder.
Inside the `src` folder is a `main` folder for all our code and a `test` folder
for our tests. Inside the `main` folder we find a `java` folder for our code, a
`resouces` folder for resources and a `webapp` folder for jsp files and such.

The great thing about a maven project is that we can learn it once and then it
becomes easire to understand any other maven project. Alternative for maven are
ant and gradle.
