Feature: Add Vehicle To Queue With Plate Number
  As a user of the toll lane system
  I want to add a vehicle to the queue with its plate number
  So that the vehicle can be processed by the system

  Scenario Outline: Add a vehicle to the queue successfully
    Given the toll lane system is running
    When I add a vehicle to the queue with the following details <axesNumber>, <axesDistance>, <weight1>, <weight2>, <totalWeight>, <vehicleType>, <plateNo>, <plateLetters>, <date>, <hashcode>
    Then the response message should be "Data submitted successfully!"

    Examples:
      | axesNumber | axesDistance | weight1 | weight2 | totalWeight | vehicleType | plateNo | plateLetters | date        | hashcode           |
      | 10         | 50           | 1500    | 2300    | 40000       | 2           | "0943"  |  "ب أ ر"     | 1717063192  | "EDFVSEGFYHTWEFRB" |
      | 8          | 40           | 1200    | 2000    | 30000       | 3           | "5678"  |  "ر ه ب"     | 1717063200  | "EDFVSEGFYHTWEFRc" |
      | 500        | 2000         | 1200    | 2000    | 30000       | 4           | "5678"  |  "ص ض خ"     | 1717063200  | "EDFVS"            |
