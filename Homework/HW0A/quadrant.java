package Homework.HW0A;

public class quadrant {
    public int quarant(int x,int y)
    {
        if(x==0||y==0)return 0;
        else if (y>0&&x>0)return 1;
        else if (y>0&&x<0)return 2;
        else if (y<0&&x<0)return 3;
        else return 4;
    }
    public void main(String[] args)
    {
        System.out.println(quarant(0,0));
    }
}
