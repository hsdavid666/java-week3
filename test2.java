package week3;

import java.util.Scanner;

public class test2 {
	public static double FirstNum, SecondNum;

	public static void main(String[] args) {
		int choose = menu();
		if (choose != 1 && choose != 5) {
			System.out.println("输入无效，请先输入两个数:");
			Input();
			choose = menu();
		}
		while(choose!=5)
		{
			switch(choose)
			{
			case 1:
				Input();
				break;
			case 2:
				AllTheOddNumbers();
				break;
			case 3:
				TheSumOfEvenNumbers();
				break;
			case 4:
				TheSquaresOfOddNumbers();
				break;
			case 5:
				break;
			}
			choose = menu();
		}
		System.out.println("程序结束！");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("========NUMBER========");
		System.out.println("1.Input two integers");
		System.out.println("2.Output all the add numbers");
		System.out.println("3.Output the sum of all the even numbers");
		System.out.println("4。Output the sum of the squares of all the odd numbers");
		System.out.println("5.Exit");
		System.out.print("Please choose(1-5):");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void Input() {
		System.out.print("请输入两个数(第一个数必须小于第二个数):");
		Scanner scan =new Scanner(System.in);
		FirstNum=scan.nextInt();
		SecondNum=scan.nextInt();
		if(FirstNum>=SecondNum)
		{
			System.out.println("输入错误，重新输入！");
			System.out.print("请输入两个数(第一个数必须小于第二个数):");
			FirstNum=scan.nextInt();
			SecondNum=scan.nextInt();
		}
		
	}
	
	public static void AllTheOddNumbers() {
		System.out.print(FirstNum+"和"+SecondNum+"之间的奇数有:");
		for(double i=FirstNum;i<=SecondNum;i++)
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		System.out.println("");
	}
	
	public static void TheSumOfEvenNumbers() {
		double sum=0;
		System.out.print(FirstNum+"和"+SecondNum+"之间的偶数和:");
		for(double i=FirstNum;i<=SecondNum;i++)
			if(i%2==0)
			{
				sum=sum+i;
			}
		System.out.println(sum);
	}
	
	public static void TheSquaresOfOddNumbers() {
		System.out.print(FirstNum+"和"+SecondNum+"之间的奇数的平方和是:");
		double sum=0;
		for(double i=FirstNum;i<=SecondNum;i++)
			if(i%2!=0)
			{
				sum=sum+Math.pow(i, 2);
			}
		System.out.println(sum);
	}
}
