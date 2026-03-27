Circular Queue in Java: Interactive Console Application

Welcome to the Circular Queue program! This program allows you to explore the basic operations of a Circular Queue in a user-friendly way. It supports enqueue (insertion) and dequeue (deletion) operations with a twist—using a circular structure for efficient space management.

Features
Insert an Element: Add a number to the queue.
Delete an Element: Remove the front element of the queue.
Overflow Protection: The queue will warn you when it's full.
Underflow Protection: The queue will warn you when it's empty.
Easy to Use: An interactive, menu-driven interface for seamless operation.
How It Works
Initialization: The queue is initialized with a size of 5.
Insert: You can insert an element as long as there is space.
Delete: You can delete an element from the front of the queue.
Circular Nature: When the end of the queue is reached, it automatically wraps around to the beginning (circular behavior).
Overflow: If the queue is full, you cannot add more items and will see an "overflow" message.
Underflow: If the queue is empty, attempting to delete an element will result in an "underflow" message.
Usage
Run the program.
You'll be prompted to choose one of the following operations:
Insert: Add a number to the queue.
Delete: Remove the front element from the queue.
After performing an operation, you’ll be asked if you want to continue. You can choose to continue (y/Y) or stop (n/N).
Example Output
1. for insert
2. for delete
Enter the choice
1
enter the number
10
do you want to continue if yes then the choose'y/Y'  if no then choose'n/N'
y

1. for insert
2. for delete
Enter the choice
2
deleted item10
do you want to continue if yes then the choose'y/Y'  if no then choose'n/N'
n
Code Explanation
The program initializes a queue with 5 slots using an array.
insert(int num): Adds a number to the queue. If the queue is full (either by reaching the last slot or having a wraparound scenario), an overflow message is displayed.
delete(): Removes the front element of the queue. It checks if the queue is empty and prints a corresponding underflow message.
The queue uses two pointers (front and rear) to track where elements should be added or removed.
The array indices wrap around circularly, preventing space from being wasted.
