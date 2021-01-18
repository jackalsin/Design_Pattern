Factory Pattern
===========================

.. meta::
   :description lang=en: Introduction to Factory Pattern.

Intent
-----------

Applicability
--------------

When you are writing a framework

- a class cannot anticipate the class of objects it must create
- a class wants its subclasses to specify the objects it creates.
- classes delegate responsibility to one of several helper subclasses, and you want to localize the knowledge of which helper subclass is delegate.
