public class User {
    private final String firstName;
    private final String lastName;
    private final String userName;
    private final String phone;
    private final String address;

    //immutable user because no setters and all final private
    private User(UserBuilder builder)
    {
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.userName=builder.userName;
        this.phone=builder.phone;
        this.address=builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.userName+", "+this.phone+", "+this.address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private String userName;
        private String phone;
        private String address;

        //these are the required fields
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        //optional field
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        //optional field
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        //optional field
        public UserBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build()
        {
            return new User(this);
        }
    }
}
