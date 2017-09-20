package javaappmath;


/**
 *
 * test program example for javaappmath
 */


    
class TestMath {
    public static void main(String[] args) {
 String result;
 int error_code;
 String error_mesage;

 
 
JavaAppMath myMO;
myMO = new JavaAppMath();
myMO.setRequest("add",10,23);
 
 if (myMO.getError_code()==0) {
  System.out.println("myMathObj.str_result="+myMO.getFloatResult()); // Display the string.
    }
 else System.out.println("Error"+myMO.getError_message());
 
 myMO.setRequest("MUL",(float)22.5,(float)10.0);
  if (myMO.getError_code()==0) {
  System.out.println("myMathObj.str_result="+myMO.getFloatResult()); // Display the string.
    }
 else System.out.println("Error"+myMO.getError_message());
}


}
        
    
