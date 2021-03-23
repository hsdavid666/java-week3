package week3;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		int choose = menu();
		double score[];
		score = new double[5];
		if (choose != 1 && choose != 6) {
			System.out.println("������Ч����������ѧ���ɼ�:");
			Input(score);
			choose = menu();
		}
		double average, high, low;
		while (choose != 6) {
			switch (choose) {
			case 1:
				Input(score);
				break;
			case 2:
				average = GetAverage(score);
				System.out.println("ƽ���ɼ�Ϊ:" + average);
				break;
			case 3:
				high = GetHigh(score);
				System.out.println("��߳ɼ�Ϊ:" + high);
				break;
			case 4:
				low = GetLow(score);
				System.out.println("��ͷ�Ϊ:" + low);
				break;
			case 5:
				Order(score);
				break;
			case 6:
				break;
			default:
				System.out.println("������Ч������������:");
				System.out.println(choose);
				break;
			}
			choose = menu();
		}
		System.out.println("���������");
	}

	public static int menu() {
		int choice = 0;
		System.out.println("========GRADE========");
		System.out.println("1.Input");
		System.out.println("2.Average");
		System.out.println("3.High");
		System.out.println("4.Low");
		System.out.println("5.Order");
		System.out.println("6.Exit");
		System.out.print("Please choose(1-6):");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void Input(double score[]) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (i < score.length) {
			System.out.print("�������" + (i + 1) + "λ�ɼ�:");
			score[i] = scan.nextDouble();
			if (score[i] > 100 || score[i] < 0)
				System.out.println("�ɼ���Ч����������");
			else
				i++;
		}
	}

	public static double GetAverage(double score[]) {
		double sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}
		return sum / 5;

	}

	public static double GetHigh(double score[]) {
		double a = 0;
		for (int i = 0; i < score.length; i++) {
			if (a <= score[i])
				a = score[i];
		}
		return a;
	}

	public static double GetLow(double score[]) {
		double a = 100;
		for (int i = 0; i < score.length; i++) {
			if (a >= score[i])
				a = score[i];
		}
		return a;
	}

	public static void Order(double score[]) {
		double a;
		System.out.print("�ɼ�����Ϊ(��С����)");
		for (int i = 0; i < score.length; i++) {
			for (int j = i + 1; j < score.length; j++) {
				if (score[i] >= score[j]) {
					a = score[i];
					score[i] = score[j];
					score[j] = a;

				}
			}
			System.out.print(score[i] + " ");
		}
		System.out.println("");

	}
}
