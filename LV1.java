//简单加减法计算；
interface IComputer{
    int computer(int n,int m);
}
class Add implements IComputer{
    public int computer(int n, int m) {
        return n + m;
    }
}
class Sub implements IComputer{
    public int computer(int n, int m) {
        return n - m;
    }
}
class UseCompute{
    public static void useCom(IComputer com, int one,int two){
        int result = com.computer(one,two);
        System.out.println(result);
    }
}
public class LV1{
    public static void main(String[] agrs){
        UseCompute.useCom(new Add(),1,2);
        UseCompute.useCom(new Sub(),2,1);

    }
}