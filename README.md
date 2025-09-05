# Introduction to java Chapter 1
- why
    - popular
    - wide(web, backend, mobile, enterprice sw)
    - high paying
    - object oriented
    - Rich APIs and community support
- what is programming language
    - natural language to machine language(0/1 or on or off)
    - compiler convert HLL lang to LLL or machine code
- Algorithm - steps of instruction
- syntax - rules of language

### Java

- james Gosling at Sun Microsystems
- Oak -> Java
- Write Once, Run Anywhere (cross-platform compatibility)
- Program -> compiler -> ByteCode -> JVM -> machine compatible code
- backward compatiblity

- Magic of Byte Code
    - Source -> compiler -> output(byte code) -> JVM -> Machine compatible code
- Java Buzzwords
    - Robust : memory mangement, exception handling 
    - Multithreaded : execute multiple threads concurrently
    - Architecture Neutral: bytecode
    - Interpreted and High performance: byte code interpreted by JVM, Just-In time compilation
    - Distributed: network-based application, semaleiss integration to interned

- Object Oriented Programming 
    - class - Human, Hotel
    - object - Name
    - Properties - id, phoneNo, rooms
    - Methods - Job, eat, run, cancelRoom, reserveRoom
- Procedure oriented (functions)

# Java Basics Chapter 2

1. Installing JDK
2. first class using text Editor
3. Compiling and Running 
4. Anatomy of a class
5. file Extensions
6. JDK vs JVM vs JRE
7. showing Output
8. Installign IDE
9. Creating first Project

### Flow
    Program.java -> java compiler -> Program.class -> JVM -> Output

### Anatomy of a class
![alt text](/Images/image.png)

### File Extesions
- .java : java source Code, JLL, editable
- .class : Bytecode, for JVM, execution, not to edit

### JDK vs JVM vs JRE

![alt text](/Images/image-1.png)

#### JDK
- .jdk s/w dev kit req to dev java app
- includes JRE, interpreter/loader, compiler(javac), docGenerator(javadoc), ..

#### JRE
- provides lib, JVM, other components to run app
- not have tools and utilities for developers like compiler.

#### JVM
- part of JRE execute bytecode
- not platform-independent, diff JVM for diff machine

### Showing Output
- println -> new line

### Main Method
- Entry point, execution start
- static belong to class no need to creat object to access
- must be public so JVM can access

### IDE (Integrated development Environment)
- Intellij Community Edition
- shift+f10 : run
- shift+f9 : debug
- alt+enter : suggests fix

- out : .class files
- idea : meta files

## Chapter 2 Challenge

1. create a class ot output :good morning using a text editor and check output.
2. Create a new Project in Intelij Idea and output "subscribe" on the console.
3. show the following patterns.
![alt text](/Images/image-2.png)

## Chapter 2 Practice Exercise

1. Computers understand HLL like Java, C. false
2. An Algorithm is set of instructions to accomplish a task. true
3. Computer is smart enough to ignore incorrect syntax. false
4. Java was first released in 1992. false
5. java was named over a person who made good coffee. false
6. ByteCode is platform independent. True
7. JDK is a part of JRE. false
8. It's optional to declare main method as public. false
9. class file contains machine code. fasle
10. println adds a new line at the end of the line. true

# Data Types, Variables and Input Chapter 3

1. Variables : store Date, name, memory, value
2. Data Types
3. Naming Conventions
4. Literals
5. Keywords
6. Escape Sequences
7. User Input
8. Type Conversion and Casting

### Variable
- Store Data
- name, memory, value
- Memory Allocation
    - Stored in RAM
    - Memory Adderess
    - DataType VarName = Value;

### Data Types
![alt text](/Images/image-3.png)

- byte - 8 bit
- short - 2 byte
- int - 4 byte
- long - 9 byte
- char - 2 byte
- float - 4 byte (3.14f)
- double - 8 byte
- boolean - 1bit, either true or false

- defaut value: 0, false

### Naming Conversion
- camelCase (This but class have first letter capital)
- snake_case
- kebab-case
- Keep a Good and short name

- Indentifier - variable name (only _ or $ allowed in special char)

### Literal
- Literal - value of variable

### Keywords
- Keywords - default, switch, char, long, interface, synchronized ....

### Escape Sequence
- escape sequences: \" , \\, \n, \t, \b(backspace)

### User Input
Scanner scanner = new Scanner(System.in)
- creates a new object of Scanner type and give it default input

### Type Conversion

![alt text](/Images/image-4.png)

- implicite type conversion / coersion- small to big
- explicit type conversion / casting - big to small (data may loss)

## Chapter 2 Challenges
4. Show the following patterns using single print statement
![alt text](/Images/image-2.png)
5. Create a program to input name of the person and respond with "Welcome NAME to KG Coding"
6. Create a program to add two numbers.

## Practice Exercise

1. In Java, a variable's name can start with a number. False
2. char in Java can store a single cahracter. True
3. Class names in Java typically start with a lower case letter. False
4. 100L is a valid long Literal in Java. True
5. \d is an escape sequence in java for a digit cahracter. False
6. Scanner classs is used for reading console input. True
7. In Java, an int can be automatically converted to a byte. False
8. Java variable names are case-sensitive. True
9. Scanner class can be used to read both primitive data types and strings. True
10. Explicit casting is required to convert a double to an int. True

