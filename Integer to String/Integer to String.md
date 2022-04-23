* int is value of primitive type
* Integer is an object that wraps value of primitive int type.

To convert integer to string,
three methods:
1. Integer.toString(n)
2. String.valueOf(n)
3. String = "" + n

#### Difference between == and equals()
```
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

System.out.println(s1 == s2); 	//true
System.out.println(s1.equals(s3));	//false
```

* both used to compare objects in Java.
* equals() is method, == is operator
* == is used to compare the objects ("container"), not content. Comparing the memory location of objects in a heap.
* == is for every primitive type, including boolean, integer, char, double.
* equals() method is used to compare value in 2 objects, data/content in 2 strings.

#### What is heap memory and stack memory?
* Memory is organized into heap memory and stack memory.
* Heap memory is dynamically allocation. 
* Allocated by random access.
* Dynamic allocation is by the malloc() function in C.
* Memory allocated remains allocated until it is freed or the program terminates.
* Heap memory used when object created using "new" operator.
* If pointer reference to this allocated memory is lost, you have a memory leak.
* That is, memory is still allocated, but cannot be accessed easily anymore.
* Leaked memory cannot be reclaimed for use, but will be freed by OS when program ends.
* Stack memory is memory allocated to local variables defined by a method. Usually remain allocated until function returns (except static local variables).
* Stack memory is released in first-in-last-out basis, i.e. data element is freed in reverse order they were allocated.

#### String to Integer conversion
1. Integer.parseInt() returns primitive type int.
* Will get NumberFormatException error if input string does not contain valid integer.
* So use try-catch block
```
String str = "123";
try 	{
	int number = Integer.parseInt(str);
	System.out.println(number);
	}
catch (NumberFormatException ex) {
	ex.printStackTrace();
	}
```
2. Integer.valueOf() returns integer object, equivalent to new Integer(Integer.parseInt()).
```
String str = "123"
Integer num = Integer.valueOf(str);
```
To check, can do pattern matching.
* take string as argument and check if it contains numbers.
```
  if (s != null && s.matches("^[+-]?\\d+$")) {
  System.out.println("true");
  }
```
Meaning of regex:
* ^ means start of string
* $ means end of string 
* [+-] means positive or negative sign
* ? means occuring zero or one time 
* \\d+ first \ is to escape, \d means digit, + means occuring one or more times
