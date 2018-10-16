package dataDriver;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;

@RunWith(Parameterized.class)
public class DataTestCSV {
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    @Parameterized.Parameters
    public static List<CSVData> dataCSV() throws IOException {
        return readFromCSV();
    }
    public static List<CSVData> readFromCSV() throws IOException {
        ArrayList<CSVData> data=new ArrayList<CSVData>();
        CsvMapper mapper = new CsvMapper();
        CsvSchema schema = mapper.schemaFor(CSVData.class);
        //mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        // TODO: 2018/10/14 以resources为根路径 
        File csvFile = new File(DataTestCSV.class.getResource("/data.csv").getFile()); // or from String, URL etc
        MappingIterator<CSVData> it = mapper.readerFor(CSVData.class).with(schema).readValues(csvFile);
        while (it.hasNext()) {
            CSVData row = it.next();
            data.add(row);
        }
        return data;
    }

    @Parameterized.Parameter
    public CSVData data;

    @Test
    public void assertions(){
        collector.checkThat(data.getReal(), equalTo(data.getExpect()));
    }
}
