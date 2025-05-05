### **Procedural vs Object Oriented**
`Procedural`, thinking in terms of what are the things this program has to do? what procedures does this program have to follow?

`Object oriented`, thinking in terms of what are the things in this program? Who are the key players? When you design a class you think about the object that will be created from that class. Think about *what the object knows* (instance variables) and *what the object can do* (methods).

**Classes, Objects, Variables and Methods**
Instance variables are the object's state, object methods are it's behaviour. Keep that in mind, state and behaviour.

So, things an object knows about it self are called instance variables. They represent an object's state (the data). Each instance of the object can have a unique state, so unique data coupled to it. Things an object can do are called methods. They are called the object's behaviour.

So, when you design a class you first think of the data an object will need to know about itself (instance variables). Then you create the methods (behaviour) that operate on that data.

It's common for an object to have methods that read or write the values of the instance variables (data). So objects have instance variables and methods, but both are designed as part of the class, where you create the instance from.

The difference between a class and an object is: A class is the blueprint for an object. It tells the JVM how to make an object of that particular type.

**Contactlist analogy:** Your phones contact's list is empty at start, but once you enter new contact's from the predefined fields like name, phone, email (instance variables) you create instances off the "Contact Class". And the data you put in the fields (instance variables) represent the state of the instantiated contact.

The methods are things you do with a contact, setName, getName, changeName. So each contact can do the same things, but each individual contact knows things unique to that contact.

**Making your first Object**
To create an object you need two Classes. One to create the blueprint and another to test your new Class. The tester Class is where you put the main method, and in that main method you create and access objects of your new Class type. The tester Class has only one job, to try out the instance variables (state) and methods (behaviour) of your new object.

**Quick, get out of main!**
As long as you are in Main you are not really in Objectville. It's fine for a test program to run in the main mehod, but in a true OO application, you need objects talking to other objects, instead of the static main() method now creating and testing your objects.

A real Java application is nothing but objects talking to other objects. In this case, talking means objects calling methods on one another.

**Side note : Java takes out the garbage**
Each time an object is created in Java, it goes intro an area of the memory called the heap. All objects, no matter when, where or how they are created - live on the heap. But, it's not just a heap, it's the Java heap, called the Garbage Collectible Heap.

When you create an object, Java allocates memory on the heap for that object. When the JVM can see that an object can never be used again, that object becomes eligible for garbage collection. Then, when you run low on memory, the Garbage Collector will run, throw out the unreachable objects and thus free up memory.

**Q&A: Global variables and methods**
There is no concept of global variables or methods in a Java OO program. In practical use however, you sometimes want a variable or method to be available to any part of your program. Later on we'll learn that marking a method `public static` makes it behave much like a global. Any class of your application can access a public static method. If you mark a variable as `public static final` you have essentially made a globally available constant.

Keep in mind that these static (global-like) things are the exception rather then the rule.

**Q&A: A Java program**
A Java program or application is a bunch of classes (at least one). In a Java program, one of the classes must have a main() method which starts up the application. To run a Java program you need the JVM, which you can bundle with your classes.

You can put all your classes in a Java ARchive file (JAR), which is in pkzip format. In the jar file you can put a simple text file (the manifest) which defines which class holds the main() method that should run / be triggered.

**Chapter 2 bullet points**
- Object oriented programming let's you extend a program without having to touch previously tested, working code.
- All Java code is defined in a class.
- A class describes how to make an object of that class type. A class is like a blue print.
- An object can take care of itself; you don't have to know or care how the object does it.
- An object knows things and does things
  -- instance variables which is the object state
  -- methods which is the object behaviour
- When you create a class, you also create a test class to create objects of your new class.
- A class can inherit instance variables and methods from a more abstract superclass.
- At runtime, a java program is nothing but object's talking to object's.

**Goals**
- [x] Learn the fundamentals of OOP
- [x] Build a simple guessing game
- [ ] Bonus: Build the restaurant analogy

**Skills**
- [x] Ability to create and use objects in Java.