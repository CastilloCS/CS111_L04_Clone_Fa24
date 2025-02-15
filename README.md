# Lab 04 - DACA + Typecasting

_Learning Objective: demonstrate an understanding of typecasting + choosing data types and application to DACA article._

[Article on DACA Recipients and Taxes](https://www.nbcnews.com/news/latino/daca-recipients-12-states-pay-over-50-million-taxes-report-n1053041)

As you read in this week's article, DACA recipients contribute massively to our economy which includes paying taxes. There are humanistic, ethical, and social reasons for supporting DACA in addition to realistic pathways to citizenship. The article, however, focused on the economic reasons, so your team would like for you to calculate and output:

- Average DACA recipient tax contribution
- Average DACA recipient tax contribution, rounded down to the nearest whole dollar
- State with the most DACA recipients

However, there are some decisions that were made in the backend system that you have no control over. You've been instructed to stick to the same data types, and have your code adjust appropriately. The database that this data will come from stores data in the following ways:

- State abbreviations (ex: _NY_) are stored as two separate characters, each lower-case (ex: _n_ and _y_)
- Number of DACA recipients is stored as a whole number
- Total federal tax contribution stored as a whole number

**_[Discuss with your partner what justifiable reasoning behind this decision could be, we'll discuss as a class during the debrief]_**

They are expecting output similar to:
```
Average DACA-recipient Tax Contribution: $85714.28571428571
Rounded down to nearest whole dollar: $85714
State with most DACA recipients: CA
```
**Testing tip:**

- Each line ends with the value request, in the above order
- Not testing the actual value
- The state must be capitalized (ex: NY, NV, etc.)
- No blank lines between outputs (see above)

**Java tip:**

- Having an issue with storing an integer outside of the `int` range? Use a larger data type for integers, make sure to use `L` right after the number so that Java recognizes it as a larger integer type. Example: `123456789012L`

# **!!!HACKER CHALLENGE!!!**

Formatting on the average tax contribution looks bad right? So many values after the decimal! With what we've covered in the course so far, upgrade your code to only show 2 places after the decimal.

