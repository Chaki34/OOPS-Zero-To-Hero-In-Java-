package L2_Constructors;

 public  class User {

    private String  username;
    private  String email;
    private  String role;

    // default

    public User(){
        this("Guest");
    }

    public User (String username){
        this(username,"not provided");
    }

    public  User (String username, String email){
        this(username,email,"USER");
    }


    public  User (String username, String email , String role){
        this.username = username;
        this.email = email;
        this.role = role;
    }


    public void  display(){
        System.out.println("Username: " + this.username);
        System.out.println("Email: " + this.email);
        System.out.println("Role: " + this.role);
    }

}
