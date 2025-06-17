🚆 Railway Coach Yard Simulation – Stack-Based Coach Arrangement
📋 Problem Description
A railway coach yard is used to temporarily rearrange coaches before forming a train. Due to limitations in space and track design, coaches can enter and exit only from one end, making the yard function like a stack (LIFO - Last In, First Out).

Your task is to simulate this stack-based coach yard system while following a set of real-world rules and constraints.

🧠 System Rules & Constraints
Maximum Capacity:
The stack (yard) can hold a maximum of 5 coaches at any time.

Priority Handling:
While forming a passenger express train, priority coaches (e.g., AC First Class) must be added first.

No Duplicate Coaches:
The system must prevent adding duplicate coach IDs (e.g., two "P101").

Coach Type Restrictions:
If the current top coach is a freight coach (e.g., F123), you must not add a passenger coach (e.g., P456) on top of it.

✅ Supported Operations
Function	Description
push(coachID)	Adds the coach to the stack after validating all rules.
pop()	Removes the top coach from the stack.
peek()	Returns the ID of the top coach without removing it.
isFull()	Returns true if the stack has reached maximum capacity.
isEmpty()	Returns true if there are no coaches in the yard.
display()	Prints the current stack from top to bottom.
