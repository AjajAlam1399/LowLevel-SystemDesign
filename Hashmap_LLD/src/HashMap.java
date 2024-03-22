import modle.Entery;

public class HashMap<S,T> {
    private static final int defaultSize=1<<4;
    private static final int maxSize=1<<30;
    public Entery[] hashTable;

    public HashMap() {
        hashTable=new Entery[defaultSize];
    }
    public HashMap(int size){
        int initalSize=findSize(size);
        hashTable=new Entery[initalSize];
    }
    private  int findSize(int size){
        int n=size-1;
        n|=n>>1;
        n|=n>>2;
        n|=n>>4;
        n|=n>>8;
        n|=n>>16;

        return (n<0)?0:n>=maxSize?maxSize:n+1;
    }
    public void put(S key,T value){
        int hashCode=key.hashCode()%hashTable.length;
        Entery node=hashTable[hashCode];

        if(node==null){
            hashTable[hashCode]=new Entery(key,value);
        }
        else{
            Entery prevNode=node;
            while(node!=null){
                if(node.getKey()==key){
                    node.setValue(value);
                    return;
                }
                prevNode=node;
                node=node.getNext();
            }
            prevNode.setNext(new Entery(key,value));
            return;

        }
    }
    public  T get(S key){
        int hasCode=key.hashCode()%hashTable.length;
        Entery node=hashTable[hasCode];
        while(node!=null){
            if(node.getKey().equals(key)){
                return (T) node.getValue();
            }
            node=node.getNext();
        }
        return  null;
    }

}
