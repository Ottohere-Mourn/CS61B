package Homework.HW0B;
//创建一个名为Dessert的类（你需要创建一个新文件并将其添加到Git中），该类位于src/文件夹内。这个类应该具有以下特征：
//两个实例变量：int flavor 和 int price。
//一个构造函数，它接受两个参数int flavor和int price，并相应地设置实例变量。
//一个静态变量，用于跟踪到目前为止创建的甜品数量int numDesserts。
//一个方法public void printDessert()，该方法打印甜品的口味和价格，以及到目前为止创建的甜品总数，它们之间用空格分隔。
//例如，如果我们创建了一个口味为1、价格为2的甜品，然后调用它的printDessert()方法，它应该打印1 2 1。
//如果我们接着创建了一个口味为3、价格为4的甜品，然后调用它的printDessert()方法，它应该打印3 4 2。
//最后，一个public static void main(String[] args)方法，当执行时只打印一行I love dessert!。
//确保完全按照上述行为实现，否则你可能无法通过测试！
public class Dessert
{
    public int flavor;
    public int price;
    static public int numDesserts=0;
    public Dessert(int fla,int pri)
    {
        this.flavor = fla;
        this.price = pri;
        numDesserts++;
    }
    public void printDessert()
    {
        System.out.println(flavor+" "+price+" "+numDesserts);
    }
    public static void main(String[] args)
    {
        System.out.println("I love dessert!");
        Dessert cake = new Dessert(4,5);
        cake.printDessert();
        Dessert cookie = new Dessert(3,6);
        cake.printDessert();

    }
}
