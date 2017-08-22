package ca.howardthompson.activator;

import ca.howardthompson.rxdialog.DialogEvent;

public class DialogTimerEvent implements DialogEvent
{
    public long getCount() {
        return count;
    }

    private final long count;

    public DialogTimerEvent(long count)
    {
        this.count = count;
    }
}
