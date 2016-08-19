package com.training.yolo;

public class PrintMaximum {
    
    public PrintMaximum(){
        
    }
    
    public int findMaximum(int[] args) {
        
        int max=0;
        
        for (int i=0; i<args.length; i++){
            if (max<args[i]){
                max=args[i];
            }
        }
        return max;
        
        
    }
    
    final static public void main(String [] hello){}
    
    public transient int x;


}
