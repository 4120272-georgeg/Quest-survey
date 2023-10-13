/*
Grace George
4120272
 */
public class UserInfo {
    private  String name, surn, email, password;  //Declaring variables for the class

    public UserInfo() {  //Creating constructor method
        this.name =" ";
        this.surn =" ";
        this.email =" ";
        this.password =" ";
    }

    public UserInfo(String name, String surn, String  email, String password) {  //Overloading constructor method
        this.name = name;
        this.surn = surn;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getSurn() {
        return surn;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurn(String surn) {
        this.surn = surn;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }





















}
