/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.filecopyrem;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rajiv
 */
public class Linker {
        public static boolean rslt=false;
        public static File file01,file02;
        public static MessageDigest md5;
        public static String Dchfile1;
               static int i =0;
        
      public static void CheckFile(String chfile1, String chfile2) throws NoSuchAlgorithmException   // this function will compare the file
    {
		 file01= new File(chfile1);
		 file02 = new File(chfile2);
		 md5  = MessageDigest.getInstance("MD5");
    		//int c1=0,c2=0;
                 
        try {
            Dchfile1 = calculateHash(md5, chfile1);
        } catch (Exception ex) {
            Logger.getLogger(Linker.class.getName()).log(Level.SEVERE, null, ex);
        }
		boolean check=false;
		String tmp1=file01.getAbsolutePath();
		String tmp2=file02.getAbsolutePath();
		//Object filst [] = new  Object[2];

	try {
		if(!Files.isSymbolicLink(file02.toPath()) && file01.length()==file02.length() && !(tmp1).equalsIgnoreCase(tmp2))
		{
		
                    if(Dchfile1.equals(calculateHash(md5, chfile2)))
                    {
                        check= true;
                    }
                    else
                    {
                        check =false;
                    }




		}

		//if(!check)
		//	System.out.println("Files are not same");
		//else
		if(check)

                        {	rslt=true;
					fcrui.jTextArea1.append(tmp2+"\n");

                                        if(fcrui.flag==1 || fcrui.flag==2) {
                                             file02.delete();
                                        }
					if(fcrui.flag==2) {
                                         crtsftlnk(tmp1,tmp2);
                                         }

				//filst[0]=filewchk;
				//filst[1]=filetochk;
			}



		//System.out.println(file2.getAbsolutePath());

		} catch (Exception e)
		{
			//System.err.println(e.getMessage());
		}

	}


    public static void display(String dsfile1,String dsdir1) // this displays the result on shell screen
           {
                Path dfile1 = Paths.get(dsfile1);
                Path ddir1 = Paths.get(dsdir1);
                
                

	try{	fcrui.jTextArea1.append("*****************************************************************************\n");
                if(fcrui.flag==0)
                    fcrui.jTextArea1.append("Copies of "+dfile1.getFileName().toString()+" found:-\n");
		if(fcrui.flag==1)
                    fcrui.jTextArea1.append("Copies of "+dfile1.getFileName().toString()+" found and deleted:-\n");
		if(fcrui.flag==2)
                    fcrui.jTextArea1.append("Copies of "+dfile1.getFileName().toString()+" found and linked:-\n");
		
                fcrui.jTextArea1.append("-----------------------------------------------------------------------------\n");
		Traversor(dfile1.toString(),ddir1.toString());

		if(!rslt) {
                fcrui.jTextArea1.append("None\n");
            }

		fcrui.jTextArea1.append("*****************************************************************************\n");


		} catch(Exception E){}

	}

    public static void crtsftlnk(String trgt,String lnk) // this methods creates the soft link
	{       
		Path newLink =  Paths.get(lnk);
		Path target =  Paths.get(trgt);
		//System.out.println(target);
		try {
			Files.createSymbolicLink(newLink, target);
		    } catch (IOException x) {
			System.err.println(x);
		    } catch (UnsupportedOperationException x) {
			//Some file systems do not support symbolic links.
			System.err.println(x);
		    }

	}

    public static void Traversor(String tfile1,String trdir)
	{
               Runtime.getRuntime().gc();
               System.gc();
               
                Path tdir = Paths.get(trdir);
		try{ DirectoryStream<Path> stream = Files.newDirectoryStream(tdir) ;
		    for (Path file: stream) {
                        System.out.println(i++);
                         Runtime.getRuntime().gc();
                         System.gc();
			if(Files.isDirectory(file))
			{	//System.out.println("\nDIR :: "+ file.toString()+"\n");
				Traversor(tfile1,file.toString());
			}
			else if(Files.isRegularFile(file)) {
                    CheckFile(tfile1,file.toString());
                }
			}

		    } catch(Exception e){}

	}
 public static String calculateHash(MessageDigest algorithm,String fileName) throws Exception{

        FileInputStream     fis = new FileInputStream(fileName);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DigestInputStream   dis = new DigestInputStream(bis, algorithm);

        // read the file and update the hash calculation
        while (dis.read() != -1);

        // get the hash value as byte array
        byte[] hash = algorithm.digest();

        return byteArray2Hex(hash);
    }

    private static String byteArray2Hex(byte[] hash) {
        Formatter formatter = new Formatter();
        for (byte b : hash) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }
    
}
