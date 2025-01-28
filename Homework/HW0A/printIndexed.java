package Homework.HW0A;

public class printIndexed {
     String[] s = {"ab","bc","cd"};
//    String[] s;
//    s = new String[]{"dd","cc","aa"};
//    先声明再添加不管用，不知道为什么！
    public void printIndexed(String[] x)
    {
        String output = "";
        for(int i = 0; i< x.length;i++)
        {
            output +=  s[i];
            output += (x.length-1-i);
        }
        System.out.println(output);
    }
    public  void main(String[] args)
    {
        printIndexed(s);
    }
}
