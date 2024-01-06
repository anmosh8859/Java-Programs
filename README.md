Notes created by Anand Mohan Sharma:


What is Java?
Java is a Technology consisting of both a programming language and a software platform.
To create an application using Java, you need JDK (Java Development Kit) which is available for windows, MacOS and Linux.
Languages work on Java
•	Clojure
•	Groovy
•	J Ruby
•	Jython
•	Kotlin
•	Scala and 50+ languages can run Java on platform.
You can develop a variety of application using java for laptops, data centers, game consoles, scientific super computers, mobile phones etc.
Java is the world’s third most popular programming language after Python and C- according to TIOBE index (website that shows the popularity of language).
What is JAVA as a language?
•	Java is High Level, class based, object oriented Programming Language.
•	It is general purpose programming language.
•	Compiled Java code can run on all platforms.
•	Java is developed in C++ language.
The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them.
History of Java:
Java was developed by James Gosling at Sun Microsystems Inc.
SUN: Stanford University Network
Company sold computers, computer components, and software and information technology services.
Company is known for the creation of Java, SOLARIS operating system, NFS (Network File System) and SPARK microprocessors.
Problem in 1980s
Multiple incompatible hardware architectures, each supporting multiple incompatible operating systems with each platform operating with one or more incompatible graphical user interfaces.
In such a scenario it was frustrating to develop application in C or C++, which were platform dependent programming languages.
•	The stealth project started to solve this problem.
•	Soon it was renamed to the Green Project.
•	The team originally considered C++, but rejected due to many reasons like lack of garbage collection. Programmer had to manually manage system memory.
o	Lack of security.
o	Lack of distributed programming.
o	Lack of threading.
o	Lack of portability.
Bill joy proposed to SUN that they should produce and object oriented environment based on C++.
Initially, James Gosling attempted to modify and extend C++, but soon abandoned that in favor of creating a new language, he called oak, after the tree that stood just outside his office.
The goal was to develop a small, reliable, portable, distributed, real time operating platform.
The result is a language platform that has proven ideal for developing secure, distributed, network based end user applications in environments ranging from network embedded devices to the world wide web and desktop.
Finally, the project was renamed to JAVA from Java Coffee.
Java was originally designed for interactive television but it was too advanced for the digital cable television industry at the time.
Java was originated in 1991.
In 1994, the team retargeted the platform for the World Wide Web.
They felt that with the advent of graphical web browsers like MOSAIC the internet could evolve into the some highly interactive medium that they had envisioned for cable TV.
Although Java 1.0a became available for download in 1994, the first public release of Java, Java 1.0a2 with the HotJava browser, came on 23 May 1995.
On Record
First version of Java released in Jan 1996.
Java 1.0 – Jan 1996.
WORA
Principle of Java:
Write Once Run Anywhere



•	Sun purchased MySQL AB in 2008 for US $1 billion.
•	On 27 January 2010, Oracle acquired SUN for US $7.4 billion.
Java Platforms
1.	Java Platform, standard Edition (Java SE) (Core Java)
2.	Java Platform, Enterprise Edition (Java EE) (Advance Java)
3.	Java Platform, Micro Edition(Java ME) (Micro Edition for mobiles)
Versiion History of Java
•	Java Alpha & Beta 	1995
•	Java 1.0			Jan 1996
•	Java 1.1			Feb 1997
•	Java 1.2[J2SE]		Dec-1998
•	Java 1.3[J2SE]		May-2000
•	Java 1.4[J2SE]		Feb-2002
•	Java 5.0[J2SE]		Sep-2004
•	Java SE6		Dec-2006
•	Java SE 7		Jul-2011
After purchased by the Oracle
Note: Java 8 is long term supported.
•	Java SE 8 LTS 		Mar-2014
•	Java SE 9		Sep-2017
•	Java SE 10		Mar-2018
•	Java SE 11		Sep-2018
•	Java SE 12		Mar-2019
•	Java SE 13		Sep-2019
•	Java SE 14		Mar-2020
•	Java SE 15		Sep-2020
•	Java SE 16		Mar-2021
•	Java SE 17 LTS		Sep-2021
Features of Java
•	Simple
•	 Object Oriented Language
•	Distributed
•	Interpreted
•	Robust
•	Secure
•	Portable
•	Multi-threaded: Multiple methods can run at the same time.
•	Automatic Memory management.
Java Development Kit 
It implements the Java Language and the Java Virtual Machine Specification and provides the Standard Edition (several predefined libraries) of the Java Application Programming Interface.
Java Virtual Machine
JVM is software, enables a computer to run Java programs as well as programs written in other languages that are also compiled to Java byte code.
JVM contains JIT compiler (Just in time Compiler), where job is to translate byte code into OS specific machine code.
								Java program is converted to byte code
								which is understood by JVM


								JVM converts the code to operating 
system specific code with the help of JIT

									OS runs the hardware according 
									to the Java program.
								 

JVM contains three major components:
1.	Class Loader
2.	Runtime Memory/Data Area
3.	Execution Engine (contains JIT compiler & Garbage collector)
JRE (Java Run-Time Environment)
If you want to run Java Program, but not develop them, then download JRE and not JDK.
JDK includes JRE, so if you are downloading and installing JDK, then no need to download JRE Separately.










How does a C/C++ program develop and run?




















How does a Java program develop and run?




















JIT Compiler
Reads Byte Code and translate to underlying OS specific machine code and stores in some temporary file until the CPU is executing the previous code.
Before Exploring First Program:
1.	Java is a case sensitive language.
2.	Java statements are terminated at ;
3.	To make even a smallest program in Java, you must define a class.
4.	No concept of non-member function.
5.	No concept of membership label.
Note*:-Java does not consider as pure object oriented language.
First Java Program
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
Run:	Hello World!
Note*:-
•	File name must be same as class which consists, main function. 
•	main function must be “static” so that it can called without making any object of its parent class as, no real object of parent class exist in real world.
•	main function must be public so that it can be called by JVM from outside of its parent class.
•	In java there is no pointers but reference variable both work same, stores the address of another variable. Ultimately, reference variables are internally pointers. 
•	‘System’ is a class, ‘out’ is a static reference variable which is referring an object of class “PrintStream”and ‘println’ is a instance member function of “PrintStream”.
Various Notations used in Java Programs:
•	camelCase: Used to name variables, references and functions.
•	PascalCase: Used to name classes and interfaces in Java.
•	snake_case: Mostly used in C/C++ to name identifiers.
Comments:
•	Block Style/Multiline comments
	/* comment here */
