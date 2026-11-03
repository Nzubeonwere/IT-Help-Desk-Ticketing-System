public class LoginService {

    public boolean login(Employee employee, String email, String password) {
        return employee.getEmail().equals(email)
                && employee.checkPassword(password);
    }

}
