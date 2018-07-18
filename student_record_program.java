

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
        int i,AboveCount,BelowCount;
        float [][]Grades;
        float Sum,Average,Max,Min;
        String []Names;
        
        
        Grades= new float[5][4];
        Names=new String[5];
        
        Sum=(float)0.0;
        Average=(float)0.0;
        Max=(float)0.0;
        Min=(float)9999.99;
        AboveCount=0;
        BelowCount=0;
        for(i=0;i<5;i++)
        {
            System.out.print("Enter Name for student "+(i+1)+": ");
            Names[i]=in.next();
            System.out.print("Enter Grades for student "+Names[i]+": ");
            System.out.print("Homework: ");
            Grades[i][0]=in.nextFloat();
            System.out.print("Attendance: ");
            Grades[i][1]=in.nextFloat();
            System.out.print("Examination: ");
            Grades[i][2]=in.nextFloat();
            Grades[i][3]=Grades[i][0]*(float)0.35+Grades[i][1]*(float)0.15+Grades[i][2]*(float)0.50;
        }
        
        
        System.out.println("\r\nThe Report of Grades is:");
        System.out.print("Student\t\tName\t\tHomework\t\tAttendance\tExamination\tTotal");
        for(i=0;i<5;i++)
        {
            System.out.print("\r\n");
            System.out.print(i+1);
            System.out.print("\t\t");
            System.out.print(Names[i]);
            System.out.print("\t\t");
            System.out.print(Grades[i][0]);
            System.out.print("\t\t");
            System.out.print(Grades[i][1]);
            System.out.print("\t\t");
            System.out.print(Grades[i][2]);
            System.out.print("\t\t");
            System.out.print(Grades[i][3]);
        }
        //to claculate the Average
        for(i=0;i<5;i++)
        {
            Sum=Sum+Grades[i][3];
        }
        Average=Sum/(float)5;
        System.out.print("\r\n\r\nThe class average is:");
        System.out.println(Average);
        
        //to calculate the max grade
        Max = Grades[0][3]; 
        for(i=1;i <5;i++)
        { 
            if(Grades[i][3] > Max)
            { 
                Max =Grades[i][3]; 
            } 
        }
        System.out.print("The Highest overall grade is");
        System.out.println(Max);
        
        //to calculate the min grade
        Min= Grades[0][3]; 
        for(i=1;i <5;i++)
        { 
            if(Grades[i][3] < Min)
            { 
                Min =Grades[i][3]; 
            } 
        }
        System.out.print("The Lowest overall grade is");
        System.out.println(Min);
        
        //to claculate number of students above the average grade
        AboveCount=0;
        for(i=0;i<5;i++)
        {
            if(Grades[i][3]>Average)
            {
                AboveCount=AboveCount+1;
            }
        }
        System.out.print("There number of students above average grade is:");
        System.out.println(AboveCount);
        
        //to claculate number of students below the average grade
        BelowCount=0;
        for(i=0;i<5;i++)
        {
            if(Grades[i][3]<Average)
            {
                BelowCount=BelowCount+1;
            }
        }
        System.out.print("There number of students below average grade is:");
        System.out.println(BelowCount);
        
        
	}
}




