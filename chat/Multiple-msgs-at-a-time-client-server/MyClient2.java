import java.net.*;  
import java.io.*;  
class MyClient2{  
public static void main(String args[])throws Exception{  
Socket s=new Socket("localhost",3333);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",str2="";  
while(!str.equals("stop")){ 
while(!str.equals("over")){
str=br.readLine();  
dout.writeUTF(str);  
}
dout.flush();  
while(!str2.equals("over")){
str2=din.readUTF();  
System.out.println("			 "+str2); 
} 
}  
  
dout.close();  
s.close();  
}}