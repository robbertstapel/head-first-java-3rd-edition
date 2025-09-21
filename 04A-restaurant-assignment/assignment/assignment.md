Create a console application in Java that represents a restaurant flow. To keep the assignment in line with the current progress in the book, take the following guidelines:
##### Actor Classes
- Customer
- Waitress
- Chef
##### Item Classes
- Menu
- Order
### Waitress
**As** a Waitress
**I want** to take orders
**So that** the Chef knows what to cook

**Acceptance criterea**
- Waitress serves Customer with Menu
- Waitress receives Order from Customer.
- Waitress passes Order to Chef
- Waitress receives cooked Order from Chef.
### Chef
**As** a Chef
**I want** to receive new Orders from the Waitress
**So that** I can cook the dishes

**Acceptance Criteria**
- Chef receives Order from Waitress
- Chef cooks and passes Order back to Waitress
### Customer
**As** a Customer
**I want** to place an Order
**So that** I can eat the cooked dish

**Acceptance Criteria**
- Customer gives Order to Waitress
- Customer receives Order from Waitress
#### Menu
As a Customer / Waitress
I want to have a Menu
So that we can communicate about the Order

**Acceptance Criteria**
- Menu holds options for the Customer to Choose
#### Order
As a Customer / Waitress / Chef
I want to handle Orders from the Menu
So that we can run a restaurant

**Acceptance Criteria**
- Order can hold one or multiple items from Menu