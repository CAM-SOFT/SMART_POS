package com.camsoft.smartpos.util;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: chhai.chivon on 6/28/2018.
 */
public class ExcelReader {

    public static final String SAMPLE_XLSX_FILE_PATH = "C:/Users/chhaichivon/Desktop/Test/sample-xlsx-file.xlsx";

    public static List<Row> getRows(String xlsFile) {
        List<Row> rows = new ArrayList<>();
        try {
            Workbook workbook = getWorkbook(xlsFile);
            // Getting the Sheet at index zero
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                rows.add(row);
            }
        } catch (EncryptedDocumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (InvalidFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return rows;
    }

    public static Workbook getWorkbook(String xlsFile) throws IOException, InvalidFormatException {
        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbook = WorkbookFactory.create(new File(xlsFile));
        return workbook;
    }
}
