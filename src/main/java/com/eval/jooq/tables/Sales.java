/*
 * This file is generated by jOOQ.
 */
package com.eval.jooq.tables;


import com.eval.jooq.Eval;
import com.eval.jooq.Indexes;
import com.eval.jooq.Keys;
import com.eval.jooq.tables.records.SalesRecord;

import java.sql.Timestamp;
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
public class Sales extends TableImpl<SalesRecord> {

    private static final long serialVersionUID = 870563661;

    /**
     * The reference instance of <code>eval.sales</code>
     */
    public static final Sales SALES = new Sales();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesRecord> getRecordType() {
        return SalesRecord.class;
    }

    /**
     * The column <code>eval.sales.sales_id</code>.
     */
    public final TableField<SalesRecord, Integer> SALES_ID = createField("sales_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>eval.sales.listing_id</code>.
     */
    public final TableField<SalesRecord, Integer> LISTING_ID = createField("listing_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>eval.sales.seller_id</code>.
     */
    public final TableField<SalesRecord, Integer> SELLER_ID = createField("seller_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>eval.sales.buyer_id</code>.
     */
    public final TableField<SalesRecord, Integer> BUYER_ID = createField("buyer_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>eval.sales.event_id</code>.
     */
    public final TableField<SalesRecord, Integer> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>eval.sales.date_id</code>.
     */
    public final TableField<SalesRecord, Integer> DATE_ID = createField("date_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>eval.sales.quantity_sold</code>.
     */
    public final TableField<SalesRecord, Integer> QUANTITY_SOLD = createField("quantity_sold", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>eval.sales.price_paid</code>.
     */
    public final TableField<SalesRecord, Double> PRICE_PAID = createField("price_paid", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>eval.sales.commission_amount</code>.
     */
    public final TableField<SalesRecord, Double> COMMISSION_AMOUNT = createField("commission_amount", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>eval.sales.sale_timestamp</code>.
     */
    public final TableField<SalesRecord, Timestamp> SALE_TIMESTAMP = createField("sale_timestamp", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>eval.sales</code> table reference
     */
    public Sales() {
        this(DSL.name("sales"), null);
    }

    /**
     * Create an aliased <code>eval.sales</code> table reference
     */
    public Sales(String alias) {
        this(DSL.name(alias), SALES);
    }

    /**
     * Create an aliased <code>eval.sales</code> table reference
     */
    public Sales(Name alias) {
        this(alias, SALES);
    }

    private Sales(Name alias, Table<SalesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sales(Name alias, Table<SalesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Sales(Table<O> child, ForeignKey<O, SalesRecord> key) {
        super(child, key, SALES);
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
        return Arrays.<Index>asList(Indexes.SALES_BUYER, Indexes.SALES_DATE, Indexes.SALES_EVENT, Indexes.SALES_LISTING, Indexes.SALES_PRIMARY, Indexes.SALES_SELLER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SalesRecord> getPrimaryKey() {
        return Keys.KEY_SALES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SalesRecord>> getKeys() {
        return Arrays.<UniqueKey<SalesRecord>>asList(Keys.KEY_SALES_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<SalesRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SalesRecord, ?>>asList(Keys.SALES_IBFK_1, Keys.SALES_IBFK_2, Keys.SALES_IBFK_3, Keys.SALES_IBFK_4, Keys.SALES_IBFK_5);
    }

    public Listings listings() {
        return new Listings(this, Keys.SALES_IBFK_1);
    }

    public Users salesIbfk_2() {
        return new Users(this, Keys.SALES_IBFK_2);
    }

    public Users salesIbfk_3() {
        return new Users(this, Keys.SALES_IBFK_3);
    }

    public Events events() {
        return new Events(this, Keys.SALES_IBFK_4);
    }

    public Dates dates() {
        return new Dates(this, Keys.SALES_IBFK_5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sales as(String alias) {
        return new Sales(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Sales as(Name alias) {
        return new Sales(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sales rename(String name) {
        return new Sales(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sales rename(Name name) {
        return new Sales(name, null);
    }
}