•	Single line Comment
// comment here
•	Document Style comment
/** comment here*/
Constants and Literals:
Constants or literals are data used for representing fixed values.
Integer literals
•	Decimal literals(Base 10): 25,-35,0
•	Octal literals(Base 8): 031
•	Hexadecimal literals (Base 16): 0x51
•	Binary literals (Base 2): 0b1101
Floating point literals (Real Constants)
152.487
Character literals
‘a’
String literals
“The Anand Mohan Sharma”
Boolean literal
true, false
Variables:
Variable is a named identifiers, used to represent memory location where we store some program’s data.
Java is a statistically typed programming language. You must have to mention data type of the variable during declaration of variable.
A variable name is any combination of alphabet, digit and underscore.
A valid variable name cannot start with a digit.
Keywords:
abstract	double	int	super
assert	else	interface	switch
boolean	enum	long	synchronized
break	extends	native	this
byte	final	new	throw
case	finally	package	throws
catch	float	private	transient
char	for	protected	try
class	goto(removed in new java version)	public	void
const(removed in new java version)	if	return	volatile
continue	implements	short	while
default	import	static	true
do	instanceof	strictfp	false
	null
Escape Sequences:
\n New line 	\f form feed
\t tab space	\\ print \
\b  backspace	\” print “
\r carriage	\’ print ‘
About J Shell
JShell is available from Java SE 9 to execute single line code of java directly.
Data Types
Data type is a category of data.
Java is strongly and statistically typed language.
Data Types
•	Primitive Data Types:
Data Types	Max-Value	Min-Value	Size of Primitive type
boolean			Implementation despendent
byte	127	-128	1 byte = 8 bit
char			2 byte = 16 bit
short	32767	-32768	2 byte = 16 bit
int	2147483647	-2147483648	4 byte = 32 bit
long	9223372036854775807	-9223372036854775808	8 byte = 64 bit
float	3.4028235E38	1.4E-45	4 byte = 32 bit
double	1.7976931348623157E308	4.9E-324	8 byte = 64 bit

o	Boolean: In java it doesn’t mean that every non-zero value is true and zero means false, you just have to mention the true or false directly.
o	Char(Character): Here we use Unicode character table other than ASCII character table.
•	Non Primitive Data Types:
o	Primitive data types are predefined in the compiler as they are keywords. 
o	Non primitive data types are classes. Every class is a data type. 
o	String is a class; therefore String is a non-primitive data type.
o	You can also define a class and create your own data type. 
o	No concept of structure in Java.



Variable Declaration
int counter;			Why
double temp;			variables		Value type variable(Value type)
String name;
int [] ages;			are different from
char [] letters;			variables?		Reference Variable (Nullable Type)
char m;
Student S1;
Note* Null can only be stored in reference variable.
Type Conversion
Every expression written in Java has a type that can be deduced from the structure of the expression and the types of the literals, variables and methods mentioned in the expression.
There is types of constants as the variables. By default Integer literal is of int type, Real literal is of double type while Character type is of int type.
Widening Conversion:
int x=3;
float y=x; // Widening Conversion no error
Narrowing Conversion:
•	float k=3.5;	Error
•	float k=3.5f;	Correct
•	float y=3.4f;	Correct
int x=y;		Error
•	int x=(int)y;	Correct
Note*: 	By default Java only does Widening conversion. Because, Narrowing Conversion can do Data loss.
Permitted Conversion
•	byte	to	short, int, long, float, double
•	short	to	int, long, float, double
•	char	to	int, long, float, double
•	int	to	long, float, double
•	long	to	float, double
•	float	to	double
Classification of Operators
Operators are used to manipulate data to produce useful information.

3              4

•	Unary Operator (+,-,++,--)
o	Note: Increment and decrement will work only on variables and not constants.
•	Arithmetic Operators: *,/,%
+,-
o	Note: 
	Associativity is left to right.
	Unlike C, java allows real constants with modulo operator.
	If numerator has “ – “ sign then remainder will be negative, but negative denominator will not give negative remainder.
i.e.,	5 % 2 = 1
	-5 % 2 = -1
	5 % 2 = 1
	-5 % -2 =-1
•	Bitwise Operator:
o	& ( BINARY AND)
=> 200 => 11001000
		=> &50 => ¬00110010
		=>   00	    00000000 
o	| ( BINARY OR)
o	^ (XOR)
o	~ ( BINARY NOT)
o	>> (RIGHT SHIFT)
=> 200 >> 2
		=> 11001000 >> 2 = 110010
		=> 50 
o	<< (LEFT SHIFT)
=> 12 << 2
		=> 1100 << 2 = 110000
		=> 96


•	Rational Operators:	< , >, <=, >=
==, !=
o	Note: 
	Always returns Boolean type result.
	int type cannot be converted to Boolean type, and vice versa.
•	Logical Operator
o	! NOT
i.e., !boolean
	!true => false
	!false => true
o	&& AND
i.e., boolean && boolean
	true && true => true
	true && false => false
	false && true => false
	false && false => false
o	|| OR
i.e., boolean || boolean
	true || true => true
	true || false => true
	false || true => true
	false || false => false

	Note: Each logical operator must be have boolean operands otherwise it will give error.
•	Assignment Operators: =, +=, -=, *=, /=, %=
o	Note:	x=5	right
5=x;	wrong
4=3;	wrong
•	Instance of Operator: This operator is to check whether the object is made of given class.
i.e., object instanceof  ClassName/SubClass/interface
	Result will either be True or False.









Decision Control Statements
•	if
if(condition){
	…………….;
	…………….;
}
Note:
o	Condition must be evaluated as a Boolean value.
•	if else
•	conditional operator
o	Syntax: 	condtion?statement1:statement2;
	If condition is true then statement1 will execute otherwise statement2 will execute.
	Conditional operator is an expression.
•	Nested if else
•	if else ladder
Iterative Control Statement
•	while
Syntax:	while(condition){
	……………;
	……………;
}
o	NOTE: Condition must be evaluated as a Boolean value (true or false).
•	do while
Syntax:	do{
	……………;
	……………;
} while(condition)
•	for
Syntax:	for(initialization ; condition ; flow ){
	……………………..;
	……………………..;
}
•	break: 
o	The break is a control transfer statement.
o	It is a keyword.
o	It is used in the body of loop to terminate the execution of the loop.
o	When the break statement is encountered inside a loop, the loop iteration stops and control moves to the first statement after the loop.
o	break can also be used in the body of switch.

