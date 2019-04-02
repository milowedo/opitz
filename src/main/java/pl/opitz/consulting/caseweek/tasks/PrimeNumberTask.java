package pl.opitz.consulting.caseweek.tasks;

import pl.opitz.consulting.caseweek.DynamoDB.CatalogItem;
import pl.opitz.consulting.caseweek.DynamoDB.DAO;
import pl.opitz.consulting.caseweek.model.PrimeNumberTaskRequest;
import pl.opitz.consulting.caseweek.model.PrimeNumberTaskResponse;

public class PrimeNumberTask implements Task<PrimeNumberTaskRequest, PrimeNumberTaskResponse> {

    @Override
    public PrimeNumberTaskResponse resolveTask(PrimeNumberTaskRequest request) {

        int n = request.getNumber();

        DAO d=new DAO();

        int remainder;
        boolean isPrime=true;
        if(n <= 2)  return new PrimeNumberTaskResponse(false);
        for(int i=2;i<=n/2;i++)
        {
            remainder=n%i;
            if(remainder==0)
            {
                isPrime=false;
                break;
            }
        }

        d.save(new CatalogItem(request.getTask().toString(),String.valueOf(isPrime)));
        return new PrimeNumberTaskResponse(isPrime);
    }
}


