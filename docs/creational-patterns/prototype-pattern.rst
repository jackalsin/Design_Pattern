Prototype Pattern
===========================

.. meta::
   :description lang=en: Introduction to Prototype Pattern.

.. note::
    It's generally not allowed in Java due to the :code:`clone` is not part :code:`Cloneable` interface.

Intent
-----------

Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

Applicability
--------------

Based on the GoF

    - when the classes to instantiate are specified at run-time, for example, by dynamic loading; or
    - to avoid building a class hierarchy of factories that parallels the class hierarchy of products; or
    - when instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.

:code:`clone` should not be used in Java per Effective Java
