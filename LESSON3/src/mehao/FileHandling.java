package mehao;

import java.util.*; 
import java.nio.file.*; 
import java.io.*; 
import java.nio.charset.StandardCharsets; 




public class FileHandling {

	
	private static void createFileUsingFileClass(String filePath) throws IOException
    {
          File file = new File(filePath);
  
          //Create the file
          if (file.createNewFile()==true){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
    }
	 private static void createFileUsingFileOutputStreamClass(String filePath,String content) throws IOException
	 {
	        String data = content;
	        FileOutputStream out = new FileOutputStream(filePath);
	        out.write(data.getBytes());
	        out.close();
	        
	}
	 public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); //creates an empty list
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	     
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 
	 private static void FileAppend(String filePath,String content) throws IOException
	 {
	    	File f=new File(filePath);     
	        FileWriter fw=new FileWriter(f,true);  
	        fw.append(content);           
	        fw.close();
	 }
	
	public static void main(String[] args) throws IOException
    {
		//String filePath = "D://Files//filehandeltest.txt";
		 System.out.println("**WELCOME TO FILE HANDLING** :)");
		 Scanner sc= new Scanner(System.in);
	      String filePath;
	      String content;
	      int wf;
	      int cnt;
	      int rf;
	      int af;
	      System.out.println("Enter File Path Which You want to create..e.g D://Files//filehandeltest.txt");
	      filePath = sc.next();
		createFileUsingFileClass(filePath);
		 System.out.println("Write Something For Your File..:)");
		 content = sc.next();
		createFileUsingFileOutputStreamClass(filePath,content);
	     System.out.println("Successfully Written..To See the What is written..Press 3.**");
				 rf = sc.nextInt();
				 if(rf == 3) {
					 List l = readFileInList(filePath);
					Iterator<String> itr = l.iterator(); 
				    while (itr.hasNext()) 
				      System.out.println(itr.next());
				    
				 }
				 System.out.println("Write Something To Add in Your File..:)");
			     content = sc.next();
			     FileAppend(filePath,content);
			     System.out.println("Successfully Added..To See the What is written..Press 3.**");
				 rf = sc.nextInt();
				 if(rf == 3) {
					 List l = readFileInList(filePath);
					Iterator<String> itr = l.iterator(); 
				    while (itr.hasNext()) 
				      System.out.println(itr.next());
				    
				 }
			    	
			
		
		
    }
}
