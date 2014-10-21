/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methods;

/**
 *
 * @author anu
 */
public class maj {
    double value;
    int count;
//    double stboundry;
//    double endboundry;
    
    public maj(){
        value=0.0;
        count=0;
  //      stboundry=0.0;
  //      endboundry=0.0;
    }
    public void setvalue(double val){
        this.value=val;
    }
    public void setcounter(int c){
        this.count=c;
    }
  /*   public void setstboundry(double val){
        this.stboundry=val;
    }
      public void setendboundry(double val){
        this.endboundry=val;
    }
   */ public double getvalue(){
        return value;
    }
    public int getcount(){
        return count;
    }
    /* public double getstboundry(){
        return stboundry;
    }
     public double getendboundry(){
         return endboundry;
     }
    */
}
