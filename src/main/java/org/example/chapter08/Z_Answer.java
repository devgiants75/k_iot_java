package org.example.chapter08;

abstract class TransportApp {
    abstract void move();

    void info() {
        System.out.println("이동 관련 애플리케이션입니다.");
    }
}

interface EcoFriendly {
    default void ecoMessage() {
        System.out.println("이동 수단은 친환경적입니다.");
    }
}

class TaxiApp extends TransportApp {
    @Override
    void move() {
        System.out.println("택시로 이동합니다.");
    }
}

class BikeApp extends TransportApp implements EcoFriendly {
    @Override
    void move() {
        System.out.println("자전거로 이동합니다.");
    }

    @Override
    public void ecoMessage() {
        System.out.println("이동 수단은 친환경적입니다.");
    }
}

public class Z_Answer {
    public static void main(String[] args) {
        TransportApp[] apps = {
                new TaxiApp(),
                new BikeApp()
        };

        for (TransportApp app : apps) {
            app.move();
            app.info();

            if (app instanceof EcoFriendly) {
                EcoFriendly eco = (EcoFriendly) app;
                eco.ecoMessage();
            }
        }
    }
}