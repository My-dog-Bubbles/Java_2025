import java.util.Scanner;

public class tester {

public static void main(String[] args) {

Scanner userValues = new Scanner(System.in);

//the input valuea

//one thing i did differently was using the lowercase function to make it easier 

//to type the if function 

System.out.print("Enter a letter that correlates to a number: ");

char let = userValues.next().toLowerCase().charAt(0); 

// this if function is pretty long but i used the or function from boolean

//"if it were this, or this, or this, print this"

// and if they wrote something else i used the else function as an error

if (let == 'a' || let == 'b' || let == 'c') {

System.out.println(2);

} else if (let == 'd' || let == 'e' || let == 'f') {

System.out.println(3);

} else if (let == 'g' || let == 'h' || let == 'i') {

System.out.println(4);

} else if (let == 'j' || let == 'k' || let == 'l') {

System.out.println(5);

} else if (let == 'm' || let == 'n' || let == 'o') {

System.out.println(6);

} else if (let == 'p' || let == 'q' || let == 'r' || let == 's') {

System.out.println(7);

} else if (let == 't' || let == 'u' || let == 'v') {

System.out.println(8);

} else if (let == 'w' || let == 'x' || let == 'y' || let == 'z') {

System.out.println(9);

} else {

System.out.println("Invalid input. Please enter a correct letter.");

}

userValues.close();

}

}

