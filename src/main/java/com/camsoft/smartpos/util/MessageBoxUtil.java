package com.camsoft.smartpos.util;

import org.zkoss.zul.Messagebox;

/**
 * @author: chhai.chivon on 6/13/2018.
 */
public class MessageBoxUtil {

    public static String Warning = "Warning";
    public static String Question = "Question";
    public static  String Information = "Information";
    public static  String Error = "Error";
    public static String ConfirmDialog  = "Confirm Dialog";



    public static void showMsg(String option, String caption, String msgText) {
        if(option.compareToIgnoreCase("ERROR") == 0) {
            Messagebox.show("Error: " + msgText, caption, Messagebox.OK, Messagebox.ERROR);
        }
        else if(option.compareToIgnoreCase("VALIDATE") == 0) {
            Messagebox.show(msgText, caption, Messagebox.OK, Messagebox.EXCLAMATION);
        }
        else if(option.compareToIgnoreCase("SUCCESS") == 0) {
            Messagebox.show(msgText, caption, Messagebox.OK, Messagebox.INFORMATION);
        }
    }
}
