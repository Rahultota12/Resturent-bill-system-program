import java.util.*;
interface customber{
    void Oreder(); 
    void MyBill();

}
class vater implements customber{
   static  int price1,price2, price3, price4, price5, price6;  
    static int pricea1,pricea2, pricea3, pricea4, pricea5, pricea6, pricea7, pricea8, pricea9, pricea10;  
    static int pricee1,pricee2, pricee3, pricee4, pricee5, pricee6, pricee7;  
    @Override
   public void Oreder(){
    
    int price,Number_of_item,number,Bill; 
    double GST;
    Scanner u=new Scanner(System.in);
    System.out.println("Enter your choice \n breakfast          1 \n lunch              2 \n dinner             3 ");
    int num=u.nextInt();
    if(num==1){
     System.out.printf("|-------------------------------------------------------------|").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|           WElcome  to  TOTA Rsturent                        |").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|--------|----------------------------------------------------|").println();
     System.out.printf("| S.N.   |         Breakfast       MENU                       |").println();
     System.out.printf("|        |         Dises                          price       |").println();
     System.out.printf("|--------|----------------------------------------------------|").println();
     System.out.printf("|   1    |      TEA                               10          |").println();
     System.out.printf("|   2    |      Samosa                            20          |").println();
     System.out.printf("|   3    |      Burgar                            40          |").println();
     System.out.printf("|   4    |      Poha                              15          |").println();
     System.out.printf("|   5    |      Gulb_jamun                        20          |").println();
     System.out.printf("|   6    |      pize                              50          |").println();
     System.out.printf("--------------------------------------------------------------|").println();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the dises number");
    number=sc.nextInt();
 if(number==1){
     System.out.println("Enter the number of tea");
      Number_of_item = sc.nextInt();
      price = 10;
       price1=Number_of_item*price;
   }
   else if(number==2){
     System.out.println("Enter the number of Samosa");
      Number_of_item = sc.nextInt();
      price = 20;
       price2=Number_of_item*price;
   }
   else if(number==3){
     System.out.println("Enter the number of Burgar");
      Number_of_item = sc.nextInt();
      price = 40;
       price3=Number_of_item*price;
   }
  else if(number==4){
     System.out.println("Enter the number of poha");
      Number_of_item = sc.nextInt();
      price = 15;
       price4=Number_of_item*price;
   }
  else if(number==5){
     System.out.println("Enter the number of gulb_jamun");
      Number_of_item = sc.nextInt();
      price = 20;
       price5=Number_of_item*price;
   }
  else if(number==6){
     System.out.println("Enter the number of Pize");
      Number_of_item = sc.nextInt();
      price = 50;
       price6=Number_of_item*price;
   }
}
   else if(num==2){
     System.out.printf("|-------------------------------------------------------------|").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|           WElcome  to  TOTA Rsturent                        |").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|--------|----------------------------------------------------|").println();
     System.out.printf("| S.N.   |             lunch MENU                             |").println();
     System.out.printf("|        |         Dises                          price       |").println();
     System.out.printf("|--------|----------------------------------------------------|").println();
     System.out.printf("|   1    |      TEA                               10          |").println();
     System.out.printf("|   2    |      Samosa                            20          |").println();
     System.out.printf("|   3    |      Burgar                            40          |").println();
     System.out.printf("|   4    |      Poha                              15          |").println();
     System.out.printf("|   5    |      Gulb_jamun                        20          |").println();
     System.out.printf("|   6    |      pize                              50          |").println();
     System.out.printf("|   7    |      cofe                              20          |").println();
     System.out.printf("|   8    |      Noodales                          30          |").println();
     System.out.printf("|   9    |      Chapati                           40          |").println();
     System.out.printf("|   10   |      Dal_bhat                          80          |").println();
     System.out.printf("--------------------------------------------------------------|").println();
    Scanner n=new Scanner(System.in);
    System.out.println("Enter the dises number");
    number=n.nextInt();
 if(number==1){
     System.out.println("Enter the number of tea");
      Number_of_item = n.nextInt();
      price = 10;
       pricea1=Number_of_item*price;
   }
   else if(number==2){
     System.out.println("Enter the number of Samosa");
      Number_of_item = n.nextInt();
      price = 20;
       pricea2=Number_of_item*price;
   }
   else if(number==3){
     System.out.println("Enter the number of Burgar");
      Number_of_item = n.nextInt();
      price = 40;
       pricea3=Number_of_item*price;
   }
  else if(number==4){
     System.out.println("Enter the number of poha");
      Number_of_item = n.nextInt();
      price = 15;
       pricea4=Number_of_item*price;
   }
  else if(number==5){
     System.out.println("Enter the number of gulb_jamun");
      Number_of_item = n.nextInt();
      price = 20;
       pricea5=Number_of_item*price;
   }
  else if(number==6){
     System.out.println("Enter the number of Pize");
      Number_of_item = n.nextInt();
      price = 50;
       pricea6=Number_of_item*price;
   }
   else if(number==7){
    System.out.println("Enter the number of cofe");
     Number_of_item = n.nextInt();
     price = 20;
      pricea7=Number_of_item*price;
  }
 else if(number==9){
    System.out.println("Enter the number of chapati");
     Number_of_item = n.nextInt();
     price = 40;
      pricea9=Number_of_item*price;
  }     
 else if(number==10){
    System.out.println("Enter the number of Dal_bat");
     Number_of_item = n.nextInt();
     price = 80;
      pricea10=Number_of_item*price;
 }
   }
   else if(num==3){
     System.out.printf("|-------------------------------------------------------------|").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|           WElcome  to  TOTA Rsturent                        |").println();
     System.out.printf("|                   dinner menu                               |").println();
     System.out.printf("|                                                             |").println();
     System.out.printf("|--------|----------------------------------------------------|").println();
     System.out.printf("| S.N.   |                    MENU                            |").println();
     System.out.printf("|        |         Dises                          price       |").println();
     System.out.printf("|--------|----------------------------------------------------|").println();
     System.out.printf("|   1    |      TEA                               10          |").println();
     System.out.printf("|   2    |      Samosa                            20          |").println();
     System.out.printf("|   3    |      Burgar                            40          |").println();
     System.out.printf("|   4    |      Poha                              15          |").println();
     System.out.printf("|   5    |      Gulb_jamun                        20          |").println();
     System.out.printf("|   6    |      pize                              50          |").println();
     System.out.printf("|   7    |      cofe                              20          |").println();
     System.out.printf("--------------------------------------------------------------|").println();
    Scanner m=new Scanner(System.in);
    System.out.println("Enter the dises number");
    number=m.nextInt();
 if(number==1){
     System.out.println("Enter the number of tea");
      Number_of_item = m.nextInt();
      price = 10;
       pricee1=Number_of_item*price;
   }
   else if(number==2){
     System.out.println("Enter the number of Samosa");
      Number_of_item = m.nextInt();
      price = 20;
       pricee2=Number_of_item*price;
   }
   else if(number==3){
     System.out.println("Enter the number of Burgar");
      Number_of_item = m.nextInt();
      price = 40;
       pricee3=Number_of_item*price;
   }
  else if(number==4){
     System.out.println("Enter the number of poha");
      Number_of_item = m.nextInt();
      price = 15;
       pricee4=Number_of_item*price;
   }
  else if(number==5){
     System.out.println("Enter the number of gulb_jamun");
      Number_of_item = m.nextInt();
      price = 20;
       pricee5=Number_of_item*price;
   }
  else if(number==6){
     System.out.println("Enter the number of Pize");
      Number_of_item = m.nextInt();
      price = 50;
       pricee6=Number_of_item*price;
   }
  else if(number==7){
     System.out.println("Enter the number of cofe");
      Number_of_item = m.nextInt();
      price = 20;
       pricee7=Number_of_item*price;
   }
  
   }else{
    System.out.println("no service");
   }
   }

  public  void getOrder(){
 
    this.plecOrder();
   
   
    }

    void plecOrder(){
       
        this.Oreder();
    }
    @Override
    public void MyBill() {
        
    }

    public void tebleA() {
    }

    public void gret() {
    }

    public void teble() {
    }

    public void maneu() {
    }
   
}

