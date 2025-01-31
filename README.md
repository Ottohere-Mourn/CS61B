
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
### 并查集 Disjoint Sets
一种数据结构，最终导出的简化版本为树。通过多次查找可以实现路径压缩，进一步简化结构。
### 二叉搜索树 BST
对无序集合进行有序排列来简化查找操作。

特殊地，树的高度决定了最坏情况的运行情况。即当树高度为N时(spindly tree)，运行时间为θ(N)，其余情况(bushy tree)为θ(logN)。

TODO: 理解渐进分析、大O记法
### 分裂树 B-Tree
为了防止BST过于spindly，允许多个节点（有序的）合并为同一个节点，同时设定一个临界值。当节点内含有节点数目超过临界值后，取中间的节点上升到其父节点位置，大于和小于它的再分开排，最后其父节点将有三个子节点。上限临界值为3时分裂树又叫2-3 树。
### 红黑树 Red Black Trees
用标准的BST来实现B-tree，方法为通过创建一个red虚拟链接把B-tree中同集合的两个节点链接起来。虚拟链接不是真实的链接，只是用来表示连接的两个点本应该在一起。 

LLRB tree（左偏红黑树，红色虚拟链接总向左偏，这样的规定方便算法实现）表现为一个普通的BST，可以和一个2-3 tree一一对应（其实就是一种结构的两种表现形式，2-3 tree虽然直观，但是代码上实现难度或许比较大）。LLRB高度容易高于对应的2-3 tree，但不会超过其二倍.渐近分析表明这样的倍数关系对运行效率没有影响。      

- 插入时：使用红色链接。
- 如果有一个右倾的“3节点”，**左倾违规**。
  - 向左旋转相应的节点以修复。
- 如果有两个连续的左链接，**不正确的4节点违规**。
  - 向右旋转相应的节点以修复。
- 如果有任何节点有两个红色子节点，**临时4节点**。
  - 颜色翻转节点以模拟分裂操作。

最后一个细节：级联操作。

- 旋转或翻转操作可能会导致需要修复的额外违规。