import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileHandlingDemo {
	public static void main(String[] args) throws IOException {
		// path set and create folder name
		File folder = new File("C:\\Users\\Dhileepan\\Desktop\\av");
		// if already folder exists same name true value return
//		boolean present = folder.exists();
//		System.out.println(present);
//		// if same name folder not present 
//		if(present==false)
//			
//		{
//			// to create folder
//			folder.mkdir();
//		}
//		System.out.println(folder.exists());
//		
//		// to create subfolder on same main folder
//		File subFolder=new File("C:\\Users\\Dhileepan\\Desktop\\av\\youtube\\24.11.22");
//		// to create subfolder
//		subFolder.mkdirs();
//		
		// to create text filename
		File file = new File("C:\\Users\\Dhileepan\\Desktop\\av\\youtube\\24.11.22\\test.txt");
		// to create file
		file.createNewFile();
		// to create doc file
//		File file1=new File("C:\\Users\\Dhileepan\\Desktop\\av\\youtube\\24.11.22\\test.doc");
//		// to create file
//		file1.createNewFile();
//		
//		File dfile=new File("C:\\Users\\Dhileepan\\Desktop\\av\\youtube\\24.11.22\\test.doc");
//		//to delete file
//		dfile.delete();
//		boolean presentf=dfile.exists();
//		System.out.println(presentf);
//		
//		//to rename file
//		File newName=new File("C:\\Users\\Dhileepan\\Desktop\\av\\youtube\\24.11.22\\dhileepan.txt");
//		file.renameTo(newName);
//		boolean presentNewName=newName.exists();
//		System.out.println(presentNewName);
//		
//		// printing File name
//		System.out.println("File name :"+newName.getName());
//		System.out.println(newName.canExecute());
//		System.out.println(newName.canRead());
//		System.out.println(newName.canWrite());
//		System.out.println(newName.length());
//		
//		//to print list of files on the directory
//		File listOfFilesFolders=new File("C:\\Users\\Dhileepan\\Desktop");
//		String[] list=listOfFilesFolders.list();
//		for(String lists:list)
//		{
//			System.out.println(lists);
//		}

		// print file only

//		File[] listOfFileOrFolder=listOfFilesFolders.listFiles();
//		for(File f:listOfFileOrFolder)
//		{
//			if(f.isFile()) //for file only
//			//if(f.isDirectory()) // for folder only	
//			System.out.println(f);
//		}

		// printing txt file only

		/*
		 * for(File txtfile:listOfFileOrFolder) { if(txtfile.isFile()) { String
		 * fileName=txtfile.getName(); // System.out.println(fileName); int
		 * lastDot=fileName.lastIndexOf("."); String
		 * extension=fileName.substring(lastDot+1); //System.out.println(extension);
		 * //to check all extension if(extension.equals("txt")) //to print what you need
		 * { if(txtfile.length()<200) //to print what size you need
		 * System.out.println(fileName+" Size "+txtfile.length()); //size of file }
		 * //System.out.println(txtfile); }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		// File Writer
//		try {
//		FileWriter writer=new FileWriter(file);
//		writer.write(65);
//		writer.write(" hi iam dhileepan");
//		writer.flush();
//		writer.close();
//		
//		//File reader
//		FileReader reader=new FileReader(file);
//		int output=reader.read();
//		
//		while(output!=-1)
//		{
//			System.out.print((char)output);
//			output=reader.read();
//		}}
//		catch (IOException ie)
//		{
//			ie.printStackTrace();
//		}

		// using buffered Reader
		FileWriter fwriter;
		fwriter = new FileWriter(file);
		BufferedWriter bwriter = new BufferedWriter(fwriter);

		bwriter.write("Tamil.");
		bwriter.newLine();
		bwriter.write("English sdgfsdg sgsrgs .fdgfd");
		bwriter.newLine();
		bwriter.write("Maths.Science");
		bwriter.flush();
		bwriter.close();

		FileReader freader = new FileReader(file);
		BufferedReader breader = new BufferedReader(freader);
		String line = breader.readLine();
		int lineCount = 0;
		int sentenceCount = 0;
		int charCount = 0;
		int wordCount = 0;
		System.out.println();
		while (line != null) {
			lineCount++;
			String[] sentence = line.split("[.]");
			sentenceCount = sentenceCount + sentence.length;
			String[] chars = line.split("");
			charCount = charCount + chars.length;
			String[] words = line.split(" ");
			wordCount = wordCount + words.length;
			System.out.println(line);
			line = breader.readLine();

		}
		System.out.println("Line Count :" + lineCount);
		System.out.println("Sentence count :" + sentenceCount);
		System.out.println("Char Count :" + charCount);
		System.out.println("word Count :" + wordCount);

		// copy paste image file
		InputStream input = new FileInputStream("C:\\Users\\Dhileepan\\Desktop\\bg2.jpg");
		OutputStream output = new FileOutputStream("C:\\Users\\Dhileepan\\Desktop\\llll.jpg");
		int content = input.read();
		while (content != -1) {
			output.write(content);
			content = input.read();
		}
		output.flush();
	}

}
