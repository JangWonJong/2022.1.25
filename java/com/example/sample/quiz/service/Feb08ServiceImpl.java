package com.example.sample.quiz.service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.sample.quiz.service
 * fileName   : Feb08Service
 * author     : Jangwonjong
 * date       : 2022-02-08
 * desc       :
 * ======================================
 * DATE          AUTHOR            NOTE
 * ======================================
 * 2022-02-08     Jangwonjong       최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    /**숫자야구의 조건
     1 ~ 9 사이의 랜덤 숫자 3개 생성 (중복 X, 음수 X)
     1 ~ 9 사이의 사용자 입력 숫자 3개 생성 (중복 X, 음수 X)
     랜덤 숫자와 사용자 입력 숫자의 위치와 숫자가 모두 같은 경우 -> strike
     랜덤 숫자와 사용자 입력 숫자의 위치는 다르고 숫자가 같은 경우 -> ball
     하나의 랜덤 숫자당 기회 총 10번
     기회를 모두 소진하거나 정답을 입력 시 replay 여부 체크
     'Y' 또는 'y' 입력 시 랜덤 숫자 생성부터 다시 실행
     'N' 또는 'n' 이나 다른 문자 입력 시 게임 종료
     *
     */
    public void baseball(Scanner scanner) {
        int com[] = new int[3]; // 컴퓨터가 제공하는 숫자
        int user[] = new int[3]; // 사용자가 입력할 숫자
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int count = 0; // 게임 횟수
        // 랜덤 숫자 생성
        while(com[0]==0) {
            com[0] = random.nextInt(10);
        }
        while(com[0]==com[1] || com[1]==0) {
            com[1] = random.nextInt(10);
        }
        while(com[1]==com[2] || com[2]==0) {
            com[2] = random.nextInt(10);
        }
        while(true) {
            int strike = 0;
            int ball = 0;
            for(int i=0; i<user.length; i++) {
                System.out.print((i+1)+"번째 수: ");
                user[i] = sc.nextInt();
                if(user[i] > 9 || user[i] <= 0) {
                    System.out.println("숫자 범위는 1~9 입니다.");
                }
            }
            for(int i=0; i<com.length; i++) {
                for(int j=0; j<user.length; j++) {
                    if(com[i] == user[j] && i==j) { // 숫자와 위치가 일치
                        strike++;
                    } else if(com[i] ==user[j] && i!=j) { // 위치는 다르나 숫자는 일치
                        ball++;
                    }
                }
            }
            System.out.println(strike+" 스트라이크 "+ball+" 볼 ");
            count++;
            if(strike == 3) {
                System.out.println("게임 끝\n" + count + "번째 시도 성공");
                break;


            }

        }
    }




    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
