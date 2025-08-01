State affects behaviour, behaviour affects state. We already know that objects have state and behaviour, represented by instance variables and methods. But until now we haven't looked at how state and behaviour are related.

That's the whole point of objects, it's behaviour acts on state. In other words, methods use instance variables values, like "if Dog < 14 pounds, doBark() sounds harder"

#### You can send things to a method
Just as you expect from any programming language, you can pass values into your methods. You might, for example, want to tell a Dog object how many times to bark by calling d.bark(3); Depending on your programming background you use the term arguments or perhaps parameters for the values passed in to a method. However, from now on, we will use the terms in the following way:

- A caller passes arguments
- A method takes parameters

Arguments are things you pass into the methods. An `argument` lands face-down into a... wait for it... `parameter`. And a parameter is nothing more than a local variable. A variable with a type and a name that can be used inside the body of the method.

But here's the important part. If a method takes a parameter, you MUST pass it something when you call it. And that something MUST be a value of the appropriate type.

Arguments land in the same order you pass them. So first argument lands in the first parameter, second argument in the second parameter, and so on.

`void bark(int numOfBarks){`
	`while(numOfBarks > 0){`
		`System.out.println("woof");`
		`numOfBarks--`
	`}`
`}`

Methods can also return values. Every method is declared with a return type, but until now we've made all of our methods with a void return type, which means they don't give anything back. We write the return type, like we already did and just omit the void. Then, inside the method we have to return something.

`int returnNumber() {`
	`return 42;`
`}`

If you declare a method to return a value, you MUST return a value of the declared type. Or... a value that is compatible with the declared type. We'll get more into that when we talk about polymorphism in chapters 7 and 8.

#### You can send more then one thing to a method
Methods can have multiple parameters. Separate them with a comma when you declare them, and separate the arguments with commas when you pass them. Again, you must declare and pass with the same type and order.

Arguments land in the same order you pass them. So first argument lands in the first parameter, second argument in the second parameter, and so on. You can also pass variables as arguments, as long the variable matches the paramater expected type at the end.

#### Java is pass-by-value. That means pass-by-copy.
So, roses are red, this poem is choppy. Passing by value is passing by copy.

Passing by copy. So when you call a method with a variable as argument. The the method cannot change what was in the calling variable. It will change, but the copy will change.

#### Q&A

**Q:** What happens if the argument you want to pass is an object instead of a primitive?

**A:** Java passes everything by value. Everything! But... value means bits inside the variable. And, remember, you don't stuff objects into variables. The variable is a remote control - a reference to an object. So if you pass a reference to an object into a method, you're passing a copy of the remote control. Much more on this later on!

**Q:** Can a method declare multiple return values? Or is there some way to return more than one value?

**A:** Sort of. A method can declare only one return value. BUT... if you want to return, say, three int values, then the declared return type can be an int array. Stuff the three int's into the array and pass it back. Return that array. It's a little more involved to return multiple values with different types. More on that in chapter five, when ArrayList is introduced.

#### Bullet points

- Classes define what an object ==knows== and what an objects ==does==.
- Things an object knows are its ==instance variables==, the state of the object.
- Things an object does are its ==methods==, the behaviour of the object.
- Methods can use instance variables so that two objects of the same type can behave differently.
- A method can have parameters, which means you can pass one or more values into the method.
- The number and type of values you pass in the method when calling it (arguments), must match the order and type of the parameters declared by the method.
- A method must always declare a return type. A void return type means the method doesn't return anything.
- If a method declares a non-void return type, it must return a value compatible with the declared return type.

#### Getters and Setters
Now that we have seen how parameters and return types work, it's time to put them to good use. Let's create Getters() and Setters(). If you are being all formal about it, you might call them Accessors and Mutators. However, Getters and Setters is a common naming convention, so that's what we'll call them.

**Getters and Setters** let you, well, get and set things. Instance variable values usually. A Getter's sole purpose in life is to send back (as a return value) the value of whatever it is that particular Getter is supposed to be Getting. 

