package part1.constructors;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    public VipCustomer(){
        this("Johnny D", 5000, "JD@mail.com");
    }

    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
}

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "JD222@mail.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
