package CircleArrayQueue;

public class CircleArrayQueue {
    private int maxSize;
    // front 变量的含义做一个调整： front 就指向队列的第一个元素, 也就是说 arr[front] 就是队列的第一个元素
    // front 的初始值 = 0
    private int front;
    // rear 变量的含义做一个调整：rear 指向队列的最后一个元素的后一个位置. 因为希望空出一个空间做为约定.
    // rear 的初始值 = 0
    private int rear;
    private int[] array;

    public CircleArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.array = new int[maxSize];
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    // 添加数据到队列
    public void enqueue(int i) {
        if (isFull()) {
            throw new RuntimeException("Add failed! The queue is full!");
        }
        array[rear] = i;
        // 将 rear 后移, 这里必须考虑取模
        rear = (rear + 1) % maxSize;
    }

    // 获取队列的数据, 出队列
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Add failed! The queue is empty!");
        }
        // 这里需要分析出 front 是指向队列的第一个元素
        // 1. 先把 front 对应的值保留到一个临时变量
        // 2. 将 front 后移, 考虑取模
        // 3. 将临时保存的变量返回
        int value = array[front];
        front = (front + 1) % maxSize;
        return value;
    }

    // 显示队列的所有数据
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < front + this.size(); i++) {
            System.out.printf("array[%d]=%d\n", i % maxSize, array[i % maxSize]);
        }
    }

    // 求出当前队列有效数据的个数
    public int size() {
        // rear = 2
        // front = 1
        // maxSize = 3
        return (rear + maxSize - front) % maxSize;
    }

    // 显示队列的头数据， 注意不是取出数据
    public int peekFront() {
        if (isEmpty()) {
            throw new RuntimeException("Peek failed! The queue is empty!");
        }
        return array[front];
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
