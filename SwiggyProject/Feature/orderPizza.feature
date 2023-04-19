Feature: a user should be able to order Pizza from Swiggy
@pizza
Scenario: Order Pizza From Swiggy
Given a user is on the home of Swiggy

And he Enters location as "<city>"
And he selects first location from suggested location in suggestion-box
And he redirects to ItemPage
And he hover over search icon
And He Enters Item as "Garlic Bread"
And he select first suggested Item in pizza cateogory
And he searchs resturant and select first restaurant
And he click on checkout button
Then the page title should be Secure Checkout


Examples: 
|city|
|Mumbai|


