package org.example;

import java.util.Scanner;

public class App {
    private int len;
    private proverbs[] data;
    private Scanner sc;
    private boolean isRunning;
    private String answer;
    private static String[] commands = {"종료", "등록"};
    App(Scanner sc){
        this.sc = sc;
        this.len = 1;
    }
    public void run() {
        this.isRunning = true;
        System.out.println("== 명언 앱 ==");
        while (this.isRunning) {
            System.out.print("명령) ");
            this.answer = this.sc.nextLine();
            if (this.answer.equals(commands[0])) {
                this.stop();
            }
            if (this.answer.equals(commands[1])) {
                this.register();
            }

        }
    }

    private void stop() {
        this.isRunning = false;
    }

    private void register() {
        this.data = new proverbs[len];
        this.data[len] = new proverbs(len++);
        System.out.print("명언 : ");
        this.data[len].proverbs = this.sc.nextLine();
        System.out.print("작가 : ");
        this.data[len].writer = this.sc.nextLine();
        System.out.println(this.data[len].id + "번 명언이 등록되었습니다.");
    }
}

class proverbs {
    String proverbs;
    String writer;
    int id;
    proverbs(int n){
        id = n;
    }
}