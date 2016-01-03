package com.accioma.telecosfacturamovil.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.accioma.telecosfacturamovil.model.Product;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table PRODUCT.
*/
public class ProductDao extends AbstractDao<Product, Long> {

    public static final String TABLENAME = "PRODUCT";

    /**
     * Properties of entity Product.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Description = new Property(2, String.class, "description", false, "DESCRIPTION");
        public final static Property Standard_price = new Property(3, Float.class, "standard_price", false, "STANDARD_PRICE");
        public final static Property Vat_tax = new Property(4, Float.class, "vat_tax", false, "VAT_TAX");
    };


    public ProductDao(DaoConfig config) {
        super(config);
    }
    
    public ProductDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'PRODUCT' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NAME' TEXT," + // 1: name
                "'DESCRIPTION' TEXT," + // 2: description
                "'STANDARD_PRICE' REAL," + // 3: standard_price
                "'VAT_TAX' REAL);"); // 4: vat_tax
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'PRODUCT'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Product entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(3, description);
        }
 
        Float standard_price = entity.getStandard_price();
        if (standard_price != null) {
            stmt.bindDouble(4, standard_price);
        }
 
        Float vat_tax = entity.getVat_tax();
        if (vat_tax != null) {
            stmt.bindDouble(5, vat_tax);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Product readEntity(Cursor cursor, int offset) {
        Product entity = new Product( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // description
            cursor.isNull(offset + 3) ? null : cursor.getFloat(offset + 3), // standard_price
            cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4) // vat_tax
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Product entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDescription(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setStandard_price(cursor.isNull(offset + 3) ? null : cursor.getFloat(offset + 3));
        entity.setVat_tax(cursor.isNull(offset + 4) ? null : cursor.getFloat(offset + 4));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Product entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Product entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
