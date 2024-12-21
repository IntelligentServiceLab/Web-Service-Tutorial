using Microsoft.AspNetCore.Builder;
using Microsoft.Extensions.DependencyInjection;
using SoapCore;
using System.ServiceModel;

var builder = WebApplication.CreateBuilder(args);

// ע�� SOAP ����
builder.Services.AddSoapCore();
builder.Services.AddSingleton<IMySoapService, MySoapService>();

var app = builder.Build();

// ���� SOAP �˵�
app.UseRouting();
app.UseSoapEndpoint<IMySoapService>(
    "/MySoapService.asmx",
    new SoapCore.SoapEncoderOptions()
);

app.Run();
