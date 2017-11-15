import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;

/**
 * Created by gireeshbabu on 15/11/17.
 */
public class PutTable {

    public static void main(String[] args) throws IOException {
        Configuration conf = HBaseConfiguration.create();
        HTable htable = new HTable(conf, "emp");
        Put p = new Put(Bytes.toBytes("row1"));
        p.add(Bytes.toBytes("personal"),Bytes.toBytes("age"),Bytes.toBytes("34"));
        htable.put(p);
        htable.close();
        System.out.println("Table column added");
    }
}
