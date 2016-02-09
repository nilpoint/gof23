# GoF Definition

Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing
for extending functionality.

# Concept

This main principle of this pattern says that we cannot modify existing functionalities but we can extend
them. In other words, this pattern is open for extension but closed for modification. The core concept
applies when we want to add some specific functionalities to some specific object instead of to the
whole class.

# Real-Life Example

Suppose you already own a house. Now you have decided to add an additional floor. Obviously, you do not
want to change the architecture of ground floor (or existing floors). You may want to change the design of the
architecture for the newly added floor without affecting the existing architecture for existing floor(s).

# Computer World Example

Suppose in a GUI-based toolkit, we want to add some border properties. We can do this by inheritance. But
it cannot be treated as the best solution because our user or client cannot have absolute control from the
creation. The core of that choice is static there.

Decorator can offer us a more flexible approach: here we may surround the component in another
object. The enclosing object is termed “decorator.” It conforms to the interface of the component it
decorates. It forwards requests to the component. It can perform additional operations before or after those
forwarding requests. An unlimited number of responsibilities can be added with this concept.

# Note

What are the main advantages of using decorator patterns?

1.  Without disturbing existing objects in the system, we can add new functionality
to a particular object.

2. We can code incrementally. For example, we’ll make a simple class first and then
one by one we can add decorator objects to them as needed. As a result, we do
not need to take care of each and every possible scenario in the beginning. On
the other hand, we must acknowledge that making a complex class first and then
extending its functionality is a much more complex procedure.

How is this pattern different from inheritance?

We can add or remove responsibilities by simply attaching or detaching decorators. But with the simple
inheritance technique, we need to create a new class for new responsibilities. So, there will be many classes
inside the system, which in turn can make the system complex.

What is the major disadvantage of using this pattern?

First of all, if we are careful enough, there is no significant disadvantage. But if we create too many
decorators in the system, the system will be hard to maintain and debug. At the same time, the decorators
can create unnecessary confusion.