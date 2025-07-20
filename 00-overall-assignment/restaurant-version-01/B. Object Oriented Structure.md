#### Model
**Purpose:** This package holds the classes that represent the **data and the core business entities** of your application. Think of them as the "nouns" of your system. They define the structure of the things your application works with.

**Characteristics:**
- They primarily contain data (fields, attributes) and methods to access or modify that data (getters, setters).
- They might also contain some simple business logic that is inherent to the entity itself (e.g., an `Order` knowing how to calculate its total price, or an `OrderLine` knowing its subtotal).
- These classes are often Plain Old Java Objects (POJOs) or "Beans."
#### Service
**Purpose:** This package contains classes that implement the **business logic, operations, and coordination** of your application. They are the "verbs" that act upon the model objects. Services often orchestrate interactions between different model objects or external resources.

**Characteristics:**
- They are typically stateless or manage state that isn't tied to a single core entity (like a queue of orders in the `Kitchen`).
- They encapsulate complex operations or processes.
- They provide a clear API for other parts of the application (like actors or UI controllers) to interact with the core functionality.

Sources:
https://www.clearlaunch.com/programming-nouns-verbs/