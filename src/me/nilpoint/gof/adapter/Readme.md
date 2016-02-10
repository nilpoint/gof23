# GoF Definition

Convert the interface of a class into another interface that clients expect. The adapter
pattern lets classes work together that couldn’t otherwise because of incompatible interfaces.

# Concept

The core concept is best described by the examples given below.

# Real–Life Example

The most common example of this type can be found with mobile charging devices. If our charger is not
supported by a particular kind of switchboard, we need to use an adapter. Even the translator who is
translating language for one person is following this pattern in real life.

# Computer World Example

In real-life development, in many cases, we cannot communicate between two interfaces directly. They
contain some kind of constraint within themselves. To deal with this kind of incompatibility between those
interfaces, we may need to introduce adapters.

# Note

GoF tells us about two major kinds of adapters:

1. Class adapters. They generally use multiple inheritance to adapt one interface to
another. (But we must remember, in Java, multiple inheritance through classes is not
supported. We need interfaces to implement the concept of multiple inheritance.)

2. Object adapters. They depend on the object compositions.

To what extent does an adapter need to take care when it adapts an adapter?

It depends on that particular case. If our target interface is very similar, then adapters do not have much
work. If there is not much similarity, then adapters must do some extra work to match those functionalities.