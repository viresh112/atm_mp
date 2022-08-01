//package blog
//file 1

package com.src.blog;
import com.src.exceptions.*;
public interface Bank {
      public void deposite(double amt) throws InvalidAmountException;

      public double withdraw(double amt) throws InvalidAmountException,InSufficientFundsException;
      
      public void balanceEnquiry();
}
