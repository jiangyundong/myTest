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
            int score=input.nextInt();
            int avg=score/count;    //获取平均分
        }
        catch(InputMismatchException e1)
        {
            System.out.println("输入数值有误！");
        }
        catch(ArithmeticException e2)
        {
            System.out.println("输入的总人数不能为0！");
        }
    }

    public void getD() {
        for (int i = 0; i < 2; i++) {
            System.out.println("dd");
        }
    }


}
