import java.net.*;
import java.io.*;
class Client
{
    public static void main(String args[])throws IOException
    {
        ServerSocket ss;
        ss = new ServerSocket(8585);
        Socket s=ss.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        String str1="";

        while(!str1.equals("bye"))
        {
            str1=din.readUTF();
            System.out.println("Client Says:"+str1);
            str1=br.readLine();
            dout.writeUTF(str1);
        }
        ss.close();
        ss.close();
    }
}


