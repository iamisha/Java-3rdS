# Assignment: Chapter 1 & 2

# 1. Discuss the features of Java.

Answer:-

Java features or advantages:-

1. Architectural-neutral and platform independent

---> Java programs can be easily moved from one computer system to another, anywhere and anytime.

---> Changes and upgrades in any Operating Systems(OS), processors, and system resources will not force any changes in java programs

---> Java gives a software based platform that runs on the top of the other hardware platforms which has basically two components
i. RunTime Environment
ii. API(Application Programming Interface)

---> Java code can be run on any platform or multiple devices like windows, linux, mac etc.

---> Java code is first compiled into the byte code using javac as javac filename.java.
---> Compiled byte code is converted into the equivalent machine code using JVM as java filename.
---> Each and every Java source file is compiled into a bytecode file, which is executed by the JVM.

![CHEESE!](architecture-neutral.jpeg)

--- > Hence, the java is platform independent.

2. Robust

Java is Robust because:-
---> There are exception handling and type checking mechanisims in java.
---> To make the memory free forgotten to make it free while deallocating the memory, there is a automatic garbage collector in java which runs on JVM.

---> Java has eleminated the concepts of pointers.

3. multithreaded and interactive

   Multithreading refers to a process of executing two or more threads simultaneously in java where a thread in java is an individual, light-weight process requiring fewer resources to create and share the process resources.

--- > Multithreading saves time as we can perform multiple operations together.

--- > It doesn't block the users to perform multiple operations at the same time due to it's indpendency.

--- > It doesn't affect the other threads if an exception occurs in a single thread.

4. Distributed

Java is distribute language because

--- > It is possible to share both data and programs.
--- > Java applications can open and access remote objects in their local system that helps multiple programmers at mutliple remote locations to work on a single project.

--- > RMI (Java Remote Method Invocation) and EJB (Enterprise Java Bean) are the manageably designed Java APIs.

5. Object-oriented

Java is Object oriented programming language as:-
--- > Everything in java is an object.
--- > All program code and data reside within objects and classes.

--- > Java comes with sets of classes, packages that we can use in our programs using the concept of inheritance.

6. Simple and familiar

Java is simple and familiar as

--- > Java has extracted many complicated functions like pointers, preprocessor header files, goto statement, operator overloading, multiple inheritance etc.

--- > Java is a simplified version of c++.

7. High Performance

Java has an impressive performance due to

--- > The use of intermediate bytecode.
--- > The use of JIT (Just In Time) compiler in which the compiler compiles the code on demand basis i.e the compiler compiler compiles only that code which is being called which saves time and makes it more efficient.

8. Ease of Development
   J2SE(Java 2 Standard Edition) 5.0 supports features like Generics, Enhanced for loop, Autoboxing or Unboxing, Typesafe Enums, etc which reduce the work of a programmer by shifting the resposibility of creating the reusable code to the compiler.

# 2. Explain how Java is platform Independent

Answer:-

Java is platform Independent due to the following reasons:

---> Java programs can be easily moved from one computer system to another, anywhere and anytime.

---> Changes and upgrades in any Operating Systems(OS), processors, and system resources will not force any changes in java programs

---> Java gives a software based platform that runs on the top of the other hardware platforms which has basically two components
i. RunTime Environment
ii. API(Application Programming Interface)

---> Java code can be run on any platform or multiple devices like windows, linux, mac etc.

---> Java code is first compiled into the byte code using javac as javac filename.java.
---> Compiled byte code is converted into the equivalent machine code using JVM as java filename.
---> Each and every Java source file is compiled into a bytecode file, which is executed by the JVM.
--- > Hence, the java is platform independent.

# 3 . Why is multiple inheritance not supported in Java ? Provide a simple code example to support your answer.

Answer:-
The diamond problem in java is the main reason why java doesn't support mulitple inheritances in classes.
Multiple inheritance shows problem when there exist methods with same signature int the both super/parent classes. Due to such problem, java doesn't support multiple inheritance directly. The same concept can be achieved in java using the Interface method.

Example code :- "[Multiple.java]"

Code explanation:- In above program, m object of Multiple class is making a call to superclass/parent method display(). This leads to the ambiguity as the compiler doesn't know which superclass method to execute which is called to be the diamond problem that leads java not support the multiple inheritance.

# 4. Define Polymorphism. How should we implement polymorphism in java ?

Answer:-
Polymorphism is the same object having different behaviour or it's one of the main feature of the Object Oriented Programming that has many forms.

There are two different methods of implementing Polymorphism in Java:-

**1.CompileTime Polymorphism or MethodOverloading :-**

This type of polymorphism is also called the static polymorphism that can be implemented using method overloading.

**Example program of CompileTime Polymorphism:-**"[CompileTimePoly.java]"

--- > In this above example program, the Polymorphism class has two same methods sum() but the arguments passed are different. Here two methods having the same name are distinguished and compile time polymorphism is achieved. For the first time, when we call the sum() method, we pass single value to the method, so the first method is evoked. For the second time, we pass two values to the method that evoked the second method.

Hence, this helps to implement the CompileTimePolymorphism.

**2. RunTime Polymorphism or MethodOverriding :-**
RunTime Polymorphis is also called the Dynamic method dispatch that can be implementd using method overriding.

**Example Program of RunTime polymorphism :-**
"[RunTimePoly.java]"

--- > In this above example program, the Shape class is super class and Circle, Rectangle and Square are it's derived classes where the area() method is overriden from the super/parent class Shape.

# 5. Create a class Employee with id, name, post and salary. Create a parameterized Constructor to initialize the instance variables. Override the toString() method to display the details.

Answer:- "[TestEmployee.java]"

# 6. Mention the scope of all modifiers and also illustrate the concept of access modifiers with suitable examples.

Answer:-

Modifiers are the keywords in object oriented languages that set the accessibility of classes, methods and other members.

# Access-modifier in java

access modifier in java has the following characteristics:-

1. Access modifiers in java defines the scope or the accessiblity of any MCCF(method, constructor, class or field)
2. We can change the accessing level of any MCCF by adding the access modifier in it.
3. In java, there are 4 different types of access modifier which are ppppd(private, public, protected and default).

4. Working field of these modifier is shown in table below.

   ![CHEESE!](access-modifier.webp)

**Example program :-**
