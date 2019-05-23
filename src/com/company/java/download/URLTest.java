package com.company.java.download;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by kriswong on 2019/5/8.
 */
public class URLTest {
    public static void main(String[] agrs){
        SingleThreadDownload();
    }

    public static void SingleThreadDownload(){
        try {
            URL url = new URL("https://www.zhihu.com/question/319923069/answer/663682250");
            URLConnection con = url.openConnection();
            con.connect();
            InputStream is = con.getInputStream();

            String file = url.getFile();

            FileOutputStream fo = new FileOutputStream("/Users/kriswong/Desktop/SingleTest.txt");
            byte[] buf = new byte[1024];
            int size = -1;
            while((size = is.read(buf)) != -1){
                fo.write(buf,0,size);
            }
            fo.close();
            is.close();
            con.connect();
        }catch (Exception e){

        }
    }

}
