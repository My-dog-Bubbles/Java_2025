
public class TestIO {

    public static void main(String[] args) {
        try {
            java.io.File file = new java.io.File("poem.txt");
        } catch (Exception nonexisting) {
            System.out.println("This file already existest");
        }

        int Chars = file.charCount();
        int words = file.wordCount();
        int lines = file.lineCount();
    }
}

class charCount {

    int count = 0;
    // make a loop that goes through all the txt file for all the chars 
}

class wordCount {

    int count = 0;
    /* make a loop that goes through all the txt file for all the txt seperates the file by spaces then add it to a list*/
}

class lineCount {

    int count = 0;
    // how to check the amount of lines (maybe look at the /n and count how many time that this exists)
}
