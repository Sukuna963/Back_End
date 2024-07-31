package com.digitalinnovationone.heroesApi.config;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import org.springframework.context.annotation.Configuration;

import static com.digitalinnovationone.heroesApi.constans.HeroesConstant.ENDPOINT_DYNAMO;
import static com.digitalinnovationone.heroesApi.constans.HeroesConstant.REGION_DYNAMO;

@Configuration
public class HeroesData {
    public static void main(String[] args) throws Exception{
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO, REGION_DYNAMO))
                .build();

        DynamoDB dynamoDB = new DynamoDB(client);

        Table table = dynamoDB.getTable("db_heroes");

        Item hero = new Item().withPrimaryKey("id", 1)
                .withString("name", "Batman")
                .withString("universe", "DC Comics")
                .withNumber("movies", 6);

        PutItemOutcome outcome = table.putItem(hero);
    }
}
