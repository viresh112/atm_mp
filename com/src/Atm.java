//package user

package com.src.user;
import java.io.*;
import com.src.exceptions.*;
import com.src.blog.*;

public class Atm {
      public static void main(String args[]) {
            Bank account = null;
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String option = "";
    
                while (true) {
                    System.out.println("Enter Bank Name ");
                    option = "com.src.blog." + br.readLine();
                    account = (Bank) Class.forName(option).getDeclaredConstructor().newInstance();
                    System.out.println("Enter Bank Name ");
    
                    do {
                        try {
                            System.out.println("Choose one option");
                            System.out.println("1 Deposite ");
                            System.out.println("2 Withdraw ");
                            System.out.println("3 Balance Enquairy ");
    
                            System.out.println("Enter option ");
                            option = br.readLine();
                            int a = Integer.parseInt(option);
    
                            switch (a) {
                                case 1: {
                                    System.out.println("Enter deposite amount : ");
                                    String s = br.readLine();
                                    double amt = Double.parseDouble(s);
    
                                    account.deposite(amt);
                                    account.balanceEnquiry();
                                    break;
                                }
                                case 2: {
                                    System.out.println("Enter Withdraw amount : ");
                                    String s = br.readLine();
                                    double amt = Double.parseDouble(s);
                                    double WithDrawAmt = account.withdraw(amt);
                                    System.out.println("Withdrawn amount : " + WithDrawAmt);
                                    account.balanceEnquiry();
                                    break;
                                }
                                case 3: {
                                    account.balanceEnquiry();
                                    break;
                                }
                                default:
                                    System.out.println("Invalid Option");
                            }
    
                        } catch (InvalidAmountException ie) {
                            System.out.println(ie.getMessage());
                        } catch (InSufficientFundsException e) {
                            System.out.println(e.getMessage());
                        } catch (NumberFormatException e) {
                            System.out.println("Please enter ONLY number ");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
    
                        System.out.println("\n Do you Want to continue (Yes/No)");
                        option = br.readLine();
                    } while (option.equalsIgnoreCase("Yes"));
    
                }
            } catch (FileNotFoundException e) {
    
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    
        }
    }