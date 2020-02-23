package com.bill.springbootquick.exception;

public class UserNotFindException extends RuntimeException{
   public UserNotFindException(){
       super("User相關Exception");
   }
}
