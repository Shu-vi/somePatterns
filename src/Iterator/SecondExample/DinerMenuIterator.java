package Iterator.SecondExample;


import java.util.Iterator;

public class DinerMenuIterator implements Iterator  {
    MenuItem[] items;
    int position;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
        position=0;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException
                    ("You can’t remove an item until you’ve done at least one next()");
        }
        if (items[position-1] != null) {//сдвиг элементов на одну позицию
            for (int i = position-1; i < (items.length-1); i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
}
