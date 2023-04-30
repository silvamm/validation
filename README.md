# Validation Example



* Validação de requisições em REST API
* Criação de validações customizadas
* Criação tratamento de exceções global
* Adição de mensagens customizadas
* Validação de objetos complexos
* Disparo manual de validações 



```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── validation
│   │   │               ├── api
│   │   │               │   └── controller
│   │   │               │       ├── AnythingController.java
│   │   │               │       ├── params
│   │   │               │       │   └── AnythingGetParams.java
│   │   │               │       └── request
│   │   │               │           ├── AnythingPostRequest.java
│   │   │               │           └── ObjectInsidePostRequest.java
│   │   │               ├── config
│   │   │               │   ├── exception
│   │   │               │   │   ├── custom
│   │   │               │   │   │   └── CustomException.java
│   │   │               │   │   ├── handlers
│   │   │               │   │   │   ├── AnotherWayGlobalHandlerException.java
│   │   │               │   │   │   └── GlobalHandlerException.java
│   │   │               │   │   └── messages
│   │   │               │   │       ├── FieldErrorsMessage.java
│   │   │               │   │       └── StandardErrorMessage.java
│   │   │               │   └── validation
│   │   │               │       ├── SecretNumberValidator.java
│   │   │               │       └── ValidSecretNumber.java
│   │   │               └── ValidationApplication.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── messages.properties

```
