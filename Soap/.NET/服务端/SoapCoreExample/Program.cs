using Microsoft.AspNetCore.Builder;
using Microsoft.Extensions.DependencyInjection;
using SoapCore;
using System.ServiceModel;

var builder = WebApplication.CreateBuilder(args);

// ×¢²á SOAP ·þÎñ
builder.Services.AddSoapCore();
builder.Services.AddSingleton<IMySoapService, MySoapService>();

var app = builder.Build();

// ÅäÖÃ SOAP ¶Ëµã
app.UseRouting();
app.UseSoapEndpoint<IMySoapService>(
    "/MySoapService.asmx",
    new SoapCore.SoapEncoderOptions()
);

app.Run();
