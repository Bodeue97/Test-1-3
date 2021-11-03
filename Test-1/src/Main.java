

import java.util.Random;
import java.util.Scanner;
import java.lang.StringBuffer;


import static java.lang.Math.sqrt;


public class Main {




    public static void main(String[] args) {


        //Zad1
//        Scanner scn = new Scanner(System.in);
//
//        int n = scn.nextInt();
//        int[] tab = new int[n];
//        Random r = new Random();
//        for (int i = 0; i <= n-1; i++){
//            tab[i] = r.nextInt(100)+1;
//
//            System.out.println(tab[i]);
//        }
//
//
//            showPrimes(tab);

        //Zad2

//        Scanner scn = new Scanner(System.in);
//        Random r = new Random();
//        int n = scn.nextInt();
//        int[] tab = new int[n];
//        for(int i = 0; i <=n-1; i++){
//            tab[i] = r.nextInt(51+50)-50;
//            System.out.println(tab[i]);
//
//        }
//
//        System.out.println(countLargest(tab));

        //Zad3

        String str = "he1e2e3e4e5e6e7eeee";

        System.out.println(delete(str, 'e'));
//












    }
    public static void showPrimes(int[] list){

        for(int i = 0; i <= list.length-1; i++){
            int count = 0;
            for(int j = 1; j<=sqrt(list[i]); j++){
                if(list[i] % j == 0){
                    count++;
                }

            }
            if(count == 1){
                System.out.println(list[i]+ " jest l. pierwsza");
            }

        }



    }

    public static String countLargest(int[] tab){
        String odp = "";
        int max = tab[0];
        int count = 0;
        for(int i = 0; i<= tab.length-1; i++){
            if(tab[i] > max){
                max = tab[i];

            }

        }
        for(int i = 0; i <=tab.length-1; i++){
            if(max == tab[i]){
                count++;
            }

        }
        odp  = "Najwiekszy element tablicy to " + max + " i wystepuje w niej "+ count + " razy";

            return odp;
    }

    public static String delete(String str, char c){
        String odp = "";
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i<=sb.length()-2; i++) {


         if(i == sb.length()-2){
            if(sb.charAt(i) == c){
                if(count > 0){
                    sb.delete(sb.length()-2, sb.length()-1);
                    }
                }
            }
          if(count > 0 && sb.charAt(i) == c ){
                sb.delete(i, i+1);

            }

            if(sb.charAt(i) == c)
                count++;


        }
        System.out.println(count);
        if(sb.charAt(sb.length()-1) == c && count > 0){
            sb.delete(sb.length()-1, sb.length());
        }
        odp = sb.toString();
        return odp;
    }



}


