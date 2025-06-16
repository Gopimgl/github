import  java.util.*;
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
        
}
}