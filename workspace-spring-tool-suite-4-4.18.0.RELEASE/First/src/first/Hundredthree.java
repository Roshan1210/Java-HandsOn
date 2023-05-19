package first;
//MultiThreading in Java
//Multithreading is a Java feature that allows concurrent execution of two or more parts of 
//a program for maximum utilization of CPU. Each part of such program is called a thread. 
//So, threads are light-weight processes within a process.


////Concurrency means executing multiple tasks at the same time but not necessarily simultaneously.
//There are two tasks executing concurrently, but those are run in a 1-core 
//CPU, so the CPU will decide to run a task first and then the other task or
//run half a task and half another task, etc. Two tasks can start, run, 
//and complete in overlapping time periods i.e Task-2 can start even
//before Task-1 gets completed. It all depends on the system architecture.


//Parallelism means that an application splits its tasks up into smaller subtasks which can be 
//processed in parallel, for instance on multiple CPUs at the exact same time.
//
//Parallelism does not require two tasks to exist. It literally physically run parts of 
//tasks OR multiple tasks, at the same time using the multi-core infrastructure of 
//CPU, by assigning one core to each task or sub-task.

//A system is said to be concurrent if it can support two or more actions in progress 
//at the same time. A system is said to be parallel if it can support two or 
//more actions executing simultaneously.

//Concurrency is about dealing with lots of things at once.
//Parallelism is about doing lots of things at once.

//Process	Thread
//1.	Process means any program is in execution.	Thread means a segment of a process.
//2.	The process takes more time to terminate.	The thread takes less time to terminate.
//3.	It takes more time for creation.	It takes less time for creation.
//4.	It also takes more time for context switching.	It takes less time for context switching.
//5.	The process is less efficient in terms of communication.	Thread is more efficient in terms of communication.
//6. 	Multiprogramming holds the concepts of multi-process.	We don’t need multi programs in action for multiple threads because a single process consists of multiple threads.
//7.	The process is isolated.	Threads share memory.
//8.	The process is called the heavyweight process.	A Thread is lightweight as each thread in a process shares code, data, and resources.
//9.	Process switching uses an interface in an operating system.	Thread switching does not require calling an operating system and causes an interrupt to the kernel.
//10.	If one process is blocked then it will not affect the execution of other processes 	If a user-level thread is blocked, then all other user-level threads are blocked. 
//11.	The process has its own Process Control Block, Stack, and Address Space.	Thread has Parents’ PCB, its own Thread Control Block, and Stack and common Address space.
//12.	Changes to the parent process do not affect child processes.	Since all threads of the same process share address space and other resources so any changes to the main thread may affect the behavior of the other threads of the process.
//13.	A system call is involved in it.	No system call is involved, it is created using APIs.
//14.	The process does not share data with each other.	Threads share data with each other.
//


//Creating Thread
//1)By extending Thread class

class ImplThread extends Thread{
	public void run() {
		System.out.println("Thread is running state........");
	}
}

public class Hundredthree  {
public static void main(String [] args) {
	ImplThread t=new ImplThread();
	t.start();
}
}
