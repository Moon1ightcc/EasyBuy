package com.easybuy.entity;

public class TSmallCategory {
    private Integer id;

    private String name;

    private Integer parentId;

    private TBigCategory bigcate;

    public TSmallCategory() {
    }

    public TSmallCategory(Integer id, String name, Integer parentId, TBigCategory bigcate) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.bigcate = bigcate;
    }

    public TBigCategory getBigcate() {
        return bigcate;
    }

    public void setBigcate(TBigCategory bigcate) {
        this.bigcate = bigcate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "TSmallCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", bigcate=" + bigcate +
                '}';
    }
}