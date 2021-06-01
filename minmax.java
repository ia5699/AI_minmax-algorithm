import java.util.*;
class minmax
{
    public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the scores");
        n=sc.nextInt();
        int i;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            System.out.print("Score "+i+"= ");
            arr[i]=sc.nextInt();
        }
        System.out.println("---------------------");
        int w=1;
        for(i=1;i<n;i++)
        {
            w=w*2;
            if(w==n)
            {w=i;break;}
        }
        minmax obj=new minmax();
        if(w%2!=0)
            obj.max(arr,n);
        else if(w%2==0)
            obj.min(arr,n);
        }
     void min(int[]arr,int n)
    {
        int mini[]=new int[n];
        int p=0;
        for(int i=0;i<n;i+=2)
        {
            System.out.print(arr[i]+"/"+arr[i+1]+"=");
            if(arr[i]<arr[i+1])
            {
                mini[p]=arr[i];
                p++;
                System.out.println(arr[i]);
            }
            else{
                mini[p]=arr[i+1];
                p++;
                System.out.println(arr[i+1]);
            }
        }
        int n1=n/2;
        if(n1!=1)
            {
                System.out.println("---------------------");
                max(mini,n1);
            }
        else
        System.out.println("END");
    }
    void max(int[]arr,int n)
    {
        int maxi[]=new int[n];
        int p=0;
        for(int i=0;i<n;i+=2)
        {
            System.out.print(arr[i]+"/"+arr[i+1]+"=");
            if(arr[i]>arr[i+1])
            {
                maxi[p]=arr[i];
                p++;
                System.out.println(arr[i]);
            }
            else{
                maxi[p]=arr[i+1];
                p++;
                System.out.println(arr[i+1]);
            }
        }
        int n1=n/2;
        if(n1!=1)
        {
            System.out.println("---------------------");
            min(maxi,n1);
        }
        else
        System.out.println("END");
    }
}        
        
                
            
                
            
            
        