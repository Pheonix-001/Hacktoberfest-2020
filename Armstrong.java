class Armstrong{  
  public static void main(String[] args)  {  
    int c=0;
    int a,temp;  
    int n=153;//It is the number to check armstrong  
    temp=n;  
    while(n>0) {  
    a=n%10;  
    n=n/10;  
    c=c+(a*a*a);  
    }  
    if(temp==c)  
    System.out.println(temp + " is a armstrong number");   
    else  
        System.out.println(temp + " is not armstrong number");   
   }  
}
