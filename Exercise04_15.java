import java.util.Scanner;
public class Exercise04_15 {

    public static void main(String[] args) {
        /* start up veriable needed for the rest of the code */
        String alphabet ="ABCabcDEFdefGHIghiJKLjklPQRSpqrsTUVtuvWXYZwxyzMNOmno";
        String letter;
        int let_Index=0;

        /* getting user input and assigning it to the letter variable */
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Give me a letter: ");
        letter = keyboard.next();

        /* Finds the index of users input from alphabet */
        let_Index = alphabet.indexOf(letter);

        /* code to checks what the number corespondent is based on the letter index from alphabet */
        if(let_Index>=0 && let_Index<=5){
            System.out.println("Your corresponding number is 2");
        }
        else if (let_Index>5 && let_Index<=11){
            System.out.println("Your corresponding number is 3");
        }
        else if (let_Index>11 && let_Index<=17){
            System.out.println("Your corresponding number is 4");
        }
        else if (let_Index>17 && let_Index<=23){
            System.out.println("Your corresponding number is 5");
        }
        else if (let_Index>23 && let_Index<=31){
            System.out.println("Your corresponding number is 7");
        }
        else if (let_Index>31 && let_Index<=37){
            System.out.println("Your corresponding number is 8");
        }
        else if (let_Index>37 && let_Index<=45){
            System.out.println("Your corresponding number is 9");
        }
        else if (let_Index>45 && let_Index<=51){
            System.out.println("Your corresponding number is 6");
        }
        else{
            System.out.println("uhh ohhh what did you do?");
        }
    }
}