class shafe extends vater{
    
    @Override
    public void getOrder() {
       
        super.getOrder();
        System.out.println("complited Order");
    }
    @Override
    void plecOrder() {
       
        super.plecOrder();
        System.out.println("complited order place customber");
    }
    
}
 class chasher extends vater{
    void cheackOreder(){
        super.getOrder();
    }
    void collectAmount(){
        this.cheackOreder();
        this.printBill();
    }
    void printBill(){
        int Bill=price1+price2+price3+price4+price5+price6;
       int Bil=pricea1+pricea2+pricea3+pricea4+pricea5+pricea6+ pricea7+pricea8+pricea9+ pricea10;
       int Bell=pricee1+pricee2+pricee3+pricee4+pricee5+pricee6+pricee7;
      
       System.out.println("Bill pay press in button");
       System.out.println();
       System.out.println(" Breakfast       1\n lunch           2\n dinner          3");
       
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
                            //breakfast bill                   
          
         if(n==1)
     { 
        double s=Bill*0.05;
        double c=Bill+s;
        System.out.println(" with out GST  your bill  "+Bill);
        System.out.println(" GST "+s);
        System.out.println("your bill include GST "+c);
        System.out.println("||===============================================||");
        System.out.println("||          Make payment your choice             ||");
        System.out.println("||                                               ||");
        System.out.println("||===============================================||");
        System.out.println("||   1                 Cash                      ||");
        System.out.println("||   2                 Creadit/debit card        ||");
        System.out.println("||   3                 UPI                       ||");
        System.out.println("||===============================================||");
        int nu=sc.nextInt();
        if(nu==1){
            System.out.println("Enter your Amount : ");
          int v=sc.nextInt();
          if(c<=v)
          {
            Double b=(double) (v-c);
            System.out.println("collact your Amount : "+b);
          }
          else{
            System.out.println("your Amount Bill se kam hai");
          }
       }
          else if(nu==2)
          {
            Scanner y=new Scanner(System.in);
            System.out.println("Swaep your card");
            System.out.println("Swaip successfull");
            System.out.println("Enter your Amount");
            int o=y.nextInt();
            if(c<=o){
            System.out.println("Enter card pin");
            int b=y.nextInt();
            if(b==1234){
              Double f=(double)(o-c);
              System.out.println("collact your Amount");
            System.out.println("Succesfull payment");
            }
            else{
              System.out.println("Invalid Pin ");
            }

          }
        else{
          System.out.println("Your Amount Bill se kam hai");
        }
          }
           if(nu==3)
          {
            Scanner a=new Scanner(System.in);
              System.out.println("Enter your upi id");
              Long r=a.nextLong();
              System.out.println("Enter your Amount ");
            double v=a.nextDouble();
            if(c<=v){
              System.out.println("enter upi pin");
              int e=a.nextInt();
              if(e==1234){
                Double  p=(Double)(v-c);
                System.out.println("collact your Amount"+p);
                       System.out.println("payment Successfull");
              }else{
                System.out.println("Invalid Pin ");
              }

          }
          else{
            System.out.println("Your Amount Bill se kam hai");
          }
        }
        }
//                   Lunch Bill
            
        if(n==2)
        { 
           double s=Bil*0.05;
           double c=Bil+s;
           System.out.println(" with out GST  your bill  "+Bil);
           System.out.println(" GST "+s);
           System.out.println("your bill include GST "+c);
           System.out.println("||===============================================||");
           System.out.println("||          Make payment your choice             ||");
           System.out.println("||                                               ||");
           System.out.println("||===============================================||");
           System.out.println("||   1                 Cash                      ||");
           System.out.println("||   2                 Creadit/debit card        ||");
           System.out.println("||   3                 UPI                       ||");
           System.out.println("||===============================================||");
           int nu=sc.nextInt();
           if(nu==1){
               System.out.println("Enter your Amount : ");
             int v=sc.nextInt();
             if(c<=v)
             {
               Double b=(double) (v-c);
               System.out.println("collact your Amount : "+b);
             }
             else{
              System.out.println("your Amount Bill se kam hai");
             }
          }
             else if(nu==2)
             {
               Scanner y=new Scanner(System.in);
               System.out.println("Swaep your card");
               System.out.println("Swaip successfull");
               System.out.println("Enter your Amount ");
               int w=y.nextInt();
               if(c<=w){
               System.out.println("Enter card pin");
               int b=y.nextInt();
               if(b==1234){
                Double z=(Double)(w-c);
                System.out.println("Collect your Amount "+z);
               System.out.println("Succesfull payment");
               }else{
                System.out.println("your cord pin Invaild ");
               }
             }
             else{
              System.out.println("your Amount Bill se kam hai");
             }
            }
              if(nu==3)
             {
               Scanner a=new Scanner(System.in);
                 System.out.println("Enter your upi id");
                 Long r=a.nextLong();
                 System.out.println("Enter your Amount ");
               double v=a.nextDouble();
               if(c<=v){
                 System.out.println("enter upi pin");
                 int e=a.nextInt();
                 if(e==1234){
                  Double d=(Double)(v-c);
                  System.out.println("collact your Amount"+d);
                          System.out.println("payment Successfull");
                 }else{
                  System.out.println("invalid your Pin ");
                 }
   
             }
             else{
              System.out.println("your Amount is Bill se kam hai");
             }
           }
          }
//                                     Dinner payment

           if(n==3)
           { 
              double s=Bell*0.05;
              double c=Bell+s;
              System.out.println(" with out GST  your bill  "+Bell);
              System.out.println(" GST "+s);
              System.out.println("your bill include GST "+c);
              System.out.println("||===============================================||");
              System.out.println("||          Make payment your choice             ||");
              System.out.println("||                                               ||");
              System.out.println("||===============================================||");
              System.out.println("||   1                 Cash                      ||");
              System.out.println("||   2                 Creadit/debit card        ||");
              System.out.println("||   3                 UPI                       ||");
              System.out.println("||===============================================||");
              int nu=sc.nextInt();
              if(nu==1){
                  System.out.println("Enter your Amount : ");
                int v=sc.nextInt();
                if(c<=v)
                {
                  Double b=(double) (v-c);
                  System.out.println("collact your Amount : "+b);
                }
                else{
                  System.out.println("your Amount Bill se kam hai");
                }
             }
                else if(nu==2)
                {
                  Scanner y=new Scanner(System.in);
                  System.out.println("Swaep your card");
                  System.out.println("Swaip successfull");
                  System.out.println("Enter your Amount");
                  int a=y.nextInt();
                  if(c<=a){
                  System.out.println("Enter card pin");
                  int b=y.nextInt();
                  if(b==1234){
                    Double l=(double)(a-c);
                    System.out.println("collact your Amount : "+l);
                  System.out.println("Succesfull payment");
                  }
                  else{
                    System.out.println("Invalid card  pin");
                  }
                }
                else{
                  System.out.println("your Amount Bill se kam hai");
                }
                }
                 
                 if(nu==3)
                {
                  Scanner a=new Scanner(System.in);
                    System.out.println("Enter your upi id");
                    Long r=a.nextLong();
                    System.out.println("Enter your Amount ");
                  double v=a.nextDouble();
                  if(c<=v){
                    System.out.println("enter upi pin");
                    int e=a.nextInt();
                    if(e==1234){
                      Double l=(double)(v-c);
                      System.out.println("collact your Amount "+l);
                             System.out.println("payment Successfull");
                    }
                    else{
                      System.out.println("Invalid UPI pin");
                    }
                  }
                  else{
                    System.out.println("your Amount Bill se kam hai");
                  }
                }
              }
        }
    }
 class Manager extends chasher{
    void collectAmount() {
       
        super.collectAmount();

    }   
 }
public class Resturent extends Manager {
    public static void main(String[] args) {
        Resturent d=new Resturent(); 
        d.collectAmount(); 
    }
}