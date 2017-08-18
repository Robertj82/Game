package menu;

import monster.Bestia;
import monster.Dracula;
import monster.Dragon;
import monster.Monster;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mapa {
    Random random = new Random();
    private int yourChoice;
    private int typeOfMonste;
    private int whatYouDo;
    private Character character;
    // Menu menu = new Menu();
    private int day = 0;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    int stillInGame;

    public void helloInGame() {
        System.out.println("Witaj na mapie");

        do {
            System.out.println("Zaraz sie okaze czy jest potwor na Twojej drodze");
            yourChoice = random.nextInt(2);

            if (yourChoice == 1) {

                do {
                    System.out.println("Spotkales potwora");
                    System.out.println("Powiedz co chcesz zrobić: ");

                    System.out.println("1 - atak");
                    System.out.println("2 - idziesz dalej i wracasz do glownego menu");
                    //System.out.println("3 - wracasz do menu");
                    System.out.println("0 - wyjscie");
                    List<String> readFromFileList = new ArrayList<>();
                    String firstLine ="";
                    whatYouDo = Menu.scanner.nextInt();
                    File file = new File("\"C:\" + File.separator + \"xx\" + File.separator + \"monster.txt\"");
                    if (whatYouDo == 1){
                        typeOfMonste = random.nextInt(3);
                         if (yourChoice == 0) {
                        System.out.println("Spotkaleś Bestię");
                             Bestia bestia = new Bestia();
                             try {
                                 readFromFileList = Files.readAllLines(file.toPath());
                             } catch (IOException e) {
                                 e.printStackTrace();
                             }
                             firstLine=readFromFileList.get(0);
                             String s [] = firstLine.split(";");
                             if(bestia.attack()>=Integer.parseInt(s[2])){
                                 System.out.println("Koniec gry - przegrałeś");
                             }
                             else{
                                 //s[2] -= (bestia.attack());
                             }

                         } else if (yourChoice == 1) {
                        System.out.println("Spotkaleś Drakulę");
                        Dracula drakula = new Dracula();
                          } else if (yourChoice == 2 ) {
                        System.out.println("Spotkaleś Dragona");
                             Dragon dragon = new Dragon();
                          }
                    } else if (whatYouDo == 2) {

                        // menu.printMenu();
                    } else if (whatYouDo != 1 && whatYouDo != 2) {
                        System.out.println("Podales złą liczbe");
                        whatYouDo = 0;
                    }


                } while (whatYouDo == 0);
                System.out.println("Dzieki za walke");
                System.out.println("Grasz dalej?");  // dodane linijki kodu1
                System.out.println("1 - tak"); // dodane linijki kodu1
                System.out.println("2 - nie"); // dodane linijki kodu1
                stillInGame = Menu.scanner.nextInt(); // dodane linijki kodu1
                if (stillInGame == 1) // dodane linijki kodu1
                    helloInGame(); // dodane linijki kodu1

            }
            System.out.println("nie bylo potwora na Twojej drodze");
            System.out.println("Grasz dalej?");
            System.out.println("1 - tak");
            System.out.println("2 - nie");
            stillInGame = Menu.scanner.nextInt();
            if (stillInGame == 1)
                helloInGame();


        } while (stillInGame == 2);
        {
            System.out.println("dzieki za gre");
        }
    }
}