**The Setter's** sole purpose is to take an argument value and use it to set the value of an instance variable.

#### Your data is exposed!

Until now we haven't secured our Classes, meaning anyone could access and change them using ==theCat.height = 0;== for example. Imagine a bad actor changing your Cat object and set it's height to 0. We would end up with a flat cat, and we don't want that to happen! Instead use Setter methods rather then to access the data directly. This way, you can add some logic to setting a value which prevents flat cats.

public void setHeight(int height){
	if (height > 5){
		this.height = height;
	}
}

#### Encapsulation starter
Mark your instance variables as private and provide public getters and setters for access control. Yes, it's that simple! When you have a little more experience you probably do thing's a little differently, but for now this approach will keep you safe.
#### What does encapsulation protect your from?
Most instance variable values are coded with some assumptions about their boundaries. Think off all the things that would brake if, for example, negative numbers were allowed. Number of bathrooms in an office. Velocity of an airplane. Birthdays. Barbell weight. Phone numbers. etc...

By forcing other code to go trough setter methods you can validate the parameter and decide if it's doable. Maybe the method will reject it and do nothing, maybe you wan't to Throw an Exception. Or you wan't to round some numbers to the nearest acceptable value. The point is, you can do anything you want using setter methods, you can't do anything if your instance variables are public.

==Any place where a particular value can be used, a method call that returns that type can be used.== In javascript we call this a value expression...

#### How do objects in an array behave?
Just like any other object, the only difference is how you get to them.
#### Declaring and initializing instance variables
When you don't initialize an instance variable it will hold a default value. For booleans this is false, for objects it's null and with integers it;s 0;

Remember, null just means a "remote control" that isn't programmed to do anything. There is a reference but no actual object.
#### The difference between instance and local variables
Instance variables are declared inside a class local variables within a method. Local variables do NOT get a default value and therefore MUST be initialized! If you don't the code won't compile.
#### What about method parameters?
Method parameters are virtually the same as local variables. They are created inside the method. Or to be correct, they are declared inside the method argument list... Method parameter will never be un-initialized because the compiler will give an error if you try to invoke a method without giving the arguments it needs. So methods are always initialized because the compiler guarantees that the method is called with arguments that match the parameters type. The arguments are assigned automatically to the parameters.
#### Comparing variables
Sometimes you want to know if two primitives are the same; for example, you might want to check an int result with some expected integer value. That's easy enough, just use the == operator. Same goes for an object on the heap. However, sometimes you wan't to check for equalities instead of checking if they are the same.

The idea of equality of object depends on the type of object. If two individual Strings have the same characters, for example a Dog object with the var name holding the value "Bentley", they are meaningfully equivalent, regardless of wether they are two distinct objects on the heap. But what if two Dog objects have the same size and weight, do you wan't to treat them as equal? Probably not! So whether two different object should be treated as equal depends on what makes sense for that particular object type. We explore object equality later on but for now you must know that the == operator is used only to compare the bits in two variables. What those bits represent doesn't matter, they are either the same or they are not.

Remember, the == operator cares only about the pattern of bits in the variable. The rules are the same whether the variable is a primitive or reference. So the == operator returns true if two reference variables refer to the same object. We don't know what the bit pattern is in this case because the JVM manages it and hides it for us.

#### Bullet points

- Encapsulation gives you control over who changes the data in your class and how.
- Make an instance variable private so it can't be changed by accessing the variable directly.
- Create a public mutator method such as a setter to control the boundaries of changing the value.
- Instance variables will have default values when not set.
- Local variables are not assigned a value by default, you always need to initialize them.
- Use == to check if two primitives hold the same value. 
- Use == to check if to references are the same. E.g. if two two object variables are actually the same object.
- Use .equals() to see if two objects are equivalent (but not necessarily the same object), e.g. to check if two String values contain the same characters.
