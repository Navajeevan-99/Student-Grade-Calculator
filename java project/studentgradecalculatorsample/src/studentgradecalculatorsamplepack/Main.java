package studentgradecalculatorsamplepack;
import java.util.Scanner;
class Test
{
	int n;
	Scanner sc;
	String[] name;
	String[] Roll_no;
	int[] mark1;
	int[] mark2;
	int[] mark3;
	int[] mark4;
	int[] mark5;
	String[] g1;
	String[] g2;
	String[] g3;
	String[] g4;
	String[] g5;
	
	float[] avg;
	Test()
	{
		System.out.print("Enter the number of the student: ");
		sc=new Scanner(System.in);
		n=sc.nextInt();
		name=new String[n];
		Roll_no=new String[n];
		mark1=new int[n];
		mark2=new int[n];
		mark3=new int[n];
		mark4=new int[n];
		mark5=new int[n];
		avg=new float[n];
		g1=new String[n];
		g2=new String[n];
		g3=new String[n];
		g4=new String[n];
		
	}
	
	void get_input()
	{
		System.out.println(n);
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i<n)
		{
			System.out.print("Enter the name "+i+" : ");
			name[i]=sc.nextLine();
			i=i+1;
		}
		i=0;
		while(i<n)
		{
			System.out.println("Enter the mark1 for student"+i+" : ");
			mark1[i]=sc.nextInt();
			System.out.println("Enter the mark2 for student"+i+" : ");
			mark2[i]=sc.nextInt();
			System.out.println("Enter the mark3 for student"+i+" : ");
			mark3[i]=sc.nextInt();
			System.out.println("Enter the mark4 for student"+i+" : ");
			mark4[i]=sc.nextInt();
			System.out.println("Enter the mark5 for student"+i+" : ");
			mark5[i]=sc.nextInt();
			i=i+1;
			
		}
	}
	void display_average()
	{
		statistics  s=new statistics();
		int i=0;
		while(i<n)
		{
			avg[i]=s.average(mark1[i],mark2[i],mark3[i],mark4[i],mark5[i]);
			System.out.println("The average of the student is : "+avg[i]);
			i++;
		}
	}
	void assign_grade()
	{
		int i=0;
		while(i<n)
		{
			if (mark1[i]==100)
			{
				g1[i]="o";
			}
			if (mark1[i]>=80 && mark1[i]<100)
			{
				g1[i]="A";
				
			}
			if (mark1[i]>=60 && mark1[i]<80)
			{
				g1[i]="B";
			}
			if (mark1[i]<60 && mark1[i]>=40)
			{
				g1[i]="C";
			}
			if (mark2[i]==100)
			{
				g1[i]="o";
			}
			
			if (mark2[i]>=80 && mark2[i]<100)
			{
				g2[i]="A";
				
			}
			if (mark2[i]>=60 && mark2[i]<80)
			{
				g2[i]="B";
			}
			if (mark2[i]<60 && mark2[i]>=40)
			{
				g2[i]="C";
			}
			if (mark3[i]==100)
			{
				g1[i]="o";
			}
			if (mark3[i]>=80 && mark3[i]<100)
			{
				g1[i]="A";
				
			}
			if (mark3[i]>=60 && mark3[i]<80)
			{
				g1[i]="B";
			}
			if (mark3[i]<60 && mark3[i]>=40)
			{
				g1[i]="C";
			}
			if (mark4[i]==100)
			{
				g4[i]="o";
			}
			if (mark4[i]>=80 && mark4[i]<100)
			{
				g1[i]="A";
				
			}
			if (mark4[i]>=60 && mark4[i]<80)
			{
				g1[i]="B";
			}
			if (mark4[i]<60 && mark4[i]>=40)
			{
				g4[i]="C";
			}
			if (mark5[i]==100)
			{
				g5[i]="o";
			}
			if (mark5[i]>=80 && mark5[i]<100)
			{
				g1[i]="A";
				
			}
			if (mark5[i]>=60 && mark5[i]<80)
			{
				g5[i]="B";
			}
			if (mark5[i]<60 && mark5[i]>=40)
			{
				g5[i]="C";
			}
			i++;
		}
		
	}
	void display_grade()
	{
		int i=0;
		while(i<n)
		{
			System.out.println("Student "+ i + "grade of the subject are ");
			System.out.println("Subject 1 : "+g1[i]);
			System.out.println("Subject 2 : "+g2[i]);
			System.out.println("Subject 3 : "+g3[i]);
			System.out.println("Subject 4 : "+g4[i]);
			System.out.println("Subject 5 : "+g5[i]);
			i++;
		}
	}
}
class statistics
{
	float average(int m1,int m2,int m3,int m4,int m5)
	{
		float avg=(m1+m2+m3+m4+m5)/5;
		return avg;
	}
	
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t[]=new Test[3];
		t[0]=new Test();
		t[0].get_input();
		t[0].display_average();
		t[0].assign_grade();
		t[0].display_grade();
	}

}
