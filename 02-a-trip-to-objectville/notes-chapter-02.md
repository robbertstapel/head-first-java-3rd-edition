## **Procedural vs Object Oriented**
**Procedural**, thinking in terms of what are the things this program has to do? what procedures does this program have to follow? 

**Object oriented**, thinking in terms of what are the things in this program? Who are the key players? When you design a class you think about the object that will be created from that class. Think about *what the object knows* (instance variables) and *what the object can do* (methods).

**Classes, Objects, Variables and Methods**
Instance variables are the object's state, object methods are it's behaviour. Keep that in mind, state and behaviour.

So, things an object knows about it self are called instance variables. They represent an object's state (the data). Each instance of the object can have a unique state, so unique data coupled to it. Things an object can do are called methods. They are called the object's behaviour.

So, when you design a class you first think of the data an object will need to know about itself (instance variables). Then you create the methods (behaviour) that operate on that data. 

It's common for an object to have methods that read or write the values of the instance variables (data). So objects have instance variables and methods, but both are designed as part of the class, where you create the instance from.

The difference between a class and an object is: A class is the blueprint for an object. It tells the JVM how to make an object of that particular type.

**Contactlist analogy:** 
Your phones contact's list is empty at start, but once you enter new contact's from the predefined fields like name, phone, email (instance variables) you create instances off the "Contact Class". And the data you put in the fields (instance variables) represent the state of the instantiated contact.

The methods are things you do with a contact, setName, getName, changeName. So each contact can do the same things, but each individual contact knows things unique to that contact.

**Making your first Object**
To create an object you need two Classes. One to create the blueprint and another to test your new Class. The tester Class is where you put the main method, and in that main method you create and access objects of your new Class type. The tester Class has only one job, to try out the instance variables (state) and methods (behaviour) of your new object.

**Quick, get out of main!**
As long as you are in Main you are not really in Objectville. It's fine for a test program to run in the main mehod, but in a true OO application, you need objects talking to objects.

**Goals**
- [ ] Learn the fundamentals of OOP
- [ ] Build a simple guessing game

**Skills**
- [ ] Ability to create and use objects in Java.