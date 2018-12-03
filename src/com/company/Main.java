package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        ServerSocket serverSocket=null;
        InputStream inputStream=null;
        OutputStream outputStream=null;
        HashItemList hashItemList=new HashItemList();
        byte[] bytebuffer=new byte[4];
        byte[] stringBuffer;
        int numberOfLetters;

        HashSet<HashItemList> hashset=new HashSet<>();
        HashItemList temp=new HashItemList();
        
     /*   userMap.put("alex",hashItemList);
        hashItemList.addItem("lock");
        System.out.println("");
        hashItemList.removeItem("pin");
        System.out.println("");
        hashItemList.removeItem("lock");
        hashItemList.removeItem("lock");
       / userMap.replace("alex",hashItemList,hashItemList.addItem());
*/      int actuallyread;
        int option;

        try {
            serverSocket=new ServerSocket(3000);
            Socket socket= serverSocket.accept();
            inputStream=socket.getInputStream();
            outputStream=socket.getOutputStream();

            actuallyread=inputStream.read(bytebuffer);
            if (actuallyread!=4){
                System.out.println("invalid input from user");
                return;
            }
            option=ByteBuffer.wrap(bytebuffer).getInt();
            switch (option){
                case 1:{
                    //getting number of user name letters
                    numberOfLetters=inputStream.read(bytebuffer);
                    //getting the user name
                    stringBuffer=new byte[numberOfLetters];
                    actuallyread=inputStream.read(stringBuffer);
                    if (actuallyread!=numberOfLetters){
                        return;
                    }
                    //getting hashcode
                    actuallyread=inputStream.read(bytebuffer);
                    if (actuallyread!=4){
                        return;
                    }


                    //check the user pool to see if the user exist
                    if (userMap.containsKey(new String(stringBuffer).toCharArray())==true){
                            if (userMap.containsValue()
                    }



                    break;
                }
                case 2:{
                    break;
                }
                default:{
                    System.out.println("what the fuck happened the user is a hacker o_o");
                }

            }
        }catch (IOException e){

        }

    }
}
