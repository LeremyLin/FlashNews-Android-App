package com.laioffer.tinnews.network;

import com.laioffer.tinnews.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApi {
    // words after based url + parameter (eg. country)
    @GET("top-headlines")
    Call<NewsResponse> getTopHeadlines(@Query("country") String country);

    // Generate restful url
    @GET("everything")
    Call<NewsResponse> getEverything(
            @Query("q") String query, @Query("pageSize") int pageSize);
}
