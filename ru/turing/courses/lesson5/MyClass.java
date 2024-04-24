package ru.turing.courses.lesson5;

import java.util.Objects;

/**
 * Класс содержащий человека, его реутинг и id
 */
public class MyClass {
    private Long id;
    private String name;
    private Integer rating;

    public MyClass(Long id, String name, Integer rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return Objects.equals(id, myClass.id) && Objects.equals(name, myClass.name) && Objects.equals(rating, myClass.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rating);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
