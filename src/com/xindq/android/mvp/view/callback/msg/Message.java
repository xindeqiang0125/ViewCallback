package com.xindq.android.mvp.view.callback.msg;

public class Message<T> {

    private T value;

    private Message(T value) {
        this.value=value;
    }

    public static <T> Message<T> of(T value){
        return new Message<>(value);
    }

    public T value() {
        return value;
    }
}
