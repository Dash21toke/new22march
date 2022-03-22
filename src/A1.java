import java.lang.*;

import java.util.*;



    class A1 extends Thread

    {

        int i,j;

        A1(int x,int y)

        {

            i=x;

            j=y;

        }

        public void run() {

            System.out.println("THREAD A:: ARITHEMATIC OPERATIONS");


            System.out.println("SUM " + (i + j));

            System.out.println("DIFFERENCE " + (i - j));

            System.out.println(" PRODUCT  " + (i * j));

            System.out.println("RATIO  " + (i / j));

        }

    }



// MAIN CLASS

    class Operate

    {

        public static void main(String args[])

        {

            Scanner s=new Scanner(System.in);

            System.out.println("ENTER TWO VALUES FOR ARITHEMATIC  OPERATIONS:");

            int x=s.nextInt();

            int y=s.nextInt();





            A1 a=new A1(x,y);




            a.start();



        }

    }

