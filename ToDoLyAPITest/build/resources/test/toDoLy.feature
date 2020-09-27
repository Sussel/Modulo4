Feature: Items

  @apiTest
  Scenario: As a user I want to create a item so my task is organized

    Given I have authentication to todo.ly

    When I send POST request 'api/items.json' with json
    """
    {
      "Content": "New Item"
    }
    """

    # response verification
    Then I expected the response code 200
    And I expected the response body is equal
    """
    {
      "Id": EXCLUDE,
      "Content": "New Item",
      "ItemType": 1,
      "Checked": false,
      "ProjectId": null,
      "ParentId": null,
      "Path": "",
      "Collapsed": false,
      "DateString": null,
      "DateStringPriority": 0,
      "DueDate": "EXCLUDE",
      "Recurrence": null,
      "ItemOrder": EXCLUDE,
      "Priority": 4,
      "LastSyncedDateTime": "EXCLUDE",
      "Children": [],
      "DueDateTime": EXCLUDE,
      "CreatedDate": "EXCLUDE",
      "LastCheckedDate": EXCLUDE,
      "LastUpdatedDate": "EXCLUDE",
      "Deleted": false,
      "Notes": "",
      "InHistory": false,
      "SyncClientCreationId": null,
      "DueTimeSpecified": true,
      "OwnerId": 676077
    }
    """


    And I get the property value 'Id' and save on ID_ITEM
    And I get the property value 'Checked' and save on ITEM_CHECKED

    When I send PUT request 'api/items/ID_ITEM.json' with json
    """
    {
      "Checked": true
    }
    """

    # response verification

    Then I expected the response code 200
    And I expected the response body is equal
    """
    {
      "Id": ID_ITEM,
      "Content": "New Item",
      "ItemType": 1,
      "Checked": true,
      "ProjectId": null,
      "ParentId": null,
      "Path": "",
      "Collapsed": false,
      "DateString": null,
      "DateStringPriority": 0,
      "DueDate": "EXCLUDE",
      "Recurrence": null,
      "ItemOrder": EXCLUDE,
      "Priority": 4,
      "LastSyncedDateTime": "EXCLUDE",
      "Children": [],
      "DueDateTime": EXCLUDE,
      "CreatedDate": "EXCLUDE",
      "LastCheckedDate": "EXCLUDE",
      "LastUpdatedDate": "EXCLUDE",
      "Deleted": false,
      "Notes": "",
      "InHistory": true,
      "SyncClientCreationId": null,
      "DueTimeSpecified": true,
      "OwnerId": 676077
    }
    """

    When I send DELETE request 'api/items/ID_ITEM.json' with json
    """
    """

    # response verification
    Then I expected the response code 200


    When I send GET request 'api/items/ID_ITEM.json' with json
    """
    """

    # response verification
    Then I expected the response code 200
    And I expected the response body is equal
    """
    {
      "Id": ID_ITEM,
      "Content": "New Item",
      "ItemType": 1,
      "Checked": true,
      "ProjectId": null,
      "ParentId": null,
      "Path": "",
      "Collapsed": false,
      "DateString": null,
      "DateStringPriority": 0,
      "DueDate": "EXCLUDE",
      "Recurrence": null,
      "ItemOrder": EXCLUDE,
      "Priority": 4,
      "LastSyncedDateTime": "EXCLUDE",
      "Children": [],
      "DueDateTime": EXCLUDE,
      "CreatedDate": "EXCLUDE",
      "LastCheckedDate": "EXCLUDE",
      "LastUpdatedDate": "EXCLUDE",
      "Deleted": true,
      "Notes": "",
      "InHistory": true,
      "SyncClientCreationId": null,
      "DueTimeSpecified": true,
      "OwnerId": 676077
    }
    """

