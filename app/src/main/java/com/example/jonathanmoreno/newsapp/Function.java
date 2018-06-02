package com.example.jonathanmoreno.newsapp;

import android.content.Context;
import android.net.ConnectivityManager;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Function {


    public static boolean checkingNetworkAvailable(Context context)
    {
        return ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo() != null;
    }


    public static String excuteGet(String targetURL, String urlParameters)
    {
        URL url;
        HttpURLConnection httpURLConnection = null;
        try {
            //Create connection
            url = new URL(targetURL);
            httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.setRequestProperty("content-type", "application/json;  charset=utf-8");


            httpURLConnection.setRequestProperty("Content-Language", "en-US");

            httpURLConnection.setUseCaches (false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);



            InputStream is;

            int status = httpURLConnection.getResponseCode();

            if (status != HttpURLConnection.HTTP_OK)
                is = httpURLConnection.getErrorStream();
            else
                is = httpURLConnection.getInputStream();



            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuffer response = new StringBuffer();
            while((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\r');
            }
            rd.close();
            return response.toString();

        } catch (Exception e) {


            return null;

        } finally {

            if(httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
    }






}
