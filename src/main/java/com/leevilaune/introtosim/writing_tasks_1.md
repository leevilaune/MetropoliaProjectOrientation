### Task 1
Everyday situation we could analyze through simulation are plenty.
For example we could simulate Metropolia coffee machine queues.
Through simulation we can find out how many machines are needed,
if the amount of machines reduces wait times and if so by how much.

If simulating it we dont have to change the current situation, potentially
annoying student and staff or costing money buying new coffee machines.
In addition creating a simple situation for this is quick and easy.

### Task 2
Lets analyze what simulating a supermarket operations entail so we can 
reasonably accurately simulate it.

For entities we have:
- Customer
  - Arrival time
  - Cart size
- Cashier
  - Speed
  - Availability
- Checkouts
  - Amount available
  - speed
- Shelves
  - Stocked
  - ProductType

For variance we have:
- Customer arrival time, such as peak hours and weekende we need 
to take into account and simulate
- Service times depends on cashier speed and customers cart size

For complexity we have:
- customer flow and staff scheduling, more customers need more staff, but where is the line where its not profitable?
- how many counters we can open, how much does it increase the costs of more staff
vs customers served and/or lost as a result of long queues.
- We can also simulate self-checkouts impact and costs overtime

Interconnectedness:
- staff location; whether they're stocking shelves or doing checkout
- Queue time impact on sales