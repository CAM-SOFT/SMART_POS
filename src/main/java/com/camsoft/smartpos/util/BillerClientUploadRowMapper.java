package com.camsoft.smartpos.util;

import com.camsoft.smartpos.model.BillerClientUploadEntity;
import org.apache.poi.ss.usermodel.Row;

/**
 * @author: chhai.chivon on 6/28/2018.
 */
public class BillerClientUploadRowMapper implements IBaseRowMapper<BillerClientUploadEntity> {
    @Override
    public BillerClientUploadEntity getRow(Row r) {
        BillerClientUploadEntity billerClientUploadEntity = new BillerClientUploadEntity();
        billerClientUploadEntity.setCompanyKey(getValueRow(r,1));
        billerClientUploadEntity.setCompanyName(getValueRow(r,2));
        billerClientUploadEntity.setCustomerId(getValueRow(r,3));
        billerClientUploadEntity.setCustomerName(getValueRow(r,4));
        billerClientUploadEntity.setNationalId(getValueRow(r,5));
        billerClientUploadEntity.setPassport(getValueRow(r,6));
        billerClientUploadEntity.setGender(getValueRow(r,7));
        billerClientUploadEntity.setDob(getValueRow(r,8));
        billerClientUploadEntity.setPhone(getValueRow(r,9));
        billerClientUploadEntity.setBankAccount(getValueRow(r,10));
        billerClientUploadEntity.setAccountCCY(getValueRow(r,11));
        billerClientUploadEntity.setInvNo(getValueRow(r,12));
        billerClientUploadEntity.setInvAmount(getValueRow(r,13));
        billerClientUploadEntity.setInvCCV(getValueRow(r,14));
        billerClientUploadEntity.setInvDate(getValueRow(r,15));
        billerClientUploadEntity.setInvExpDate(getValueRow(r,16));
        return billerClientUploadEntity;
    }

    private static String getValueRow(Row r,int numberRow){
        return (r.getCell(numberRow) != null ? r.getCell(numberRow).toString() : "");
    }
}
