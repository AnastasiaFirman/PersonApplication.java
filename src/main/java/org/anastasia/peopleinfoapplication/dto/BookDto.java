package org.anastasia.peopleinfoapplication.dto;

import lombok.*;
import org.anastasia.peopleinfoapplication.model.Author;

@Setter
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class BookDto {
    private Long id;
    private String title;
    private AuthorDto author;
}
