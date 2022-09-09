/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessCL;

public class DataBaseServiceImpl {
    
      public int calculateDataofBirth(int year,int month,int day){
       
          int yearB=year;
          int monthB=month;
          int dayB=day;
          int Ydaycount;
          boolean isleap=isLeapYearCount(year);
         
         if(isleap==true){
            Ydaycount=dayLeapCount(month, day);
         }else{
            Ydaycount=CheckBday(month, day);
         }
          return Ydaycount;
    
      }
      
     private int CheckBday(int month,int day) {
         
         switch(month){
             case 1:
                     day = day;
                     return day;
                     
             case 2:
                 day = day + 31;
                 return 31+day;
                 
             case 3:
                 day = day + 31 + 28;
                 return day;
                 
             case 4:
                 day = day + 31 + 28 + 31; 
                 return day;
                 
             case 5: 
                 day = day + 31 + 28 + 31 + 30;
                 return day;
                 
             case 6:
                 day = day + 31 + 28 + 31 + 30 + 31;
                 return day;
             
             case 7:
                 day = day + 31 + 28 + 31 + 30 + 31 + 30;
                 return day;
             
             case 8:
                 day = day + 31 + 28 + 31 + 30 + 31 + 30 + 31;
                 return day;
                 
             case 9:
                 day = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                   return day;
                   
             case 10:
                 day = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                 return day;
                 
             case 11:
                 day = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                 return day;
                 
             case 12:
                 day = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                 return day;
                 
         }
         return 0;
       }   
     
    private int dayLeapCount(int month,int day) {
         
         switch(month){
             case 1:
                day = day; 
                return day;
                     
             case 2:
                 day = day + 31;
                 return day;
                 
             case 3:
                 day = day+31+29; 
                 return day;
                 
             case 4:
                 day = day+31+29+31; 
                 return day;
                 
             case 5: 
                 day = day+31+29+31+30; 
                 return day;
                 
             case 6:
                 day = day+31+29+31+30+31; 
                 return day;
                 
             case 7:
                 day = day+31+29+31+30+31+30; 
                 return day;
                 
             case 8:
                 day = day+31+29+31+30+31+30+31; 
                 return day;
                 
             case 9:
                 day = day+31+29+31+30+31+30+31+31; 
                 return day;
                   
             case 10:
                 day = day+31+29+31+30+31+30+31+31+30;
                 return day;
                 
             case 11:
                 day = day+31+29+31+30+31+30+31+31+30+31;
                 return day;
                 
             case 12:
                 day = 31+29+31+30+31+30+31+31+30+31+30;
                 return day;
                 
         }
         
       return 0;
       } 
    
      private boolean isLeapYearCount(int year) {
        if((year%4==0 && year%100!=0) || year%400==0) {
            return true;
        }else {
            return false;
        }
    }
}
