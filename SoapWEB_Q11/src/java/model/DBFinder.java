/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import BusinessCL.DataBaseServiceImpl;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class DBFinder {
    
    DataBaseServiceImpl dbService=new DataBaseServiceImpl();
    @WebMethod
    public int calculateDataofBirth(int year,int month,int day){

        return dbService.calculateDataofBirth(year, month, day);

    }
    
    
}
