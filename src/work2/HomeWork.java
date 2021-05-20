package work2;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int number;
        do {

            System.out.println("2 .Odd/Even");
            System.out.println("3.Perfect square");
            System.out.println("0. exit");
            choice = sc.nextInt();
            switch (choice){


                case 2:
                    System.out.println("Nhập vào số cần kiểm tra");
                    number = sc.nextInt();
                    if (isOdd(number)) {
                        System.out.println(number + " là số lẻ");
                    } else System.out.println(number + " là số chẵn");
                    break;
                case 3:
                    System.out.println("Nhập vào số cần kiểm tra");
                    number = sc.nextInt();
                    if (isSquareNumber(number)) {
                        System.out.println(number + " là số chính phương");
                    } else {System.out.println(number + " không là số chính phương");
                        break;
                    }
                case 4:
                    System.exit(0);

            }
            }

        while (choice!=4);

    }


    public static boolean isSquareNumber(int number){
        boolean check = false;
        for (int i = 0;i <Math.sqrt(number);i++){
            if(i*i==number){
                check=true;
                break;
            }
        }
        return  check;
    }
    public static boolean isOdd(int number){
        if( number%2==0){
            return false;
        }else {
        return true;
        }
    }
}
