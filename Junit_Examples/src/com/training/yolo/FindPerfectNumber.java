package com.training.yolo;

public class FindPerfectNumber {
    
    public boolean checkPerfectNumber (int number){        
        
        int temp = 0;
        for(int i=1; i<=number/2; i++){
            if(number%i == 0){
                temp += i;
            }
        }
        if(temp == number){
            return true;
        } else {
            return false;
        }
                        
    }

}
