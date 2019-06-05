/* Exercsie 7-11
 * This program will create a bank account object
 * */

import java.io.*;
import java.util.Scanner;

public class ex711
{
  public static void main(String[] args) throws IOException
  {
    bankacct711 b = new bankacct711();
    String aNumber;
    double balance, amount;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter an account number: ");
    aNumber = br.readLine();
    b.setAcctNum(aNumber);
    System.out.println("Enter beginning balance: ");
    balance = sc.nextDouble();
    b.setBal(balance); // Changes value of b's private data field
    System.out.println("Enter amount of transaction: ");
    amount = sc.nextDouble();
    b.trans(amount); // Updates value of b's private data field
    System.out.println("n/Account Number is " + b.getAcctNum());
    System.out.printf("Current Balance is " + b.getBal());
    // Look up and print value of b's private data field
  }
}
    