package Objects;

public class FacebookUser {
    //Facebook User:
    //Create a class for a facebook user which has the following instance variables: username, password, name, age, and number of friends
    //Create a constructor which will create a facebook user by only taking the username and password. If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.
    //Overload the constructor to accept username, password, and the user’s name. If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’
    //Overload the constructor to accept all of the variables. Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ). If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
    //Create an info method that will print the Username, name, age and number of friends for the Facebook user.
    //Create a sendFriendRequest method that will accept a Facebook user object and send them a friend request. The method should return a boolean of if the friend request was sent (true) or if the friend request was not sent (false). If your friend list is at the 5000 limit then do not send the request and print “You have reached the limit of friends.” Also if the user you are trying to send the request to has already hit the limit then print “theUsersName cannot accept any more friend request. If both you and the user are under the limit print “Friend request sent to theUsersName” and increase your number of friends by one.

    String username;
    String password;
    String name;
    int age;
    int numberOfFriends;

    public FacebookUser(String username, String password) {
        if (password.contains(username)) {
            System.out.println("Invalid password");
            this.password = "password";
        } else {
            this.password = password;
        }
        this.username = username;
    }

    public FacebookUser(String username, String password, String name) {
        this(username, password);
        name = name.replace(" ", "");
        boolean valid = true;
        for (int i = 0; i < name.length(); i++) {
            //if (name.toLowerCase().charAt(i) >= 97 && name.toLowerCase().charAt(i) <= 122) {
            if (Character.isLetter(name.charAt(i))) {
                valid = false;
                break;
            }
        }
        if (valid) {
            this.name = name;
        } else {
            name = "no name";
            System.out.println("Invalid name");
        }
    }

    public FacebookUser(String username, String password, String name, int age, int numberOfFriends) {
        if (age > 0) {
            this.age = age;
        } else {
            //  age = 0; because all integers are zero by default
            System.out.println("Invalid age");
        }
        if (numberOfFriends > 0) {
            this.numberOfFriends = numberOfFriends;
        } else {
            // numberOfFriends = 0; because all integers are zero by default
            System.out.println("Invalid number of friends");
        }

    }

    public void info() {
        System.out.println("Username: " + this.username);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Number of friends: " + this.numberOfFriends);
    }

    public boolean sendFriendRequest(FacebookUser userTwo) {
        if (this.numberOfFriends > 5000) {
            System.out.println("You reached the limit");
            return false;
        } else if (userTwo.numberOfFriends > 5000) {
            System.out.println(userTwo.name + " has reahced the limit of friends ");
            return false;
        } else {
            System.out.println("Request sent");
            this.numberOfFriends++;
            userTwo.numberOfFriends++;
            return true;
        }
    }
}