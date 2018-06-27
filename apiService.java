package com.example.jayhind.upload_files_and_crud_retrofit;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by Jay Hind on 6/27/2018.
 */

public interface apiService {
    @Multipart
    @POST("upload.php")
    Call<ResponseBody> ulploadFile(@Part MultipartBody.Part file,
                               @Part("file") RequestBody name);

}
