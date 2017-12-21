package mobileappscompany.w4d2mvp.utils.base;

/**
 * Created by fallaye on 12/19/17.
 */

public interface BasePresenter<V extends BaseView> {

    void attachView(V view);
    void dettachView();
}
