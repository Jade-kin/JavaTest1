package com.hand;

public class IncomeTax {

    private static IncomeTax incomeTax = new IncomeTax();

    //私有构造方法
    private IncomeTax(){}

    public static IncomeTax getIncomeTax(){
        return incomeTax;
    }

    //计算个人所得税
    public double calculation(int salary){
        if((salary-3500) <= 1500){
            //含税级距不超过1500
            return (salary-3500)  * 0.03;
        }else if((salary-3500) > 1500 && (salary-3500) <= 4500){
            //含税级距1500-4500
            return (salary-3500)  * 0.1;
        }else if((salary-3500) > 4500 && (salary-3500) <= 9000){
            //含税级距4500-9000
            return (salary-3500)  * 0.2;
        }else if((salary-3500) > 9000 && (salary-3500) <= 35000){
            //含税级距9000-35000
            return (salary-3500)  * 0.25;
        }else if((salary-3500) > 35000 && (salary-3500) <= 55000){
            //含税级距35000-55000
            return (salary-3500)  * 0.3;
        }else if((salary-3500) > 55000 && (salary-3500) <= 80000){
            //含税级距55000-80000
            return (salary-3500)  * 0.35;
        }else if((salary-3500) > 80000){
            //含税级距超过80000
            return (salary-3500)  * 0.45;
        }else {
            return 0;
        }
    }
}
