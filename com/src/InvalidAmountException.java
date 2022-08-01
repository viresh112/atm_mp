//file 2 
package com.src.exceptions;

public class InvalidAmountException extends Exception {
      public InvalidAmountException(){
            super();
           }
           public InvalidAmountException(String s){
            super(s);
           }
}
