import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("********  Game Started  **********");
        int score = 0;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

            switch (1) {
                //a + b ez
                case 1:
                    int a = rand.nextInt(1000);
                    int b = rand.nextInt(1000);
                    int sum = a + b;

                    System.out.println("1) What is " + a + " + " + b + " ?");
                    int a1 = sc.nextInt();
                    if (a1 == sum) {
                        score++;
                        System.out.println("- Correct!");
                    }
                    else {
                        System.out.println("- Wrong!");

                    }
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------");

                case 2:
                    System.out.println("2) What is the boiling point temperature of water?");
                    String[] q2 = {" 0 Celsius", " 75 Celsius", " 100 Celsius"};
                    
                    for (int i=0; i < q2.length; i++) {
                        System.out.println(i+1 + ". " + q2[i]);
                    }
                    int a2 = sc.nextInt();;
                    if (a2 == 3) {
                        score++;
                        System.out.println("- Correct!");
                    }
                    else {
                        System.out.println("- Wrong!");

                    }
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------");

                case 3:
                    System.out.println("3) What is the speed of sound?");
                    String[] q3 = {"120 km/h", "1,200 km/h", "400 km/h"};
                    for (int i=0; i < q3.length; i++) {
                        System.out.println(i+1 + ". " + q3[i]);
                    }
                    int a3 = sc.nextInt();;
                    if (a3 == 2) {
                        score++;
                        System.out.println("- Correct!");
                    }
                    else {
                        System.out.println("- Wrong!");

                    }
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------");

                case 4:
                    System.out.println("4) In a race, if you are in third place ,and you passed the third; what position are you in?");
                    String[] q4 = {"Fourth ", "Fifth ", "Second"};
                    for (int i=0; i < q4.length; i++) {
                        System.out.println(i+1 + ". " + q4[i]);
                    }
                    int a4 = sc.nextInt();;
                    if (a4 == 2) {
                        score++;
                        System.out.println("- Correct!");
                    }
                    else {
                        System.out.println("- Wrong!");

                    }
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------");

                case 5:
                    System.out.println("5) How do you spell Red?");
                    String[] q5 = {"L-S-T-E-R", "B-l-u-e", "A-D-C", "R-e-d"};
                    for (int i=0; i < q5.length; i++) {
                        System.out.println(i+1 + ". " + q5[i]);
                    }
                    int a5 = sc.nextInt();
                    if (a5 == 4) {
                        score++;
                        System.out.println("- Correct!");
                    }
                    else {
                        System.out.println("- Wrong!");
                    }
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------");

                case 6:
                    System.out.println("6) 1 matchstick can light 2 candles, if 100 candles are lighted, how many matches will it take ?");
                    String[] q6 = {"Every month", "R2 months", "None of above"};
                    for (int i=0; i < q6.length; i++) {
                        System.out.println(i+1 + ". " + q6[i]);
                    }
                    int a6 = sc.nextInt();;
                    if (a6 == 1) {
                        score++;
                        System.out.println("- Correct!");
                    }
                    else {
                        System.out.println("- Wrong!");
                    }
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------");


                case 7:
                    System.out.println("7) Array Game Change the bit of the array to 1");
                    System.out.println("Enter number of bits to change it to 1 the code will change one of them to 0");
                    int[] q7 = new int[11];
                    //reset
                    for(int i = 0; i < 10; i++) {
                        q7[i] = 0;
                    }

                    //random
                    boolean isChange = true;
                    while(isChange){
                        System.out.print("Enter the first index of array 1 - 10 (Enter -1 to skip): ");
                        int index = sc.nextInt();

                        //ฉลาดเกมส์โกง
                        if(index == 100){
                            score++;
                            System.out.println("Correct!");
                            break;
                        }
                        if(index == -1){
                            System.out.println("Skip!");
                            break;
                        }

                        System.out.print("Enter the second index of array 1 - 10 (Enter -1 to skip): ");
                        int index2 = sc.nextInt();

                        if(index2 == -1){
                            System.out.println("Skip!");
                            break;
                        }

                        int n = rand.nextInt(11);
                        int k = 0;

                        q7[n] = 0;
                        q7[index] = 1;
                        q7[index2] = 1;

                        System.out.print("The bit of the array is: ");
                        for(int i = 1; i <= 10; i++){
                            if(q7[i] == 1) {
                                k++;
                            }
                            System.out.print(q7[i]);
                        }
                        System.out.println();
                        if(k == 10) {
                            isChange = false;
                            score++;
                            System.out.println("Correct!");
                        }
                    }
                    System.out.println("-----------------------------------------------------------------------------------------------");
                
                case 8:
                    System.out.println("8) Meet the boss");
                    System.out.println("-Manage the library-");
                    System.out.println("You have to pick the book in wrong place in to the right place (Skip key -1 in Enter pick roll)");
                    System.out.println("***********************************************************************************************");
                    System.out.println("The bookshelf is 5x5 the code will random book to the wrong place");
                    System.out.println("You have to pick it in to the right place by pick book in (row, column) to the right place");
                    System.out.println("***********************************************************************************************");
                    char[][] li_game = new char[7][7];
                    char[][] li_name = new char[7][7];

                    System.out.print("Enter amount of book 5-24 (reccommend 24):");
                    int q = sc.nextInt();
                    //reset
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <= 5; j++){
                            li_game[i][j] = ' ';
                            li_name[i][j] = ' ';
                        }
                    }
                        
                    //random answer
                    for(int i = 1; i <= q; i++){
                        int ii = rand.nextInt(5) + 1;
                        int jj = rand.nextInt(5) + 1;
                        if(li_name[ii][jj] == ' '){
                            li_name[ii][jj] = (char) (i - 1 + 'a');
                        }
                        else{
                            i--;
                        }
                    }

                    //print answer
                    System.out.println();
                    System.out.println("This is pattern of the answer");
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <= 5; j++){
                            System.out.print("|" + li_name[i][j]);
                            if(j == 5){
                                System.out.print("|");
                            }
                        }
                        System.out.println();
                        System.out.println("-----------");
                    }

                    //random question
                    for(int i = 1; i <= q; i++){
                        int ii = rand.nextInt(5) + 1;
                        int jj = rand.nextInt(5) + 1;
                        if(li_game[ii][jj] == ' '){
                            li_game[ii][jj] = (char) (i - 1 + 'a');
                        }
                        else{
                            i--;
                        }
                    }

                    //print question
                    System.out.println();
                    System.out.println("This is pattern you have to manage");
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <= 5; j++){
                            System.out.print("|" + li_game[i][j]);
                            if(j == 5){
                                System.out.print("|");
                            }
                        }
                        System.out.println();
                        System.out.println("-----------");
                    }

                    //swap
                    boolean run = true;
                    boolean run_2 = true;
                    int cnt = 0;
                    while(run){
                        System.out.print("Enter the row to pick : ");
                        int row = sc.nextInt();
                        
                        //ฉลาดเกมส์โกง
                        if(row == 100){
                            score++;
                            run = false;
                            System.out.println("Correct!");
                            break;
                        }
                        if(row == -1){
                            run = false;
                            System.out.println("Skip!");
                            break;
                        }

                        System.out.print("Enter the column to pick : ");
                        int col = sc.nextInt();
                        char temp = li_game[row][col];
                        li_game[row][col] = ' ';
                        run_2 = true;
                        cnt = 0;

                        while(run_2){
                            System.out.print("Enter the row to put : ");
                            int row_1 = sc.nextInt();
                            System.out.print("Enter the column to put : ");
                            int col_1 = sc.nextInt();
                            if(li_game[row_1][col_1] == ' '){
                                li_game[row_1][col_1] = temp;
                                run_2 = false;
                            }
                            else{
                                System.out.println("This place is already taken");
                                run = true;
                                run_2 = true;
                            }
                        }
                        
                        System.out.println("----------------------------------------------------");
                        System.out.println("now pattern    answer pattern");
                        for(int i = 1; i <= 5; i++){

                            for(int j = 1; j <= 5; j++){
                                if(li_game[i][j] == li_name[i][j]){
                                    cnt++;
                                }
                                System.out.print("|" + li_game[i][j]);
                                if(j == 5){
                                    System.out.print("|");
                                }
                            } 

                            System.out.print("    ");
                            for(int j = 1; j <= 5; j++){                               
                                System.out.print("|" + li_name[i][j]);
                                if(j == 5){
                                    System.out.print("|");
                                }
                            }
                            System.out.println();
                            System.out.println("-----------    -----------");
                        }

                        if(cnt == 25){
                            score++;
                            run = false;
                            System.out.println("Correct!");
                        }
                    }
            }
        System.out.println("***");
        System.out.println("You only scored [ " + score + " ] points out of 7 points");
        System.out.println("********  Game End  **********");

    }

}