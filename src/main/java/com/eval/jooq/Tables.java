/*
 * This file is generated by jOOQ.
 */
package com.eval.jooq;


import com.eval.jooq.tables.Categories;
import com.eval.jooq.tables.Dates;
import com.eval.jooq.tables.Events;
import com.eval.jooq.tables.Listings;
import com.eval.jooq.tables.Sales;
import com.eval.jooq.tables.Users;
import com.eval.jooq.tables.Venues;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in eval
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>eval.categories</code>.
     */
    public static final Categories CATEGORIES = com.eval.jooq.tables.Categories.CATEGORIES;

    /**
     * The table <code>eval.dates</code>.
     */
    public static final Dates DATES = com.eval.jooq.tables.Dates.DATES;

    /**
     * The table <code>eval.events</code>.
     */
    public static final Events EVENTS = com.eval.jooq.tables.Events.EVENTS;

    /**
     * The table <code>eval.listings</code>.
     */
    public static final Listings LISTINGS = com.eval.jooq.tables.Listings.LISTINGS;

    /**
     * The table <code>eval.sales</code>.
     */
    public static final Sales SALES = com.eval.jooq.tables.Sales.SALES;

    /**
     * The table <code>eval.users</code>.
     */
    public static final Users USERS = com.eval.jooq.tables.Users.USERS;

    /**
     * The table <code>eval.venues</code>.
     */
    public static final Venues VENUES = com.eval.jooq.tables.Venues.VENUES;
}
