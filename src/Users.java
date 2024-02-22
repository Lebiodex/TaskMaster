import java.util.ArrayList;

public class Users extends User{

    private ArrayList<User> users;

    public ArrayList<User> getUsers() {
        return users;
    }

    public Users(){
        super();
        users=new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

}