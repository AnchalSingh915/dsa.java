import java.util.*;
class dem10
{
    int item[]=new int[5];
    int front;
    int rear;
          public void init()
          {
              front=-1;
              rear=-1;
          }
          public void insert(int num)
          {
            int max=5;
              if((front==0 && rear==max-1)||(rear+1==front))
              {
                  System.out.println("overflow");
              }
              else if(rear==max-1)
              {
                  rear=0;
                  item[rear]=num;
              }
              else if(rear==-1 && front==-1)
              {
                rear=front=0;
                 item[rear]=num;
              }
              else
              {
                 rear++;
                 item[rear]=num;
              }
          }
          public void delete()
          {
              int max=5;
              if((front==-1 && rear==-1)||(rear+1==front))
              {
                  System.out.println("Empty");
              }
              else if(front==max-1)
              {
                  System.out.println("deleted item"+item[front]);
                  front=0;
              }
              else if(front==rear)
              {
                System.out.println("deleted item"+item[front]);
                front=-1;
                rear=-1;
              }
              else
              {
                  System.out.println("deleted item"+item[front]);
                  front++;
              }
          }
          public static void main(String args[])
          {
              int p=0, t=0;
              char ch;
              Scanner sc=new Scanner(System.in);
              dem10 obj=new dem10();
              obj.init();
              do
              {
                  System.out.println("1. for insert");
                  System.out.println("2. for delete");
                  System.out.println("Enter the choice");
                  p=sc.nextInt();
                  if(p==1)
                  {
                      System.out.println("enter the number");
                      t=sc.nextInt();
                      obj.insert(t);
                  }
                  else
                  {
                    obj.delete();  
                  }
                  System.out.println("do you want to continue if yes the the choose'y/Y'  if no then choose'n/N'");
                  ch=sc.next().charAt(0);      
              }
              while(ch=='y' || ch=='Y');
          }
}
