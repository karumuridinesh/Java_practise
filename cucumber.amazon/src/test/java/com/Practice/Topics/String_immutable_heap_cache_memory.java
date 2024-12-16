package com.Practice.Topics;

public final class String_immutable_heap_cache_memory {
	public static void main(String[] args) {
	
	int x = 99+1;
	System.out.println(x);
	System.out.println("x hashcode is : "+System.identityHashCode(x));  // This gives a hash code that can be treated like an address
	int t = 99;
	System.out.println(t);
	System.out.println("t hashcode is : "+System.identityHashCode(t));  
	int y = 99;
	System.out.println(y);
	System.out.println("y hashcode is : "+System.identityHashCode(y));  // This gives a hash code that can be treated like an address
	String name = "ab";
	System.out.println(name);
	System.out.println("ab hashcode is : "+name.hashCode());
	
	String name1 = "ab"+"bc";
	System.out.println(name1);
	System.out.println("abbc hashcode is : "+name1.hashCode());
	String name2 = "ab";
	System.out.println(name2);
	System.out.println("ab hashcode is : "+name2.hashCode());

	
/*Explanation of Cache memory, Heap memory, String constant pool /string intern pool
In Java, memory is divided into various segments, each serving different purposes in terms of object storage and program execution.
 Two important types of memory are cache memory and heap memory, and within the heap, there is a special section called 
 the String Constant Pool.

1. Cache Memory
	Cache memory is a hardware-level memory located very close to the CPU. It is a small, high-speed memory used to store 
	frequently accessed data and instructions so that the CPU can access them quickly. It’s much faster than main memory (RAM) 
	but smaller in size.

In Java:

Java doesn’t directly manage or interact with hardware-level cache memory. The Java Virtual Machine (JVM) relies on the underlying 
hardware and operating system to manage caching at the processor level. However, Java programs benefit from cache memory, especially
during repeated access to objects or data that can be kept in the cache.Cache memory is crucial for improving the performance of
Java applications, as it minimizes the time it takes for the CPU to access data, which can reduce the latency caused by fetching
data from main memory (RAM).

2. Heap Memory
	Heap memory is a portion of memory allocated to store objects created during the execution of a Java application. Heap memory
	is managed by the Java Virtual Machine (JVM) and is where dynamically allocated objects and variables live.

Key Points:

Object Storage:	All objects created via new keyword are stored in heap memory. When an object is no longer referenced, it becomes 
				   eligible for garbage collection, where the JVM automatically frees up memory.
Dynamic Allocation: Heap memory is allocated at runtime, meaning objects of different sizes can be created dynamically as 
					the program runs.
JVM Management: The JVM manages heap memory using garbage collectors that clean up unused objects and reclaim memory.
Heap memory is divided into generations:

Young Generation: Where newly created objects are first placed.
Old Generation: Where long-lived objects are moved after surviving several rounds of garbage collection in the young generation.
Permanent Generation/Meta space: Stores metadata like class definitions, method definitions, and constant pool entries
 								 (in older JVM versions).

3.String Constant Pool (or String Intern Pool)
The String Constant Pool, also known as the String Intern Pool, is a special area in the heap memory where string literals 
are stored. The JVM uses this pool to optimize memory usage when dealing with strings.

How it works:
		When you create a string using a string literal, the JVM checks if that string already exists in the pool.
String s1 = "Hello";  // Stored in String Constant Pool
String s2 = "Hello";  // References the same string in the pool

	In the example above, both s1 and s2 point to the same memory location in the String Pool, rather than creating two separate 
	objects. This saves memory and allows for better performance, as strings are immutable and can safely be shared across different 
	parts of the program.
	If you create a string using the new keyword, it will be stored in the regular heap space, not the String Constant Pool, 
	unless explicitly interned using intern().
String s3 = new String("Hello"); // Creates a new object in the heap
String s4 = s3.intern();         // Forces s4 to refer to the String Constant Pool
Why use a String Pool?

Memory Efficiency: By storing only one copy of each literal string, the String Pool saves memory.
Performance: Since strings are immutable, referencing the same string from multiple places in the code doesn’t pose any risks of 
			 modification, leading to efficient memory usage without affecting program correctness.
Summary of Each Component:
Term	Description
Cache Memory:	A small, fast memory at the hardware level used by the CPU to store frequently accessed data.
Heap Memory:	A memory area in the JVM used to store dynamically allocated objects and variables.
String Constant Pool: A special area with in the heap memory where Java stores and reuses string literals to optimize memory usage.

Conclusion:
Cache memory operates at the hardware level, speeding up access to frequently used data.
Heap memory is managed by the JVM and holds objects created at runtime, including strings created with new.
The String Constant Pool is an area within the heap that optimizes the storage and reuse of string literals, improving both memory 
usage and performance in Java programs.
	*/

	        String str1 = "Java";    // Points to the String Constant Pool
	        String str2 = "Java";    // Same object as str1, from String Pool

	        String str3 = new String("Java");  // Creates a new object in the heap
	        String str4 = str3.intern();       // Now str4 points to the String Pool object

	        System.out.println(str1 == str2);  // true, both point to the same pool object
	        System.out.println(str1 == str3);  // false, str1 is in the pool, str3 is in the heap
	        System.out.println(str1 == str4);  // true, str4 is now interned in the pool
	    
/*Explanation of Strings are immutable
 
  Strings are immutable, meaning once a String object is created, its value cannot be changed. 
  This immutability is a core feature of the language, and it brings several benefits in terms of security, performance and 
  memory optimization. Here's a detailed explanation of why Java strings are immutable:

1. String Pool and Memory Efficiency
	Java maintains a special memory region known as the String Constant Pool. 
	When you create a string literal (e.g., "Hello"), Java checks if that string already exists in the pool. 
	If it does, the reference to that existing string is returned; otherwise, a new string is created and placed in the pool.

	If strings were mutable, changing the content of one string would affect all other references to that string in the pool. 
	This could lead to unpredictable behavior and bugs. Immutability ensures that once a string is in the pool,	it remains 
	constant and can be safely shared by multiple references.

	Example:
		String s1 = "Hello";
		String s2 = "Hello"; // Points to the same string in the pool
	If strings were mutable, changing s1 would also change s2, which could cause significant issues. Immutability prevents 
	such side effects.

2. Caching and Hashing Optimization
	Since strings are immutable, their hashCode can be cached. This is especially beneficial for strings that are used frequently 
	in data structures like HashMap and HashSet.When you create a String, its hash code is computed once and stored. 
	Every subsequent call to hashCode() returns the cached value, resulting in faster lookups. If strings were mutable, 
	every time a string's content changed, its hash code would need to be recomputed, leading to performance overhead.

	Example:

		String s = "Hello";
		int hash1 = s.hashCode(); // Cached value
		int hash2 = s.hashCode(); // Same cached value, no re-computation
3. Security
	Strings are widely used to store sensitive information such as user names, passwords, and file paths. Since strings are 
	immutable, once they are created, their content cannot be changed, which makes them more secure.
	For example, if a string containing a password were mutable, someone could change the content of the password string and 
	gain unauthorized access to sensitive information. With immutability, the original string remains secure, and any modifications 
	would require creating a new string.

	Example:
		String password = "securePassword";
		// Immutable password cannot be altered by malicious code
4. Thread Safety
	Immutability makes strings inherently thread-safe. Multiple threads can safely share and operate on the same string without 
	worrying about synchronization or concurrency issues, as the string's value cannot change once it is created.

	If strings were mutable, you would need to handle synchronization whenever multiple threads access or modify the string. 
	This would introduce complexity and potential performance bottlenecks in multi-threaded applications.

	Example:

		String sharedString = "ThreadSafe";
		// Multiple threads can access sharedString without risk of modification
5. Design and Simplicity
	Java's string immutability is part of its design philosophy. Strings are used extensively in programming, so having them 
	immutable simplifies both the language and the development process. By ensuring that strings cannot be altered once created, 
	Java avoids many common programming errors that arise from mutable objects, such as unintended modifications or aliasing problems.

6. Performance
	Immutability allows strings to be easily cached and reused. If strings were mutable, creating defensive copies of strings 
	would be necessary in many places to prevent changes to the original string, leading to inefficiencies and higher memory 
	consumption. With immutability, the JVM can reuse strings freely without worrying about unintended modifications.

7. Security in ClassLoader and Reflection APIs
	Strings are frequently used in the Java ClassLoader and reflection APIs. For instance, class names and method names are 
	passed as strings. If strings were mutable, malicious code could change the class or method names at runtime, leading to 
	potential security risks.

	With immutable strings, Java ensures that class or method names passed around in these sensitive APIs cannot be altered once 
	created, preventing tampering with the behavior of the application.

Conclusion
	String immutability in Java provides several crucial benefits:
	Memory efficiency through the String Pool.
	Performance optimizations via cached hash codes.
	Security by preventing unauthorized modifications.
	Thread safety as immutable objects can be shared across threads without synchronization issues.
	Simplicity and robustness in design, avoiding common issues like unintended object modifications.
	These reasons contribute to why Java makes strings immutable, and why this decision improves both the performance and 
	security of Java programs.	
*/	
	        // String Builder 
	StringBuilder sfb = new StringBuilder("Hello");
	sfb.append(" World");
	System.out.println(sfb);  // Hello World

	StringBuilder stb = new StringBuilder("Hello World");
	stb.delete(5, 11);  // Removes " World"
	System.out.println(stb);  // Hello
	
    // String Buffer 

	StringBuffer sb = new StringBuffer("Hello");
	sb.insert(5, " Beautiful");
	System.out.println(sb);  // Hello Beautiful World
	
	StringBuffer smb = new StringBuffer("Hello");
	smb.reverse();
	System.out.println(smb);  // olleH


}

}