o	Labbelled break:
	Example:	first:
for(int i=1;i<=10;i++){
	for(int j=1;j<=5;j++){
	if(i+j=8)
		break first;
	System.out.println(i+j);
}
}
•	Continue:
o	Continue is a keyword.
o	It is used only in the body of loop.
o	It is used to skip the current iteration.
o	Syntax:
	while(condition){
…………………;
………………...;
if(condition)
	continue;
………………..;
}
	for(		;	;	){
…………………;
………………...;
if(condition)
	continue;
………………..;
}
	Note: You can use labeled continue as well.
•	for each
for each loop is applicable on collection of values to access all the elements one by one from first element to the last element.
Syntax: 	for(type var: array){
			…….;
			…….;
…….;
} 




Switch case control
Switch is a multi-way branch statement. ‘switch’ is a keyword.
Syntax:
	switch(expression){
	case constant 1:
		……………………..;
	case constant 2:
		……………………..;
		.
		.
		.
	default:
		……………………..;
}
Java switch expression must be of byte, short, int, long, enums, string and wrapper classes.
Variables are not allowed in case constant.
•	Case constants are not necessarily in sequence.
•	default can be placed anywhere in the switch.
•	Case constant cannot be real constant.
Optionally, break can be used to move control outside switch block.
Nesting of switch is also possible.
Object Oriented Programming Language
•	Java is an object oriented programming language.
•	Real world is full of objects.
•	Object is used to represent a real world entity.
•	Class is a description of object.
•	Object is an instance of a class.
Key concepts of OOPs:
1.	Encapsulation
An act of combining properties and methods related to the same entity is called Encapsulation.
Encapsulation can be implemented by defining class.
o	Classes:
	Class is a description of an object.
	Class is a blueprint of an object.
	Class == Common Noun
	Class is a way to achieve encapsulation.
	Class is defined with the class keyword.
class ClassName{
……………………………..;
}
o	Object:
	Object is an instance of a class.
	Object == Proper noun.
	Object is a real world entity.
	Object can be created using class.
o	Instantiation:
	In C++ can be created in two ways.
•	SMA
Box b1;	//b1 is an object in C++;






•	DMA
Box *p =new Box;
	or
Box *p=new Box();


•	Instantiation  in Java, object can be created only by DMA.
Box *p =new Box;
	or
Box *p=new Box();
o	b1 is not an object.
o	b1 is a reference variable.
o	b1 is of nullable type.
o	If b1 is a local variable then it is blank when not initialized.
Reference Variable
C++
•	Any type.
•	Use & to declare.
•	Mandatory to initalize during declaration.
•	Cannot modify	Java
•	Only class type.
•	No symbol required.
•	Optional
•	Can Modify




Java Program
Method 1
public class Box {
    int length, breadth, height;
    void setDimension(int x, int y, int z){
        length=x;
        breadth=y;
        height=z;
    }
    void showDimension(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Height: "+height);
    }

    public static void main(String[] args) {
        Box b1= new Box();
        b1.setDimension(20,40,60);
        b1.showDimension();
    }
}
Method 2
public class Box {
    int length, breadth, height;
    void setDimension(int x, int y, int z){
        length=x;
        breadth=y;
        height=z;
    }
    void showDimension(){
        System.out.println("Length: "+length);
        System.out.println("Breadth: "+breadth);
        System.out.println("Height: "+height);
    }
    public class Main {
        public static void main(String[] args) {
            Box b1 = new Box();
            b1.setDimension(20, 40, 60);
            b1.showDimension();
        }
    }
}
Garbage Collector:
Garbage collector is a part of JVM, whose job is to release memory of unreferenced objects from the heap.
Automatic memory management or automatic garbage collection is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects.
In programming languages like C or C++, allocating and de-allocating memory is a manual process.
How garbage collection works?
o	Step-1: Marking
	It is the process of marking not in use objects.
	All the objects are scanned in the marking phase to make this determination. This can be very time consuming process.
o	Step-2: Normal Deletion
	Removes unreferenced objects.
	Memory allocator holds the references to the free spaces.
Deletion with compacting
In addition to deletion, compacting referenced objects by moving referred object together.
Static Members:
Static
static is a keyword.
Static member means it belongs to the type(class) itself and not to the instances of that type.
static keyword can be used in java as:
	static members variables or static variable.
	static methods
	static blocks
	static classes (nested class)
o	Nested concept of static local variable in java.
o	Outer class can never be static.
Static Variables
o	Static variables are declared in class using static keyword.
o	Static variables are by default initialized to its default value.
o	Static variables have a single copy for the whole class and do not depend on the objects.

class Example{
int x; // instance variable
static int k; //static variable
}

Object can access static member of the class.


Methods to access static variable:
	classname.staticVariable;
	objectname.staticVariable;
Type of Variables on the basis of scope
o	Instance Variable
o	Local Variable
o	Static Variable
Default value of Instance or static variables:
a.	Value type variable.
b.	nullable type variables.
Local Variables are blank by default.
No concept of garbage value.
Why Java is completely Object Oriented language?
Java is an object oriented programming language and as said everything in Java is an object.
But primitive type are sort of left out in the world of objects, that is they cannot participate in the object activities.
Wrapper Classes
As a solution to this problem, Java allows you to include the primitives in the family of objects by using what are called Wrapper Classes.
There is a wrapper class for every primitive data type in Java.
This class encapsulates a single value for the primitive data type.
Wrapper classes are used to convert primitive types into object and vice-versa.
Auto-boxing:
	Convert primitive to object.
	int x=20;
	Integer i1=x; //Autoboxing
	int x=20;
	Integer i1=Integer.valueOf(x); //Explicit Conversion
	valueOf():
•	It is a static method.
•	It return object reference of relative wrapper class.
	int x=20;
	Integer i1=new Integer(x); //Explicit Conversion
Unboxing:
	Object to primitive.
	Integer i1 = new Integer(20);
	int a=i1.intValue(); //Explicit Conversion
		or
int a =i1;//unboxing
Primitive Type	Wrapper Class
boolean	Boolean
byte	Byte
Char	Character
short	Short
int	Integer
Long	Long
float	Float
double	Double

