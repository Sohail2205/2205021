package mes.casetools.BCA2205030;

public class Fibonacci {
    int first=0;
    int second =1;
    int next,i;
    int limit=10;
    void display()
    {
    for(i=0;i<limit;i++)
    {  System.out.print(" "+first+" "); 
    next=first+second;
        first=second;
        second=next;
        
    }
    
    }
    public static void main(String[] args) {
        Fibonacci obj= new Fibonacci();
        obj.display();
    }
}