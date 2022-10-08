```
class Pair implements Comparable<Pair>{
int key;
int value;
Pair(int key,int value){
this.key=key;
this.value = value;
}
public int compareTo(Pair other){
return other.value -this.value;
}
}
```