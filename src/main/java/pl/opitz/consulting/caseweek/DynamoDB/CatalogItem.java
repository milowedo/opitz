package pl.opitz.consulting.caseweek.DynamoDB;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="Results")
public class CatalogItem {

    private String task;
    private String result;

    @DynamoDBAttribute(attributeName="TASK")
    public String getTask() {return task; }
    public void setTask(String t) { this.task = t; }

    @DynamoDBAttribute(attributeName="RESULT")
    public String getResult() {return result; }
    public void setResult(String t) { this.result = t; }


}
