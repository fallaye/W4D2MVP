package mobileappscompany.w4d2mvp.rxjava;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by fallaye on 12/19/17.
 */

public class Justoperator {


    public static void main(String[] args) {
        Observable<String> stringObservable =
                Observable.just(
                        "first",
                        "Second",
                        "Third",
                        "Fourth"
                );

        Observer stringObserver = new Observer() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("onSubscribe");
            }

            @Override
            public void onNext(Object o) {

                System.out.println("onNext");

            }

            @Override
            public void onError(Throwable e) {
                System.out.println("onError");
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };

        stringObservable.subscribe(stringObserver);
    }
}
