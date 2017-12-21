package mobileappscompany.w4d2mvp.view.repolist;

import android.view.View;

import java.util.List;

import mobileappscompany.w4d2mvp.model.Repo;
import mobileappscompany.w4d2mvp.utils.base.BasePresenter;
import mobileappscompany.w4d2mvp.utils.base.BaseView;

/**
 * Created by fallaye on 12/19/17.
 */

public interface RepoListContract {

    interface View extends BaseView{
        void setFullName(String fullName);
        void setRepos(List<Repo> repos);

    }

    interface Presenter extends BasePresenter<View>{

void getFullName(String firstName, String lastName);

void getRepos(String username);

    }
}