2.	Data Hiding
3.	Abstraction
4.	Polymorphism
5.	Inheritance
Packages & Import
•	Packages are nothing more than the way we organize files into different directories according to their functionality usability as well as category they should belong to.
•	File in one directory (or package) would have different functionality from those of another directory.
Example: Files in java.io package do something related to I/O, but files in java.net package give us the way to deal with the network.
Benefit
o	Packaging also helps us to avoid class name collision when we use the same class name as that of others.
o	The benefits of using package reflect the ease of maintenance, organization and increase collaboration among developers.




Creating Package
o	Suppose we have a file called HelloWorld.java and we want to put this file in a package World.
HelloWorld.java: 
package World;
public class HelloWorld{
	public static void main(String []args){
		System.out.println("Package Inside");
	}
}
Compilation Technique: javac -d . HelloWorld.java
Run Technique: java packagename.ClassName
o	Suppose we have a file called HelloWorld.java and we want to put this file in a package World.
General Error:
‘javac’ is not recognized as an internal or external command, operable program or batch file. When you get this error, you should conclude that your operating system cannot find the compiler.
Set PATH of javac so that OS can find it.

Import
o	To use classes that reside in another package, we need to use import statement.
o	You can import whole package or a particular class using one import statement.
o	Syntax:
	import package.*;
	import package.ClassName;
o	Write import statement at the beginning of java file.
o	Example:
import java.time.LocalDateTime;
public class DateAndTime {
    public static void main(String[] args) {
        LocalDateTime t=LocalDateTime.now();
        System.out.println(t);
    }
}
Multiple classes in a java file
o	We can have only one public class in a single java file.
o	Name of the file should be same as the name of public class.
o	In absence of public class, any class name can be given to the file name.





Scanner Class
•	We can read java input from System.in using scanner class.
•	Scanner is final class, that is, cannot be extended.
•	A scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
•	The constructor of Scanner class requires on argument to initiate.
•	The resulting tokens may then be converted into values of different types using the various next methods.
•	Scanner class is a part of java.util package.
Example:
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Name in one word: ");
        String name=sc.next();
        System.out.println("Enter the age of person: ");
        while(!sc.hasNextInt()) /* This will empty the buffer untill it has any element other than integer.*/
                    sc.next();
        int age= sc.nextInt();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

Output: Enter the Name in one word: 
Anand Mohan Sharma
Enter the age of person: 
25
Name: Anand
Age: 25

Note*: To store full String(with spaces) we use nextLine() function.
For More Visit: https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
Access Modifiers
Java supports four categories of accessibility rules: 
•	private
•	protected
•	public
•	default (not keyboard i.e., absence of private, protected & private )
Modifiers can be used for class, member variables and member functions.

Accessibility of Class
•	There can be only two possibilities, either class is a public class or just a class which means it is of default type.
•	There can be only one public class in a single java file.
•	The name of the java file must be the same as the name of the public class.
•	Only public class can be accessed directly from outside the package.
Accessibility of Members
•	private: Members cannot be accessed from outside the class body.
•	default: Members are accessible only from the classes of some same package.
•	protected: members are accessed from any class of the same package and subclasses of any package.
•	public: members are accessible from any class of any package.
Constructor
•	Constructor is a special member of the class whose name is the same as the name of the class.
•	Constructor has no return type.
•	Constructor are called implicitly only once at the time of object creation.
•	Example: class Demo{
    public Demo(){
        
    }
}
•	When there is no constructor defined in the class by programmer, compiler implicitly provide a default constructor for the class.
•	Constructors can be parameterized.
•	 Constructors can be overloaded.
•	Constructor cannot be abstract, final, static or synchronized.
•	Any access modifier can be used on constructor.
•	Why Constructer?
o	Object is a real world entity, that is, it must be a representation of a real world thing.
o	In order to represent a real world entity, an object must have the same state as of the entity.
o	To make it possible object member variables must be initialized with appropriate values.
•	Copy Constructor
o	Unlike c++, Java doesn’t create a default copy constructor.
o	You can define an explicit copy constructor.
•	Private Constructor
o	What will happen when you define a private constructor in your class?
o	You can access private members only within the class.
o	Why there is a need to create private constructor?
	To prevent making objects directly in any other class by new keyword, we could use private constructor.
	To make the Singleton Class.
•	Singleton Class: If only one instance of a class can be created, then it is called singleton class.
o	Design Pattern of Singleton Class:
	Class should contain:
•	private static reference variable of same class type.
•	private constructor.
•	public static method returning object reference. Method may return null when object is already created.
Inheritance
Inheritance is a mechanism in Java by which one class is allowed to inherit the features (fields and methods) of another class.
Object oriented programming allows classes to inherit commonly used state and behavior from other classes.
Syntax:	class Subclass extends SuperClass{
}
extends is a keyword
Base class = Super class = Parent class
Derived class = Sub class = Child class

*NOTE*: In java, each class is allowed to have one direct super class, and each superclass has the potential for any number of sub classes.
Benefits of Inheritance
•	Code reusability.
•	Abstraction: Abstraction is a process of hiding the implementation details and showing only functionality to the user.
•	Updating the methods
•	Easy Modification



*Generalization Example*
Hierarchical Relationship



	


Member Accessibility Rule: 
•	Subclass can access public and protected members of superclass.
•	Subclass can also access default members if it is in the same package as of superclass.
“this” and “super” reference variables:
•	this
	The “this” object reference is a local variable in instance member methods referring the caller object.
	“this” keyword is used as a reference to the current object which is an instance of the current class.
	The “this” reference to the current object is useful in situations where a local variable hides or shadow, a field with same name.
	If a method needs to pass the current object to another method, it can do so by using this reference.
	Note: Note that the this reference cannot be used in a static context, as static code is not executed in the context of any object.
•	super
	The keyword ‘super’ also references the current object, but as an instance of the current class’s super class.
	The keyword ‘super’ can be used to resolve name conflicts between superclass and subclass.



Constructors in Inheritance
1.	Construction Inheritance
o	Constructors are not inherited by subclass.
o	Subclass’s constructor invokes constructor of super class.
o	Explicit call to the super class constructor from sub class’s constructor can be made using super ().
2.	Constructor Chaining
o	Constructor can call other constructors of the same class or superclass.
o	Constructor call from a constructor should be the first step. (Call should appear in the first line)
o	Such series of invocation of constructors is known as constructor chaining.
Abstract Class and Methods
C++
	There was no abstract keyword in C++ but, concept of abstract class was there.
	What is abstract class in C++?
