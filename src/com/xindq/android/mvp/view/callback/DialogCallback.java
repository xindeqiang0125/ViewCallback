package com.xindq.android.mvp.view.callback;

/**
 * Android MVP Activity Callback , DialogCallback
 */
public interface DialogCallback {

    /**
     * show dialog
     *
     * @param message the message shown in the dialog
     */
    void onShowDialog(Object message);

    /**
     * close dialog
     */
    void onDismissDialog();
}
