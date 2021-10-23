package ucf.assignments;

import java.util.ArrayList;

public class Catalog {
    private ArrayList<ToDoList> catalog;
    private int listSize;

    public Catalog() {
        catalog = new ArrayList<>();
        listSize = 0;
    }

    public void addList(ToDoList newList)
    {
        catalog.add(newList);
        updateSize();
    }

    public void deleteList(ToDoList deleteVal)
    {
        catalog.remove(deleteVal);
        updateSize();
    }

    public void editList(String old, String updated)
    {
        for(ToDoList list: catalog)
        {
            if (list.getName().equalsIgnoreCase(old))
            {
                list.setName(updated);
            }
        }
    }

    private void updateSize()
    {
        listSize = catalog.size();
    }

    public ArrayList<ToDoList> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<ToDoList> catalog) {
        this.catalog = catalog;
    }

    public int getListSize() {
        return listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catalog=" + catalog +
                ", listSize=" + listSize +
                '}';
    }
}
