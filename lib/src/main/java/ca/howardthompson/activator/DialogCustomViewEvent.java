package ca.howardthompson.activator;

import android.view.View;

import ca.howardthompson.rxdialog.DialogEvent;

/*
 * Created by howard on 5/15/2017.
 */


public class DialogCustomViewEvent implements DialogEvent {

    public View getCustomView() {
        return customView;
    }

    private View customView = null;

    private void setCustomView(View view) {
        this.customView = view;
    }

    DialogCustomViewEvent(View view) {
        setCustomView(view);
    }

}
