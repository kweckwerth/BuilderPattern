public class Main {


    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Jon", "Smith").userName("username").phone("1234567").address("address").build();
        System.out.println(user1);
        User user2 = new User.UserBuilder("Joe", "Blow").userName("username").address("address2").build();
        System.out.println(user2);
        User user3 = new User.UserBuilder("Art", "Craft").userName("username1").build();
        System.out.println(user3);
    }
}
