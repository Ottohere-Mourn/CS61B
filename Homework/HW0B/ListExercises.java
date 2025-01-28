package Homework.HW0B;
import java.util.List;
import java.util.ArrayList;
public class ListExercises {
    public int sum(int[] array)
    {
        int sum = 0;
        for(int num : array)
        {
            sum += num;
        }
        return sum;
    }
    public List<Integer> evens(int[] array)
    {
        List<Integer> list = new ArrayList<>();
        for(int num : array)
        {
            if(num%2==0)list.add(num);
        }
        return list;
    }
    public List<Integer> common(List<Integer> a,List<Integer> b)
    {
        List<Integer> common = new ArrayList<>();
        common.addAll(a);
        for(int i : b)
        {
            boolean is_in_the_list = false;
            for(int j : common)
            {
                if(i==j)
                {
                    is_in_the_list = true;
                    break;
                }
            }
            if(!is_in_the_list)common.add(i);
        }
        return common;
    }
    public int[] array = new int[]{1,2,3,4,5};
    List<Integer> a =new ArrayList<>();
    {
        a.add(1);
        a.add(2);
    }
    List<Integer> b =new ArrayList<>();
    {
        b.add(2);
        b.add(3);
    }
    public int countOccurrencesOfC(List<String> strings,char c)
    {
        int num = 0;
        for(String i : strings)
        {
            for(int j = 0; j<i.length();j++)
            {
                if(i.charAt(j)==c){num++;}
            }
        }
        return num;
    }
    List<String> strings = new ArrayList<>();
    {
        strings.add("Chihaya Anon");
        strings.add("Nagasaki soyo");
    }
    public void main(String[] args)
    {
        System.out.println(sum(array));
        System.out.println(evens(array));
        System.out.println(common(a,b));
        System.out.println(countOccurrencesOfC(strings,'a'));
    }
}
