package com.stackroute.uberservice.function;

import com.stackroute.uberservice.dto.ResponseDto;
import com.stackroute.uberservice.model.ProspectiveDriver;
import org.junit.Test;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import static org.assertj.core.api.Assertions.assertThat;

public class SaveProspectiveDriverTest {

  /*  @Test
    public void start() throws Exception {
        AzureSpringBootRequestHandler<Integer, ResponseDto> handler = new AzureSpringBootRequestHandler<>(
                GetProspectiveDriver.class);
        ResponseDto result = handler.handleRequest(55, null);
        handler.close();
        assertThat(result.getMessage()).isEqualTo(" Data retrived from cosmosdb");
    }

    @Test
    public void test() {
        ProspectiveDriver driver=new ProspectiveDriver();
        driver.setName("roger");
        ResponseDto result = new ResponseDto();
         result = new SaveProspectiveDriver().apply(driver);
        assertThat(result.getMessage()).isEqualTo("saved the document to mongo db");
    }*/
}
