public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        if (isValidInput(id) && isValidInput(name)) {
            this.id = id;
            this.name = name;
        } else {
            System.out.println("ID and name cannot be empty");
        }
    }

    public Account(String id, String name, int balance) {
        if (isValidInput(id) && isValidInput(name)) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        } else {
            System.out.println("ID and name cannot be empty");
        }
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }

    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public String toString() {
        return "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]";
    }

    private boolean isValidInput(String input) {
        return input != null && !input.isEmpty();
    }
}

