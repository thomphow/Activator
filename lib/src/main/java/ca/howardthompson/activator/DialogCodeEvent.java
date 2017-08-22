package ca.howardthompson.activator;

import ca.howardthompson.rxdialog.DialogEvent;

/**
 * Created by howard on 5/22/2017.
 */

class DialogCodeEvent implements DialogEvent {

    public String getCode() {
        return code;
    }

    private final String code;

    DialogCodeEvent(String code)
    {
        this.code = code;
    }
}

