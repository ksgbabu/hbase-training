import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;

import java.io.IOException;

import static org.apache.hadoop.hbase.util.Bytes.toBytes;

/**
 * Created by gireeshbabu on 15/11/17.
 */
public class DeteteColumn {

    public static void main(String[] args) throws IOException {
        Configuration conf = HBaseConfiguration.create();
        HTable htable = new HTable(conf, "emp");
        Delete delete = new Delete(toBytes("row1"));
        delete.deleteColumn(toBytes("personal"),toBytes("age"));
        htable.delete(delete);
        htable.close();
        System.out.println("Column Deleted");
    }
}
