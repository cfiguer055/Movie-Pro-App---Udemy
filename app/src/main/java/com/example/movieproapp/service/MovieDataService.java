package com.example.movieproapp.service;

import com.example.movieproapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    // Base URL
    // https://api.themoviedb.org/3/
    //
    // End_Point URL
    // movie/popular?api_key=2d4f52206f47b0fa3c936736b9f8721a
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);

}
