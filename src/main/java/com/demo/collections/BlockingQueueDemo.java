package com.demo.collections;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        //thread safe queue
        //wait for queue to become non-empty/ wait for space
        //simplify concurrency problems like producer-consumer
        //standard queue -- immediately
          //empty -- remove (no-waiting)
         //full -- add (no-waiting)

       //blocking queue -- waiting
        //put --> Blocks if the queue is full, until space becomes available
        //take --> Blocks if the queue is empty, until an element is available
        //offer --> Waits for space to become available, until a specified time-out.

    }
}
