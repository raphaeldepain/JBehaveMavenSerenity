Narrative:
As a user
I want to make an operation
So that I can get the result of two numbers

Scenario: scenario addition
Given a Calculator Class with the operation sign as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|+|2|5|7|

Scenario: scenario substraction
Given a Calculator Class with the operation sign as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|-|7|5|2|

Scenario: scenario multiplication
Given a Calculator Class with the operation sign as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|*|2|5|10|

Scenario: scenario division
Given a Calculator Class with the operation sign as <sign>
When I give the first number as <number1>
And I give the second number as <number2>
Then I should get the result as <result>

Examples:
|sign|number1|number2|result|
|/|20|5|4|