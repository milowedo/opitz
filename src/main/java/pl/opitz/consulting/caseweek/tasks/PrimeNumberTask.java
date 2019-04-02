package pl.opitz.consulting.caseweek.tasks;

import pl.opitz.consulting.caseweek.model.PrimeNumberTaskRequest;
import pl.opitz.consulting.caseweek.model.PrimeNumberTaskResponse;

public class PrimeNumberTask implements Task<PrimeNumberTaskRequest, PrimeNumberTaskResponse> {

    @Override
    public PrimeNumberTaskResponse resolveTask(PrimeNumberTaskRequest request) {

        int n = request.getNumber();

        int remainder;
        boolean isPrime=true;

        for(int i=2;i<=n/2;i++)
        {
            remainder=n%i;
            if(remainder==0)
            {
                isPrime=false;
                break;
            }
        }


        return new PrimeNumberTaskResponse(isPrime);
    }
}


