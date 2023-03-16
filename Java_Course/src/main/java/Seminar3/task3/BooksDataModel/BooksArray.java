package Seminar3.task3.BooksDataModel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BooksArray
{
    private String BookName;
    private String lastname;
    private Integer price;
    private Integer year;
    private Integer numberPages;
}
