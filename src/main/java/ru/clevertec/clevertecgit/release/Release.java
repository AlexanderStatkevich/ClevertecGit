package ru.clevertec.clevertecgit.release;

import java.util.Objects;

public class Release {
    private String field;

    private String newField;

    public Release(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Release release = (Release) o;
        return Objects.equals(field, release.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}
