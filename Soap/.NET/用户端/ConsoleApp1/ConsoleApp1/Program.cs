
using MySoapSevice;

class Program
{
    static  void Main(string[] args)
    {
        // 创建服务的客户端实例
        MySoapServiceClient client = new MySoapServiceClient();

        string soap = client.GetGreeting("!");
        // 调用服务方法
        Console.WriteLine(soap);
        Console.WriteLine($"Sum: {client.AddNumbers(5, 10)}");

        client.Close();
    }
}
