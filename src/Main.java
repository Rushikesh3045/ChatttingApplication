
import java.net.*;
import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        Socket s=new Socket("localhost",8585);
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        String str1="";

        while(!str1.equals("bye"))
        {
            str1=br.readLine();
            dout.writeUTF(str1);
            str1=din.readUTF();
            System.out.println("Server says:"+str1);
        }
        s.close();
    }
}


