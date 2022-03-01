public class Fun {
    public static int fun(int x){
        int f;
        if (x==0){
            return (1);
        }else{
            f=x*fun(x-1);
            return f;
        }

    }
    public static void main(String[] args) {
        System.out.println(fun(4));
    }
}
