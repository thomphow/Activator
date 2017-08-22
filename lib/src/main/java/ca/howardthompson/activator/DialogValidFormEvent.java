package ca.howardthompson.activator;

import ca.howardthompson.rxdialog.DialogEvent;

/**
 * Used with dialog form validation. The action is to create a warning dialog.
 */

public class DialogValidFormEvent implements DialogEvent {

    public String getEmail() {
        return email;
    }
    private final String email;

    public String getCode() {
        return code;
    }

    private final String code;


    public DialogValidFormEvent(String email, String code)
    {
        this.email = email;
        this.code = code;
    }
}