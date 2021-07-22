import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testCreateEmployee() throws IllegalAccessException, ClassNotFoundException{
        Employee employee = Employee.getInstance();
        System.out.println("Memory adress : " + employee);
        //Employee.getInstance();

        Employee employee1 = Employee.getInstance();
        System.out.println("Memory adress : " + employee1);

    }

}