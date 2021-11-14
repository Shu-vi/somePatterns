package Iterator.FirstExample;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{
    ArrayList<MenuItem> menuItems;
    int position;
    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems){
        this.menuItems=menuItems;
        position=0;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size()!=position;
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position+=1;
        return menuItem;
    }
}
