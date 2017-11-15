import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;

import java.io.IOException;

import static org.apache.hadoop.hbase.util.Bytes.toBytes;

/**
 * Created by gireeshbabu on 15/11/17.
 */
public class GetTable {

    public static void main(String[] args) throws IOException {
        Configuration conf = HBaseConfiguration.create();
        HTable htable = new HTable(conf, "emp");
        Get get = new Get(toBytes("row1"));
        Result result = htable.get(get);
        byte[] value = result.getValue(toBytes("personal"),toBytes("name"));
        System.out.println("Name="+ new String(value));

    }
}
