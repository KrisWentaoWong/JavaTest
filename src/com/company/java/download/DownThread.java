package com.company.java.download;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 多线程下载Internet资源
 * DownThread类是一个下载线程，该线程在启动时需要指定下载文件的URL、下载起始点和瞎子啊结束点等参数
 * Created by kriswong on 2019/5/8.
 */
public class DownThread implements Runnable {
    String url = "";
    File file;
    long startPosition;
    long endPosition;

    public DownThread(String url,File file,long startPosition,long endPosition){
        this.url = url;
        this.file = file;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }
    @Override
    public void run() {
        try{
            URL downURL = new URL(url);
            HttpURLConnection connection = (HttpURLConnection)downURL.openConnection();
            connection.setRequestProperty("User-Agent","NetFox");
            String sProperty = "bytes="+startPosition+"-";
            if(endPosition > 0){
                sProperty += endPosition;
            }
            connection.setRequestProperty("RANGE",sProperty);

            //利用RandomAccessFile将下载的信息写入本地文件
            RandomAccessFile raf = new RandomAccessFile(file,"rw");
            //从startPosition字节的位置开始写入信息
            raf.seek(startPosition);
            //读取URL定位的文件信息
            InputStream is = connection.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] buf = new byte[1024];
            long size = -1;
            while((size = bis.read(buf)) > 0){
                raf.write(buf,0,(int)size);
            }
            raf.close();
            bis.close();
            connection.disconnect();
        }catch (Exception e){

        }finally {
        }
    }
}
