package com.example.sample.quiz.controller;

import com.example.sample.quiz.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.sample.controller
 * fileName   : TempController
 * author     : Jangwonjong
 * date       : 2022-02-04
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-04     Jangwonjong       최초 생성
 */
public class QuizController {
    public void execute(Scanner scanner){
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();

        while (true){
            System.out.println("[서브메뉴]\n 0)Exit 1)2월6일 2)2월7일 3)2월8일 ");
            switch (scanner.next()){
                case "0":
                    System.out.println("### Exit ###");return;
                case "1":
                    String[] arr = {"권혜민",  "조현국",       "김진영",     "김한슬",      "서성민",
                            "정렬",   "해시",         "힙",         "완전탐색",     "DP",
                            "스택",   "깊이우선탐색 ", "그래프",      "탐욕법",       "이중탐색",
                            "큐",    "너비우선탐색"};
                    System.out.println("[소메뉴]\n0.Exit \n1.팀별 과제 \n2.팀장이 맡은 과제 \n3.큐를 담당한 사람\n4.팀원별 과제 수");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println("### 1.팀별 과제 ###");
                            feb06Service.quiz1(arr);
                            break;
                        case "2":
                            System.out.println("### 2.팀장이 맡은 과제 ###");
                            feb06Service.quiz2(arr);
                            break;
                        case "3":
                            System.out.println("### 3. 큐를 담당한 사람");
                            feb06Service.quiz3(arr);
                            break;
                        case "4":
                            System.out.println("### 4. 팀원별 과제 수###");
                            feb06Service.quiz4(arr);
                            break;
                        default:
                            System.out.println("### Invalid Menu ###");

                    }
                case "2":
                    System.out.println("[소메뉴]\n 0.Exit\n1.주사위\n2.가위바위보\n3.소수 구하기\n4.윤년/평년\n5.임의숫자 맞추기");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("### 종료 ###");return;
                        case "1":
                            System.out.println("### 1.주사위 ###");
                            feb07Service.dice(scanner);
                            break;
                        case "2":
                            System.out.println("### 2.가위바위보 ###");
                            feb07Service.rps(scanner);
                            break;
                        case "3":
                            System.out.println("### 3.소수 구하기 ###");
                            feb07Service.getPrime(scanner);
                            break;
                        case "4":
                            System.out.println("### 4.윤년/평년 구별 ###");
                            feb07Service.leapYear(scanner);
                            break;
                        case "5":
                            System.out.println("### 5.임의의 수 맞추기 ###");
                            feb07Service.numberGolf(scanner);
                            break;
                        default:
                            System.out.println("### Invalid Menu ###");
                    }
                case "3":
                    System.out.println("[소메뉴]\n0.Exit\n1.로또\n2.야구\n3.좌석예약\n4.은행 입출금\n5.구구단");
                    switch (scanner.next()){
                        case "0":
                            System.out.println("Exit");return;
                        case "1":
                            System.out.println("로또");
                            feb08Service.lotto(scanner);
                            break;
                        case "2":
                            System.out.println("### 야구 ###");
                            feb08Service.baseball(scanner);
                            break;
                        case "4":
                            System.out.println("### 좌석예약 ###");
                            feb08Service.booking(scanner);
                            break;
                        case "5":
                            System.out.println("### 은행 입출금 ###");
                            feb08Service.bank(scanner);
                            break;
                        case "6":
                            System.out.println("### 구구단 ###");
                            feb08Service.gugudan(scanner);
                            break;
                        default:
                            System.out.println("Invalid Menu");
                    }
                    break;
            }

        }
    }

}




