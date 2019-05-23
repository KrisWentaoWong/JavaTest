package com.company.java.download;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**找出页面里的url
 * Created by kriswong on 2019/5/8.
 */
public class ParseHTML {
    public List searchURL(String urlString) throws Exception{
        List<String> list = new ArrayList<>();
        URL url = new URL(urlString);
        URLConnection connection = url.openConnection();
        connection.connect();
        BufferedReader bf = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String nextLine = null;
        while ((nextLine=bf.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(nextLine);
            while(tokenizer.hasMoreTokens()){
                String urlToken = tokenizer.nextToken();
                if(hasMatch(urlToken)){
                    list.add(urlToken);
                }
            }
        }
        return list;
    }

    /**
     * 判断字符串中是否含有http字符，即超链接
     * @param token
     * @return
     */
    private boolean hasMatch(String token){
        return token.indexOf("http:")!=-1;
    }

    public static void main(String[] args) throws Exception {
        ParseHTML parseHTML = new ParseHTML();
//        String url = "https://github.com/";
//        String url = "http://www.seu.edu.cn/";
        String url = "https://www.nju.edu.cn/";
        List<String> list = parseHTML.searchURL(url);
        for(String s: list){
            System.out.println(s);
        }
    }
}
