public class lockers {
    public static void main(String[] args) {
        String[] lockers = new String[100];

        /* al the lockers start at open */
        for (int iter = 0; iter<lockers.length; iter++) {
            lockers[iter]="closed";
        }
        // for (i = 0; i<lockers.length; i++) {
        //     System.out.println(lockers[i]);
        // }
        

        /* student 1 closes all of the lockers */
        for (int iter = 0; iter<lockers.length;iter++) {
            lockers[iter]="open";
        }
        // for (i = 0; i<lockers.length; i++) {
        //     System.out.println(lockers[i]);
        // }

        /* uses the student in */
        // iteration for students
        for (int iter = 1; iter<lockers.length; iter++) {
            //iteration for lockers
            for (int i = 0; (iter+i)<lockers.length;i++) {
                System.out.println(i);
                if (lockers[(iter+i)]=="open"){
                    lockers[(iter+i)]="closed";
                    System.out.println(lockers[(iter+i)]);
                } else{
                    lockers[(iter+i)]="open";
                }
            }
            // for (i = 0; i<lockers.length; i++) {
            //     System.out.println(lockers[i]);
            //     System.out.println("out");
            // }      
        }
    }
}
