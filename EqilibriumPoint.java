/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eqilibriumpoint;

/**
 *
 * @author xin
 */
public class EqilibriumPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={-7,1,5,2,-4,3,0};
        EqilibriumPoint f=new EqilibriumPoint();
        int r=f.findEqui(arr);
       if(r!=-1){
          System.out.println("the position is: "+r);
       }
    }
    int findEqui(int[] A){
       int sum=0;
       int lefsum=0;
       int l=A.length;
       for(int i=0;i<l;i++){
            sum+=A[i];        
       }
       for(int i=0;i<l;i++){
            sum=sum-A[i];
            
            if(sum==lefsum){
                return i;
             }
            lefsum+=A[i];
       }
       
       return -1;
    }
}
