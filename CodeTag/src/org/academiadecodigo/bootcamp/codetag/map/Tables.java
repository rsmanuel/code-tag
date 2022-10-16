package org.academiadecodigo.bootcamp.codetag.map;

import java.util.HashMap;
import java.util.Iterator;

public class Tables extends Base implements Iterable<String>{
    private HashMap<String, Integer[]> tables;

    public Tables(){
        this.tables = new HashMap<>();
        buildTables();
    }

    private void buildTables() {
        tables.put("table1", new Integer[]{567, 658, 226, 623});
        tables.put("table2", new Integer[]{732, 823, 226, 623});
        tables.put("table3", new Integer[]{901, 992, 226, 623});
        tables.put("table4", new Integer[]{1066, 1157, 226, 623});
        tables.put("table5", new Integer[]{1231, 1322, 226, 623});
    }

    public HashMap<String, Integer[]> getTables() {
        return tables;
    }

    public Integer[] get(String table){
        return tables.get(table);
    }

    @Override
    public Iterator<String> iterator() {
        return tables.keySet().iterator();
    }
}
