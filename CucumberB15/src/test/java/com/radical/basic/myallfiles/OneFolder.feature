Feature: Facebook login

As a fb user, i want to enter usename and pwd as a parameter

Scenario: validate fb login Scenario1
Given the user is on facebook login page
When he enters "Yogesh" as user name
And he enters " pwd" as password
Then check username is present in testbox
