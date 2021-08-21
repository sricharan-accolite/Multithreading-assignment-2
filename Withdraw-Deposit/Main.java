class Main
{
    public static void main(String args[])
    {
        final Person p = new Person();
        
        new Thread()
        {
            public void run()
            {
                p.deposit(1000);
            }
        }.start();
        new Thread()
        {
            public void run()
            {
                p.withdraw(1500);
            }
        }.start();    
    }
}

class Person
{
    int amount = 1000;

    synchronized void withdraw(int amount)
    {

        if (this.amount < amount)
        {
            System.out.println("Insufficient Balance. Please deposit more money");
            try
            {
                wait();
            } catch (Exception e)
            {
                System.out.println(e);
            }
        }
        this.amount -= amount;
        System.out.println("deducted amaount: " + amount);
        System.out.println("Balance remaining : " + this.amount);
    }

    synchronized void deposit(int amount)
    {
        this.amount += amount;
        System.out.println("Successfully deposited.");
        notify();
    }
}