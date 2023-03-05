package akz.models;

public class User {
    private int iduser;
    private String name,mail,phone,address;

    public User() {
    }

    public User(String name, String mail, String phone, String address) {
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
    }

    public User(int iduser, String name, String mail, String phone, String address) {
        this.iduser = iduser;
        this.name = name;
        this.mail = mail;
        this.phone = phone;
        this.address = address;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
