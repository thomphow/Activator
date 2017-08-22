package ca.howardthompson.activator;

import ca.howardthompson.rxdialog.DialogEvent;

/**
 * Created by howard on 5/22/2017.
 */

class DialogEmailEvent implements DialogEvent {

    String getEmail() {
        return email;
    }

    private final String email;

    DialogEmailEvent(String email)
    {
        this.email = email;
    }
}