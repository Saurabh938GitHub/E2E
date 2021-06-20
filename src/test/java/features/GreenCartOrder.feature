Feature: To automate the flow of placing order on GreenKart website

@GreenCart1
Scenario: User selects the vegetables from landing page
When User lands on landing page
And User selects the vegetable
And User lands on cart page to place order
And User selects the country and agrees to terms
Then User gets the confirmation
