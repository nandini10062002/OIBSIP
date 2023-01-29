import java.util.*;
public class atmInterface {
    public static void main(String[] args) {
        String userID="12345OASIS";
        int pinOfUser=5849;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter User ID : ");
        String id=sc.next();
        System.out.println("Enter Pin : ");
        int pin=sc.nextInt();
        System.out.println();
        if(userID.equals(id) && pinOfUser==pin){
            System.out.println("Welcome To OASIS Bank! ");
            System.out.println("Account Deatils : ");
            System.out.println("Name Of Account Holder : Nandini Shintre");
            System.out.println("Account Number :141006");
            System.out.println();
            char c;
            do{
                System.out.println("Enter the choice of the operation you want to perform.");
                System.out.println("""
                        1. Transaction History
                        2.Withdraw Money
                        3.Deposit Money
                        4.Transfer Money
                        5.Quit""");
                System.out.println("Please Enter Your CHOICE : ");
                Scanner sc1=new Scanner(System.in);
                int choice=sc1.nextInt();
                float bal=10000;
                float withdraw,deposit = 0,newBal=0;
            switch(choice){
                case 1 :
                    System.out.println("Transaction History");
                    System.out.println("Account Balance : "+bal);
                    break;
                case 2 :
                    if(bal==10000){
                        System.out.println("Enter the withdrawal amount : ");
                        withdraw=sc.nextFloat();
                        if(bal>withdraw){
                            bal-=withdraw;
                            System.out.println("Withdrawal Successful.\nYour new Balance : "+bal);
                        }else
                            System.out.println("Sorry You can't allow to withdraw your money.");
                    }else
                        System.out.println("Sorry You can't allow to withdraw your money.");
                    break;
                case 3 :
                    System.out.println("DEPOSIT");
                    System.out.println("Enter the amount to be deposited : ");
                    int dep=sc.nextInt();
                    deposit+=dep;
                    System.out.println("Deposit Successful.\nYour new Balance : "+bal);
                    break;
                case 4 :
                    System.out.println("Transfer");
                    System.out.println("Enter the AC.no as well as Name of account holder & their Bank Name :");
                    int acno=sc.nextInt();
                    String name =sc.next();
                    String bname=sc.next();
                    System.out.println("Enter amount to be transfered : ");
                    float amount=sc.nextFloat();
                    if(amount<=bal){
                        newBal=bal-amount;
                        System.out.println("Amount Transfered Successfully." +
                                "\nYour new Balance is : "+newBal);
                    }else System.out.println("Entered amount is greater than that of the Balance Amount");
                    break;
                case 5 :
                    System.out.println("Quit.");
                default :
                    System.out.println("Invalid Choice.Try Again with correct option.");
            }
            System.out.println("DO YOU WANT TO CONTINUE (Y/N)");
            c=sc.next().charAt(0);
        }while(c=='Y' || c=='y');
       }
        else System.out.println("Invalid Details.Make sure you entered correct details.");
    }
}