

# Learning Java

## Introduction
- Java can be explained as a **Object Oriented Programming Language** which means that it has a certain set of features namely-

  - ***Objects and Classes*** - 
    - The very basic run-time entities in OOP.
    - Any OOP problem is specified as a collection of objects and communications between them.
    - An Object is data + code to manipulate the data.
    - Entire set of data items and the code to manipulate the values are specified using a Class.
    - A class is a logically entity and is used to identify nature and behaviour and helps characterisation of the object.
    - A class can have its own data members that are unique to it.
    - A class can have a set of functions in them and can be used at anytime in the code with proper calling.
    - Some classes can be called in the program directly while some cannot I will write about in the upcoming sections.

  - ***Data Abstraction and Encapsulation*** -
    - Encapsulation is wrapping up of the data and methods together into a single unit.
    - Apart from the methods, the data cannot be accessed by anyone/anything outside the class.
    - This insulation of data from the outside world is called Data Hiding.
    - Encapsulation makes it possible for us to be treated without including non essential background details.
    - In data encapsulation we use the keywords like 
      - Public : Data Members can be called anywhere in the program.
      - Private & Protected : Data Members cannot be called directly but instead require a function to call them.

  - ***Inheritance***  -
    - Incorporating Additional Features to class without modifying it.
    - A class (also called as a subclass in JAVA) may inherit features of another class (also called base class in JAVA)
    - We define only those features (data/methods) that are unique to the base class while the other required features are defined in the base class.

  - ***Polymorphism*** -
    - Ability to take more than one form.
    - Models different behaviour of an application (methods, operators etc.) in different circumstances.
    - For example, the ‘+’ operator in Java may add two integers or may concatenate two strings.
    - Similar to a word having different meanings in different contexts.
    - For example Draw() can be used in different ways just by passing different Data Elements i.e, - Draw(Circle), Draw(Box) and Draw(Triangle)

  - ***Dynamic Binding*** -

    - Binding refers to linking of method call (*or reference*) to the code to be executed.
    - Polymorphic references are methods calls that refer to different types of Objects at different times.
    - Polymorphic references cannot be determined at the compile time, therefore they are resolved at the run time.
