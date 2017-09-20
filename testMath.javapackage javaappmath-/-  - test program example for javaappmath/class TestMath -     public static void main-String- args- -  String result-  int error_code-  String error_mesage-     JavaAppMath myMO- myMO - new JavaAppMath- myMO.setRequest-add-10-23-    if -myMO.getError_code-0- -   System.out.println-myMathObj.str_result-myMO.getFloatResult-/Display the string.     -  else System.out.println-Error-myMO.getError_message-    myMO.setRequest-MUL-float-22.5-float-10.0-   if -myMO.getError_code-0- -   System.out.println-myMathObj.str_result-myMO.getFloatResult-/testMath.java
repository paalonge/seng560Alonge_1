package javaappmath;


/**
 *
 * test program example for javaappmath
 */


    
class TestMath {
 public static void main(String[] args) {

JavaAppMath myMO;
myMO = new JavaAppMath();
myMO.setRequest("add",10,23);
 
//test add two integer numbers
 if (myMO.getError_code()==0) {
  System.out.println("My Integer result="+myMO.getIntResult()); 
    }
 else System.out.println("Error"+myMO.getError_message());
 
 // test multiple two floating numbers
 myMO.setRequest("MUL",(float)22.5,(float)10.0);
  if (myMO.getError_code()==0) {
  System.out.println("My Float result="+myMO.getFloatResult());  
    }
 else System.out.println("Error"+myMO.getError_message());
 
     // test error with bad operator request
 myMO.setRequest("BAD",(float)22.5,(float)10.0);
  if (myMO.getError_code()==0) {
  System.out.println("My Float result="+myMO.getFloatResult());  
    }
 else System.out.println("Error"+myMO.getError_message());

}


}
        
    
