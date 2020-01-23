package com.marat;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите сайт который надо открыть");
        String sait = s.nextLine();
        System.out.println("Введитe кол-во секунд ожидания перед открытием сайта");
        int secund = s.nextByte()*1000;
        System.out.println("Введите сколько штук открывать");
        int kol = s.nextInt();
        System.out.println("Ожидаю...");


        long t = System.currentTimeMillis() + secund;
        Thread.sleep(secund-10);
        while (true){
        if (t == System.currentTimeMillis()) {
            Desktop d = Desktop.getDesktop();
            System.out.println("Открываю...");
            for (int i = 0; i<kol;){
            d.browse(new URI(String.format("http://"+sait)));
            i++;}
            return;
        }
        }
        }
    }

