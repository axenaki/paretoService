/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Arrays;

/**
 *
 * @author anu
 */
public class policy_imp {

    private double biodiv;
    private double co2;
    private double costfood;
    private double forestland;
    private String policy;
    private double[] data;
    private double score;
    private int dominated;
    private double distance;
    private int dominatedbycategory;
    private String order;

    public policy_imp() {
        this.biodiv = 0;
        this.co2 = 0;
        this.costfood = 0;
        this.forestland = 0;
        this.policy = "";
        this.data = new double[4];
        this.score = 0;
        this.dominated = 0;
        this.distance = 0;
        this.dominatedbycategory=0;
        this.order="";
    }

    public double getBiodiv() {
        return biodiv;
    }

    public void setBiodiv(double biodiv) {
        this.biodiv = biodiv;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public double getCostfood() {
        return costfood;
    }

    public void setCostfood(double costfood) {
        this.costfood = costfood;
    }

    public double getForestland() {
        return forestland;
    }

    public void setForestland(double forestland) {
        this.forestland = forestland;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double[] getData() {
        return data;
    }

    
    public void setData(double[] data) {
        this.data = data;
    }

    public int getDominated() {
        return dominated;
    }

    public void setDominated(int dominated) {
        this.dominated = dominated;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance() {
          
        //euclidean 
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += Math.pow(data[i], 2);
        }
        this.distance = Math.sqrt(sum);
    }
    
    public int getDominatedbycategory() {
        return dominatedbycategory;
    }

    public void setDominatedbycategory(int dominatedbycategory) {
        this.dominatedbycategory = dominatedbycategory;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(int objectives_number) {
       //in order to create the right order we need to substract from the total number of objectives
        int[] thisorder = new int[data.length];
        double[] sorted = data.clone();
        Arrays.sort(sorted);
        String myorder="";
        //TODO fix O() add equals in same order value
        for (int j = 0; j < data.length; j++) {
            for (int i = 0; i < data.length; i++) {
                
                if (data[j]==sorted[i]) {
                    thisorder[j] = objectives_number-i;
                }
            }
        }
        for(int u=0; u<thisorder.length;u++){
            myorder+=thisorder[u];
        }
        this.order = myorder;
    }
    
}
