# GoF Definition

Provide a surrogate or placeholder for another object to control access to it.

# Concept

We want to use a class which can perform as an interface to something else.

# Real–Life Example

In a classroom, when one student is absent, during roll call, his best friend may try to mimic the student's voice to try to keep his friend from being marked as absent.

# Computer World Example

Consider an ATM implementation for a bank. Here we will find multiple proxy objects. Actual bank
information will be stored in a remote server. We must remember that in the real programming world, the
creation of multiple instances of a complex object (heavy object) is very costly. In such situations, we can
create multiple proxy objects (which must point to an original object) and the total creation of actual objects
can be carried out on a demand basis. Thus we can save both the memory and creational time.

# Note

What are the different types of proxies?

Mainly we are familiar with the following types:

* Remote proxies. They will hide that actual object which is in a different address space.
* Virtual proxies. They are used to perform optimization techniques like the creation of a heavy object on a demand basis.
* Protection proxies. They generally deal with different access rights.
* Smart reference. It can also perform some additional housekeeping work when an object is accessed.
* A typical operation is counting the number of references to the actual object.
