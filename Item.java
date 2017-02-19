import java.util.*;

public class Item {
	int itemId;
    ArrayList<Item> neighbor;

    public Item() {
        this.neighbor = new ArrayList<>();
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean LiveNeighbor(int itemId) {
        for (Item neighbour: neighbor) {
            if (neighbour.getItemId() == itemId) {
                return true;
            }
        }
        return false;
    }

    public void AddLink(Item item) {
        if (!neighbor.contains(item))
        	neighbor.add(item);
    }
    
    
}