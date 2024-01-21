import java.util.Scanner;

public class Grade_calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-------------------------GRADE CALCULATOR-------------------------------------");
        System.out.println("Enter the no of subject");
        int sub= sc.nextInt();
        System.out.println("Enter marks of a subject");
        int maxmarks=sc.nextInt();



        int max=sub*maxmarks;
        int tmarks=0;
        int marks;

        for(int i=0;i<sub;i++){
            System.out.println("Enter the marks");
            marks=sc.nextInt();
            tmarks =tmarks+marks;

        }
        int per=100*tmarks/max;
        System.out.println("percentage:"+per);
        String grade=grade(per);
        int avgmarks=tmarks/sub;
        System.out.println("AVERAGE MARKS:"+avgmarks);
        System.out.println(grade);

    }

    static String grade(int per){
       if(per>90){
           return "Grade:A+";

       }
       else if (per>80) {
           return "Grade:A";

       }
       else if (per>70) {
           return "Grade:B";

       }
       else if (per>60) {
           return "Grade:B+";

       }
       else if (per>=50) {
           return "Grade:C";

       }

        return "FAIL";
    }

}
