package ru.clevertec.clevertecgit.featuretemp;

public class FeatureTemp {
    private String field;
    private String anotherField;

    public FeatureTemp(String field, String anotherField) {
        this.field = field;
        this.anotherField = anotherField;
    }

    @Override
    public String toString() {
        return "FeatureTemp{" +
                "field='" + field + '\'' +
                ", anotherField='" + anotherField + '\'' +
                '}';
    }
}
