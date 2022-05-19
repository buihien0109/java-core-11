package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    private int id;
    private String title;
    private String[] category;
    private String author;
    private int pageNumber;
    private int releaseYear;
}
