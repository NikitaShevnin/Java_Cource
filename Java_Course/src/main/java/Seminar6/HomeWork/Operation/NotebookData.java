package Seminar6.HomeWork.Operation;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Тут идёт выделение полей
 */
@Data
@AllArgsConstructor

public class NotebookData {
    private String Name;
    private Integer OZU;
    private Integer hardDiskSize;
    private String operatingSystem;

    public NotebookData (String Name, Integer OZU, Integer hardDiskSize,String operatingSystem){
        this.Name = Name;
        this.OZU = OZU;
        this.hardDiskSize = hardDiskSize;
        this.operatingSystem = operatingSystem;
    }
}