# Operators, If-else and Number System Chapter 4
1. Assignment Operator
2. Arithmetic Operators 
3. Order of Operators
4. Shorthand Operators
5. Unary Operators
6. If-else
7. Relational Operators
8. Logical Operators
9. Operator Precendence
10. Intro to Number System
11. Intro to Bitwise Operators

### Assignment Operators
- = : assign value of right to left

### Arithmatic Operators
![alt text](/Images/image-5.png)

- +, -, *, /, %

### Order of Operation and operator precedence
![alt text](/Images/image-6.png)
- BODMAS

### Shorthand Operators
- += -= *= /= %= <<= >>= >>>= &= ^= |=

### Unary Operator
- ++ -- + - ! ~
- Post and Pre

### if-else
- if(condition){} : if condition is true exicutes the block of code
- if-else ladder

### Relational Operators
- Equality : ==(loose), ===(strict)
- Inequality : != (loose), !== (strict)
- Relational
    - > : Greater than
    - < : Less Than
    - >= : Greater than or equal to
    - <= : Less than or equal to
- order of relational operator is less than arithmetic operators

### Logical Operators

- AND (&&) : all must be true
- OR (||) : one condition must be true
- Not (!) : inverts
- Lower priority than math and comparison operators

### Operator Precedence and Associativity
![alt text](/Images/image-7.png)

- Parentheses ()
- Unary ++ -- + - ! ~
- Multiplication/Division/Modulo * / %
- Addition/Subtraction + -
- Shift Operators << >> >>>
- Relational < <= > >= instanceof
- Equality == !=
- Bitwise AND &
- Bitwise XOR ^
- Bitwise OR |
- Logical AND &&
- Logical OR ||
- Ternary ?:
- Assignment = += -= *= /= %= <<= >>= >>>= &= ^= |=

### Intro to Number System
- Binary (2) : 0,1
- Octal (8) : 0,1,2,3,4,5,6,7
- Decimal (10) : 0,1,2,3,4,5,6,7,8,9
- Dexadecimal (16) : 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F

- In Decimal  
  $$423 = 4 * 10^2 + 2 * 10^1 + 3 * 10^0$$

- In Binary  
  $$11010.11_2 = 1 * 2^4 + 1 * 2^3 + 0 * 2^2 + 1 * 2^1 + 0 * 2^0 
  + 1 * 2^{-1} + 1 * 2^{-2}$$  

  $$= 16 + 8 + 2 + 0.5 + 0.25 = 26.75_{10}$$

### Intro to Bitwise Operator

- AND (&)
- OR (|)
- XOR (^) : true if both diff
- NOT (~)
- Left Shift (<<) : 0100 -> 1000 (multiply by 2)
- Right Shift (>>) : 1100 -> 0110 (devide by 2)
    - if positive zero filled
    - if negetive one filled

- ~5 = ~(00000101) = 11111010 = 2's compliment of -6.
- if the MSB is 0 then its positive, convert directly.
- if the MSB is 1 then its negetive, find its 2's compliment.


## Chapter 4 Challenges

7. Create a program to swap two numbers.
8. Create a program that takes two numbers and shows result of all arithmetic operators (+,-,*,/,%).
9. Create a program to calculate product of two floating points numbers.
10. Create a program to calculate Perimeter of a rectangle.
11. Create a program to calculate the Area of a Triangle.
12. Create a program to calculate simple interest.
13. Create a program to calculate Compound interest.
14. Create a program to convert Fahrenheit to Celsius.
15. Create a program that determines if a number is positive, negative, or zero.
16. Create a program that determines if a number is odd or even.
17. Create a program that determines the greatest of the three numbers.
18. Create a program that determines if a given year is a leap year, (considering conditions like divisible by 4 but not 100, unless also
divisible by 400).
19. Create a program that calculates grades based on marks

        A -> above 90%      B -> above 75%
        C -> above 60%      D -> above 30%
        F -> below 30%

20. Create a program that categorize a person into different age groups

        Child -> below 13       Teen -> below 20
        Adult -> below 60       Senior-> above 60

21. Create a program that shows bitwise AND of two numbers.
22. Create a program that shows bitwise OR of two numbers.
23. Create a program that shows bitwise XOR of two numbers.
24. Create a program that shows bitwise compliment of a number.
25. Create a program that shows use of left shift operator.
26. Create a program that shows use of right shift operator.
27. Wrtite a program to check if a given number is even or odd using bitwise operators.

## Chapter 4 Practice Exercise

1. In java, && and || operators perform short-circuit evaluation. True
2. In an if-else statement, the else block executes only when the if condition is false. True
3. Java allows an if statement without the else part. True
4. The ^ operator in Java is used for exponentiation. False
5. Unary minus operator can be used to negate the value of a variable in Java. True
6. a += b is equivalent to a = a + b in Java. True
7. In Java, the binary number system uses base 10. False
8. The number 1010 in binary is equivalent to 10 in decimal. True
9. & and | are logical operators in Java. False
10. In Java, a >> 2 shifts the binary bits of a to the left by 2 positions. False
