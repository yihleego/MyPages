package io.leego.mypages.util;

import java.lang.reflect.Field;

/**
 * @author Yihleego
 */
public class PaginationField {
    private int defaultPage;
    private int defaultSize;
    private int maxPage;
    private int maxSize;
    private String countColumn;
    private Field pageField;
    private Field sizeField;
    private Field offsetField;
    private Field rowsField;
    private Field countColumnField;

    public PaginationField(int defaultPage, int defaultSize, int maxPage, int maxSize, String countColumn, Field pageField, Field sizeField, Field offsetField, Field rowsField, Field countColumnField) {
        this.defaultPage = defaultPage;
        this.defaultSize = defaultSize;
        this.maxPage = maxPage;
        this.maxSize = maxSize;
        this.countColumn = countColumn;
        this.pageField = pageField;
        this.sizeField = sizeField;
        this.offsetField = offsetField;
        this.rowsField = rowsField;
        this.countColumnField = countColumnField;
    }

    public int getDefaultPage() {
        return defaultPage;
    }

    public void setDefaultPage(int defaultPage) {
        this.defaultPage = defaultPage;
    }

    public int getDefaultSize() {
        return defaultSize;
    }

    public void setDefaultSize(int defaultSize) {
        this.defaultSize = defaultSize;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getCountColumn() {
        return countColumn;
    }

    public void setCountColumn(String countColumn) {
        this.countColumn = countColumn;
    }

    public Field getPageField() {
        return pageField;
    }

    public void setPageField(Field pageField) {
        this.pageField = pageField;
    }

    public Field getSizeField() {
        return sizeField;
    }

    public void setSizeField(Field sizeField) {
        this.sizeField = sizeField;
    }

    public Field getOffsetField() {
        return offsetField;
    }

    public void setOffsetField(Field offsetField) {
        this.offsetField = offsetField;
    }

    public Field getRowsField() {
        return rowsField;
    }

    public void setRowsField(Field rowsField) {
        this.rowsField = rowsField;
    }

    public Field getCountColumnField() {
        return countColumnField;
    }

    public void setCountColumnField(Field countColumnField) {
        this.countColumnField = countColumnField;
    }
}
