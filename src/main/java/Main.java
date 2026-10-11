public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("employee@example.com", "Test123!");

        LoginService loginService = new LoginService();

        boolean loginSuccessful = loginService.login(employee, "employee@example.com", "Test123!");

        System.out.println("Login successful: " + loginSuccessful);
    }
}
