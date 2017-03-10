package makers.ar_d.recyclerviewproject;

/**
 * Created by Diethel on 3/4/2017.
 */

public class ListItem {
    private String head;
    private String description;

    public ListItem(String description, String head) {
        this.description = description;
        this.head = head;

    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

}
