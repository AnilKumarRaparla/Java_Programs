import java.util.*;

class Map1
{
    public static void main(String[] args)
    {
Map<Integer, String> map = new LinkedHashMap<>();
map.put(01, "Anil");
map.put(02, "Kumar");
map.put(03, "Raparla");
Set<Integer> keys = map.keySet();

for(Integer key : keys)
System.out.println(key);

Collection<String> values = map.values();

for(String value : values)
System.out.println(value);

for(Integer key : keys)
System.out.print(map.get(key));
    }
}