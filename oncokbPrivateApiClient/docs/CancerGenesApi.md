# CancerGenesApi

All URIs are relative to *https://localhost:8080/oncokb-curate/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**utilsAllActionableVariantsGetUsingGET**](CancerGenesApi.md#utilsAllActionableVariantsGetUsingGET) | **GET** /utils/allActionableVariants | utilsAllActionableVariantsGet
[**utilsAllActionableVariantsTxtGetUsingGET**](CancerGenesApi.md#utilsAllActionableVariantsTxtGetUsingGET) | **GET** /utils/allActionableVariants.txt | utilsAllActionableVariantsTxtGet
[**utilsAllAnnotatedVariantsGetUsingGET**](CancerGenesApi.md#utilsAllAnnotatedVariantsGetUsingGET) | **GET** /utils/allAnnotatedVariants | utilsAllAnnotatedVariantsGet
[**utilsAllAnnotatedVariantsTxtGetUsingGET**](CancerGenesApi.md#utilsAllAnnotatedVariantsTxtGetUsingGET) | **GET** /utils/allAnnotatedVariants.txt | utilsAllAnnotatedVariantsTxtGet
[**utilsAllCuratedGenesGetUsingGET**](CancerGenesApi.md#utilsAllCuratedGenesGetUsingGET) | **GET** /utils/allCuratedGenes | utilsAllCuratedGenesGet
[**utilsAllCuratedGenesTxtGetUsingGET**](CancerGenesApi.md#utilsAllCuratedGenesTxtGetUsingGET) | **GET** /utils/allCuratedGenes.txt | utilsAllCuratedGenesTxtGet
[**utilsCancerGeneListGetUsingGET**](CancerGenesApi.md#utilsCancerGeneListGetUsingGET) | **GET** /utils/cancerGeneList | utilsCancerGeneListGet
[**utilsCancerGeneListTxtGetUsingGET**](CancerGenesApi.md#utilsCancerGeneListTxtGetUsingGET) | **GET** /utils/cancerGeneList.txt | utilsCancerGeneListTxtGet


<a name="utilsAllActionableVariantsGetUsingGET"></a>
# **utilsAllActionableVariantsGetUsingGET**
> List&lt;ActionableGene&gt; utilsAllActionableVariantsGetUsingGET(version)

utilsAllActionableVariantsGet

Get All Actionable Variants.

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.CancerGenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authorization
ApiKeyAuth authorization = (ApiKeyAuth) defaultClient.getAuthentication("authorization");
authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authorization.setApiKeyPrefix("Token");

CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    List<ActionableGene> result = apiInstance.utilsAllActionableVariantsGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsAllActionableVariantsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

[**List&lt;ActionableGene&gt;**](ActionableGene.md)

### Authorization

[authorization](../README.md#authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsAllActionableVariantsTxtGetUsingGET"></a>
# **utilsAllActionableVariantsTxtGetUsingGET**
> String utilsAllActionableVariantsTxtGetUsingGET(version)

utilsAllActionableVariantsTxtGet

Get All Actionable Variants in text file.

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.CancerGenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authorization
ApiKeyAuth authorization = (ApiKeyAuth) defaultClient.getAuthentication("authorization");
authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authorization.setApiKeyPrefix("Token");

CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    String result = apiInstance.utilsAllActionableVariantsTxtGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsAllActionableVariantsTxtGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

**String**

### Authorization

[authorization](../README.md#authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="utilsAllAnnotatedVariantsGetUsingGET"></a>
# **utilsAllAnnotatedVariantsGetUsingGET**
> List&lt;AnnotatedVariant&gt; utilsAllAnnotatedVariantsGetUsingGET(version)

utilsAllAnnotatedVariantsGet

Get All Annotated Variants.

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.CancerGenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authorization
ApiKeyAuth authorization = (ApiKeyAuth) defaultClient.getAuthentication("authorization");
authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authorization.setApiKeyPrefix("Token");

CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    List<AnnotatedVariant> result = apiInstance.utilsAllAnnotatedVariantsGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsAllAnnotatedVariantsGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

[**List&lt;AnnotatedVariant&gt;**](AnnotatedVariant.md)

### Authorization

[authorization](../README.md#authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsAllAnnotatedVariantsTxtGetUsingGET"></a>
# **utilsAllAnnotatedVariantsTxtGetUsingGET**
> String utilsAllAnnotatedVariantsTxtGetUsingGET(version)

utilsAllAnnotatedVariantsTxtGet

Get All Annotated Variants in text file.

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.CancerGenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authorization
ApiKeyAuth authorization = (ApiKeyAuth) defaultClient.getAuthentication("authorization");
authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authorization.setApiKeyPrefix("Token");

CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    String result = apiInstance.utilsAllAnnotatedVariantsTxtGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsAllAnnotatedVariantsTxtGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

**String**

### Authorization

[authorization](../README.md#authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="utilsAllCuratedGenesGetUsingGET"></a>
# **utilsAllCuratedGenesGetUsingGET**
> List&lt;CuratedGene&gt; utilsAllCuratedGenesGetUsingGET(version)

utilsAllCuratedGenesGet

Get list of genes OncoKB curated

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.CancerGenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authorization
ApiKeyAuth authorization = (ApiKeyAuth) defaultClient.getAuthentication("authorization");
authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authorization.setApiKeyPrefix("Token");

CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    List<CuratedGene> result = apiInstance.utilsAllCuratedGenesGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsAllCuratedGenesGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

[**List&lt;CuratedGene&gt;**](CuratedGene.md)

### Authorization

[authorization](../README.md#authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsAllCuratedGenesTxtGetUsingGET"></a>
# **utilsAllCuratedGenesTxtGetUsingGET**
> String utilsAllCuratedGenesTxtGetUsingGET(version)

utilsAllCuratedGenesTxtGet

Get list of genes OncoKB curated in text file.

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.CancerGenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authorization
ApiKeyAuth authorization = (ApiKeyAuth) defaultClient.getAuthentication("authorization");
authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authorization.setApiKeyPrefix("Token");

CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    String result = apiInstance.utilsAllCuratedGenesTxtGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsAllCuratedGenesTxtGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

**String**

### Authorization

[authorization](../README.md#authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

<a name="utilsCancerGeneListGetUsingGET"></a>
# **utilsCancerGeneListGetUsingGET**
> List&lt;CancerGene&gt; utilsCancerGeneListGetUsingGET(version)

utilsCancerGeneListGet

Get cancer gene list

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.CancerGenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authorization
ApiKeyAuth authorization = (ApiKeyAuth) defaultClient.getAuthentication("authorization");
authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authorization.setApiKeyPrefix("Token");

CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    List<CancerGene> result = apiInstance.utilsCancerGeneListGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsCancerGeneListGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

[**List&lt;CancerGene&gt;**](CancerGene.md)

### Authorization

[authorization](../README.md#authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="utilsCancerGeneListTxtGetUsingGET"></a>
# **utilsCancerGeneListTxtGetUsingGET**
> String utilsCancerGeneListTxtGetUsingGET(version)

utilsCancerGeneListTxtGet

Get cancer gene list in text file.

### Example
```java
// Import classes:
//import org.oncokb.ApiClient;
//import org.oncokb.ApiException;
//import org.oncokb.Configuration;
//import org.oncokb.auth.*;
//import org.oncokb.client.CancerGenesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: authorization
ApiKeyAuth authorization = (ApiKeyAuth) defaultClient.getAuthentication("authorization");
authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//authorization.setApiKeyPrefix("Token");

CancerGenesApi apiInstance = new CancerGenesApi();
String version = "version_example"; // String | version
try {
    String result = apiInstance.utilsCancerGeneListTxtGetUsingGET(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CancerGenesApi#utilsCancerGeneListTxtGetUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| version | [optional]

### Return type

**String**

### Authorization

[authorization](../README.md#authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

