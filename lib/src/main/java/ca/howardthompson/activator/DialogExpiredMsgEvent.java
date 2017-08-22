package ca.howardthompson.activator;

import ca.howardthompson.rxdialog.DialogEvent;

/**
 * Used with dialog form validation where the result is invalid but is to just
 * be ignored. (With combinelatest, you have to produce a result)
 */

public class DialogExpiredMsgEvent implements DialogEvent {

    public DialogExpiredMsgEvent(){
    }
}