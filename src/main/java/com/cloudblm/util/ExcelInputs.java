package com.cloudblm.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ExcelInputs {
	
	public static int i;
	public static int a=1;
	
	

	public static ArrayList<Object[]> getdatafrmexcel() {
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		Xls_Reader reader = new Xls_Reader("./asset/testdata/testcase.xlsx");
		
		for(int i = 2;i<=reader.getRowCount("sheet1");i++) {
			Object temp[] = new Object[reader.getColumnCount("sheet1")];
			for(int j = 0;j< reader.getColumnCount("sheet1");j++) {
				
				temp[j] = reader.getCellData("sheet1", j, i);		
				
			}			
			mydata.add(temp);
		}
		
		return mydata;
	}
	
	public static ArrayList<Object[]> getTestDatabasedonID(int id,List<Object[]> testdata) {
		String temp = "";
		
		for(int i = 0;i<testdata.size();i++) {
			int sheetid = Math.round(Float.parseFloat(testdata.get(i)[0].toString()));				
			if(sheetid == id) {				
				temp = testdata.get(i)[2].toString();
				break;
			}			
		}
		
		String parsed[] = temp.split("\n");
		ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		
		for(int i =0;i<parsed.length;i++) {			
			String data = parsed[i].split("-")[0].trim();
			String msg  = parsed[i].split("-")[1].trim();
			mydata.add(new Object[] {data,msg});
		}
		
		return mydata;
		
	}
	
	public static void main(String[] args) {
		List<Object[]> testdata = ExcelInputs.getdatafrmexcel();
		ExcelInputs.getTestDatabasedonID(5, testdata).forEach(r->{
			System.out.println(r[0]+","+r[1]);
		});
	}

}
