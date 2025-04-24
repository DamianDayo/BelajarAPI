package com.example.belajarapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import com.example.belajarapi.TeamResponse;


public interface APIService {
    @GET("search_all_teams.php")
    Call<TeamResponse> getTeams(@Query("l") String league);
}
