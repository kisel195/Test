import java.util.*;

public class LoadGraph {
	ArrayList<Item> graphsItems = new ArrayList<>();

	public ArrayList<Item> getShow() {
        return graphsItems;
    }
	
    public void Add(int itemId) {
        if (!CheckItem(itemId)) {
        	Item item = new Item();
        	item.setItemId(itemId);
            graphsItems.add(item);
        }
        return;
    }
    
    public void Union(int firstItemId, int secondItemId) {
        if (CheckItem(firstItemId) && CheckItem(secondItemId)) {
        	Item firstItem = GetItem(firstItemId);
        	Item secondItem = GetItem(secondItemId);
            firstItem.AddLink(secondItem);
            if (firstItemId == secondItemId)
                return;
            secondItem.AddLink(firstItem);
        }
    }
    
    public boolean Find(int firstItemId, int secondItemId) {
    	boolean temp = (CheckItem(firstItemId) && CheckItem(secondItemId)) ? GetItem(firstItemId).LiveNeighbor(secondItemId) : false;
        return temp;
    }

    public boolean CheckItem(int itemId) {
        for (Item item: graphsItems) {
            if (item.getItemId() == itemId)
                return true;
        }
        return false;
    }

    private Item GetItem(int itemId) {
        for (Item item : graphsItems) {
            if (item.getItemId() == itemId)
                return item;
        }
        return null;
    }

    
}