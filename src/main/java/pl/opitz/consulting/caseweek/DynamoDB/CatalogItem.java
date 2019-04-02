package pl.opitz.consulting.caseweek.DynamoDB;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="Results")
public class CatalogItem{
    static AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();

    private String task;
    private String result;

    @DynamoDBAttribute(attributeName="TASK")
    public String getTask() {return task; }
    public void setTask(String t) { this.task = t; }

    @DynamoDBAttribute(attributeName="RESULT")
    public String getResult() {return result; }
    public void setResult(String t) { this.result = t; }

    @Override
    public String toString() {
        return "TASK= "+task+" RESULT= "+result;
    }

    public CatalogItem(String r, String t){
        task=t;
        result=r;
    }



}
