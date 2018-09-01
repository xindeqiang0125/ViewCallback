package com.xindq.android.mvp.view.callback;

import com.xindq.android.mvp.view.callback.msg.Message;

public interface DialogCallback {

    void onShowDialog(Message<?> message);

    void onDismissDialog();
}
