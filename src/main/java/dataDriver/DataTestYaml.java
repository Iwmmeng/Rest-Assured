package dataDriver;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;

@RunWith(Parameterized.class)
public class DataTestYaml {
    @Rule
    public ErrorCollector collector = new ErrorCollector();
    @Parameterized.Parameters()
    public static List<YamlData> data() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        List<YamlData> data = mapper.readValue(
                new File(DataTestYaml.class.getResource("/data.yaml").getFile()),
                new TypeReference<List<YamlData>>(){}
        );
        return data;
    }

    @Parameterized.Parameter
    public YamlData data;

    @Test
    public void assertions(){
        collector.checkThat(String.valueOf(data.getReal1()+data.getReal2()), equalTo(data.getExpect()));
    }
}


