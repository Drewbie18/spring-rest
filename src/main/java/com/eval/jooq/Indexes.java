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

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>eval</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index CATEGORIES_PRIMARY = Indexes0.CATEGORIES_PRIMARY;
    public static final Index DATES_PRIMARY = Indexes0.DATES_PRIMARY;
    public static final Index EVENTS_EVENT_CATEGORY = Indexes0.EVENTS_EVENT_CATEGORY;
    public static final Index EVENTS_EVENT_DATE = Indexes0.EVENTS_EVENT_DATE;
    public static final Index EVENTS_EVENT_VENUE = Indexes0.EVENTS_EVENT_VENUE;
    public static final Index EVENTS_PRIMARY = Indexes0.EVENTS_PRIMARY;
    public static final Index LISTINGS_DATE = Indexes0.LISTINGS_DATE;
    public static final Index LISTINGS_EVENT = Indexes0.LISTINGS_EVENT;
    public static final Index LISTINGS_PRIMARY = Indexes0.LISTINGS_PRIMARY;
    public static final Index LISTINGS_SELLER = Indexes0.LISTINGS_SELLER;
    public static final Index SALES_BUYER = Indexes0.SALES_BUYER;
    public static final Index SALES_DATE = Indexes0.SALES_DATE;
    public static final Index SALES_EVENT = Indexes0.SALES_EVENT;
    public static final Index SALES_LISTING = Indexes0.SALES_LISTING;
    public static final Index SALES_PRIMARY = Indexes0.SALES_PRIMARY;
    public static final Index SALES_SELLER = Indexes0.SALES_SELLER;
    public static final Index USERS_PRIMARY = Indexes0.USERS_PRIMARY;
    public static final Index VENUES_PRIMARY = Indexes0.VENUES_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index CATEGORIES_PRIMARY = Internal.createIndex("PRIMARY", Categories.CATEGORIES, new OrderField[] { Categories.CATEGORIES.CATEGORY_ID }, true);
        public static Index DATES_PRIMARY = Internal.createIndex("PRIMARY", Dates.DATES, new OrderField[] { Dates.DATES.DATE_ID }, true);
        public static Index EVENTS_EVENT_CATEGORY = Internal.createIndex("event_category", Events.EVENTS, new OrderField[] { Events.EVENTS.CATEGORY_ID }, false);
        public static Index EVENTS_EVENT_DATE = Internal.createIndex("event_date", Events.EVENTS, new OrderField[] { Events.EVENTS.DATE_ID }, false);
        public static Index EVENTS_EVENT_VENUE = Internal.createIndex("event_venue", Events.EVENTS, new OrderField[] { Events.EVENTS.VENUE_ID }, false);
        public static Index EVENTS_PRIMARY = Internal.createIndex("PRIMARY", Events.EVENTS, new OrderField[] { Events.EVENTS.EVENT_ID }, true);
        public static Index LISTINGS_DATE = Internal.createIndex("date", Listings.LISTINGS, new OrderField[] { Listings.LISTINGS.DATE_ID }, false);
        public static Index LISTINGS_EVENT = Internal.createIndex("event", Listings.LISTINGS, new OrderField[] { Listings.LISTINGS.EVENT_ID }, false);
        public static Index LISTINGS_PRIMARY = Internal.createIndex("PRIMARY", Listings.LISTINGS, new OrderField[] { Listings.LISTINGS.LISTING_ID }, true);
        public static Index LISTINGS_SELLER = Internal.createIndex("seller", Listings.LISTINGS, new OrderField[] { Listings.LISTINGS.SELLER_ID }, false);
        public static Index SALES_BUYER = Internal.createIndex("buyer", Sales.SALES, new OrderField[] { Sales.SALES.BUYER_ID }, false);
        public static Index SALES_DATE = Internal.createIndex("date", Sales.SALES, new OrderField[] { Sales.SALES.DATE_ID }, false);
        public static Index SALES_EVENT = Internal.createIndex("event", Sales.SALES, new OrderField[] { Sales.SALES.EVENT_ID }, false);
        public static Index SALES_LISTING = Internal.createIndex("listing", Sales.SALES, new OrderField[] { Sales.SALES.LISTING_ID }, false);
        public static Index SALES_PRIMARY = Internal.createIndex("PRIMARY", Sales.SALES, new OrderField[] { Sales.SALES.SALES_ID }, true);
        public static Index SALES_SELLER = Internal.createIndex("seller", Sales.SALES, new OrderField[] { Sales.SALES.SELLER_ID }, false);
        public static Index USERS_PRIMARY = Internal.createIndex("PRIMARY", Users.USERS, new OrderField[] { Users.USERS.USER_ID }, true);
        public static Index VENUES_PRIMARY = Internal.createIndex("PRIMARY", Venues.VENUES, new OrderField[] { Venues.VENUES.VENUE_ID }, true);
    }
}
