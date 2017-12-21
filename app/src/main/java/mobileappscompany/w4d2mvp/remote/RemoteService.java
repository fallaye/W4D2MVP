package mobileappscompany.w4d2mvp.remote;

import java.util.List;
import java.util.Observable;

import mobileappscompany.w4d2mvp.model.Repo;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by fallaye on 12/19/17.
 */

public interface RemoteService {

    @GET("users/{user}/repos")
    io.reactivex.Observable<List<Repo>> getRepos(@Path("user") String user);
}
