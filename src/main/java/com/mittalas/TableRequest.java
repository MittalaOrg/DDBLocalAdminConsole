package com.mittalas;

public class TableRequest {

    private String tableName;

    public TableRequest(final String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }
}
