import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;

import java.io.IOException;

import static org.apache.hadoop.hbase.util.Bytes.toBytes;

/**
 * Created by gireeshbabu on 15/11/17.
 */
public class Scanning {
    public static void main(String[] args) throws IOException {

        Configuration conf = HBaseConfiguration.create();
        HTable htable = new HTable(conf, "emp");

        Scan scan = new Scan();
        scan.addColumn(toBytes("personal"),toBytes("name"));
        ResultScanner scanner = htable.getScanner(scan);
        Result result = null;
        while((result = scanner.next()) != null ){
           byte[] value = result.getValue(toBytes("personal"),toBytes("name"));
            System.out.println("value-"+new String(value));
        }
    }
}
