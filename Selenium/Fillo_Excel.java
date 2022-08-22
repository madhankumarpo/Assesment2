package com.Selenium;

import java.sql.Connection;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Fillo_Excel{

	
	
		
		    public static void main(String[] args) throws FilloException {
		        Fillo fillo=new Fillo();
		        com.codoid.products.fillo.Connection connection=fillo.getConnection("C:/Study/Test.xlsx");
		      /* String strQuery="Select * from Sheet1 where Name='Avinash'";
		        Recordset recordset=connection.executeQuery(strQuery);*/
		        
		        String strQuery1="INSERT INTO sheet1(Name,Country) VALUES('Test1','UK')";
		        connection.executeUpdate(strQuery1);
		        String strQuery2="Update Sheet1 Set Country='US' where Name='Arun'";
		        connection.executeUpdate(strQuery2);
		         
		         
		       /* while(recordset.next()){
		        System.out.println(recordset.getField("Status"));
		        }     
		        recordset.close();*/
		        connection.close();
		    
        
       //String strQuery1="INSERT INTO sheet1(Name,Country) VALUES('Test1','UK')";connection.executeUpdate(strQuery1);

      //String strQuery="Update Sheet1 Set Country='US' where ID=100 and name='John'";
      //  connection.executeUpdate(strQuery1);

	}
}
