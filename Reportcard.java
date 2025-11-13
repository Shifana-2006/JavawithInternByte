import java.util.*;
public class Reportcard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Student Report Card System---");
        //System.out.println("Enter Student Name");
        String name=sc.nextLine();
        //System.out.println("Enter Student ID");
        int id=sc.nextInt();
        int numofsub=sc.nextInt();
        String[] subjects=new  String[numofsub];
        int[] marks=new int[numofsub];
        int total=0;
        for(int i=0;i<numofsub;i++){
           // System.out.println("Enter "+(i+1)+" subject name:");
            subjects[i]=sc.nextLine();
           // System.out.println("Enter marks for"+(i+1)+"subject:");
            marks[i]=sc.nextInt();
            total=total+marks[i];
        }
        double avg=(double)total/numofsub;
        String grade;
        if(avg>=90)
            grade="O";
        else if(avg>=80)
            grade="A";
        else if(avg>=70)
            grade="B";
        else if(avg>=60)
            grade="C";
        else if(avg>=50)
            grade="D";
        else
            grade="F";
        //Display
        System.out.println("-----Report Card-----");
        System.out.println("Student Name: "+name);
        System.out.println("Student ID: "+id);
        System.out.println("Subjects & Marks");
        for(int i=0;i<numofsub;i++){
            System.out.println(subjects[i]+":"+marks[i]);
        }
        System.out.println("Total marks:"+total+"/"+(numofsub*100));
        System.out.println("Average: %2f\n"+avg);
        System.out.println("Grade: "+grade);
        if(grade.equals("F"))
            System.out.println("Result:Fail");
        else
            System.out.println("Result:Pass");
        System.out.println("---Thank you for using Student Report Card System---");
        sc.close();
    }
}