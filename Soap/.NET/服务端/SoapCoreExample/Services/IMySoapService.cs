using System.ServiceModel;

[ServiceContract(Namespace = "http://localhost:5231")]
public interface IMySoapService
{
    [OperationContract]
    string GetGreeting(string name);

    [OperationContract]
    int AddNumbers(int a, int b);
}
