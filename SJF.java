import java.util.Arrays;
import java.util.Scanner;

public class SJF {

	public void execute()
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter number of processes:");
		int numProcess=sc.nextInt();
		Process[] process=new Process[numProcess];
		for(int i=0;i<numProcess;i++)
		{
			System.out.println("Enter Arrival and Burst time of process P"+(i+1));
			int at=sc.nextInt();
			int bt=sc.nextInt();
			
			process[i]=new Process("P"+(i+1),bt,at);
			
			
		}
		
		Arrays.sort(process,new SortByBurstTime());
		int sum=1;
		double TotalWT=0,TotalTAT=0,avgWT=0,avgTAT=0;
		System.out.println("\n\nPrno\tBT\tAT\tCT\tTAT\tWT\tPr");
		
		
		
		
		for(int i=0;i<numProcess;i++)
		{
			sum=process[i].CT=sum+process[i].BT;
			process[i].TAT=process[i].CT-process[i].AT;
			process[i].WT=process[i].TAT-process[i].BT;
			
			
			TotalWT=TotalWT+process[i].WT;
			TotalTAT=TotalTAT+process[i].TAT;
			
			process[i].display();
			
			
			
		}
		
		avgTAT=(double)TotalWT/numProcess;
		avgWT=(double)TotalTAT/numProcess;
	
		System.out.println(avgWT+" "+avgTAT);
		sc.close();
	}
	
	public static void main(String args[])
	{
		
	SJF obj=new SJF();
		obj.execute();
		
	}
}
