Abstract Factory Pattern
===========================

.. meta::
   :description lang=en: Introduction to Abstract Factory Pattern.

Intent
-----------

Provide an interface for creating families of related or dependent objects without specifying their concrete class.

Structure
--------------

.. mermaid::

  classDiagram
    class Client
    class AbstractFactory
    AbstractFactory: CreateProductA()
    AbstractFactory: CreateProductB()
    class AbstractProductA
    class ProductA1
    class ProductA2
    class AbstractProductB
    class ProductB1
    class ProductB2
    class ConcreteFactory1
    ConcreteFactory1: CreateProductA()
    ConcreteFactory1: CreateProductB()
    class ConcreteFactory2
    ConcreteFactory2: CreateProductA()
    ConcreteFactory2: CreateProductB()
    AbstractProductA <|-- ProductA1
    AbstractProductA <|-- ProductA2
    AbstractProductB <|-- ProductB1
    AbstractProductB <|-- ProductB2
    AbstractFactory <|-- ConcreteFactory1
    AbstractFactory <|-- ConcreteFactory2
    ConcreteFactory1 --* ProductA1
    ConcreteFactory1 --* ProductA2
    ConcreteFactory2 --* ProductB1
    ConcreteFactory2 --* ProductB2
    Client --> AbstractProductA
    Client --> AbstractProductB

Implementation
--------------

如果要create一套新的product，只需要pass in 不同的 ``AbstractFactory``就行了

Benefits and Liabilities
------------------------

1. It isolates concrete class. The client will only have access to the ``AbstractFactory`` and ``AbstractProduct``
2. It makes exchanging product families Easy. If you need to change from one family of production to another, just change the factory
3. It promotes consistency among products.
4. Supporting new kinds of products is difficult.
