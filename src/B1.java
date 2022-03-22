import java.lang.*;

import java.util.*;






class B1 extends Thread

{

    int i;

    B1(int x)

    {

        i=x;

    }

    public void run()

    {
        System.out.println("THREAD B:: TRIGNOMETRIC OPERATIONS");

        System.out.println("SINE OF "+i+""+Math.sin(i));

        System.out.println("COSINE OF "+i+""+Math.cos(i));

        System.out.println("TAN OF "+i+"  "+Math.tan(i));

        System.out.println("END OF B");

    }

}

// MAIN CLASS

class Operate1

{

    public static void main(String args[])

    {

        Scanner s=new Scanner(System.in);



        System.out.println("ENTER A VALUE FOR TRIGNOMETRIC OPERATIONS:");

        int z=s.nextInt();



        B1 b=new B1(z);





        b.start();

    }

}

