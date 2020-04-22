# Threading

There are 2 types of multitasking in java:

1. process_based: run programs concurrently
2. thread_based: each program can run multiple tasks at once

However only thread are under java's control and it allows our programs to make
use of any idle time. A threat can have various states:

- runnig
- ready to run
- subscribe
- resumed
- blocked
- terminated

To create a thread we either extend the thread class or implement the runnable
interface. When implementing the runnable interface, the `run()` method is what
will be run inside the thread. The created thread doesn't run until we call the
`start()` method.

> A factory method returns an object of a class and is typically a static method

By implementing the runnable implementation, we are implementing the run method
rather than override the Threads own run method. Furthermore, we can inherit
from another class at the same time rather than limit ourself to inheriting from
the Thread class. Thats why the Runnable interface is the prefered way.

We can use the `isAlive()` method to determine if a thread has ended. Another
way is by using the `join()` method. The idea is that the calling thread waits
for the thread to join it.

Java also allows us to set a threat's priority to alot it more CPU time or less
with the `setPriority()` method.

We can use synchronization to coordinate two or more threads. To make use of
synchronization we have to understand the concept of the monitor which controls
object access. It works by locking objects. A locked object can't be accessed
by any other threat.

Synchronizing a method is donde through the **synchronized** keyword. When the
method gets called it is locked.

When working with APIs or other code we can't modify the code. We can however,
synchronize objects using a synchronized block.

```java
synchronized int getArea(int width, int length) {}

synchronized(someAPIObject){}
```

We can make our threads communicate with each other using these methods:

- `wait()`: object is blocked and unlocked
- `notify()`: sleeping threats resume waiting thread
- `notifyAll()`: sleeping threats are awaked.

Use these methods inside a synchronized context.

> A deadlock occures when two threads wait for the other to execute resulting
> in 2 suspended threads.

> A race condition occures when 2 or more threads want to access a shared
> resource at the same time.

Suspend, resume and stop are methods that allow us to control threads but they
are deprecated due to various problems such as deadlocks. To control threads
use flags instead and check periodically.
