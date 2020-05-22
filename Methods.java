/*
package OOPS;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(maxOf(n1,n2));
    }

    static int maxOf(int a,int b){
        return a>b?a:b;
    }
}
*/

//JAVA IS ALWAYS PASS BY VALUE
// MEANS THAT CHANGES IN FUNCTION DOESNT AFFECT THE PASSED PARAMETER
package OOPS;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int a=5;
        int b=6;

        swap(a,b);

        //after swap a and b value of a and b remains same
        // c and d (copies of a and b)are swapped.
        System.out.println("a="+a+" b="+b);
    }

    static void swap(int c,int d){
        int temp=c;
        c=d;
        d=temp;
        System.out.println("c="+c+" d="+d);
    }
}