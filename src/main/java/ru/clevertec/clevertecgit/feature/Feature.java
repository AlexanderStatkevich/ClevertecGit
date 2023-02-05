package ru.clevertec.clevertecgit.feature;

import java.util.Objects;

public class Feature {
    private String field;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feature feature = (Feature) o;
        return Objects.equals(field, feature.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}
