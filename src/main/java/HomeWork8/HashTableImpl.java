package HomeWork8;

import java.util.LinkedList;
import java.util.List;

public class HashTableImpl<K, V> implements HashTable<K, V> {

    private int capaValue = 0;
    private final List<HashTableImpl.Item<K, V>>[] data;
    private int size;

    static class Item<K, V> implements Entry<K, V> {
        private final K key;
        private V value;

        public Item(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Item{" + "key=" + key + ", value=" + value + '}';
        }
    }

    public HashTableImpl(int initialCapacity) {
        data = new List[initialCapacity];
        capaValue = initialCapacity;
    }

    public HashTableImpl() {
        this(16);
    }

    @Override
    public boolean put(K key, V value) {
//        if (size() == data.length) {
//            return false;
//        }

        int index = hashFunc(key);
        if (data[index] == null) {
            data[index] = new LinkedList<HashTableImpl.Item<K, V>>();
        }
        data[index].add(new HashTableImpl.Item<K, V>(key, value));
        size++;
//        int n = 0;

//        while (data[index].get(n) != null) {
//            if (isKeysEquals(data[index].get(n), key)) {
//                data[index].get(n).setValue(value);
//                size++;
//                return true;
//            }
//
//            n++;

//            index += getStepLinear();
//            index += getStepQuadratic(n++);

//            index += getStepDoubleHash(key);
//            index %= data.length;

//        }

//        data[index] = new HashTableImpl.Item(key, value);

        return true;
    }

    private int getStepDoubleHash(K key) {
        return 5 - (key.hashCode() % 5);
    }

    private int getStepQuadratic(int n) {
        return (int) Math.pow(n, 2);
    }

    private int getStepLinear() {
        return 1;
    }

    private boolean isKeysEquals(HashTableImpl.Item<K, V> item, K key) {
//        if (item == emptyItem) {
//            return false;
//        }
        return (item.getKey() == null) ? (key == null) : item.getKey().equals(key);
    }

    private int hashFunc(K key) {
        return Math.abs(key.hashCode() % data.length);
    }

    @Override
    public V get(K key) {
        return hashFunc(key) == -1 ? null : findValue(key);
    }
//    List<HashTableImpl.Item<K, V>> list,
    public V findValue(K key) {
        int index = hashFunc(key);
        List<HashTableImpl.Item<K, V>> list = data[index];
        HashTableImpl.Item<K, V> item = findItem(key);
        if (item == null) {
            return null;
        }
        return item.getValue();
    }

    public HashTableImpl.Item<K, V> findItem(K key) {
        int index = hashFunc(key);
        List<HashTableImpl.Item<K, V>> list = data[index];
        V value;
        for (int i = 0; i < list.size(); i++) {
            if (isKeysEquals(list.get(i), key)) {
                return list.get(i);
            }
        }
        return null;
    }

//    private int indexOf(K key) {
//        int index = hashFunc(key);
//
//        int count = 0;
//
//        while (count++ < data.length) {
//            if (data[index] == null) {
//                break;
//            }
//            if (isKeysEquals(data[index], key)) {
//                return index;
//            }
//
//            index += getStepDoubleHash(key);
//            index %= data.length;
//        }
//        return -1;
//    }

    @Override
    public V remove(K key) {
        int index = hashFunc(key);
        if (index == -1) {
            return null;
        }
        HashTableImpl.Item<K, V> removed = findItem(key);
        data[index].remove(removed);
        size--;
        return removed.getValue();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < capaValue; i++) {
            if (data[i] != null) {
                for (int j = 0; j < data[i].size(); j++) {
                    if (data[i].get(j) != null) {
                        sb.append(String.format("[ %s : %s ] = [%s]%n", i, j, data[i].get(j)));
                    }
                }
            }
        }
        return sb.toString();
    }
}