package ar.com.carloscurotto.rxjava;

import rx.Observable;
import rx.functions.Action1;

public class Example {

    public static void hello(String... names) {
        Observable.from(names).subscribe(new Action1<String>() {
            public void call(String s) {
                System.out.println("Hello " + s + "!");
            }
        });
    }
    
    public static void main(String[] args) {
        hello("Carlos", "Victoria");
    }
}
