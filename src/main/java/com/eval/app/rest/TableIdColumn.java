package com.eval.app.rest;


import org.jooq.TableField;
import org.jooq.impl.TableImpl;

/**
 * Simple convenience object to allow to easily get table and primary key field of that table (ID) by
 * the expected query params.
 */
public class TableIdColumn {

    private final TableImpl table;
    private final TableField icColumn;

    public TableIdColumn(TableImpl table, TableField icColumn) {
        this.table = table;
        this.icColumn = icColumn;
    }

    public TableImpl getTable() {
        return table;
    }

    public TableField getIdColumnName() {
        return icColumn;
    }
}
