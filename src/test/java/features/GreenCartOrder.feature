Feature: To automate the flow of placing order on GreenKart website

Background:
When User lands on landing page

@GreenCart1
Scenario: User selects the vegetables from landing page
And User selects the vegetable1
And User lands on cart page to place order
And User selects the country and agrees to terms
Then User gets the confirmation

@GreenCart2
Scenario: User selects the vegetables from landing page
And User selects the vegetable2
And User lands on cart page to place order
And User selects the country and agrees to terms
Then User gets the confirmation