It is a class which cannot be instantiate, that is, you cannot create object of an abstract class. But, you can create a pointer of an abstract class. 
	How to create an abstract class in C++?
You can make a class abstract by declaring at least one virtual function in the class.
class A{
	public:
		virtual void fun(int, int)=0;
		void f1(){……..}
		void f2(){……..}
};
class A is an abstract class
	Why we create an abstract class?
Abstract class can only be used as a base class.
class B : public A{
	public:
		void fun(int a, int b){ 	//override
………..;
……….;
}
}
*Note: “virtual” keyword is used to command the compiler for late binding of parent’s class method if, parent class type pointer is used to point the child class instant (object).

Java:-
Abstract class:
	abstract class A{
	………….;
	………….;
}
	You cannot create an object of abstract class but you could make reference variable. 
i.e., A obj = new A(); Error
	It can only be used as a superclass for other classes that extend the abstract class.
	Like any other class, an abstract class can contain fields that describe the characteristics and methods that describe the actions that a class can perform.
Abstract Methods:
	An abstract can include methods that contain no implementation. These are called abstract methods.
The abstract method declaration must end with a semicolon rather than a block.
	If a class has any abstract method, whether declared or inherited the entire class must be declared abstract.
i.e.,
class A{
	abstract public void f1();
	void f2(){……………}
	void f3(){………….}
}
Error….
or
class A{
	abstract public void f1();
	void f2(){……………}
	void f3(){………….}
}
class B extends A{
	………….;
	………..;
}
	B obj = newB();
Error….
class A{
	abstract public void f1();
	void f2(){……………}
	void f3(){………….}
}
Correct….
	An object must have an implementation for all of its methods. 
You need to create a subclass that provides an implementation for the abstract method.
	You cannot make an abstract method as private.
Interface
A interface in java is an abstract type which is used to describe the behavior that a class must implement.
Instance can contain public static final variables and abstract method. Also it may contain default method and static method.
•	Face to interact with.
Interface in Java
interface I1{

}
•	An interface like that of an abstract class cannot be instantiated.
•	Although you can create a reference variable of interface.
•	Interface does not have constructors.
•	Interface just specifies the method declaration (implicitly public and abstract) and can only contain fields (implicitly public, static and final).
Why interfaces are required?
•	Interfaces are used in java to achieve abstraction.
•	It is also helpful in capturing similarities among unrelated classes without artificially forcing a class relationship.
Defining Interface
public interface Area {
    float PI = 3.14F;
    double getArea();
}
How to use Interface?
class Circle implements Area{
    private double Radius;

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    @Override
    public double getArea() {
        return PI*getRadius()*getRadius();
    }
}
•	If A1 is reference variable of type Area, it can refer to an object of circle but can only access those members of circle which belongs to interface Area.
•	If a class that implements an interface does not define all the methods of the interface, then it must be declared abstract and the method definitions must be provided by the subclass that extends the abstract class.
Multiple Implementations
•	A class can extend only one class but can implement any number of interfaces.
class B extends A implements I1,I2, ...{
	……….;
	……….;
	……….;
}
More Examples
•	Car wants to implement MusicPlayer.
•	SprotsWatch also wants to implement MusicPlayer.
•	Car also wants to implement Metrics to show various during metrics.
•	Batch wants to implement Admission.
•	Television wants to implement MagicStick to became a SmartTV.
Multiple Extensions
Multiple extensions is allowed when extending interfaces, i.e., one interface can extend none, one or more interfaces.
interface I1{
	……..;
}
interface I2{
	…….;
}
interface I3 extends I1,I2{
	……..;
}
Remember
•	class extends class.
•	class implements interface.
•	interface extends interface.


Abstract Class v/s Interface
•	Abstract class will have constructor but Interfaces do not have constructors.
•	Abstract class can have abstract and non-abstract methods, but interfaces can have only abstract methods.
•	All members of an interface are public, but in Abstract class you can set any access modifier.
•	Interface can have only static variables, but Abstract class can have static and instance variables.
•	Interface can have only final variables, but Abstract class can have non final variables as well.
New Features
•	Before Java 8, interfaces can only have abstract methods, but from Java 8 onwards, you can write methods with definitions.
•	You have to declare access modifier as default if you want to define any method inside the interface.
•	You can make static methods in interfaces as well.
Problem
interface I1{
	default void f1(){
		…….;
	}
}
interface I2{
	default void f1(){
		…….;
	}
}
class A implements I1,I2{
	…….;
	B obj=new B();
	obj.f1();		
}

Q. Which f1()’s definition of interfaces should be bound?
Solution:
	You will have to define/override the f1() again in the class also, if the conflict arises. 








Problem
interface I1{
	default void f1(){
		…….;
	}
}
class A{
	public void f1(){
		…….;
	}
}
class B extends A implements I1 {
	…….;
	B obj=new B();
	obj.f1();
}

Q. Which f1()’s definition of interface or class A should be bound?
Solution:
	class A’s definition of f1() will be bound.
Note: Interfaces are not allowed to define methods which are already available in Object class.
Functional Interface:
It is an interface that has only one abstract method.
Example:
@Functional Interface
interface I1{
	void show();
}
Anonymous Inner Class
interface I1{
    void show();
}
public class AnonymusInnnerClass {
    public static void main(String[] args) {
        I1 obj= new I1() {
            @Override
            public void show() {
                System.out.println("The Anonymus Inner Class");
            }
        };
        obj.show();
    }
} 


Object Class
•	Object is a class in Java.
•	Every class has object as a direct or indirect superclass. Therefore object class methods are available to all java classes.
•	Object class is present in java.lang package.
•	Object class work as root of class hierarchy.
Methods of Object Class
•	clone()	•	getClass()
•	It returns the class object of this object and is used to get the actual runtime class of the object.
•	It is final method.
class Student{

}
Student s1=new Student();
System.out.println(s1.getClass().getName()).	•	wait()
•	equals()
•	Used to compare two objects. i.e., obj1.equals(obj2);
•	Returns true when the objects are equal, false otherwise.
•	Although, you have to override it in your class to work for the objects of your class.
	•	toString()
•	Used to get Class Name with its hash code in hexadecimal number.	•	notify()
•	finalize() 
•	It invokes implicitly just before an unreferenced object is collected by Garbage Collector.
•	It behaves as destructor of C++.	•	hashCode()
•	Used to get a unique hexadeximal number as unique identity number.	•	notifyAll()




