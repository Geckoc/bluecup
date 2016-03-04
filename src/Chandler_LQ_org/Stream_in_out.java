package Chandler_LQ_org;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Stream_in_out {

	public static void main(String[] args) throws IOException {
		File file=new File("G:\\test","out.txt");
		File file2=new File("G:\\test", "in.txt");
try {
	if(!file.exists()){
		file.createNewFile();
	}
	if(!file2.exists()){
		file2.createNewFile();
	}
	FileWriter in=new FileWriter(file);
	BufferedWriter bwin=new BufferedWriter(in);
	FileReader out=new FileReader(file2);
	BufferedReader bfout=new BufferedReader(out);
	String string=null;
	int a=0;
	while((string=bfout.readLine())!=null){
		a++;
		bwin.write(a+""+string);
		bwin.newLine();
	}
		bwin.flush();
		bwin.close();
		in.close();
		out.close();
		bfout.close();
} catch (FileNotFoundException e) {
    e.printStackTrace();
}
}
}
