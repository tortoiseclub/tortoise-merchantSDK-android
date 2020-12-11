# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.CancellationApi;

public class CancellationApiExample {

    public static void main(String[] args) {
        CancellationApi apiInstance = new CancellationApi();
        Cancellation body = new Cancellation(); // Cancellation | cancellation object that needs to be added
        try {
            apiInstance.addCancellation(body);
        } catch (ApiException e) {
            System.err.println("Exception when calling CancellationApi#addCancellation");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/suryaharshan1/Tortoise/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CancellationApi* | [**addCancellation**](docs/CancellationApi.md#addCancellation) | **POST** /cancellations | Create a new cancellation request for a plan
*CancellationApi* | [**editCancellation**](docs/CancellationApi.md#editCancellation) | **PUT** /cancellations/{cancellationId} | Edit a cancellation request for a plan
*CancellationApi* | [**fetchAllCancellations**](docs/CancellationApi.md#fetchAllCancellations) | **GET** /cancellations | Fetch all cancellations
*CancellationApi* | [**getCancellation**](docs/CancellationApi.md#getCancellation) | **GET** /cancellations/{cancellationId} | Get cancellation by ID
*CustomerApi* | [**addCustomer**](docs/CustomerApi.md#addCustomer) | **POST** /customers | Add a new customer
*CustomerApi* | [**editCustomer**](docs/CustomerApi.md#editCustomer) | **PUT** /customers/{customerId} | Edit customer details
*CustomerApi* | [**fetchAllCustomers**](docs/CustomerApi.md#fetchAllCustomers) | **GET** /customers | Fetch all customers
*CustomerApi* | [**getCustomer**](docs/CustomerApi.md#getCustomer) | **GET** /customers/{customerId} | Get customer by ID
*PaymentApi* | [**addPayment**](docs/PaymentApi.md#addPayment) | **POST** /payments | Add a new payment
*PaymentApi* | [**fetchAllPayments**](docs/PaymentApi.md#fetchAllPayments) | **GET** /payments | Fetch all payments
*PaymentApi* | [**getPayment**](docs/PaymentApi.md#getPayment) | **GET** /payments/{paymentId} | Get payment by ID
*PlanApi* | [**addPlan**](docs/PlanApi.md#addPlan) | **POST** /plans | Add a new plan
*PlanApi* | [**editPlan**](docs/PlanApi.md#editPlan) | **PUT** /plans/{planId} | Edit a plan&#39;s details
*PlanApi* | [**fetchAllPlans**](docs/PlanApi.md#fetchAllPlans) | **GET** /plans | Fetch all plans
*PlanApi* | [**getPlan**](docs/PlanApi.md#getPlan) | **GET** /plans/{planId} | Get a plan by ID
*ProductApi* | [**addProduct**](docs/ProductApi.md#addProduct) | **POST** /products | Add a new product
*ProductApi* | [**editProduct**](docs/ProductApi.md#editProduct) | **PUT** /products/{productId} | Edit product details
*ProductApi* | [**fetchAllProducts**](docs/ProductApi.md#fetchAllProducts) | **GET** /products | Fetch all products
*ProductApi* | [**getProduct**](docs/ProductApi.md#getProduct) | **GET** /products/{productId} | Get product by ID
*RedemptionApi* | [**addRedemption**](docs/RedemptionApi.md#addRedemption) | **POST** /redemptions | Create a new redemption request for a plan
*RedemptionApi* | [**editRedemption**](docs/RedemptionApi.md#editRedemption) | **PUT** /redemptions/{redemptionId} | Edit a redemption request for a plan
*RedemptionApi* | [**fetchAllRedemptions**](docs/RedemptionApi.md#fetchAllRedemptions) | **GET** /redemptions | Fetch all redemption requests
*RedemptionApi* | [**getRedemption**](docs/RedemptionApi.md#getRedemption) | **GET** /redemptions/{redemptionId} | Get a redemption request by ID
*SchemeApi* | [**addScheme**](docs/SchemeApi.md#addScheme) | **POST** /schemes | Add a new scheme
*SchemeApi* | [**editScheme**](docs/SchemeApi.md#editScheme) | **PUT** /schemes/{schemeId} | Edit scheme details
*SchemeApi* | [**fetchAllSchemes**](docs/SchemeApi.md#fetchAllSchemes) | **GET** /schemes | Fetch all schemes
*SchemeApi* | [**getScheme**](docs/SchemeApi.md#getScheme) | **GET** /schemes/{schemeId} | Get scheme by ID


## Documentation for Models

 - [Cancellation](docs/Cancellation.md)
 - [Customer](docs/Customer.md)
 - [Payment](docs/Payment.md)
 - [Plan](docs/Plan.md)
 - [PlanCustomer](docs/PlanCustomer.md)
 - [PlanProduct](docs/PlanProduct.md)
 - [PlanScheme](docs/PlanScheme.md)
 - [Product](docs/Product.md)
 - [Redemption](docs/Redemption.md)
 - [Scheme](docs/Scheme.md)
 - [SchemeRedemptionOption](docs/SchemeRedemptionOption.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### tortoise_merchant_apiKey

- **Type**: API key
- **API key parameter name**: X-TORTOISE-KEY
- **Location**: HTTP header

### tortoise_merchant_appId

- **Type**: API key
- **API key parameter name**: X-TORTOISE-ID
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

developer@tortoise.pro

