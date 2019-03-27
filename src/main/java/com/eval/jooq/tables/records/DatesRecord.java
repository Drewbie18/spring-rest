/*
 * This file is generated by jOOQ.
 */
package com.eval.jooq.tables.records;


import com.eval.jooq.tables.Dates;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


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
public class DatesRecord extends UpdatableRecordImpl<DatesRecord> implements Record8<Integer, Date, String, Integer, String, Integer, Integer, Boolean> {

    private static final long serialVersionUID = -742390858;

    /**
     * Setter for <code>eval.dates.date_id</code>.
     */
    public DatesRecord setDateId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>eval.dates.date_id</code>.
     */
    public Integer getDateId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>eval.dates.cal_date</code>.
     */
    public DatesRecord setCalDate(Date value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>eval.dates.cal_date</code>.
     */
    public Date getCalDate() {
        return (Date) get(1);
    }

    /**
     * Setter for <code>eval.dates.day_name</code>.
     */
    public DatesRecord setDayName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>eval.dates.day_name</code>.
     */
    public String getDayName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>eval.dates.week_num</code>.
     */
    public DatesRecord setWeekNum(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>eval.dates.week_num</code>.
     */
    public Integer getWeekNum() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>eval.dates.month_abrv</code>.
     */
    public DatesRecord setMonthAbrv(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>eval.dates.month_abrv</code>.
     */
    public String getMonthAbrv() {
        return (String) get(4);
    }

    /**
     * Setter for <code>eval.dates.quarter_num</code>.
     */
    public DatesRecord setQuarterNum(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>eval.dates.quarter_num</code>.
     */
    public Integer getQuarterNum() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>eval.dates.year_num</code>.
     */
    public DatesRecord setYearNum(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>eval.dates.year_num</code>.
     */
    public Integer getYearNum() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>eval.dates.holiday</code>.
     */
    public DatesRecord setHoliday(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>eval.dates.holiday</code>.
     */
    public Boolean getHoliday() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Date, String, Integer, String, Integer, Integer, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Date, String, Integer, String, Integer, Integer, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Dates.DATES.DATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field2() {
        return Dates.DATES.CAL_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Dates.DATES.DAY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Dates.DATES.WEEK_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Dates.DATES.MONTH_ABRV;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Dates.DATES.QUARTER_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Dates.DATES.YEAR_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return Dates.DATES.HOLIDAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date component2() {
        return getCalDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getWeekNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getMonthAbrv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getQuarterNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getYearNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getHoliday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value2() {
        return getCalDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDayName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getWeekNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getMonthAbrv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getQuarterNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getYearNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getHoliday();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatesRecord value1(Integer value) {
        setDateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatesRecord value2(Date value) {
        setCalDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatesRecord value3(String value) {
        setDayName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatesRecord value4(Integer value) {
        setWeekNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatesRecord value5(String value) {
        setMonthAbrv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatesRecord value6(Integer value) {
        setQuarterNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatesRecord value7(Integer value) {
        setYearNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatesRecord value8(Boolean value) {
        setHoliday(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DatesRecord values(Integer value1, Date value2, String value3, Integer value4, String value5, Integer value6, Integer value7, Boolean value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DatesRecord
     */
    public DatesRecord() {
        super(Dates.DATES);
    }

    /**
     * Create a detached, initialised DatesRecord
     */
    public DatesRecord(Integer dateId, Date calDate, String dayName, Integer weekNum, String monthAbrv, Integer quarterNum, Integer yearNum, Boolean holiday) {
        super(Dates.DATES);

        set(0, dateId);
        set(1, calDate);
        set(2, dayName);
        set(3, weekNum);
        set(4, monthAbrv);
        set(5, quarterNum);
        set(6, yearNum);
        set(7, holiday);
    }
}
