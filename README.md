# seng560Alonge_1
sprint_1
The library was written in Java and the package is javaappmath. A sample test program is included in the source code. 
The reusable library implements basic arithmetic  functions. It performs the following operations on integers and floating point numbers as well as numbers provided in octal, binary, and hexadecimal). The operations to be supported are: 
-	Addition
-	Subtraction
-	Multiplication
-	Division
-	Square Root
-	Exponent
-	Conversion between the various types (octal, hexadecimal, integer, binary).

To use the library create a JavaAppMath, for example myMO = new JavaAppMath();
To call the library there is one method setRequest.  The setRequest method accepts 2 to 3 arguments that verify based on the request. The first argument is always the type of math operation to be performed. These operations are as follows:
	ADD-addition, requires two number arguments
	SUB-subtraction, requires two number arguments
	MUL-multiplication, requires two number arguments
	DIV-division, requires two number arguments
	SQR-square root, requires one number argument
	EXP-exponent, requires two number arguments
	CON-conversion, requires one number argument
Each operation results returns a value that is of the following type/representation:
-	Float
-	Integer
-	String representing Octal numbers
-	String representing Hexadecial numbers
-	String representing Binary numbers
Each of these results types are retrieved via the following methods public:
-	getFloatResult();
-	getIntResult();
-	getOctResult();
-	getHexResult();
-	getBinResult();
There are seven(7) setRequest methods the first argument is the type of operation, the second argument is either the base type of the number1 argument or the number1 argument, the third argument when it exists is always a number argument. The setRequest method arguments are as follows:
-	setRequest(String operation, int number1, int number2)  
-	setRequest(String operation, float number1, float number2)
-	setRequest(String operation, int number)
-	setRequest(String operation, float number)
-	setRequest(String operation, String numberbasetype, number)
-	setRequest(String operation, String numberbasetype int number)
-	setRequest(String operation, String numberbasetype, float number)
The library returns an error code and error messages in the JavaAppMath object. The error codes are as follows:
-	MATH_SUCCESS=0;
-	DIVISION_ERROR=-1;
-	MISSING_ARGUMENT_ERROR=-2;
-	ADD_ERROR=-3;
-	SUB_ERROR=-4;
-	SQRT_ERROR=-5;
-	EXP_ERROR=-6;
-	CONVERSION_ERROR=-7;
-	UNKNOWN_ERROR=-8;
-	UNSUPPORTED_ARGUMENT_ERROR=-9;
-	UNKNOWN_OPERATION=-10;
-	UNKNOWN_TYPE=-11;
-	BASE_TYPES_CONVERSION_ERROR=-12;
The enum for operational types and number base types are public in the library and are as follows:
For base types: INT, FLO, OCT, BIN, HEX, STR
For operational types: ADD, SUB, MUL, DIV, SQR, EXP, CON
The package was externally kept simple, with one JavaAppMath object, set operation request methods, a set of get result methods for a variety of number types, and a set of get error codes and get error message methods. The package used common naming conventions for ease of use, and automatically supplies the operational result in multiple number formats. The code used is considered best practice and standard java procedures to ensure portability.
