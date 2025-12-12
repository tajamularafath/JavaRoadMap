package singleton;

public class SingletonClass {
    public static void main(String[] args) {

        Account.createObject();
        Account.createObject();
        Account.createObject();

    }


    static class Account {
        static Account obj;

        private Account() {
            System.out.println("Object Created");
        }

        public static void createObject() {
            if (obj == null) {
                obj = new Account();
            } else {
                System.out.println("Cannot create Object");
            }
        }
    }
}
