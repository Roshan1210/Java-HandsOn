package first;
//More about thread
//Creating Thread by implementing runnable interface
class MyThread implements Runnable{
	public void run() {
		System.out.println("Thread is in running State now");
	}
}

public class Hundredfour {
public static void main(String[] args) {
	Thread t=new Thread(new MyThread());
	t.start();
}
}
//notes
//An interrupt is an indication to a thread that it should stop what it is doing and do something else
//Blocked state
//1)Sleep 2)join (waiting for the thread to finish execution)3)Blocked on monitor(Lock-Trying to access a locked Shared Resource
//4)Blocked on i/o 5)Blocked on Wait Signal

//When can we interrupt a thread?
//interrupt() method: If any thread is in sleeping or waiting for a state then using the interrupt() method,
//we can interrupt the execution of that thread by showing InterruptedException. A thread that is in the sleeping or 
//waiting state can be interrupted with the help of the interrupt() method of Thread class.

//Daemon threads are low priority threads which always run in background and user threads are high priority
//threads which always run in foreground. User Thread or Non-Daemon are designed to do specific or complex 
//task where as daemon threads are used to perform supporting tasks.


//JVM doesn’t wait for daemon thread to finish but it waits for User Thread : First and foremost
//difference between daemon and user threads is that JVM will not wait for daemon thread to finish 
//its task but it will wait for any active user thread. For example, one might have noticed this behavior 
//while running Java program in NetBeans that even if the main thread has finished, the top left 
//down button is still red, showing that Java program is still running. This is due to any user 
//thread spawned from the main thread, but with main thread one don’t see that red dot in NetBeans.

//Thread Priority : The User threads are high priority as compare to daemon thread means they won’t get CPU 
//as easily as a user thread can get.
//Creation of Thread : User thread is usually created by the application for executing some task concurrently.
//On the other hand, daemon thread is mostly created by JVM like for some garbage collection job.
//Termination of Thread : JVM will force daemon thread to terminate if all user threads have finished 
//their execution but The user thread is closed by application or by itself. A user thread can keep running 
//by the JVM running but a daemon thread cannot keep running by the JVM. This is the most critical difference 
//between user thread and daemon thread.
//Usage : The daemons threads are not used for any critical task. Any important task is done by user thread.
//A daemon thread is generally used for some background tasks which are not critical task.

//As we know Java has a feature, Multithreading, which is a process of running multiple threads simultaneously.
//When multiple threads are working on the same data, and the value of our data is changing, that scenario is not
//thread-safe and we will get inconsistent results. When a thread is already working on an object and preventing 
//another thread on working on the same object, this process is called Thread-Safety. 


//Using Synchronization
//Synchronization is the process of allowing only one thread at a time to complete the particular task. 
//It means when multiple threads executing simultaneously, and want to access the same resource at the same time, 
//then the problem of inconsistency will occur. so synchronization is used to resolve inconsistency problem by allowing only one thread at a time. 
//Synchronization uses a synchronized keyword. Synchronized is the modifier that creates a block of code known as a critical section. 

//Using Volatile keyword
//
//
//A volatile keyword is a field modifier that ensures that the object can be used by multiple threads at the same
//time without having any problem. volatile is one good way of ensuring that the Java program is thread-safe. 
//a volatile keyword can be used as an alternative way of achieving Thread Safety in Java.
// 

//Final Variables are also thread-safe in java because once assigned some reference of an object 
//It cannot point to reference of another object. 

//What is race condition in Java thread?
//What is race condition? A condition in which the critical section (a part of the program where shared memory is accessed) is concurrently 
//		executed by two or more threads. It leads to incorrect behavior of a program.

//A race condition occurs when two threads use the same variable at a given time
//A race condition occurs when two or more threads can access shared data and they try to change it at the same time.


//Critical section is a code section which leads to RACE Condition 

//to prevent race condition chk synchronization ,volatile keyword

//If you want to control synchronization to a specific object, or you only want part of a 
//method to be synchronized to the object, then specify a synchronized block. If you use the 
//synchronized keyword on the method declaration, it will synchronize the whole method to the object or class.


//Inter-thread communication in Java is a mechanism in which a thread is paused running in its critical section and another thread is 
//allowed to enter (or lock) in the same critical section to be executed.

//Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other


//Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in
//its critical section and another thread is allowed to enter (or lock) in the same critical 
//section to be executed.It is implemented by following methods of Object class:
//
//wait()
//notify()
//notifyAll()
//
//.


//1) wait() method
//The wait() method causes current thread to release the lock and wait until either another
//thread invokes the notify() method or the notifyAll() method for this object, or a specified amount of time has elapsed.
//
//The current thread must own this object's monitor, so it must be called from the synchronized method only otherwise it will throw exception.


//2) notify() method
//The notify() method wakes up a single thread that is waiting on this object's monitor.
//If any threads are waiting on this object, one of them is chosen to be awakened.
//The choice is arbitrary and occurs at the discretion of the implementation.


//notifyAll() method
//Wakes up all threads that are waiting on this object's monitor.
