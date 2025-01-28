package Homework.HW0B;
import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class JavaExercises {
    public int[] makeDice()
    {
        int[] arrayDice = {1,2,3,4,5,6};
        return arrayDice;
    }
    public String[] takeOrder(String name)
    {
        String[] foods;
        if(name.equals("Ergun"))foods=new String[]{"beyti", "pizza", "hamburger", "tea"};
        else if(name.equals("Erik"))foods=new String[]{"sushi", "pasta", "avocado", "coffee"};
        else foods = new String[3];
        return foods;
    }
    public int findMinMax(int[] array)
    {
        int min=array[0];
        int max=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(array[i]<min)min=array[i];
            if(array[i]>max)max=array[i];
        }
        return max-min;
    }
    //Build a ArrayList
    public List<Integer> list = new ArrayList<>();
    public int hailstone(int n)
    {
        list.add(n);
        if(n==1) return 0;
        else if(n%2==0) return hailstone(n/2);
        else return hailstone(3*n+1);
    }
    public void main()
    {
        int[] array = new int[]{1,2,3,4,5,6};
        System.out.println(Arrays.toString(makeDice()));
        System.out.println(Arrays.toString(takeOrder("Ergun")));
        //What the hell is this function?
        System.out.println(findMinMax(array));
        hailstone(15);
        System.out.println(list);
    }



}
