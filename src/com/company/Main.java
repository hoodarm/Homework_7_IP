package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int n = 0;
        boolean answer = false;
        while (!answer)
        {
            if ((n * n * n + 91) % 47 == 0)
            {
                answer = true;
                System.out.println(n);
            }
            n++;
        }
    }
}
