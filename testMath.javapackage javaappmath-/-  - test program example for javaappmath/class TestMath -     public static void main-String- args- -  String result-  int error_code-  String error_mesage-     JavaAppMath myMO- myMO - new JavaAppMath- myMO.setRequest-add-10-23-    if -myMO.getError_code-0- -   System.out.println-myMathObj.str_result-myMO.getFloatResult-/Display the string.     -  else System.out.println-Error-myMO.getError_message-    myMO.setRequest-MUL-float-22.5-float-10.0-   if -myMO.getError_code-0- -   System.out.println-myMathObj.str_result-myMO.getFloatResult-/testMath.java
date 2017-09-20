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
  System.out.println("My Addition Integer result="+myMO.getIntResult()); 
    }
 else System.out.println("Error"+myMO.getError_message());
 
 // test multiple two floating numbers
 myMO.setRequest("MUL",(float)22.5,(float)10.0);
  if (myMO.getError_code()==0) {
  System.out.println("My Muliplication Float result="+myMO.getFloatResult());  
    }
 else System.out.println("Error"+myMO.getError_message());
 
     // test error with bad operator request
 myMO.setRequest("BAD",(float)22.5,(float)10.0);
  if (myMO.getError_code()==0) {
  System.out.println("My Float result="+myMO.getFloatResult());  
    }
 else System.out.println("Error"+myMO.getError_message());

       // test square root
 myMO.setRequest("sqr",12);
  if (myMO.getError_code()==0) {
  System.out.println("My square root Float result="+myMO.getFloatResult());  
    }
 else System.out.println("Error"+myMO.getError_message());
  
  // test division
 myMO.setRequest("dIv",100,28);
  if (myMO.getError_code()==0) {
  System.out.println("My division Float result="+myMO.getFloatResult()+"Same set My division Int result="+myMO.getIntResult());
    }
 else System.out.println("Error"+myMO.getError_message());
  
  // test division with divide by zero error
 myMO.setRequest("dIv",100,0);
  if (myMO.getError_code()==0) {
  System.out.println("My division Float result="+myMO.getFloatResult()+"Same set My division Int result="+myMO.getIntResult());
    }
 else System.out.println("Error"+myMO.getError_message());
  
    // test conversion types
 myMO.setRequest("add",200,12);
  if (myMO.getError_code()==0) {
  System.out.println("My add Float result="+myMO.getFloatResult()
  +"\n Int="+myMO.getIntResult()
  +"\n Oct="+myMO.getOctResult()
  +"\n Hex="+myMO.getHexResult()
  +"\n Bin="+myMO.getBinResult()
  );
    }
 else System.out.println("Error"+myMO.getError_message());
}

}
        
    
