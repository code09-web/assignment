package interbiz;
import java.util.Scanner;

/**
 * NoteWithdraw
 */
public class NoteWithdraw {
    static int[] mininumNote(int amount)
    {
        int numberOfNote[] = new int[5];
        while(amount>0){
            if(amount>=2000){
                numberOfNote[0]++;
                amount =amount - 2000;
              }else if (amount >= 500) {
                numberOfNote[1]++;
                amount -= 500;
              }else if (amount >= 200) {
                numberOfNote[2]++;
                amount -= 200;
              }
               else if(amount >=100){
                numberOfNote[3]++;
                amount -= 100;
              }else if(amount >= 50){
                numberOfNote[4]++;
                amount -= 50;
              }
          }

        return numberOfNote;
    }
    static int[] maximumNote(int amount)
    {
        int numberOfNote[] = new int[5];
        while(amount>0){
            if(amount>=50){
                numberOfNote[4]++;
                amount =amount - 50;
              }else if (amount >= 100) {
                numberOfNote[3]++;
                amount -= 100;
              }else if (amount >= 200) {
                numberOfNote[2]++;
                amount -= 200;
              }
               else if(amount >=500){
                numberOfNote[1]++;
                amount -= 500;
              }else if(amount >= 2000){
                numberOfNote[0]++;
                amount -= 2000;
              }
          }

        return numberOfNote;
    }
    static void printNote(int numberOfNote[]){
        for (int i = 0; i<=numberOfNote.length; i++) {
            if(i == 0 && numberOfNote[i]>0){
                System.out.println("2000 note = " + numberOfNote[i]);
            }else if(i == 1 && numberOfNote[i]>0)
            {
                System.out.println("500 note = " + numberOfNote[i]);
            }else if(i == 2 && numberOfNote[i]>0)
            {
                System.out.println("200 note = " + numberOfNote[i]);
            }
            else if(i == 3 && numberOfNote[i]>0)
            {
                System.out.println("100 note = " + numberOfNote[i]);
            }else if(i == 4 && numberOfNote[i]>0)
            {
                System.out.println("50 note = " + numberOfNote[i]);
            }
          }
    }
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int amount = sc.nextInt();
//   amount = 4750;
  int numberOfNote[] = new int[5];
  System.out.println("Input :- "+amount);
  System.out.print("Mininum: ");
  numberOfNote = NoteWithdraw.mininumNote(amount);
  NoteWithdraw.printNote(numberOfNote);

  System.out.print("Maximum: ");
  numberOfNote = NoteWithdraw.maximumNote(amount);
  NoteWithdraw.printNote(numberOfNote);
 
}
    
}
