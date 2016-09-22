import java.io.*;

class FileSearchJAVA{

public static void walkThrough(File ofl){
	
	String pattern = ".java";
	
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
