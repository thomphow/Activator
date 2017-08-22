package ca.howardthompson.activator;

/**
 * Created by howard on 5/13/2017.
 */

import ca.howardthompson.rxdialog.DialogEvent;

/**
 * Event identifying a button state change on an Dialog.
 */

public class DialogButtonStateChangeEvent implements DialogEvent {
    private final int theButton;

    public boolean isEnabled() {
        return enabled;
    }

    private final boolean enabled;

    public DialogButtonStateChangeEvent(int button, boolean enabled)
    {
        this.theButton = button;
        this.enabled = enabled;
    }

    public int getButton()
    {
        return theButton;
    }

}

