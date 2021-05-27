package com.stackroute.uberservice.function;


import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.ServiceBusQueueOutput;
import com.microsoft.azure.functions.annotation.ServiceBusQueueTrigger;
import com.microsoft.azure.functions.annotation.ServiceBusTopicOutput;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SendToTopic {

  /*  @FunctionName("CreateShipment")
    @ServiceBusTopicOutput( )
    @ServiceBusQueueOutput(name = "$return",
            queueName = "shippingsinitiated",
            connection = "ServiceBus")
    public String run(
            @ServiceBusQueueTrigger(name = "message",
                    queueName = "ordersforshipping",
                    connection = "ServiceBus")
                    String msg,
            final ExecutionContext context
    ) throws InterruptedException, IOException {
        // NOTE: Look at our complex business logic ;-)
        // Yes - do the REAL STUFF here!
        Thread.sleep(5000);
        //NewOrderMessage msg
        /*ShippingCreatedMessage shippingCreated =
                new ShippingCreatedMessage();
        shippingCreated.Id = UUID.randomUUID();
        shippingCreated.Created = new Date();
        shippingCreated.OrderId = msg.Order.Id;
        shippingCreated.UserId = msg.UserId;

        Gson gson = new GsonBuilder().setDateFormat(
                "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'").create();
        String shippingCreatedMessage = gson.toJson(shippingCreated);

        return shippingCreatedMessage; */
      /*  return null;
    }*/
}
