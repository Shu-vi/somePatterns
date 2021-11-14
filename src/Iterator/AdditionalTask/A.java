package Iterator.AdditionalTask;

public class A implements Iterable{
    /*
        создаём массив в A и в B типа Object.
        Сперва в B в конструктуре добавляем в массив элементы, если он переполнился, то создаём новый массив с большей размерностью, после чего
        в конструкторе возвращаем массив в массив класса A и добавляем поля класса A
        После перечисляем как для массива
     */
    private Object[] list;//храним поля обоих классов
    private int y1;
    private double y2;
    private B b;

    public A(int y1, double y2) {
        b = new B(7, 9, -1.2, false);
        this.y1 = y1;
        this.y2 = y2;
        this.list = b.getList();
        add(y1);
        add(y2);
    }

    //добавление полей в массив
    private void add(Object x){
        boolean isAdd=false;
        int i=0;
        if (isFull()){
            createNew();
        }

        while (i < list.length && !isAdd){
            if (list[i]==null){
                isAdd=true;
                list[i]=x;
            }
            i++;
        }
    }
    //Создание нового массива c большей размерностью
    private void createNew(){
        Object[] list2 = new Object[this.list.length+1];
        for (int i=0; i<this.list.length; i++){
            list2[i]=this.list[i];
        }
        this.list = list2;
    }
    //проверка массива на полноту
    private boolean isFull(){
        boolean b=true;
        for (int i=0; i<list.length; i++){
            b=b && list[i]!=null;
        }
        return b;
    }


    public Iterator iterator(){
        return new C(this.list);
    }

//--------------------------------------------------
    private class B{
        //поля этого класса перечисляем итератором
        private int x1,x2;
        private double x3;
        private boolean x4;
        private Object[] list;

        public B(int x1, int x2, double x3, boolean x4) {
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.x4 = x4;
            list = new Object[1];
            add(x1);
            add(x2);
            add(x3);
            add(x4);
        }
        //добавление элемента в массив
        private void add(Object x){
            boolean isAdd=false;
            int i=0;
            if (isFull()){
                createNew(list);
            }

            while (i < list.length && !isAdd){
                if (list[i]==null){
                    isAdd=true;
                    list[i]=x;
                }
                i++;
            }
        }
        //увеличиваем размерность массива
        private void createNew(Object[] list1){
            Object[] list2 = new Object[list1.length+1];
            for (int i=0; i<list1.length; i++){
                list2[i]=list1[i];
            }
            this.list = list2;
        }
        //проверяем массив на полноту
        private boolean isFull(){
            boolean b=true;
            for (int i=0; i<list.length; i++){
                b=b && list[i]!=null;
            }
            return b;
        }

        public Object[] getList() {
            return list;
        }
}
//----------------------------------------------------



//---------------------------------------------------
    private class C implements Iterator{
        //класс итератор
        int pointer;
        Object[] list;

        public C(Object[] list) {
            this.list = list;
            this.pointer = 0;
        }

        @Override
        public Object next() {
            Object value = list[pointer];
            pointer++;
            return value;
        }

        @Override
        public boolean hasNext() {
            return list.length!=pointer;
        }
    }
//---------------------------------------------------
}