•	When you try to print the reference variable of an object it will call it’s toString() method which inherited from Object class.
public class FeaturedObject {
    private int x=20;
    private int y=30;
    public FeaturedObject(){ }
    public FeaturedObject(int x,int y){
        this.x=x;
        this.y=y;
    }
    public static void main(String[] args) {
        FeaturedObject f= new FeaturedObject(5,6);
        System.out.println(f);
        System.out.println(f.toString());
    }
}

Output
 
Arrays
Array is a linear collection of similar elements.
Declaring arrays in Java
int arr[5];          ->	Error
int arr[ ];
int [ ]arr; 
•	arr is not an array but it is a reference variable to hold reference of int type array.
arr = new int[5];
or
int [ ] arr = new int [5];
Initializing array during declaration
int [ ] arr = new int [ ] {5,10,15,20,25};
or
int  [ ] arr = {5,10,15,20,25};

int [ ] arr = new int [5] {5,10,15,20,25};
•	You cannot mention size and values together.










Initialization after declaration:
int [ ] arr = new int [3];
arr[0] = 1;
arr[1] = 2;
arr[2] = 5;


Two dimensional Arrays
•	It is an array of arrays
int [ ][ ] a = new int [3][6]; 






Reference Variable
int [ ][ ] a;
Declaration
int [ ][ ] a = new int [3][6];

int [ ][ ]a = new int [ ][ ];		both blank not possible
int [ ][ ] a = new int [ ][6];  	not possible
int [ ][ ]a = new int [3][ ];
int [ ][ ] a = new int [ ][ ]{1,2,3,4,5,6},{2,4,6,8,10,12},{3,6,9,12,15,18};
Distinct array length
int [ ][ ]a = new int [3][ ];
a[0] = new int[5];
a[1] = new int[4];
a[2] = new int[3];





String Class
Introduction to Strings
A java.lang.String class is final which implies no class can extend it.
Immutable Class
String is an immutable class, that is, Strings in java once created and initialized, cannot be changed on the same reference.
String is Special
•	You can create String object like primitives.
•	You can use + and += operator on Strings.

Creating String
•	A simple string can be created using a string literal enclosed inside double quotes as shown.
String s1 = “My name is The Anand Mohan Sharma”;
•	If two or more Strings have the same set of characters in the same sequence then they share the same reference in memory.
String s1 = “My name is The Anand Mohan Sharma”;
String s2 = “My name is The Anand Mohan Sharma”;
String s3 = “My name is” + “The Anand Mohan Sharma”;
In Memory
•	All String references s1, s2 and s3 denote the same String objects.
•	





Creating String using new keyword
•	Creating String object using new keyword always generate a new object in memory, even if the Strings are same.
String s4 = new String(“My name is The Anand Mohan Sharma”);
Comparing String using new keyword
String s1 = “computer”;
String s2 = “computer”;
String s3 = new String(“computer”);
System.out.println(“Result: ” + (s1==s2));	true
System.out.println(“Result: ” + s1.equals(s2));	true
System.out.println(“Result: ” + (s1==s3));	false
System.out.println(“Result: ” + s1.equals(s3));	true

Comparing String using new keyword
•	toUpperCase();
•	toLowerCase();
•	equals(String another String);
•	equalsIgnoreCase(String another String);
•	compareTo(String another String); //returns the difference between Unicode of first different character of the string.
•	indexOf(int ch);
•	indexOf(int ch,int fromIndex);
•	indexOf(String str);
•	indexOf(String str, int fromIndex);
•	substring(int fromIndex);
•	substring(int fromIndex, int toIndex+1);
•	replace(char, char);
Lambda Expression
interface Intop{
    int intop(int i);
}
class TestLambda{
    static int square(Intop io,int i){
        return io.intop(i);
    }
    public static void main(String[] args) {
        System.out.println("Square of 25: "+square((k)-> k*k,25));
    }
}
Exception Handling
Exception
So, what are NullPointerException and ArithmeticException?
They are classes in java.lang package.
Exceptions are any abnormal, unexpected events or extraordinary conditions that may occur at runtime.
They could be FileNotFoundException, unable to get connection exception and so on.
On such conditions java throws an exception object.
Java exceptions are basically java objects.
Java exception handling is used to handle error conditions in a program systematically by taking the necessary action.
Any exception not specifically handled within a java program is caught by the java runtime environment.
An exception is a subclass of the Exception class, which is a subclass of the Throwable class.
Java exceptions are raised with the throw keyword and handled within a catch block.


Error
Exception


IOException	ClassNotFoundException	RuntimeExceptiion


IllegalArgumentException	NullPointerException	ArithmeticException

NumberFormatException
Throwable
•	The Throwable class provides a String variable that can be set by the subclass to provide a detail message that provides more information of the exception occurred.
•	All classes of Throwable define a one parameter constructor that takes a String as the detailed message.
•	The class Throwable provides getMessage() function to retrieve an exception.
Types of Exceptions
There are two types of Exceptions…
1.	Checked (Compile time checking)
2.	Unchecked (Runtime Exception)
Unchecked exceptions are RuntimeException and any of its subclasses.
They are basically business logic programming errors.
import java.util.Scanner;
public class HandlingException {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try {
            System.out.println(a/b);
            System.out.println("In try");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Outside try-catch");
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        System.out.println("Square of "+a+": "+a*a);
    }
}
Handling of Exception
try{
}catch(ExceptionClass e){
}finally{
}

