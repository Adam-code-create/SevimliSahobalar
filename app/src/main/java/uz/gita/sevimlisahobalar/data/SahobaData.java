package uz.gita.sevimlisahobalar.data;

public class SahobaData {
    private int logoID;
    private String name;
    private int imageID;
    private String description;


    public SahobaData(int logoID, String name, int imageID, String description) {
        this.logoID = logoID;
        this.name = name;
        this.imageID = imageID;
        this.description = description;
    }


    public int getLogoID() {
        return logoID;
    }

    public String getName() {
        return name;
    }

    public int getImageID() {
        return imageID;
    }

    public String getDescription() {
        return description;
    }
}
