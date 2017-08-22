/*
       GNU LESSER GENERAL PUBLIC LICENSE
                       Version 3, 29 June 2007

 Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.


  This version of the GNU Lesser General Public License incorporates
the terms and conditions of version 3 of the GNU General Public
License, supplemented by the additional permissions listed below.

  0. Additional Definitions.

  As used herein, "this License" refers to version 3 of the GNU Lesser
General Public License, and the "GNU GPL" refers to version 3 of the GNU
General Public License.

  "The Library" refers to a covered work governed by this License,
other than an Application or a Combined Work as defined below.

  An "Application" is any work that makes use of an interface provided
by the Library, but which is not otherwise based on the Library.
Defining a subclass of a class defined by the Library is deemed a mode
of using an interface provided by the Library.

  A "Combined Work" is a work produced by combining or linking an
Application with the Library.  The particular version of the Library
with which the Combined Work was made is also called the "Linked
Version".

  The "Minimal Corresponding Source" for a Combined Work means the
Corresponding Source for the Combined Work, excluding any source code
for portions of the Combined Work that, considered in isolation, are
based on the Application, and not on the Linked Version.

  The "Corresponding Application Code" for a Combined Work means the
object code and/or source code for the Application, including any data
and utility programs needed for reproducing the Combined Work from the
Application, but excluding the System Libraries of the Combined Work.

  1. Exception to Section 3 of the GNU GPL.

  You may convey a covered work under sections 3 and 4 of this License
without being bound by section 3 of the GNU GPL.

  2. Conveying Modified Versions.

  If you modify a copy of the Library, and, in your modifications, a
facility refers to a function or data to be supplied by an Application
that uses the facility (other than as an argument passed when the
facility is invoked), then you may convey a copy of the modified
version:

   a) under this License, provided that you make a good faith effort to
   ensure that, in the event an Application does not supply the
   function or data, the facility still operates, and performs
   whatever part of its purpose remains meaningful, or

   b) under the GNU GPL, with none of the additional permissions of
   this License applicable to that copy.

  3. Object Code Incorporating Material from Library Header Files.

  The object code form of an Application may incorporate material from
a header file that is part of the Library.  You may convey such object
code under terms of your choice, provided that, if the incorporated
material is not limited to numerical parameters, data structure
layouts and accessors, or small macros, inline functions and templates
(ten or fewer lines in length), you do both of the following:

   a) Give prominent notice with each copy of the object code that the
   Library is used in it and that the Library and its use are
   covered by this License.

   b) Accompany the object code with a copy of the GNU GPL and this license
   document.

  4. Combined Works.

  You may convey a Combined Work under terms of your choice that,
taken together, effectively do not restrict modification of the
portions of the Library contained in the Combined Work and reverse
engineering for debugging such modifications, if you also do each of
the following:

   a) Give prominent notice with each copy of the Combined Work that
   the Library is used in it and that the Library and its use are
   covered by this License.

   b) Accompany the Combined Work with a copy of the GNU GPL and this license
   document.

   c) For a Combined Work that displays copyright notices during
   execution, include the copyright notice for the Library among
   these notices, as well as a reference directing the user to the
   copies of the GNU GPL and this license document.

   d) Do one of the following:

       0) Convey the Minimal Corresponding Source under the terms of this
       License, and the Corresponding Application Code in a form
       suitable for, and under terms that permit, the user to
       recombine or relink the Application with a modified version of
       the Linked Version to produce a modified Combined Work, in the
       manner specified by section 6 of the GNU GPL for conveying
       Corresponding Source.

       1) Use a suitable shared library mechanism for linking with the
       Library.  A suitable mechanism is one that (a) uses at run time
       a copy of the Library already present on the user's computer
       system, and (b) will operate properly with a modified version
       of the Library that is interface-compatible with the Linked
       Version.

   e) Provide Installation Information, but only if you would otherwise
   be required to provide such information under section 6 of the
   GNU GPL, and only to the extent that such information is
   necessary to install and execute a modified version of the
   Combined Work produced by recombining or relinking the
   Application with a modified version of the Linked Version. (If
   you use option 4d0, the Installation Information must accompany
   the Minimal Corresponding Source and Corresponding Application
   Code. If you use option 4d1, you must provide the Installation
   Information in the manner specified by section 6 of the GNU GPL
   for conveying Corresponding Source.)

  5. Combined Libraries.

  You may place library facilities that are a work based on the
Library side by side in a single library together with other library
facilities that are not Applications and are not covered by this
License, and convey such a combined library under terms of your
choice, if you do both of the following:

   a) Accompany the combined library with a copy of the same work based
   on the Library, uncombined with any other library facilities,
   conveyed under the terms of this License.

   b) Give prominent notice with the combined library that part of it
   is a work based on the Library, and explaining where to find the
   accompanying uncombined form of the same work.

  6. Revised Versions of the GNU Lesser General Public License.

  The Free Software Foundation may publish revised and/or new versions
of the GNU Lesser General Public License from time to time. Such new
versions will be similar in spirit to the present version, but may
differ in detail to address new problems or concerns.

  Each version is given a distinguishing version number. If the
Library as you received it specifies that a certain numbered version
of the GNU Lesser General Public License "or any later version"
applies to it, you have the option of following the terms and
conditions either of that published version or of any later version
published by the Free Software Foundation. If the Library as you
received it does not specify a version number of the GNU Lesser
General Public License, you may choose any version of the GNU Lesser
General Public License ever published by the Free Software Foundation.

  If the Library as you received it specifies that a proxy can decide
whether future versions of the GNU Lesser General Public License shall
apply, that proxy's public statement of acceptance of any version is
permanent authorization for you to choose that version for the
Library.
 */


