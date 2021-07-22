public class Employee {
    private static Employee employee;

    static {
        System.out.println("Class chargée");
    }

    private Employee(){
        System.out.println("Nouvel objet créé");
    }



    public static Employee getInstance() {
        /*
        if (employee == null){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            employee = new Employee();
        }



        return employee;

         */

        return Employee.EmployeeHolder.instance;



    }

    private static class EmployeeHolder{
        private static final Employee instance = new Employee();

        private EmployeeHolder(){
        }
    }


    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                Employee employee = Employee.getInstance();
                System.out.println("Memory adress : " + employee);
                //Employee.getInstance()
            }
        };

        Runnable r2 = new Runnable() {

            @Override
            public void run() {
                Employee employee1 = Employee.getInstance();
                System.out.println("Memory adress : " + employee1);
            }
        };



        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
}
