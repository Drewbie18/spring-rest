/*
 * This file is generated by jOOQ.
 */
package com.eval.jooq.tables;


import com.eval.jooq.Eval;
import com.eval.jooq.Indexes;
import com.eval.jooq.Keys;
import com.eval.jooq.tables.records.UsersRecord;

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
public class Users extends TableImpl<UsersRecord> {

    private static final long serialVersionUID = 306876758;

    /**
     * The reference instance of <code>eval.users</code>
     */
    public static final Users USERS = new Users();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UsersRecord> getRecordType() {
        return UsersRecord.class;
    }

    /**
     * The column <code>eval.users.user_id</code>.
     */
    public final TableField<UsersRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>eval.users.username</code>.
     */
    public final TableField<UsersRecord, String> USERNAME = createField("username", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>eval.users.first_name</code>.
     */
    public final TableField<UsersRecord, String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>eval.users.last_name</code>.
     */
    public final TableField<UsersRecord, String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>eval.users.city</code>.
     */
    public final TableField<UsersRecord, String> CITY = createField("city", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>eval.users.user_state</code>.
     */
    public final TableField<UsersRecord, String> USER_STATE = createField("user_state", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>eval.users.email</code>.
     */
    public final TableField<UsersRecord, String> EMAIL = createField("email", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>eval.users.phone</code>.
     */
    public final TableField<UsersRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>eval.users.sports</code>.
     */
    public final TableField<UsersRecord, Boolean> SPORTS = createField("sports", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>eval.users.theatre</code>.
     */
    public final TableField<UsersRecord, Boolean> THEATRE = createField("theatre", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>eval.users.concerts</code>.
     */
    public final TableField<UsersRecord, Boolean> CONCERTS = createField("concerts", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>eval.users.jazz</code>.
     */
    public final TableField<UsersRecord, Boolean> JAZZ = createField("jazz", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>eval.users.classical</code>.
     */
    public final TableField<UsersRecord, Boolean> CLASSICAL = createField("classical", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>eval.users.opera</code>.
     */
    public final TableField<UsersRecord, Boolean> OPERA = createField("opera", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>eval.users.rock</code>.
     */
    public final TableField<UsersRecord, Boolean> ROCK = createField("rock", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>eval.users.vegas</code>.
     */
    public final TableField<UsersRecord, Boolean> VEGAS = createField("vegas", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>eval.users.broadway</code>.
     */
    public final TableField<UsersRecord, Boolean> BROADWAY = createField("broadway", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>eval.users.musicals</code>.
     */
    public final TableField<UsersRecord, Boolean> MUSICALS = createField("musicals", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>eval.users</code> table reference
     */
    public Users() {
        this(DSL.name("users"), null);
    }

    /**
     * Create an aliased <code>eval.users</code> table reference
     */
    public Users(String alias) {
        this(DSL.name(alias), USERS);
    }

    /**
     * Create an aliased <code>eval.users</code> table reference
     */
    public Users(Name alias) {
        this(alias, USERS);
    }

    private Users(Name alias, Table<UsersRecord> aliased) {
        this(alias, aliased, null);
    }

    private Users(Name alias, Table<UsersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Users(Table<O> child, ForeignKey<O, UsersRecord> key) {
        super(child, key, USERS);
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
        return Arrays.<Index>asList(Indexes.USERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UsersRecord> getPrimaryKey() {
        return Keys.KEY_USERS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UsersRecord>> getKeys() {
        return Arrays.<UniqueKey<UsersRecord>>asList(Keys.KEY_USERS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(String alias) {
        return new Users(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Users as(Name alias) {
        return new Users(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(String name) {
        return new Users(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Users rename(Name name) {
        return new Users(name, null);
    }
}
