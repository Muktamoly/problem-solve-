class Demo {

    public static void main(String args[])
    {

        Singleton x = Singleton.getInstance();


        Singleton y = Singleton.getInstance();


        Singleton z = Singleton.getInstance();


        System.out.println(" x is "
                           + x.hashCode());
        System.out.println(" y is "
                           + y.hashCode());



        if (x == y ) {


            System.out.println("the number");
        }

        else {

            System.out.println(Number);

        }
    }
}
