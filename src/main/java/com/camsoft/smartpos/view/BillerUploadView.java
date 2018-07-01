package com.camsoft.smartpos.view;

import com.camsoft.smartpos.util.MessageBoxUtil;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;

/**
 * @author: chhai.chivon on 6/26/2018.
 */
public class BillerUploadView  extends SelectorComposer<Component> {


    @Wire
    Window winITADDSBU;

    @Wire
    Combobox cboType;
    @Wire
    Tab tabIndividual;
    @Wire
    Tab	tabBatchFile;
    @Wire
    Tabpanel tabPanelIndividual;
    @Wire
    Tabpanel tabPanelBatch;
    @Wire
    Textbox txtTotal;
    @Wire
    Button btnBrowse;

    @Wire
    Textbox txtFileUpload;
//    @WireVariable
//    BillerClientUploadService billerClientUploadService;
//    List<BillerClientUploadEntity> billerClientUploadEntities = new ArrayList<>();

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);

        /**
         * IF  @WireVariable  OR @Autowired It is not create bean object
         */
        //billerClientUploadService = new BillerClientUploadService();



    }

    @Listen("onClick = #btnClose")
    public void closeWin() {
        try{
            winITADDSBU.detach();
        }
        catch(Exception e) { }
    }

    @Listen("onChange=#cboType")
    public void changeType(){

        String strIndex ="";
        try {
            strIndex = cboType.getSelectedItem().getValue().toString();
            if(strIndex.compareToIgnoreCase("2") == 0){
                onVisibleIndividualBatchFileTab(false);
            }
            else{
                onVisibleIndividualBatchFileTab(true);
            }
        } catch(Exception ex) {
            MessageBoxUtil.showMsg("ERROR", "Error", ex.getMessage());
        }

    }
    private void onVisibleIndividualBatchFileTab(Boolean b){
        tabIndividual.setSelected(b);
        tabIndividual.setVisible(b);
        tabPanelIndividual.setVisible(b);

        tabBatchFile.setSelected(!b);
        tabBatchFile.setVisible(!b);
        tabPanelBatch.setVisible(!b);
    }

    @Listen("onChange=#txtFileUpload")
    public void onChangeTxtFileUpload(){
        String pathFile = txtFileUpload.getValue();


//        if(pathFile.compareToIgnoreCase("") != 0){
//            billerClientUploadEntities = billerClientUploadService.getBillerClientUploads(pathFile);
//            System.out.println("Size 001 : " + billerClientUploadEntities.size());
//            txtTotal.setValue(String.valueOf(billerClientUploadEntities.size()));
//        }

    }
}
