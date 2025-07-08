So far, we have used variables in two places. as object state (instance variables) and as local variables (variables declared within a method). Later we will use variables as arguments (values send to a method by the calling code), and variables as return types (values send back to the caller of the method).

Regardless of the type (primitive or object reference) you must follow two rules. variables must have a type and a name. Java primitives are:

**B**e **C**arefull! ⚠️ 
- Boolean
- Char
**B**ears **S**houldn't **I**ngest **L**arge **F**urry **D**ogs 🐻 🐩
- Byte
- Short
- Int
- Long
- Float
- Double

---
#### **Integral Types** 🔢 
These are used for numbers without decimal points. The sequence `8 - 16 - 32 - 64` is the memory size progression for this group!

**byte** `(8-bit | -128 to 127)` Working with data from files or networks; saving memory when you have large arrays of small numbers.

**short** `(16-bit | -32,768 to 32,767)` Not used very often, but can be a memory-saving choice in specific situations where values won't exceed ~32,000.

**int** `(32-bit | -2.1 billion to 2.1 billion)` This is the default and most common choice for any whole number. It's used for loop counters, array indexes, and general counting.

**long** `(64-bit | -9 quintillion to 9 quintillion)` Used when you need to work with numbers far outside the range of an `int`, such as counting stars in the universe or tracking nanoseconds.

#### **Floating-Point Types** 💧
These are for numbers that have a fractional part (decimals).

**float** `(32-bit | ~6-7 decimal digits of precision)` Good for saving memory in large arrays of decimal numbers where high precision is not critical.

**double** `(64-bit | ~15 decimal digits of precision)` This is the default and standard choice for any decimal number, especially for financial or scientific calculations that require accuracy.

#### **Other Primitives** ⚛️ 🦧
**char** `(16-bit | A single Unicode character)` Used for storing a single letter, symbol, or character like 'A', '$', 'ñ', or 'Ω'. Its 16-bit size allows it to represent characters from nearly all written languages.

**boolean** `(1-bit conceptually | true or false)` Used for tracking conditions or states. It acts as a simple switch for logic in your code (e.g., `isLoggedIn`, `hasPermission`).

---
#### Object reference types
My guess: Objects are not stored in stack, only the reference (pointer). Instead object, or better... the instances of your classes (so info outside the program so to say), is created / stored on the heap. 
#### STACK & Heap Memory
Difference in size, speed and other trivial functions. Also, the garbage collector checks if there are active references to object, pointers (vars). If none the garbage collector cleans up the space on the heap memory.

**Bullet points chapter 3**
- Variables come in two types, primitive and reference.  ⚛️ 🦧 vs  📍🔍  
- Variables must always be declared with a type and name.
- A primitive variable always holds the bits representing 1 out of 8 primitives
	- Be Careful, Bears Shouldn't Ingest Large Furry Dogs.
	- Boolean, Char, Byte, Short, Integer, Long, Float, Double
- The value of a reference variable holds the bits representing a way to an object on the heap.
- A reference variable is like a remote control. Using the dot operator (.) on a reference variable is like pressing a button on the remote control to access a method or instance variable.
- I made up an address analogy myself. So the variable just holds the address of the object. The computer reads the address on the STACK, then goes to the heap and knocks on the door to ask the method to execute. In case there is method params the computer communicates these too. What a friendly neighbor!
- A reference variable has a value of `null` when it is not referencing any object.
- An array is always an object, even if the  array is declared to hold primitives. There is no such thing as a primitive(s) array, only an array that holds primitives.