package test_web;

import java.util.InputMismatchException;
import java.util.Scanner;

public class te {
	public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        try
        {
            System.out.println("请输入班级总人数：");
            int count=input.nextInt();
            System.out.println("请输入总成绩：");
            int score=input.nextInt();
            int avg=score/count;    //获取平均分
            System.out.println("本次考试的平均分为："+avg);
        }
        catch(InputMismatchException e1)
        {
            System.out.println("输入数值有误！");
        }
        catch(ArithmeticException e2)
        {
            System.out.println("输入的总人数不能为0！");
        }
        catch(Exception e3)
        {
            e3.printStackTrace();
            System.out.println("发生错误！"+e3.getMessage());
        }
    }
	
	public int getInt() {
		return 1;
	}
	
	public int getInt1() {
		return 1;
	}
	
	public void getB() {
		
	}
	
	public int getA() {
		return 2;
	}
	
	public int getInt3() {
		return 3;
	}
	
	public int getInt2() {
		System.out.println();
		return 2;
	}
}
