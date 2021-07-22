public class EmployeeMain {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

        try {
            Class.forName("Employee").newInstance();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
    }
}
