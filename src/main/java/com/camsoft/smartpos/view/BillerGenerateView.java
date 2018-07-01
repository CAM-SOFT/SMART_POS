package com.camsoft.smartpos.view;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Window;

/**
 * @author: chhai.chivon on 6/26/2018.
 */
public class BillerGenerateView extends SelectorComposer<Component> {


    @Wire
    Window winITADDSBG;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
    }

    @Listen("onClick = #btnClose")
    public void closeWin() {
        try{
            winITADDSBG.detach();
        }
        catch(Exception e) { }
    }
}
