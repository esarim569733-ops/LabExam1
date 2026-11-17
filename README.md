# LabExam1
Lab Activity: Permutations Using Queue
Instructions
Create a Java program that implements the Queue data structure to generate permutations.

Your program must complete the following tasks:

Queue Implementation: Accept five elements from the user, enqueue them into a Queue, display the Queue, and dequeue two elements. Display the updated Queue after the dequeue operations.
Permutations: Allow the user to specify the number of elements to arrange. Generate and display all possible permutations of the selected elements.
Total Count: Display the total number of permutations generated.




Programming Requirements
Use Java's Queue interface and LinkedList implementation.
Use Scanner for user input.
Implement Queue operations such as add(), poll(), peek(), and isEmpty().
Manually implement the permutation algorithm. Do not use built-in permutation generators.
Use an appropriate algorithm (such as recursion or backtracking) to generate all possible arrangements.
Display all generated permutations and their total count.


Expected Output Example
Queue Implementation:

Enter five elements: A B C D E
 
Queue: [A, B, C, D, E]
 
Dequeuing two elements...
Updated Queue: [C, D, E]
Permutation Generation:

Enter number of elements to arrange: 3
 
Generated Permutations:
CDE
CED
DCE
DEC
ECD
EDC
 
Total Permutations: 6
