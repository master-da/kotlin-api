package com.tsunderead.asynctask.helperpackage;

public interface NetworkCaller<T> {
    void onNetworkCallSuccess(T t);
    void onNetworkCallFail();
}