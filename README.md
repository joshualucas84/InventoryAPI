# InventoryAPI
How to run
##
```shell
./gradlew clean bootRun

localhost:8080/swaggerui.html
```

- List the quantity of items per warehouse given a particular model ID

- List the model name and quantity given an optional warehouse identifier of a specified part category

- Given a quantity, model ID, store ID and optional warehouse ID, reserve a quantity of items of a particular model for a particular store (i.e., take it out of available inventory)

- Request an email notification (given a store email address) when an item of a requested model arrives at a warehouse.