Catch
•	Exception thrown during execution of the try block can be caught and handled in a catch block.
•	On exit from a catch block, normal execution continues and the finally block is executed.
Finally
•	A finally block is always executed, regardless of the cause of exit from the try block, or whether any catch block was executed.
•	Generally, finally block is used for freeing resources cleanup, closing connections etc.
Remember:
•	For each try block there can be zero or more catch blocks, but only one finally block.
•	The catch blocks and finally block must always appear in conjunction with a try block.
•	A try block must be followed by either at least one catch or one finally block.
•	The order exception handlers in the catch block must be from the most specific exception.
NOTE: 
•	InputMissmatchException is not found in Exception class but it is in the java.util package so be aware.
Throw
•	A program can explicitly throw an exception using the throw statement.
throw <throwable instance>
•	The exception reference must be of type Throwable class or one of its subclasses.
•	A detail message can be passed to the constructor when the exception object is created.
User defined exception
•	You can define your own custom exception class.
•	Your exception class must be throwable.
•	User defined exception class should be a child class of any exception class.
•	If it extends RuntimeException or any of its descendant class then your class will become unchecked exception, otherwise it will become checked exception.
Checked Exception
•	Checked exceptions force programmers to deal with the exception that may be thrown.
•	When a checked exception occurs in a method, the method must either catch the exception and take the appropriate action, or pass the exception on to its caller.
•	“Checked” means they will be checked at compile time itself.
•	You must handle the checked exception in your code otherwise your code will not be compiled.
•	If you don’t want to handle the checked exception, then you can specify the exception using “throws” keyword.
throws
The throws clause can be used in the method prototype.
method() throws ExceptionClass1, ExceptionClass2….
{
	………..;
	………..;
	………..;
}
•	The throws keyword is applicable to a method to indicate that the method raises particular type of exception while being processed.
•	The throws keyword takes arguments as a list of objects of type Throwable.
•	If a method is capable of causing an exception that it does not handle, it must specify this behavior so that callers of the method can guard themselves against the exception.
o	A throws clause lists the type of exceptions that a method might throw.

import java.io.IOException;
import java.lang.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalance extends Exception{
    InsufficientBalance(String s){
        super(s);
    }
}

public class HandlingThroughThrow {
    public static void main(String[] args) /*throws InsufficientBalance*/ {
        Scanner sc= new Scanner(System.in);


        /*System.out.println("Enter any two numbers: ");
        try {
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(b==0)
                throw new ArithmeticException("Cannot divide by sunya😂");
            System.out.println(a/b);
            System.out.println("In try");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e1){
            System.out.println(e1.getMessage());
            sc.next();
        }
        System.out.println("Outside try-catch");
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println("Square of "+a+": "+a*a);*/


        Account ac=new Account(123,9000);
        ac.showBalance();
        System.out.println("Enter the amount you want to withdraw:");
        ac.debit(sc.nextDouble());
        ac.showBalance();
    }
}
class Account{
    private int acno;
    private double balance;
    Account(int accountNo, double accountBalance){
        acno=accountNo;
        balance=accountBalance;
    }
    void credit(double money){
        balance+=money;
    }
    void debit(double money) {
        try {
            if (money > balance)
                throw new InsufficientBalance("Insufficient Balance in Account...😒");
            balance -= money;
        }catch(InsufficientBalance e){
            System.out.println(e.getMessage());
        }
    }
    void showBalance(){
        System.out.println("Current Account Balance: "+balance);
    }
}







Threading
What is a Thread?
A thread is an independent path of execution within a program.
Multithreading
•	Many threads can run concurrently within a program.
•	Multithreading refers to two or more tasks executing concurrently within a single program.
Thread Class
Every thread in Java is created and controlled by the java.lang.Thread class.
Creating Thread
There are two ways to create thread in java.
1.	Implement Runnable interface.
2.	By extending the Thread class.

Runnnable
public interface Runnable{
	Void run();
}
One way to create a thread in Java is to implement the Runnable interface and then instantiate an object of the class.
We need to override the run() method into our class which is the only method that needs to be implemented.

public class Main {
    public static void main(String[] args) {
        Threading.Driver2(null);
    }
}
public class Threading {
    public static void Driver3(String []args){
    Thread abhinav= new Thread(new Runnable() {
        @Override
        public void run() {
            for(Integer i=0;i<=100;i++)
                System.out.println("Abhinav: "+i);
        }
    });
    Thread anand= new Thread(new Runnable() {
        @Override
        public void run() {
            for (Integer i=0;i<=100;i++){
                System.out.println("Anand: " + i);
            }
        }
    });
    abhinav.start();
    anand.start();
   }
    public static void Driver2(String[] args) {
        Anoop Anu=new Anoop();
        Prakash Prak= new Prakash();
        Anu.start();
        Prak.start();
    }
    public static void Driver1(String[] args) {
        Abhinav abhi=new Abhinav();
        Hemant hemu =new Hemant();
        Thread hemant= new Thread(hemu);
        Thread abhinav= new Thread(abhi);
        hemant.start();
        abhinav.start();
       }
}
class Abhinav implements Runnable{
    public void run(){
        table();
    }
    void table(){
        for(int i=0;i<100;i++)
            System.out.println("hemant: "+(i+1));
    }
}
class Hemant implements Runnable{
    public void run(){
        table();
    }
    void table(){
        for(int i=0;i<=100;i++)
            System.out.println("Abhinav: "+(i+1));
    }
}
class Prakash extends Thread{
    public void run(){
        writeCounting();
    }
    public void writeCounting(){
        for(int i=1;i<=100;i++)
            System.out.println("Prakash: "+i);
    }
}
class Anoop extends Thread{
    public void run(){
        writeCounting();
    }
    public void writeCounting(){
        for (int i=1;i<=100;i++)
            System.out.println("Anoop: "+i);
    }
}

Useful Methods of Thread
•	currentThread(): It is a static method of Thread class that returns reference of current thread object.
•	getName(): It is an instance method of Thread class which returns a String telling the name of the thread.
•	sleep(): It is a static method of Thread class that takes milliseconds as an argument. It cease the execution of thread for specified time.
Life Cycle of a Thread
The life cycle of a Thread in Java refers to the state transformations of a thread that begins with its birth and ends with its death.
States
1.	New Thread		Thread is created
2.	Runnable		Actually running or waiting for its turn to run.
3.	Not Runnable	goes out of runnable state for same reason.
4.	Dead		End of thread

















