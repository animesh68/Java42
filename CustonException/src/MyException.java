public class MyException {
    public static void main(String[] args) {
        UserValidator validator = new UserValidator();
        try {
            validator.validateAge(18); // This will not throw an exception
            validator.validateAge(17); // This will throw an exception
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
