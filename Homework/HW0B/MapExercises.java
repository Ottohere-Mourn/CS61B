package Homework.HW0B;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;
//任务3：MapExercises
//MapExercises.java中有3个不同的方法需要你完成：

//letterToNum：这个方法返回一个从每个小写字母到其在字母表中对应顺序的数字的映射，其中'a'对应1，'z'对应26。
public class MapExercises {
    public int letterToNum(char letter)
    {
        TreeMap<Character,Integer> letterToNum = new TreeMap<>();
        for(char c = 'a'; c<='z'; c++)
        {
            letterToNum.put(c,c-'a'+1);
        }
        return letterToNum.get(letter);
    }
//squares：这个方法接收一个整数列表，并返回一个从列表中的整数到它们平方的映射。如果给定的列表为空，它应该返回一个空的映射。
public TreeMap<Integer,Integer> squares(List<Integer> list)
{
    TreeMap<Integer,Integer> squares = new TreeMap<>();
    for(int num : list)
    {
        squares.put(num,num*num);
    }
    return squares;
}

//countWords：这个方法接收一个字符串列表，并返回一个从列表中的单词到它们出现次数的映射。如果给定的列表为空，它应该返回一个空的映射。
    public TreeMap<String,Integer> countWords(List<String> strings)
    {
        TreeMap<String,Integer> countWords = new TreeMap<>();
        for(String string : strings)
        {
            String[] words = string.split("\\s+");
            for(String word : words)
            {
                word=word.toLowerCase();
                if(countWords.containsKey(word)){countWords.put(word,countWords.get(word)+1);}
                else {countWords.put(word,1);}
            }
        }
        return countWords;
    }
    List<String> strings =new ArrayList<>();
    {
        strings.add("Here the World");
        strings.add("Hello World");
        strings.add("The world");
    }
    public void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        for(int i = 1;i<=10;i++)list.add(i);
        System.out.println(letterToNum('d'));
        System.out.println(squares(list));
        System.out.println(countWords(strings));
    }
}
