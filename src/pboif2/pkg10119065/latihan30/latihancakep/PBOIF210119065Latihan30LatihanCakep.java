package pboif2.pkg10119065.latihan30.latihancakep;

import java.util.Scanner;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program cakep
 */

public class PBOIF210119065Latihan30LatihanCakep {
    
    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String MAGENTA = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pertanyaan = RED + "kamu " + GREEN + "ngerjain sendiri " +  
                            YELLOW + "latihan 17 sampe " + BLUE + "latihan 30 ini?";
        System.out.println(pertanyaan);
        System.out.print(BLUE+"Jawab "+ RED + "(Yoi/Enggak) : ");
        String jawab = sc.next();
        
        if(jawab.equals("yoi")|| jawab.equals("Yoi")||jawab.equals("YOI")){
            System.out.println(RED + "\nCakep Bener. " + MAGENTA + "Good Job");
        }else if(jawab.equals("Enggak") || jawab.equals("ENGGAK") || jawab.equals("enggak")){
            System.out.println(RED + "\nTetep cakep sih. " + CYAN + "/nSing penting paham konsep nya yee"
                    + BLACK + "\nKeep the code works dude");
        }else{
            
        }
    }
    
}
