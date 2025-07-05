/*import  java.util.*;
public class gopi{
   int[] g(int a[]){

   for(int i=a.length-1;i>=0;i--){
if(a[i]==9){
    a[i]=0;
}
else if(a[i]<9){
a[i]=a[i]+1;
return a;
}
   }
   int []f=new int[a.length+1];
   f[0]=1;
   return f;
   }   
    public static void main(String[] args){ 
        gopi gp=new gopi();
        int x[]=gp.g(new int[]{1,2,3,9});
        System.out.println(Arrays.toString(x));
*/
/*public class gopi{
    public static void main(String[] args){
     String a="zbcd";
        char b=a.charAt(0);
        int c=(int)b;
System.out.println(c);*/
import java.util.*;
public class gopi{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a={1,2,3,4,5};
       int [] b={11,12,13,14};
       System.out.println(a);
       System.out.println(b);
       a=b;
       a[2]=20;
       System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(b));
       System.out.println("enter the array numbers");
        a=new int[4];
        System.out.println(a);
        System.out.println(Arrays.toString(a));
    }
}