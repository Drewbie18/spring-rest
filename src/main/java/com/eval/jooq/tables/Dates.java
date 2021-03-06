/*
 * This file is generated by jOOQ.
 */
package com.eval.jooq.tables;


import com.eval.jooq.Eval;
import com.eval.jooq.Indexes;
import com.eval.jooq.Keys;
import com.eval.jooq.tables.records.DatesRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dates extends TableImpl<DatesRecord> {

    private static final long serialVersionUID = 1776773835;

    /**
     * The reference instance of <code>eval.dates</code>
     */
    public static final Dates DATES = new Dates();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DatesRecord> getRecordType() {
        return DatesRecord.class;
    }

    /**
     * The column <code>eval.dates.date_id</code>.
     */
    public final TableField<DatesRecord, Integer> DATE_ID = createField("date_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>eval.dates.cal_date</code>.
     */
    public final TableField<DatesRecord, Date> CAL_DATE = createField("cal_date", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>eval.dates.day_name</code>.
     */
    public final TableField<DatesRecord, String> DAY_NAME = createField("day_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>eval.dates.week_num</code>.
     */
    public final TableField<DatesRecord, Integer> WEEK_NUM = createField("week_num", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>eval.dates.month_abrv</code>.
     */
    public final TableField<DatesRecord, String> MONTH_ABRV = createField("month_abrv", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>eval.dates.quarter_num</code>.
     */
    public final TableField<DatesRecord, Integer> QUARTER_NUM = createField("quarter_num", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>eval.dates.year_num</code>.
     */
    public final TableField<DatesRecord, Integer> YEAR_NUM = createField("year_num", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>eval.dates.holiday</code>.
     */
    public final TableField<DatesRecord, Boolean> HOLIDAY = createField("holiday", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>eval.dates</code> table reference
     */
    public Dates() {
        this(DSL.name("dates"), null);
    }

    /**
     * Create an aliased <code>eval.dates</code> table reference
     */
    public Dates(String alias) {
        this(DSL.name(alias), DATES);
    }

    /**
     * Create an aliased <code>eval.dates</code> table reference
     */
    public Dates(Name alias) {
        this(alias, DATES);
    }

    private Dates(Name alias, Table<DatesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Dates(Name alias, Table<DatesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Dates(Table<O> child, ForeignKey<O, DatesRecord> key) {
        super(child, key, DATES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Eval.EVAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DATES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DatesRecord> getPrimaryKey() {
        return Keys.KEY_DATES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DatesRecord>> getKeys() {
        return Arrays.<UniqueKey<DatesRecord>>asList(Keys.KEY_DATES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dates as(String alias) {
        return new Dates(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Dates as(Name alias) {
        return new Dates(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Dates rename(String name) {
        return new Dates(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Dates rename(Name name) {
        return new Dates(name, null);
    }
}