package ca.howardthompson.activator;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.InputType;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import ca.howardthompson.rxdialog.CustomPanel;
import ca.howardthompson.rxdialog.DialogButtonEvent;
import ca.howardthompson.rxdialog.DialogDialogEvent;
import ca.howardthompson.rxdialog.DialogDismissEvent;
import ca.howardthompson.rxdialog.DialogEvent;
import ca.howardthompson.rxdialog.RxDialogBuilder;
import com.jakewharton.rxbinding2.view.RxView;
import java.util.concurrent.TimeUnit;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;


public class CustomDialogs {


	/**
	 * Observable created for a Warning Dialog with a single Confirm button
	 */
	public static Observable<DialogEvent> InfoDialog(Context con, String message,
													 Boolean completeOnDismiss) {

		final RxDialogBuilder builder = new RxDialogBuilder(con, completeOnDismiss);

		builder
				.positiveButton(Strings.notify_dialog_button_text.get(), true)
				.setTitle(Strings.notify_dialog_default_title.get())
				.setMessage(message)
				.setIcon(ca.howardthompson.activator.WarningIcon.getDrawable());

		Observable<DialogEvent> ob =  builder.createObservable();

		ob = ob.subscribeOn(Schedulers.io())
				.doOnError(new Consumer<Throwable>() {
					public void accept(Throwable t) {
						Log.d(Constants.TAG, "Error on Warning Dialog [" + t.toString() + "]");
					}
				})
				.doOnNext(
						new io.reactivex.functions.Consumer<DialogEvent>() {
							public void accept(DialogEvent event) throws Exception {
								Log.d(Constants.TAG,"Warning Dialog event [" + event.toString() + "]");
							}
						})
				.doOnComplete(
						new io.reactivex.functions.Action() {
							public void run() throws Exception {
								Log.d(Constants.TAG,"Warning Dialog complete event");
							}
						});

		return ob;
	}


	/**
	 * Creates the View shown in the message area the dialog.
	 *
	 * @param con - the context for the view if created here
	 * @return the message view
	 */
	private static View createDialogView(Context con, Activator theActivator, boolean hasExpired, boolean temporaryAvailable) {
		View view;
		if (theActivator.getDialogCustomView() != null) {
			view = theActivator.getDialogCustomView();
		}
		else {
			TextView tv = new TextView(con);
			String cText = theActivator.getDialogCustomText();
			if (!Convert.getString(cText).equals("")) {
				tv.setText(cText);
			}
			else {
				if (hasExpired) {
					if (temporaryAvailable)
						tv.setText(Strings.dialog_expired_message.get());
					else
						tv.setText(Strings.dialog_expired_no_temporary_message.get());
				} else {
					if (temporaryAvailable)
						tv.setText(Strings.dialog_message.get());
					else
						tv.setText(Strings.dialog_no_temporary_message.get());
				}
			}
			view = tv;
		}
		return view;
	}


