package Seminar3.task1.DataModel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Модель данных для решения первой задачи из домашнего задания
 */
@Data
@AllArgsConstructor
public class model {
    private String NameOfProduct;
    private String SortOfProduct;
    private Integer CostOfProduct;
}
