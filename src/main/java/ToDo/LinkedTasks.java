package ToDo;

import java.util.LinkedList;
import java.util.List;
public class LinkedTasks {
    private final LinkedList <Task> list = new LinkedList<>();
    public int size (){
        return list.size();
    }
    public List<Task> asList() {
        return list;
    }
    public  void addLast (String title) {
        list.add(new Task(title));
    }

    public void toogleAt (int index){
        if(!valid(index)) return;
        list.get(index).done = !list.get(index).done;
    }
    private boolean valid(int i ){
        return i>0 && i<list.size();

    }
    public void  removeAt(int index){
        if(!valid(index));
        list.remove(index); //
    }
    public void move(int index, int delta){
        int target = index + delta;
        if (!valid(index) || !valid(target)) return;
        Task t = list.remove(index);
        list.add(target,t);
    }
    public void clean(){
        list.clear();
    }
    
}

