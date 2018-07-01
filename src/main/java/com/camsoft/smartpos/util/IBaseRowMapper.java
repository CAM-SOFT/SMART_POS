package com.camsoft.smartpos.util;

import org.apache.poi.ss.usermodel.Row;

/**
 * @author: chhai.chivon on 6/28/2018.
 */
public interface IBaseRowMapper<T> {

    T getRow(Row r);
}