InterThread Communication
Inter-thread communication in Java is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter in the same critical section to be executed.
Polling
The process of testing a condition repeatedly till it becomes true is known as polling.
Polling is usually implemented with the help of loops to check whether a condition is true or not. If it is true, a certain action is taken.
This wastes many CPU cycle and makes the implement inefficient.
Wait and Notify
To avoid polling, Java uses three methods.
wait(): It tells calling thread to give up the lock and go to sleep until some other thread calls notify().
notify():It wakes up one single thread called wait() on the same object.
notifyAll(): It wakes up all the threads called wait() on the same object.
Graphical User Interface
Graphical user interface is a type of user interface that allows users to interact with the screen using graphical components (visual indicators) rather than text commands.
You can reuse the graphics classes provided in JDK for constructing your own Graphical User Interface (GUI) applications.
API
There are two sets of Java API’s for graphics programming: 
1.	AWT (Abstract Windowing Toolkit)
2.	Swing
Java Graphics APIs  - AWT and Swing – provide a huge set of reusable GUI components, such as button, text field, label, choice, panel and frame for building GUI applications.
AWT (Abstract Window Toolkit)
It consists of 12 packages
Only 2 packages  java.awt. and java.awt.event are commonly used
The java.awt package contains the core AWT graphics classes
•	GUI component classes (Button, TextFeild and Label)
•	GUI container classes (Frame, Panel, Dialog)
•	Layout managers (FlowLayout, GridLayout)
•	Custom graphics classes (Graphics, Color, Font)
AWT Events: The java.awt.event package supports event handling.
•	Event Classes (ActionEvent, MouseEvent, keyEvent, WindowEvents).
•	Event Listener Interface (ActionListener, MouseListener, keyListener, WindowListener).
Swing
Java provides a rich set of libraries to create Graphical User Interface.
Swing API is set of extensible GUI components to ease developers’ life to create Java based Front End/GUI applications.
It is built upon top of AWT API and acts as replacements of AWT API as it has almost every control corresponding to AWT controls.
Swing is light weight, offers rich controls and highly customizable.
To use swing API, import javax.swing.*;
•	JFrame, JButton, JLabel, JCheckbox, JRadioButton, JList, JComboBox, JTextField, JPasswordField, JOptionPane…

Database Management in Java
Data: Any piece of information which is required in a programming problem for data processing is data.
Data Persistence: 
•	Data processing will be done during the program.
•	In many programming scenarios Data needs to exist even after the end of program and program wants to use this data sometimes in future. So to resolve this problem. 
•	When you want program’s data to persist even beyond the life of program, then we need to store this data in the secondary storage.
•	Data is stored in secondary storage in terms of logical entity called file.
•	File Handling: You need to write program to transfer data of your program to the file in secondary storage and sometimes you need to write program to bring file’s data in to your program. Every task of this type comes under this.
•	Database: Database is a place where you store all your application data.
o	Logical View: Database is a collection of tables.
o	User View: Database is a collection of files.
•	Database Management System: It is the bunch of program to handle and managing database.
MySQL Constraints: SQL constraints are used to specify rules for data in a table. Constraints can be specified when the table is created with the CREATE TABLE statement, or after the table is created with the ALTER TABLE statement.
•	NOT NULL
o	By default a column can hold NULL value.
o	The NOT NULL constraint enforces a column to NOT accept NULL values.
o	This makes a field mandatory to contain a value.
Example:
	CREATE TABLE Employee(
empid int NOT NULL,
name varchar(80),
age int,
salary double(9,2)
);

ALTER TABLE Employee
MODIFY age int NOT NULL;
•	Unique: The UNIQUE constraint ensures that all values in a column are different.
CREATE TABLE Employee(
	empid int NOT NULL,
	name varchar(50),
	age int,
	salary double(9,2),
	UNIQUE(empid)
);
ALTER TABLE Employee ADD UNIQUE (empid);
•	Primary Key: The PRIMARY KEY constraint uniquely identifies each record in a table. Primary keys must contain unique values and cannot contain NULL values.
Example:
	CREATE TABLE Employee(
empid int NOT NULL,
name varchar(80),
age int,
salary double(9,2),
PRIMARY KEY(empid)
);
ALTER TABLE Employee ADD PRIMARY KEY(empid);

•	 Auto Increment: 
Example:
CREATE TABLE Employee(
empid int NOT NULL,
name varchar(80),
age int,
salary double(9,2),
PRIMARY KEY(empid)
);

•	Foreign Key: The FOREIGN KEY constraint is used to prevent actions that would destroy actions that would destroy links between tables. A FOREIGN KEY is a field in one table, that refers to the PRIMARY KEY in another table.
Example:
CREATE TABLE Customer (
id int,
name varchar(50),
mobile varchar(10),
PRIMARY KEY(empid)
);

	CREATE TABLE Bill(
billno int NOT NULL,
customer_id int,
amount double(8,2),
PRIMARY KEY(billNo),
FOREIGN KEY(customer_id) REFERENCES Customer(id)
);
•	default:
CREATE TABLE customer (
	id int,
	name varchar(50),
	mobile varchar(10),
	city varchar(20) DEFAULT ‘Bhopal’,
	PRIMARY KEY(id)
)
or
ALTER TABLE Customer ALTER City SET DEFAULT ‘BHOPAL’;
JDBC (Java Database Connectivity)
JDBC Introduction: The JDBC (Java DataBase Connectivity) API defines interfaces and classes for writing database applications in Java by making database connections.
JDBC is for any RDBMS: Using JDBC you can send SQL statements to almost any relational database. It provides RDBMS access by allowing you to embed SQL inside Java code.



Connectivity Code: You have to first import the SQL package.
	import java.sql.*;

Getting Connection:
	DriverManager is a class provides basic service for managing a set of JDBC drivers. GetConnnection() is a static method in DriverManager class to establish a connection to the given database URL. It returns Connection object.

Connection: Connection is an interface.
Connection con;
con = DriverManager.getConnection(url, username, password);
It can throw SQLException
url = “jdbc: mysql: // localhost: 3306/db1”;
username = “root”;
password = “admin@123”;

Preparing SQL Statement
PreparedStatement ps;
ps = com.prepareStatement(sqlstatement);
•	For a SELECT statement, the method to use is executeQuery(), returns ResultSet.
•	For statements that create or modify tables, the method to use is executeUpdate() It returns integer value that states, How many rows are updated?
•	execute() returns Boolean value.
•	It provides several set methods to set values of placeholders present in the sql query string.
setString(parameterIndex, String)
Result Set
ResultSet provides access to a table of data generated by executing a statement.
The table rows are retrieved in sequence.
The next() method is used to successively step through the rows of the tabular results.
Some result set methods:
•	getInt()
•	getString()
•	getFloat()
•	getDouble()
:What is library?
Java Library is a collection of predefined classes. You can use these classes either by inheriting them or by instantiating them.


Primitive Types:
	In Java primitive types are the most basic types. The int is one of eight primitive types.
	The eight primitive data types in the Java are boolean, byte, char, short, int, long, float and double. Consider these data types as the building blocks of data manipulation. Let’s explore the eight primitive types in Java.

Casting in Java:
Calendar Class
•	It is an abstract class, but its instance can be made by a static method getInstance();
