# IBM_CloudFunction_Action
Integration between  Watson Assistance solution dialog with IBM FaaS(CloudFunction action)

To make a call from Dialog node to CloudFunction for getting News Headlines

## Skill News Dialog node

## Following {name: You Have to define Cloud Function Endpoint}

"output": {
    "generic": []
  },
  "actions": [
    {
      "name": "/XYZ/hello-world/helloworld",
      "type": "server",
      "parameters": {
        "news": "<? input.text ?>"
      },
      "credentials": "$my_creds",
      "result_variable": "my_result"
    }
  ]
}

