# Swing

Swing is the most widely used Java GUI. Swing defines a collection of classes
and interfaces that support a rich set of visual components.

Swing was a response to deficiencies present in Java's Abstract Window Toolkit
(AWT). The look and feel of an AWT component is defined by the platform not by
java.

Swing was introduced 1997 and included as part of the java foundation classes
(JFC). Swing components are lightweight which means that a component is written
entirely in java. In swing you can seperate the look and feel of a component
from the logic of acomponent. Java provides look and feel such as metal and
nimbus which are avaiable to all swing users.

Swing's pluggable look and feel is made possible because swing uses a modified
version of the MVC architecture. It combines the view and controler into a
single enity called the UI delegate.

> Swing doesn't replace the AWT.

Swing GUI consist of 2 key items:

1. components
2. containers

A component is an independent visual control. A container holds a group of
components.

Swing commponents are declared from the JComponent class. Swing defines 2 types
of containers.

1. top level: not contained in any other container
2. lightweight: to organize and manage groups of components

Eech top level container defines a set of panes. The layout manager controls
the position of components within a container. Java offers several layout
managers.

Swing programs use swing components to handle user interactions but they
also have special requirements related to threading.

Swing programs are event driven. When an event is send to a program, the
grogram responds to the event by use of an event handler. The event handling
mechanism used by swing is called the delegation event model. An event source
generates an event and sends it to one or more listeners. The listeners waits
until it receives an event and processes the event and then returns.
