package Assignment1;

public class Person {

    // fields
    private int id;
    private String firstName; // 3 Anna
    private String lastName;
    private String email;

    // constructors


    // methods
    public String getSummary() {
        return "id: " + id + " Name: " + firstName + " " + lastName + " " + "Email:" + " " + email ;
    }

    // setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) { // 1 Anna
        if (firstName == null) {
            throw new IllegalArgumentException("firstName was null");
        }
        this.firstName = firstName; // 2 Anna
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null) {
            throw new IllegalArgumentException("lastName was null");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email was null");
        }
        this.email = email;
    }


}
