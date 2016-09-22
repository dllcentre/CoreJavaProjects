/* Searching a file in the local disks */

import java.io.*;
import java.util.*;

class LocalSearchEngineMain{
public static void main(String[] args){
	System.out.println("Enter the pattern number you want to search in the local disks ");
	System.out.println();

		System.out.println("0 for .jpg");
		System.out.println("1 for .mp3");
		System.out.println("2 for .java");
		System.out.println("3 for .pdf");
		
	System.out.println();

File[] odisks;

	try
	{
	odisks = File.listRoots();
	
	Scanner oscan = new Scanner(System.in);
	int j = oscan.nextInt();
	
			switch(j){
				case 0:
					for(int i=0; i<(odisks.length-1);i++)
					{
						File of = new File(odisks[i].toString());
						FileSearchJPG.walkThrough(of);		
					}break;
					
				case 1:
					for(int i=0; i<(odisks.length-1);i++)
					{
						File of = new File(odisks[i].toString());
						FileSearchMP3.walkThrough(of);		
					}break;
					
				case 2:
					for(int i=0; i<(odisks.length);i++)
					{
						File of = new File(odisks[i].toString());
						FileSearchJAVA.walkThrough(of);		
					}break;
					
				case 3:
					for(int i=0; i<(odisks.length-1);i++)
					{
						File of = new File(odisks[i].toString());
						FileSearchPDF.walkThrough(of);		
					}break;
		
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
}
}








import java.io.*;

class FileSearchJPG{

public static void walkThrough(File ofl){
	
	String pattern = ".jpg";
	
	 File[] listFile= ofl.listFiles();
	 if(listFile!=null){
		 for(int i=0;i<listFile.length;i++){
			 if(listFile[i].isDirectory()){
				 walkThrough(listFile[i]);
			 }else{
				 if(listFile[i].getName().endsWith(pattern)){
					 System.out.println(listFile[i].getPath());
				 }
			 }
		 }
	 }
	}
}