	// Needs to be static due to un-subscribe context
	private static Observable<DialogEvent> mergedOb = null;

	static Observable<DialogEvent> ActivationDialog(final Context con, final Activator theActivator,  boolean neutralButtonPermitted, boolean hasExpired) {

		String statusText ="";

		final Bundle bun = new Bundle();

		if (neutralButtonPermitted) {

			int days = theActivator.calcDaysRemaining(con, theActivator);
			if (days>0) {
				statusText = Strings.time_remaining.get() + ": " + theActivator.calcDaysRemaining(con, theActivator);
			}
			else {
				neutralButtonPermitted = false;
				statusText = Strings.trial_period_expired.get();
			}
		}

		final CustomPanel ap;
		Observable<DialogEvent> ObEmail;
		Observable<DialogEvent> ObCode;
		Observable<DialogEvent> dialogObservable;
		Observable<DialogEvent> intervalObservable;


		try {
			View v = createDialogView(con, theActivator, hasExpired, neutralButtonPermitted);
			ap = new CustomPanel(con)
			.setPanelPadding(50,50,50,50)
			.addIcon(theActivator.getIconResId())
			.addMessageView(v)
			.setViewPadding(0,20,0,0);

			ObEmail = ap.addEditText(Strings.input_userid_label.get(), InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS, CustomPanel.NO_FIELD_LIMIT)

			// At one point used de-bounce to validate the Email and Code fields; then
			// enable the Activation button. But, having code continually waking up every
			// X milliseconds and re-validating text / throwing up a warning dialog... was not
			// the right UI or good processing. Validation needed to be done when the Activation button
			// was pressed.

					.doOnError(new Consumer<Throwable>() {
						public void accept(Throwable t) {
							Log.d(Constants.TAG, "Error on email field [" + t.toString() + "]");
						}
					})
					.map(new Function<CharSequence, DialogEvent>() {
						@Override
						public DialogEvent apply(CharSequence chars) {

								theActivator.setUserId(chars.toString());

								return new DialogEmailEvent
										(chars.toString());

						}
					});

			ap.setViewPadding(0,0,0,0);
			ObCode = ap.addEditText(Strings.input_code_label.get(), InputType.TYPE_CLASS_NUMBER, 8)
					.map(new Function<CharSequence, DialogEvent>() {
						@Override
						public DialogEvent apply(CharSequence chars) {

							theActivator.setActivationCode(chars.toString());

							return new ca.howardthompson.activator.DialogCodeEvent
									(chars.toString());
						}
					})
					.doOnError(new Consumer<Throwable>() {
						public void accept(Throwable t) {
							Log.d(Constants.TAG, "Error on code field [" + t.toString() + "]");
						}
					});

			ap.addText(statusText, Color.RED);

		} catch (Exception e) {
			Log.d(Constants.TAG, "Failed to create ActivatePanel [" + e.toString() + "]");
			return Observable.error(e);
		}

		final RxDialogBuilder builder = new RxDialogBuilder(con, false);

		if (neutralButtonPermitted) {

			builder
			.positiveButton(Strings.confirm_button_text.get(), true)
			.negativeButton(Strings.cancel_button_text.get(), true)
			.neutralButton(Strings.temporary_button_text.get(), false)
			.setView(ap.getView());

			dialogObservable =  builder.createObservable()
			.subscribeOn(AndroidSchedulers.mainThread())
			.observeOn(AndroidSchedulers.mainThread())
			.doOnError(new Consumer<Throwable>() {
				public void accept(Throwable t) {
					Log.d(Constants.TAG, "Error on Activation Dialog [" + t.toString() + "]");
				}
			});



			intervalObservable =
					Observable.interval(0, 1, TimeUnit.SECONDS, Schedulers.io())
							.delay(5, TimeUnit.SECONDS)
							.subscribeOn(Schedulers.io())
							.observeOn(AndroidSchedulers.mainThread())
							.map(new Function<Long, DialogEvent>() {
								@Override
								public DialogEvent apply(Long l) {
									if (l <= theActivator.getTemporaryWaitTime()) {
										return new DialogTimerEvent(l);
									} else
										return new DialogButtonStateChangeEvent(DialogInterface.BUTTON_NEUTRAL,true);
								}
							}).take(theActivator.getTemporaryWaitTime() + 2);


			mergedOb = Observable.merge(dialogObservable, ObEmail, ObCode, intervalObservable);

		} else {

			builder
							.positiveButton(Strings.confirm_button_text.get(), true)
							.negativeButton(Strings.cancel_button_text.get(), true)
							.setView(ap.getView());

			dialogObservable =
							builder.createObservable()
							.subscribeOn(AndroidSchedulers.mainThread())
							.observeOn(AndroidSchedulers.mainThread());

			mergedOb = Observable.merge(dialogObservable, ObEmail, ObCode);
		}

		mergedOb =
		mergedOb.doOnError(new Consumer<Throwable>() {
			public void accept(Throwable t) {
				Log.d(Constants.TAG, "Error on Merged Events from Dialog [" + t.toString() + "]");
			}
		})
		.subscribeOn(AndroidSchedulers.mainThread())
		.observeOn(AndroidSchedulers.mainThread())
		.flatMap(new Function<DialogEvent, ObservableSource<DialogEvent>>() {
			@Override
			public ObservableSource<DialogEvent> apply(DialogEvent event) throws Exception {
				if (event instanceof DialogDialogEvent) {

					theActivator.setTmpDialog(((DialogDialogEvent) event).getDialog());
					AlertDialog ad = ((DialogDialogEvent) event).getDialog();
					Button b = ad.getButton(AlertDialog.BUTTON_POSITIVE);

//TODO Remove
//							b.setOnClickListener(new View.OnClickListener() {
//								@Override
//								public void onClick(View v) {
//									if (subscriber.isUnsubscribed()) return;
//									subscriber.onNext(v);
//								}
//							});
//
//							b.setOnClickListener(new onClickListener);
					return RxView.clicks(b)
							.doOnSubscribe(new Consumer<Disposable>() {
								public void accept(Disposable d) {
									Log.d(Constants.TAG,"Positive button Subscribed");
								}

							})
							.map(new Function<Object, DialogEvent>() {
								@Override
								public DialogEvent apply(Object obj) {
									return new DialogButtonEvent(DialogInterface.BUTTON_POSITIVE);
								}

							});
				} else
					return Observable.just(event);
			}
		})
		.concatMap(new Function<DialogEvent, ObservableSource<DialogEvent>>() {
			@Override
			public ObservableSource<DialogEvent> apply(DialogEvent event) throws Exception {
				if (event instanceof DialogButtonEvent) {

					bun.putInt(Activator.BUTTON_PRESSED, ((DialogButtonEvent) event).getButton());

					int key = bun.getInt(Activator.BUTTON_PRESSED);
					switch (key) {
						case DialogInterface.BUTTON_NEUTRAL:

							theActivator.doTemporaryActivation(con);
							return Observable.just((DialogEvent) new DialogDoneEvent(true, ""));

						case DialogInterface.BUTTON_NEGATIVE:
							return Observable.just((DialogEvent) new DialogDoneEvent(true, ""));

						case DialogInterface.BUTTON_POSITIVE:

							String emailStr = theActivator.getUserId();
							String codeStr = theActivator.getActivationCode();

							String errorDialogText = "";

							boolean emailValid = !TextUtils.isEmpty(emailStr) && Patterns.EMAIL_ADDRESS.matcher(emailStr).matches();
							if (!emailValid) {
								errorDialogText = "Invalid Email";
							}
							boolean codeValid = !TextUtils.isEmpty(codeStr);

							if (!codeValid) {
								if (errorDialogText.equals(""))
									errorDialogText = "Invalid Code";
								else
									errorDialogText = errorDialogText + " and " + "Invalid Code";
							}

							boolean isValidForm = emailValid && codeValid;

							if (!isValidForm) {
                                    Observable<DialogEvent> obWarn = InfoDialog(con, errorDialogText, true);
                                    obWarn = obWarn.doOnError(new Consumer<Throwable>() {
                                        @Override
                                        public void accept(@io.reactivex.annotations.NonNull Throwable throwable) throws Exception {
                                            Log.d(Constants.TAG, "Warning Dialog Problem [" + throwable.toString() + "]");
                                        }
                                    });
									obWarn = obWarn
									.take(2) 	// DialogDialogEvent & DialogButtonEvent
									.map(new Function<DialogEvent, DialogEvent>() {
										@Override
										public DialogEvent apply(DialogEvent event) {
											// Just a fake no op. Jump back to dialog.
											if (event instanceof DialogDialogEvent)
												return new DialogIgnoreEvent();
											else
												return event;
										}
									});

                                    return obWarn;
							} else
							return BackEnd.Activate(con, theActivator)
									.doOnSubscribe(new Consumer<Disposable>() {
										public void accept(Disposable d) {
											Log.d(Constants.TAG,"Activate Subscribed");
										}

									})
									.map(new Function<Boolean, DialogEvent>() {
										@Override
										public DialogEvent apply(Boolean successful) {
											if (successful) {
												return new DialogDoneEvent(true, "");
											} else
												return new DialogDoneEvent(false, "Unable to activate");
										}
									});

						default:
							return Observable.just((DialogEvent)
									new DialogDoneEvent(false, "Unknown button entered [" + key + "]"));
					}


				} else
					return Observable.just(event);
			}
				})
				.doOnNext(
						new Consumer<DialogEvent>() {
							public void accept(DialogEvent event) throws Exception {
								Log.d(Constants.TAG, "MergedOb doOnNext [" + event.toString() + "]");

								if (event instanceof DialogEmailEvent) {
									bun.putString(Activator.EMAIL_ENTER, ((DialogEmailEvent) event).getEmail());
								}

								if (event instanceof DialogCodeEvent) {
									bun.putString(Activator.CODE_ENTER, ((DialogCodeEvent) event).getCode());
								}

								if (event instanceof DialogDismissEvent) {
									Log.d(Constants.TAG, "MergeOb DialogDismissEvent");
								}



								if (event instanceof DialogButtonStateChangeEvent) {

									if (((DialogButtonStateChangeEvent) event).getButton() == DialogInterface.BUTTON_NEUTRAL)
										RxDialogBuilder.updateButtonText(theActivator.getTmpDialog(), DialogInterface.BUTTON_NEUTRAL,
												"later");

									RxDialogBuilder.updateButton(theActivator.getTmpDialog(), ((DialogButtonStateChangeEvent) event).getButton(),
											((DialogButtonStateChangeEvent) event).isEnabled());
								}

								if (event instanceof DialogCustomViewEvent) {

									theActivator.setCustomView(((DialogCustomViewEvent) event).getCustomView());
								}

								if (event instanceof DialogTimerEvent) {

									mergedOb.unsubscribeOn(AndroidSchedulers.mainThread());

									Long tmpL = ((DialogTimerEvent) event).getCount();
									tmpL = theActivator.getTemporaryWaitTime() - tmpL;

									String tmpStr;
									if (tmpL > 0) {
										tmpStr = tmpL.toString() + "s";

										// Note: If in the future if we need to update a TextView instead of
										// a button, there is no way to invalid a View on the AlertDialog.
										// Instead, if you update a button to its current state, then
										// it will invalidate the whole dialog and display the view change.

										RxDialogBuilder.updateButtonText(theActivator.getTmpDialog(), DialogInterface.BUTTON_NEUTRAL,
												tmpStr);
									}
								}
							}

						})
				.doOnComplete(new io.reactivex.functions.Action() {
					public void run() throws Exception {
						Log.d(Constants.TAG, "doOnComplete in ActivationDialog");
					}
				});


		return mergedOb;
	}

//				.map(new Function<DialogEvent, DialogEvent>() {
//					@Override
//					public DialogEvent apply(DialogEvent event) {
//
//						if (event instanceof DialogDialogEvent) {
//							Activator.getInstance().setTmpDialog(((DialogDialogEvent) event).getDialog());
//
//
//
//
//							return (event);
//
//						} else
//							return event;
//					}
//				})
}
