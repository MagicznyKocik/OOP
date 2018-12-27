package part1.constructors;

public class Main {

    public static void main(String[] args) {
        BankAccount tomasz = new BankAccount();

        tomasz.setAccountNumber(1);
        System.out.println(tomasz.getAccountNumber());
        tomasz.setBalance(500);
        System.out.println(tomasz.getBalance());
        tomasz.setCustomerName("Tomasz Działowy");
        System.out.println(tomasz.getCustomerName());
        tomasz.setEmail("gimper@sds.ssfgf");
        System.out.println(tomasz.getEmail());
        tomasz.setPhoneNumber("123456789");
        System.out.println(tomasz.getPhoneNumber());

        tomasz.depositFunds(50);
        System.out.println(tomasz.getBalance());
        tomasz.depositFunds(-24);
        System.out.println(tomasz.getBalance());
        tomasz.withdrawFunds(250);
        System.out.println(tomasz.getBalance());
        tomasz.withdrawFunds(-100);
        System.out.println(tomasz.getBalance());
        tomasz.withdrawFunds(350);
        System.out.println(tomasz.getBalance());

        BankAccount kitkaAccount = new BankAccount(123,
                1000, "Emilka Kitka",
                "kitkaemilka@sffdw", "8765432");
        kitkaAccount.depositFunds(100);
        System.out.println(kitkaAccount.getBalance());

        VipCustomer KiITA = new VipCustomer();
        System.out.println(KiITA.getName() + " " + KiITA.getEmail() + " " + KiITA.getCreditLimit());
        VipCustomer vip2par = new VipCustomer("KiciKici", 40000);
        System.out.println(vip2par.getName() + " " + vip2par.getEmail() + " " + vip2par.getCreditLimit());
        VipCustomer vip3par =new VipCustomer("KiciKiciMiau", 100000, "KiciMiau@maul.com");
        System.out.println(vip3par.getName() + " " + vip3par.getEmail() + " " + vip3par.getCreditLimit());







    }

}
