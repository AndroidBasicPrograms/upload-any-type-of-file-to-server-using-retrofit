package com.example.jayhind.upload_files_and_crud_retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jay Hind on 6/27/2018.
 */

public class apiClass {
    static Retrofit r=null;
    public static Retrofit getClient() {
        if(r==null)
        {
            r=new Retrofit.Builder().baseUrl("http://192.168.43.55/android/").addConverterFactory(GsonConverterFactory.create()).build();
        }
        return r;
    }
}
