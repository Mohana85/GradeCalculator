import java.util.*;
 public class Grade{
    public static char calculateGrade(int percentage){
        int choice=percentage;
        if(choice>=90 && choice<=100){
            return 'S';
        }
        else if(choice>=80 && choice<90){
            return 'A';
        }
        else if(choice>=70 && choice<80){
            return 'B';
        }
         else if(choice>=60 && choice<70){
            return 'c';
        }
         else if(choice>=50 && choice<60){
            return 'D';
        }
         else if(choice>=40 && choice<50){
            return 'E';
        }
        else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int totalSubjects=sc.nextInt();
        sc.nextLine();
        int sum=0;
        System.out.println("Enter the marks of the subjects(out of 100): ");
        int subjects=1;
        while(subjects<=totalSubjects){
            System.out.print("Enter the marks for subject "+subjects+": ");
            int marks=sc.nextInt();
            sum+=marks;
            subjects++;
        }
        System.out.println("Totla marks of the student: "+sum);
        double percentage=(double)sum/totalSubjects;
        System.out.printf("The Average of the student: %.2f ",percentage);
        if((int)percentage<40){
            System.out.print("The Student failed the exam : ");
        }
        System.out.println();
        System.out.print("The Grade of the student: "+calculateGrade((int)percentage));
        sc.close();
    }
}