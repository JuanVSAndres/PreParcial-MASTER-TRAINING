package entities;

import java.util.ArrayList;
import java.util.List;

public class Activity {

    private List<Record> records;

    public Activity() {
        this.records = new ArrayList<>();
    }

    public int averageBeats(){

        int result=0;
        for(int i = 0; this.records.size()<i;i++){
            result=this.records.get(i).getBeats();
        }
        return result;

    }

    public void addRecord(Record record) {
        this.records.add(record);
    }
}
