
package test.com.max.learnAnnotation.controller; 

import com.max.learnAnnotation.controller.MyAnnotation;
import com.max.learnAnnotation.controller.TestBase;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

/** 
* MyAnnotation Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 1, 2018</pre> 
* @version 1.0 
*/
public class MyAnnotationTest  extends TestBase {

    @Autowired
    private MyAnnotation myAnnotation;
@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: testExceptionOne() 
* 
*/ 
@Test
public void testTestExceptionOne() throws Exception { 
//TODO: Test goes here...
    System.out.println(myAnnotation.testExceptionOne());
} 

/** 
* 
* Method: testExceptionTwo() 
* 
*/ 
@Test
public void testTestExceptionTwo() throws Exception { 
//TODO: Test goes here...
    myAnnotation.testExceptionTwo();
} 


} 
