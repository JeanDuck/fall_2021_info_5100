import java.util.*;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class q1 {
    public static class threadSafeLinkedList{
        private LinkedList<Integer> list = new LinkedList<>();
        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
        public void addAtPosition(int index, int element){
            lock.writeLock().lock();
            list.add(index,element);
            lock.writeLock().unlock();
        }
        public void removeAtPosition(int index, int element){
            lock.writeLock().lock();
            if(get(index)==element) {
                list.remove(index);
            }
            lock.writeLock().unlock();
        }
        public int get(int index){
            int x;
            lock.readLock().lock();
            x=list.get(index);
            lock.readLock().unlock();
            return x;
        }
        public int getFirst() {
            int x;
            lock.readLock().lock();
            x=list.getFirst();
            lock.readLock().unlock();
            return x;
        }
        public int getLast() {
            int x;
            lock.readLock().lock();
            x=list.getLast();
            lock.readLock().unlock();
            return x;
        }
        public int size(){
            int size;
            lock.readLock().lock();
            size=list.size();
            lock.readLock().unlock();
            return size;
        }

    }
}
