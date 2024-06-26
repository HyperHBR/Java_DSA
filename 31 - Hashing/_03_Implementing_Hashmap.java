import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class _03_Implementing_Hashmap {
    public static class HashMap<K,V>{ //We Dont Know The Types So We Key K ANd V As Generic
        private class Node{
            K key;
            V value;
            
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }

        private int bucketSize;
        private int noOfNodes;
        //Just Defining Variable For The Empty Bucket Array Which Will Be Storing LL
        private LinkedList<Node> buckets[];
        
        //Initializing My Empty LL
        @SuppressWarnings("unchecked")
        public HashMap(){
            bucketSize = 4;
            noOfNodes = 0;
            //The Empty Bucket Array Which Will Be Storing LL
            this.buckets = new LinkedList[4];
            for(int i=0;i<bucketSize;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K key){
            // Getting The HashCode
            int hashCode = key.hashCode();
            
            //Getting ABS Value
            hashCode = Math.abs(hashCode);

            //Returning hashCode/bucketSize
            return hashCode%bucketSize;
        }

        public int searchInLL(K key,int bucketIndex){
            LinkedList<Node> ll = buckets[bucketIndex];
            int di = 0;

            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("uncheck")
        private void rehash(){
            //Storing Old Data
            LinkedList<Node> oldBuckets[] = buckets;
            //Creating New Buckets
            buckets = new LinkedList[2*bucketSize];
            //Doubling Bucket Size
            bucketSize*=2;

            //Initialization
            for(int i=0;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i=0;i<oldBuckets.length;i++){
                for(int j=0;j<oldBuckets[i].size();j++){
                    Node node = oldBuckets[i].remove();
                    put(node.key,node.value);
                }
            }
        }

        public void put(K key,V value){ //O(lambda)
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key,bucketIndex);

            if(dataIndex != -1){
                Node node = buckets[bucketIndex].get(dataIndex);
                node.value = value;
            }else{
                buckets[bucketIndex].add(new Node(key,value));
                noOfNodes++;
            }

            //Getting The Lambda
            double lambda = (double)noOfNodes/bucketSize;

            //Checking Rehash Condition
            if(lambda > 2.0) //Our Condition
                rehash();
        }

        public boolean containsKey(K key){ //O(1)
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex == -1){
                return false;
            }
            return true;
        }
        
        public V get(K key){ //O(1)
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex != -1){
                Node node = buckets[bucketIndex].get(dataIndex);
                return node.value;
            }
            return null;
        }

        public V remove(K key){ //O(1)
            int bucketIndex = hashFunction(key);
            int dataIndex = searchInLL(key, bucketIndex);

            if(dataIndex != -1){
                Node node = buckets[bucketIndex].remove(dataIndex);
                noOfNodes--;
                return node.value;
            }
            return null;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keySet = new ArrayList<>();

            for(int i=0;i<buckets.length;i++){
                for(int j=0;j<buckets[i].size();j++){
                    Node node = buckets[i].get(j);
                    keySet.add(node.key);
                }
            } 
            return keySet;
        }

        public boolean isEmpty(){ //O(1)
            return noOfNodes == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("US", 120);
        hm.put("UK", 80);
        
        ArrayList<String> keys = hm.keySet();
        for(String s : keys){
            System.out.println(s);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
