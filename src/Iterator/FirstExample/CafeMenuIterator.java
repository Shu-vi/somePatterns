package Iterator.FirstExample;

import java.util.HashMap;

public class CafeMenuIterator implements Iterator{
    HashMap<String, MenuItem> menuItems;
    int position;

    public CafeMenuIterator(HashMap<String, MenuItem> menuItems){
        this.menuItems=menuItems;
        position=0;
    }

    @Override
    public boolean hasNext() {
        return menuItems.get(Integer.toString(position)) != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(Integer.toString(position));
        position++;
        return menuItem;
    }
}
