package Homework.HW0A;

public class starTriangle {
    public static void main(String [] args)
    {
        for(int i=0;i<5;i++)
        {
            String line = "";
            for(int j=0;j<i+1;j++){line+="*";}
            System.out.println(line);
        }
    }
}
