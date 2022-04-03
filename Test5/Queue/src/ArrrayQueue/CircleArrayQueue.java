package ArrrayQueue;

public class CircleArrayQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] array;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.front = -1;    // 指向队列头部，分析出 front 是指向队列头的前一个位置.
        this.rear = -1;     // 指向队列尾，指向队列尾的数据(即就是队列最后一个数据)
        this.array = new int[maxSize];
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    // 添加数据到队列
    public void enqueue(int i) {
        if (isFull()) {
            throw new RuntimeException("Add failed! The queue is full!");
        }
        rear++;     // 让 rear 后移
        array[rear] = i;
    }

    // 获取队列的数据, 出队列
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Delete failed! The queue is empty!");
        } else {
            front++;
            return array[front];
        }
    }

    // 显示队列的所有数据
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.printf("array[%d]=%d\n", i, array[i]);
            }
        }
    }

    // 显示队列的头数据， 注意不是取出数据
    public int peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Peek failed! The queue is empty!");
        }
        return array[front + 1];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
