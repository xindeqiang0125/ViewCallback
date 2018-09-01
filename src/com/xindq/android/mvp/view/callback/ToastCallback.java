package com.xindq.android.mvp.view.callback;

import com.xindq.android.mvp.view.callback.msg.Message;

public interface ToastCallback {
    void onShowToast(Message<?> message);
}
