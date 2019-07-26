package com.pk.json.parse.model;

import java.util.List;

public class Data {

    private double count;

    private double limit;

    private double offset;

    private List<Record> records;

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getOffset() {
        return offset;
    }

    public void setOffset(double offset) {
        this.offset = offset;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "Data{" +
                "count=" + count +
                ", limit=" + limit +
                ", offset=" + offset +
                ", records=" + records +
                '}';
    }
}
