import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.HBaseAdmin;

import java.io.IOException;

/**
 * Created by gireeshbabu on 24/08/17.
 */
public class CreateTable {

    public static void main(String[] args) throws IOException {
        createTable();
    }

    public static void createTable() throws IOException {

        HBaseConfiguration conf = new HBaseConfiguration();
        HBaseAdmin admin = new HBaseAdmin(conf);

        System.out.println(admin.tableExists(TableName.valueOf("emp2")));

        //admin.deleteColumn("emp","contact_details");
        //HColumnDescriptor cd = new HColumnDescriptor("contact_details");
        //admin.addColumn("emp",cd);

        //TableName[] names =  admin.listTableNames();

        //for(TableName n : names){
        //    System.out.println(n);
        //}

        //HTableDescriptor tbld = new HTableDescriptor(TableName.valueOf("dep2"));
        //tbld.addFamily(new HColumnDescriptor("personal"));
        //tbld.addFamily(new HColumnDescriptor("professional"));

        //admin.createTable(tbld);
        //System.out.println("Table Created");

        // Verifying whether the table is disabled
        //Boolean bool = admin.isTableEnabled("emp");
        //System.out.println("Emp table enable status:"+bool);
        System.out.println("Done..");


    }

}
