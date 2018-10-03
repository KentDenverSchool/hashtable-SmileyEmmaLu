/*
Emma Lu
10/2/18
Hash Table
 */
import java.lang.reflect.Array;

public class HashTable {
    String [] values;

    //initializes an array of size capacity
    public HashTable(int capacity){
        values = new String[capacity];
    }

    //put hashes the key to an index in your array, and places the value there. Fails if there are collisions/repeat keys.
    public boolean put(String key, String value){
        int index = hashCode(key)% values.length;
        if(values[index]== null){
            values[index] = value;
            return true;
        }
        else{
            return false;
        }

    }

    //get hashes the key to get the index, and returns that element. Returns null if key not found.
    public String get(String key){
        int index = hashCode(key) % values.length;
        return values[index];
    }

    //returns the unique int in the range of the [0, array length)
    private int hashCode(String key){
        int index = hashCode(key)% values.length;
        return index;
    }

}
