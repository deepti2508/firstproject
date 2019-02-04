package pack1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddEmployee.class, DeleteEmployee.class, Login.class })
public class AllTests {

}
