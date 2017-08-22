package ca.howardthompson.activator;

import ca.howardthompson.rxdialog.DialogEvent;

/**
 * Created by howard on 5/31/2017.
 */

public class DialogDoneEvent implements DialogEvent {
    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    private Boolean success;

    public String getErrStr() {
        return errStr;
    }

    private String errStr;

    public void setErrStr(String str) {
        this.errStr = str;
    }

    public DialogDoneEvent(Boolean success, String errStr)
    {
        this.success = success;
        this.errStr = errStr;
    }
}
