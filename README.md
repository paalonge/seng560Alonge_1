.
GIT HUB link to Alonge repository paalonge/seng560Alonge_1  v1.1.2
https://github.com/paalonge/seng560Alonge_1/releases/latest
README.md as follows and is included in GIT release
The library was written in Java and the package is javaappmath. A sample test program is included in the source code. The package was coded to be easy to use and understand.
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
-	setRequest(String operation, String numberbasetype, String number)
-	setRequest(String operation, String numberbasetype, int number)
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
More detailed description of each type of setRequest method is below:

1.	setRequest(String operation, int number1, int number2)  
o	Valid operations are: add, sub, mul,div,sqr,exp,con. Valid numbers are integers. In the case of SQR only the first number is used to calculate the square root. In the case of CON only the first number is used to be converted. Each set request provides a conversation to all types and can be fetched via the public get methods.
2.	setRequest(String operation, float number1, float number2)
o	Valid operations are: add, sub, mul,div,sqr,exp,con. Valid numbers are floats. In the case of SQR only the first number is used to calculate the square root. In the case of CON only the first number is used to be converted. Each set request provides a conversation to all types and can be fetched via the public get methods.
3.	setRequest(String operation, int number)
o	Valid operations are: sqr. Valid number is integer. Each set request provides a conversation to all types and can be fetched via the public get methods.
4.	setRequest(String operation, float number)
o	Valid operations are: sqr. Valid number is float. Each set request provides a conversation to all types and can be fetched via the public get methods.
5.	setRequest(String operation, String numberbasetype, String number)
o	Valid operations are: con. Valid numberbasetype is int, flo, oct, bin, hex, str. Valid number is string. Each set request provides a conversation to all types and can be fetched via the public get methods.
6.	setRequest(String operation, String numberbasetype, int number)
o	Valid operations are: con. Valid numberbasetype is int, flo, oct, bin, hex, str. Valid number is integer. Each set request provides a conversation to all types and can be fetched via the public get methods.
7.	setRequest(String operation, String numberbasetype, float number)
o	Valid operations are: con. Valid numberbasetype is int, flo, oct, bin, hex, str. Valid number is float. Each set request provides a conversation to all types and can be fetched via the public get methods
The package was externally kept simple, with one JavaAppMath object, set operation request methods, a set of get result methods for a variety of number types, and a set of get error codes and get error message methods. The package used common naming conventions for ease of use, and automatically supplies the operational result in multiple number formats. The code used is considered best practice and standard java procedures to ensure portability.

 
Test Cases

This is a sampling of my Test philosophy and is not a comprehensive test suite. The test goal is as follows. Each of the 7 setRequest() methods should be tested and have been labeled as setRequest method 1 through 7 for identification.
1.	setRequest(String operation, int number1, int number2)  
2.	setRequest(String operation, float number1, float number2)
3.	setRequest(String operation, int number)
4.	setRequest(String operation, float number)
5.	setRequest(String operation, String numberbasetype, number)
6.	setRequest(String operation, String numberbasetype int number)
7.	setRequest(String operation, String numberbasetype, float number) 
Each of these methods should be tested for each type of operation. Therefore setRequest.1 will have at minimum 7 test cases to be successful identified as:
•	1.1setRequest_ADD
•	1.2setRequest_SUB
•	1.3setRequest_MUL
•	1.4setRequest_DIV
•	1.5setRequest_SQR
•	1.6setRequest_EXP
•	1.7setRequest_CON
•	
Test setRequest.1 should also have test cases to catch errors, to be identified as:
•	1.4.1setRequest_DIV_ERROR-send 2nd number argument as a zero.
•	1.1.1setRequest_BAD_Oper-send operation argument as invalid, such as “BAD”

Test setRequest.3 has one valid operator the square root. (String operation, int number)
•	3.1setRequest_SQR-send a valid operator “SQR” with a valid integer.
•	3.2setRequest__BAD_Oper-send operation argument as invalid, such as “ADD”

 
Sample Test Case Form

Test Identifier: 1.1setRequest_ADD
Test Date: ____________________
Test Operator: _________________
Test Witness: __________________

Test Description:
List setRequest() methods values and type:
	Operator: String: “ADD” ,  Number 1: Integer 200, Number 2: Integer: 12
Method should correctly identify argument types and correctly identify operation string no matter the text case.
List expected results:	Expect Value		Pass/Fail	Comments
getFloatResult();		212.00
getIntResult();			212
getOctResult();		324
getHexResult();		D4
getBinResult();		011010100

Code Snippet:	
JavaAppMath myMO;
myMO = new JavaAppMath();
myMO.setRequest("add",200,12);
 
 if (myMO.getError_code()==0) {
  	System.out.println("Float result="+myMO.getFloatResult()); 
 }

Test Complete Signature: __________________    Date: ________  

