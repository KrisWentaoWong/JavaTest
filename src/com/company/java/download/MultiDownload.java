package com.company.java.download;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * MultiDownload类只要功能是获取下载文件的大小，并根据指定的线程数量计算出每一个线程应该下载的起始点和结束点，然后创建并启动线程
 * Created by kriswong on 2019/5/8.
 */
public class MultiDownload {
    public static void main(String[] agrs){
        MultiDownload download = new MultiDownload();
        try{
            String url = "https://github.com/";
            String filePath = "/Users/kriswong/Desktop/MultiTest.txt";
            int threadNum = 4;
            download.downProcess(url,filePath,threadNum);
        }catch (Exception e){

        }
    }

    public void downProcess(String url,String dest,int threadNum) throws Exception {
        //获取文件大小
        long fileSize = getFileLength(url);
        //计算每个线程需要下载多少字节
        long byteCount = threadNum > 0 ? fileSize/threadNum + 1 : fileSize;
        File file = new File(dest);
        int i=0;
        while(i < threadNum){
            //计算每个线程需要下载文件的起始点和结束点
            final long startPosition = byteCount*i;
            final long endPosition = byteCount*(i+1);
            //启动一个线程
            //最后一个线程的结束点为文件末尾
            if(i == threadNum-1){
                DownThread fileThread = new DownThread(url,file,startPosition,0);
                new Thread(fileThread).start();
            }else{
                DownThread fileThread = new DownThread(url,file,startPosition,endPosition);
                new Thread(fileThread).start();
            }
            i++;
        }
    }

    public long getFileLength(String url) throws Exception{
        URL downloadURL = new URL(url);
        HttpURLConnection connection = (HttpURLConnection)downloadURL.openConnection();
        long size = -1;
        int stateCode = connection.getResponseCode();
        if(stateCode == 200){
            size = connection.getContentLength();
            connection.disconnect();
        }
        return size;
    }
}
