### Start with the Real World
- Identify the "Nouns": Look at the problem domain (your restaurant) and identify the key things, actors, or concepts. These often become your classes or objects.
- Examples: Waitress, Customer (even if not a class yet, it's a concept), Menu, MenuItem, Order, Kitchen, Chef, Table.
- Identify the "Verbs": What do these nouns do? Or what actions are performed on them? These often become your methods.
- Examples: Waitress greets, Waitress takes order, Menu opens, Order adds item, Chef prepares food.

### For Each "Noun" (Potential Class), Ask:
**What does it know about itself? (State/Attributes/Fields)**
- A Waitress knows her name and id.
- A MenuItem knows its name, price, and id.
- An Order knows its id and the list of items it contains.
- These become the instance variables (fields) of your class.

**What can it do? (Behavior/Methods)**
- A Waitress can presentMenu(), takeOrder().
- A Menu can openMenu() (display itself), getMenuItemById().
- An Order can addItem(), calculateTotal().
- These become the methods of your class.

### Embrace Core OO Principles:
Encapsulation (Bundling & Hiding):
- Bundle the data (fields) and the methods that operate on that data together within a class.
- Control access to the internal state. Typically, make fields private and provide public methods (getters, setters, or other action methods) to interact with that state. This protects the object's integrity.
Use toString() method or getters, and let other classes use those. This way, if a class changes how it stores its data, The other classes won't necessarily break.

**Abstraction (Simplifying Complexity):**
- Hide the complex implementation details and expose only the necessary functionalities.
- When your Waitress calls menu.openMenu(), she doesn't need to know how the menu prints itself (loops, data structures, etc.), only that it will display. The Menu object abstracts away those details.

**Single Responsibility Principle (SRP):**
- Each class should have one primary responsibility or reason to change.
- Your MenuItem is responsible for item data. Your Menu is responsible for the collection of items. This is good SRP. Merging them would violate this.

**Collaboration (Objects Talking to Each Other):**
- Objects rarely work in isolation. They interact by calling each other's methods.
- Your Waitress object will interact with a Menu object, and later with an Order object. Think about what information needs to pass between them.
- Example: waitress.presentMenu(theMenu); – The Waitress tells theMenu to do something.
#### Tips and Tricks for OO Thinking:
**CRC Cards (Class-Responsibility-Collaboration):**
A simple, powerful technique. Use index cards. For each potential class:
- Class Name: Write it at the top.
- Responsibilities: On the left, list what the class should do or know.
- Collaborators: On the right, list other classes it needs to interact with to fulfill its responsibilities.
This helps you visualize interactions and distribute responsibilities.

**Tell, Don't Ask:**
- Instead of an object asking another object for data to then operate on that data, tell the other object to perform the operation itself (if the responsibility lies with it).

**Think About "Is-A" vs. "Has-A" Relationships:**
- Is-A (Inheritance): A DeluxeBurger is a Burger. Use inheritance when one class is a more specific type of another.
- Has-A (Composition/Aggregation): An Order has a list of MenuItems. A Waitress has a name. Use fields to represent these "has-a" relationships. This is very common.

**Keep it Simple (YAGNI - You Ain't Gonna Need It):**
- Don't over-engineer. Start with the simplest design that works for the current requirements. You can always refactor and add complexity later if needed.

**Iterate and Refactor**:
- Your first OO design is rarely perfect. As you write code and understand the problem better, you'll see ways to improve it. Refactoring (restructuring existing code without changing its external behavior) is a normal part of the process.

**When the Real-World Analogy Bends (or Breaks):**
- Real-world analogies are great starting points, but sometimes a direct 1:1 mapping can lead to awkward or inefficient software.
- For example, in the real world, a menu doesn't "get an item by ID." But in software, this is a very useful function for the Menu object to provide to other parts of the system (like the Waitress or Order processing).
- The goal is to create a useful model, not necessarily a perfect replica.

