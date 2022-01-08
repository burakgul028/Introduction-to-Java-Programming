/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HomeworkExercises6Week11;

/**
 *
 * burak gul 2016556028
 */
class Queue {
//An int[] data field named elements that stores the int values in the queue.
private int[] elements;
private int size;
private int capacity;

//in the public Queue(), the number"this(8);"whose
//capacity is specified is transferred here.
public Queue(int capacity) {

this.capacity = capacity;
elements = new int[capacity];

}

public Queue() {

this(8);// A constructor that creates a Queue object with default capacity 8.

}

//The method enqueue(int v) that adds v into the queue.

public void enqueue(int x) {

if (size >= elements.length) {

int[] temp = new int[size * 2];
System.arraycopy(elements, 0, temp,
0, size);
elements = temp;

}

elements[size++] = x;

}//enqueue finish

//The method dequeue() that removes and returns the element from the
//queue.
public int dequeue() {

int x = elements[0];
size--;
for (int i = 0; i < size; i++) {

elements[i] = elements[i + 1];

}

return x;

}//dequeue finish

//The method empty() that returns t the queue is empty.

public boolean empty() { 

return size == 0;

}
//The method getSize() that returns the size of the queue.

public int getSize() {

return size;

}

//
public int getCapacity() {
return capacity;
}

}//end of class Queue

//Main Class 
public class HomeworkExercises6Week11 {

public static void main(String[] args) {
Queue queue = new Queue();

for (int i = 0; i < 20; i++) {
queue.enqueue(i);
}

for (int i = 0; i < 20; i++) {
System.out.printf("%2d ", queue.dequeue()); //%2d for array view
if ((i + 1) % 5 == 0) System.out.printf("\n");

}

}//end of public static void main(String[] args)

}//end of public class HomeworkExercises6Week11
