package com.camsoft.smartpos.service;

import com.camsoft.smartpos.model.BillerClientUploadEntity;
import com.camsoft.smartpos.util.BillerClientUploadRowMapper;
import com.camsoft.smartpos.util.ExcelReader;
import org.apache.poi.ss.usermodel.Row;
import org.zkoss.zk.ui.select.annotation.VariableResolver;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chhai.chivon on 6/28/2018.
 */
@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class BillerClientUploadService {

    public List<BillerClientUploadEntity> getBillerClientUploads(String fileWithPath){
        List<Row> rows  = ExcelReader.getRows(fileWithPath);
        List<BillerClientUploadEntity> billerClientUploadEntities  =  new ArrayList<>();
        for (Row row : rows) {
            BillerClientUploadEntity billerClientUploadEntity;
            if (row.getRowNum() > 1) {
                billerClientUploadEntity = new BillerClientUploadRowMapper().getRow(row);
                billerClientUploadEntities.add(billerClientUploadEntity);
            }
        }
      return billerClientUploadEntities;
    }
}
