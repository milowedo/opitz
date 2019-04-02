package pl.opitz.consulting.caseweek.DynamoDB;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class DAO {

    public static void save(CatalogItem a){
        CatalogItem item = new CatalogItem(a.getResult(),a.getResult());
        DynamoDBMapper mapper = new DynamoDBMapper(a.client);
        mapper.save(item);
    }
}
