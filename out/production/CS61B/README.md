# Just a title
I am a student in ZJU major in ME but interested in CS.And this is my repository for CS61B.

Hopefully,I could be better at this.
# 一些笔记
考虑到中间继承有几堂课摸鱼了，导致有的知识点没有呈现在代码里，这里先写一点。

## implements & extends

### **1. 先理解「类（Class）」和「接口（Interface）」**
#### **类（Class）**  
- **是什么**：类的本质是 **“一种具体事物的模板”**。  
  - 比如：`Dog`（狗）、`Car`（汽车）、`Student`（学生）。  
- **特点**：  
  - 类可以 **直接创建对象**（例如：`Dog myDog = new Dog();`）。  
  - 类中可以包含 **属性（数据）** 和 **方法（行为）** 的具体实现。  

#### **接口（Interface）**  
- **是什么**：接口的本质是 **“一类行为的规范”**。  
  - 比如：`Runnable`（可跑的）、`Swimmable`（可游泳的）、`Serializable`（可序列化的）。  
- **特点**：  
  - 接口 **不能直接创建对象**（比如不能直接 `new Runnable()`）。  
  - 接口只定义 **方法的签名（方法名、参数、返回值）**，但不写具体实现。  
  - 接口更像一种“合同”：**谁实现了这个接口，就必须履行这个合同（实现所有方法）**。

---

### **2. 什么是「超类型（Hypernym）」和「子类型（Hyponym）」？**
这两个术语是语言学和计算机科学中的概念，用来描述 **“一般与特殊”** 的关系。  

#### **超类型（Hypernym）**  
- **广义上的类别**，代表更抽象、更通用的概念。  
  - 例如：  
    - 动物（Animal）是狗（Dog）的超类型。  
    - 交通工具（Vehicle）是汽车（Car）的超类型。  
    - 列表（List）是动态数组（ArrayList）的超类型。  

#### **子类型（Hyponym）**  
- **具体化的类别**，代表更具体、更特殊的概念。  
  - 例如：  
    - 狗（Dog）是动物（Animal）的子类型。  
    - 汽车（Car）是交通工具（Vehicle）的子类型。  
    - 动态数组（ArrayList）是列表（List）的子类型。  

   **简而言之，implements用于继承方法，extends用于继承类**

## super

当子类不得不访问父类的方法时，可以用super.function()来直接调用父类方法（此时便可以访问父类私有的一些成员变量），此处的super有点像this。

在调用父类方法前可以写一行super(x);增加代码可读性。x为下面调用方法中需要传入的参数。

如果不写，会自动调用默认的函数（多个重载函数中选无参数传入的）。
## @Override

在重写父类方法前标记，没有实际用处，相当于注释，但是可以检查下方的拼写错误。
## 编译的静态检查
简而言之，编译的时候会根据对象的静态类型进行检查，比如：(maxDog返回值为Dog类，Poodle为Dog子类，意为贵宾犬，下面的两个参数均为贵宾犬的种类)

Dog largerdog = maxDog(frank,franJr);

Poodle largerPoddle = maxDog(frank,franJr);

虽然我们知道frank和franJr都是属于Poodle的，但是在定义maxDog的时候编译器只知道他们是Dog类的，因此会报错。

这里可以通过添加(Poodle)进行强制的类型转换避免报错。

## 数据结构
