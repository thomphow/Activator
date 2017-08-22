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

public enum Strings {
    dialog_title("Activation required", "Attivazione"), //

    dialog_message("Welcome!\nA confirmation e-mail containing activation data will be sent to "
            + "you as soon as we receive your purchase data.\n\nIn the meanwhile, you can still "
            + "activate your app temporarily by pressing [Later].",

            "Benvenuto!\nAppena riceveremo i dati relativi al vostro acquisto vi invieremo "
                    + "una e-mail con i dati per l'attivazione.\n\nNel frattempo, potete attivare "
                    + "temporaneamente l'applicazione premendo il tasto [Dopo]."), //

    dialog_expired_message("Your activation has expired\nA confirmation e-mail containing activation data will be sent to "
            + "you as soon as we receive your purchase data.\n\nIn the meanwhile, you can still "
            + "activate your app temporarily by pressing [Later].",
            "Your activation has expired\nAppena riceveremo i dati relativi al vostro acquisto vi invieremo "
                    + "una e-mail con i dati per l'attivazione.\n\nNel frattempo, potete attivare "
                    + "temporaneamente l'applicazione premendo il tasto [Dopo]."), //

    dialog_expired_no_temporary_message("Your activation has expired\nA confirmation e-mail containing activation data will be sent to "
            + "you as soon as we receive your purchase data.",
            "Your activation has expired\nAppena riceveremo i dati relativi al vostro acquisto vi invieremo "
                    + "una e-mail con i dati per l'attivazione."), //


    dialog_no_temporary_message("Welcome!\nA confirmation e-mail containing activation data will be sent to "
            + "you as soon as we receive your purchase data.",
            "Benvenuto!\nAppena riceveremo i dati relativi al vostro acquisto vi invieremo "
                    + "una e-mail con i dati per l'attivazione."), //


    input_userid_label("Enter your email", "Inserite la vostra e-mail"), //

    input_code_label("Enter your code", "Inserite il codice di attivazione"), //

    cancel_button_text("Cancel", "Annulla"), //

    confirm_button_text("Activate", "Attiva"), //

    temporary_button_text("Later", "Dopo"), //

    time_remaining("Days left", "Giorni rimasti"), //

    powered_by("Powered by", "Powered by"), //

    info_dialog_default_title("Info", "Informazioni"), //

    info_dialog_button_text("Ok", "Ok"), //

    notify_dialog_default_title("Notice", "Avviso"), //

    notify_dialog_button_text("Ok", "Ok"), //

    confirm_cancel_dialog_default_title("Warning", "Attenzione"), //

    confirm_cancel_dialog_default_message("Confirm the operation?", "Confermi l'operazione?"), //

    button_cancel_dialog_text("Cancel?", "Annulla"), //

    button_confirm_dialog_text("Confirm", "Conferma"), //

    network_unavailable("Network is currently unavailable. Please check your " +
            "connection and try again.",
            "La rete non è attualmente disponibile. Controlla la connessione e riprova."), //

    backend_not_responding("The activation server is not responding. Please try again later.",
            "Il server di attivazione non risponde. Riprova più tardi."), //

    invalid_email_address("Invalid e-mail address", "Indirizzo e-mail non valido"), //

    congratulations("Congratulations!", "Congratulazioni!"), //

    app_successfully_activated("has been successfully activated.\nThank You.", "è stata attivata correttamente.\nGrazie."), //

    activation_error("Activation error", "Errore di attivazione"), //

    wrong_activation_code("Wrong activation code. Make sure you typed it correctly.\n" +
            "If the problem persists, contact the support service.",
            "Codice di attivazione errato. Controlla di averlo digitato correttamente.\n" +
                    "Se il problema persiste, contatta il serizio di assistenza."), //

    wrong_app_name("Your user id was found but the application name does not match the " +
            "licensed name. Please contact the support service.",
            "Il tuo id utente è stato riconosciuto ma il nome dell'applicazione non " +
                    "corrisponde alla licenza. Contatta il servizio di assistenza."), //

    userid_not_found("User id not found in the activation database.\nMaybe your purchase " +
            "data has not yet been received. Please retry later.",
            "Utente non trovato nel database di attivazione.\nProbabilmente i dati relativi " +
                    "al tuo acquisto non sono ancora stati ricevuti. Riprova più tardi."), //

    unrecognized_error("Unrecognized error code", "Codice di errore non riconosciuto"), //

    trial_period_expired("Trial period expired", "Periodo di prova scaduto"), //


    ;



    private String en;
    private String it;
    private String es;


    private Strings(String en, String it) {
        this.en = en;
        this.it = it;
    }

    private Strings(String en, String it, String es) {
        this.en = en;
        this.it = it;
        this.es = es;
    }



    public String get() {
        String string = null;

        if (ca.howardthompson.activator.Languages.isEnglish()) {
            string = en;
        }

        if (Languages.isItalian()) {
            string = it;
        }

        if (Languages.isSpanish()) {
            string = es;
        }


        // fallback to english if language not recognized
        if (string==null) {
            string = en;
        }

        return string;
    }
}

