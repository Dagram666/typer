package logic;

public class CreateUser {

    private String name;
    private String lastName;
    private String nick;
    private String email;
    private String password;


    public CreateUser(String imie, String nazwisko, String nick, String email, String haslo) {
        this.name = imie;
        this.lastName = nazwisko;
        this.nick = nick;
        this.email = email;
        this.password = haslo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String person() {
        String person = name + " " + lastName + " " + nick + " " + email + " " + password;
        return person;
    }

}
