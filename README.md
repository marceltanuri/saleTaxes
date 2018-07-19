# saleTaxes

Application writen for the purpose of Liferay Coding Problem.
This is a simple Java Application which has its main method in the App.java.

This eclipse project is ready to be easily imported. But depending on your IDE version, you may have to set up the JUnit 5 libs in your build path.

It was followed the business rules underneath:
* Basic sales tax is applicable at a rate of 10% on all goods, except books, food, and medical products that are exempt. Import duty is
an additional sales tax applicable on all imported goods at a rate of 5%, with no exemptions.
* When I purchase items, I receive a receipt which lists the name of all the items and their price (including tax), finishing with the total
cost of the items, and the total amounts of sales taxes paid. The rounding rules for sales tax are that for a tax rate of n%, a shelf price
of p contains (np/100 rounded up to the nearest 0.05) amount of sales tax
