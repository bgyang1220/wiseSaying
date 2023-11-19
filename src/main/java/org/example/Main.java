package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class App{
    String[] proverbs;
    Scanner sc = new Scanner(System.in);
    boolean isRunning;
    String answer = new String();
    App(){
        this.isRunning = true;
        System.out.println("== 명언 앱 ==");
        while (this.isRunning){
            System.out.print("명령) ");
            this.answer = this.sc.nextLine();
            if (this.answer.equals("종료")){

            }
        }
    }
//    void
}