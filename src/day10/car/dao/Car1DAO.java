package day10.car.dao;


import day10.car.dto.Car1DTO;

import java.util.Scanner;

public class Car1DAO {

    private Car1DTO car1;

    public Car1DAO(Car1DTO car) {
        this.car1 = car;
    }


    public void speed() {
        Scanner in = new Scanner(System.in);
        int speed = 0;
        System.out.println("차 모델: "+car1.getModel()+"\n소유자: "+car1.getUser());
        while (true) {
            System.out.println("\n속도증가를 원하는 1을 입력하세요. 감소를 원하면 -1을 입력하세요");
            int a = in.nextInt();
            if (a == 1) {
                speed++;
                System.out.println("현재 속도: "+speed);
            } else if (a == -1) {
                speed--;
                System.out.println("현재 속도: "+speed);
            }

            if (speed == 0) {
                System.out.println("stop");
                break;
            }
        }
    }
    }

