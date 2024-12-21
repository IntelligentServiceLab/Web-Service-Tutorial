using System;
public class MySoapService : IMySoapService
{
    public string GetGreeting(string name)
    {
        return $"Hello, {name}!";
    }

    public int AddNumbers(int a, int b)
    {
        return a + b;
    }
}

