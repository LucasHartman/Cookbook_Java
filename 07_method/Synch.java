
/*
Source: http://tutorials.jenkov.com/java-concurrency/synchronized.html#java-synchronized-tutorial-video

The synchronized mechanismwas Java's first mechanism for synchronizing access to objects shared by multiple threads.

Synchronized blocks in Java are marked with the synchronized keyword.
A synchronized block in Java is synchronied on some ojbect.
All synchronized blocks synchronized on the same object can only have one thread executing inside them at the same time.
All other threads attempring to enter the synchronized block are blocked until the thread inside the synchronized blocks exits the block

The synchronized keyword can be used to makr four different types of blocks:
    1. Instance methods
    2. Static methods
    3. Code blocks inside instance methods
    4. Code blocks inside static methods


*/
public class Synch {

    private int count = 0;

    public synchronized void add(int value) {
        this.count += value;
    }

}