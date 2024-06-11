interface moperation{
    int operate(int a,int b);
}
public class lambda_ex {
    public static void main(String[] args) {
        moperation add=(a,b)->a+b;
        moperation sub=(a,b)->a-b;
        int res1 =add.operate(2, 5);
    int res2=sub.operate(9,6);
    System.out.println("Add result:"+res1);
    System.out.println("Add result:"+res2);
    }
}