package test_web;

import java.util.InputMismatchException;
import java.util.Scanner;

public class te {
	public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        try
        {
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

    }
	
	public int getInt() {
		return 1;
	}
	
}
