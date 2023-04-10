package SeminarOOP2.hw.Operation;
/**
 * Тут идёт выделение полей геттеры и сеттеры
 */
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

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getOZU() {
        return OZU;
    }

    public void setOZU(Integer OZU) {
        this.OZU = OZU;
    }

    public Integer getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(Integer hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}