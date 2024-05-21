class QueueOperations {
	private static final int MAX_SIZE = 10;
	private int[] array;
	private int front, rear;
	
	public QueueOperations() {
		array = new int[MAX_SIZE];
		front = rear = -1;
	}
	
	public void enqueue(int element) {
		if (front == (rear + 1) % MAX_SIZE) {
			System.out.println("Queue is full. Cannot enqueue.");
			return;
		}
		if (front == -1) {
			front = rear = 0;
		} 
		else {
			rear = (rear + 1) % MAX_SIZE;
        	}
        	array[rear] = element;
		System.out.println("Enqueued: " + element);
	}
	
	public void dequeue() {
		if (front == -1) {
			System.out.println("Queue is empty. Cannot dequeue.");
			return;
		}
		System.out.println("Dequeued: " + array[front]);
		if (front == rear) {
			front = rear = -1;
		} 
		else {
			front = (front+1)%MAX_SIZE;
		}
	}
}

class Queue {
	public static void main(String[] args) {
		QueueOperations obj = new QueueOperations();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
	}
}
