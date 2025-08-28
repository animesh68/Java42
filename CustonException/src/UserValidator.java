class UserValidator {
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote: Age is " + age);
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}