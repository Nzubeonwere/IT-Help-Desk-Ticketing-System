public class Employee {

    private String email;
    private String password;

    public Employee(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkPassword(String enteredPassword) {
        return password.equals(enteredPassword);
    }
}
