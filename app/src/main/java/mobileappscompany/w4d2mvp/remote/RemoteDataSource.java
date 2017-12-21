package mobileappscompany.w4d2mvp.remote;

import java.util.List;
import java.util.Observable;

import mobileappscompany.w4d2mvp.model.Repo;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fallaye on 12/19/17.
 */

public class RemoteDataSource {
    public static final String  BASE_URL = "https://api.github.com/";

    public static Retrofit   create(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit;
    }

    public static io.reactivex.Observable<List<Repo>> getRepos(String username){
        Retrofit retrofit = create();

        RemoteService remoteService = retrofit.create(RemoteService.class);
        return remoteService.getRepos(username);
    }
}
