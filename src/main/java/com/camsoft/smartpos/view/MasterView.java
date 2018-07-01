package com.camsoft.smartpos.view;


import com.camsoft.smartpos.config.CookieManager;
import com.camsoft.smartpos.model.SystemFunction;
import com.camsoft.smartpos.util.WindowUtil;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Chhai Chivon on 5/25/18.
 */
public class MasterView extends SelectorComposer<Component> {


    @Wire
    Tab tbRoot;
    @Wire
    Tab tbOperation;
    @Wire
    Tab tbView;
    @Wire
    Tab tbSystem;
    @Wire
    Tab tbSecurity;
    @Wire
    Tabpanel tpRoot;
    @Wire
    Tabpanel tpOperation;
    @Wire
    Grid grOperation;
    @Wire
    Tabpanel tpView;
    @Wire
    Grid grView;
    @Wire
    Tabpanel tpSystem;
    @Wire
    Grid grSystem;
    @Wire
    Tabpanel tpSecurity;
    @Wire
    Grid grSecurity;
    @Wire
    Hbox hbContent;


    private boolean isOperation = false;
    private boolean isView = false;
    private boolean isSystem = false;
    private boolean isSecurity = false;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);

        if (CookieManager.getCookie(CookieManager.APP_USER_ID) != "" && CookieManager.getCookie(CookieManager.APP_USER_ID) != "") {

        } else {
            Executions.sendRedirect("login.zul");
        }

        onInitMenu();
    }

    private void onInitMenu() {

        Rows operationRows = new Rows();
        Rows viewRows = new Rows();
        Rows systemRows = new Rows();
        Rows securityRows = new Rows();


        List<SystemFunction> systemFunctions = getSystemFunctions();
        for (SystemFunction systemFunction : systemFunctions) {

            if (systemFunction.getFuncGroup().compareTo("OPERATION") == 0) {
                tbOperation.setSelected(true);
                tbOperation.setVisible(true);
                tpOperation.setVisible(true);
                grOperation.setVisible(true);
                isOperation = true;
            } else if (systemFunction.getFuncGroup().compareTo("SEARCH") == 0) {
                tbView.setSelected(true);
                tbView.setVisible(true);
                tpView.setVisible(true);
                grView.setVisible(true);
                isView = true;
            } else if (systemFunction.getFuncGroup().compareTo("SETTING") == 0) {
                tbSystem.setSelected(true);
                tbSystem.setVisible(true);
                tpSystem.setVisible(true);

                grSystem.setVisible(true);
                isSystem = true;
            } else if (systemFunction.getFuncGroup().compareTo("SECURITY") == 0) {
                tbSecurity.setSelected(true);
                tbSecurity.setVisible(true);
                tpSecurity.setVisible(true);
                grSecurity.setVisible(true);
                isSecurity = true;
            }


            Row rw = new Row();
            Div dv = new Div();
            Image img = new Image();
            Label lbl = new Label();

            img.setSrc("/static/resources/image/icon/" + systemFunction.getIconFile());
            img.setParent(dv);

            lbl.setValue(" " + systemFunction.getFuncDesc());
            lbl.setSclass("leftMenuItem");
            lbl.setStyle("color:#000000; font-size:9pt; padding-left:2px;");
            lbl.setParent(dv);

            dv.setParent(rw);

            final String tmpFuncId = systemFunction.getFuncId() + ".zul";
            rw.addEventListener(Events.ON_CLICK, new EventListener() {
                public void onEvent(Event event) throws Exception {
                    WindowUtil.newWindow(hbContent, tmpFuncId, null);
                }
            });


            if (isOperation == true) {
                rw.setParent(operationRows);
                operationRows.setParent(grOperation);
                isOperation = false;
            } else if (isView == true) {
                rw.setParent(viewRows);
                viewRows.setParent(grView);
                isView = false;
            } else if (isSystem == true) {
                rw.setParent(systemRows);
                systemRows.setParent(grSystem);
                isSystem = false;
            } else if (isSecurity == true) {
                rw.setParent(securityRows);
                securityRows.setParent(grSecurity);
                isSecurity = false;
            }
        }
    }

    @Listen("onClick = #tlbLogout")
    public void confirmLogout() {
        Messagebox.show("Do you want to logout ?"
                , "Logout"
                , Messagebox.OK | Messagebox.NO
                , Messagebox.QUESTION
                , new org.zkoss.zk.ui.event.EventListener() {
                    public void onEvent(Event e) {
                        if (Messagebox.ON_OK.equals(e.getName())) {
                            onLogout();
                        } else if (Messagebox.ON_NO.equals(e.getName())) {
                        }
                    }
                }
        );
    }

    private void onLogout() {
        CookieManager.removeCookie();
        Executions.sendRedirect("login.zul");
    }


    private List<SystemFunction> getSystemFunctions() {
        List<SystemFunction> systemFunctions = new ArrayList<>();
        SystemFunction systemFunction1 = new SystemFunction();
        systemFunction1.setFuncId("ITADDSBU");
        systemFunction1.setFuncDesc("Biller Upload");
        systemFunction1.setFuncGroup("OPERATION");
        systemFunction1.setIconFile("upload_excel_word.png");

        systemFunctions.add(systemFunction1);

        SystemFunction systemFunction2 = new SystemFunction();
        systemFunction2.setFuncId("ITADDSBG");
        systemFunction2.setFuncDesc("Biller Generate");
        systemFunction2.setFuncGroup("SEARCH");
        systemFunction2.setIconFile("generate_excel_word.png");

        systemFunctions.add(systemFunction2);
        return systemFunctions;
    }
}
