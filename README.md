# Transport Ticket Booking System - COCOMO Cost Estimation

## Project Description

This project calculates the software development effort, development
time, average team size, and total development cost using the
Basic COCOMO model.

## COCOMO Model

The project is considered an Organic type project.

### Formulas

Effort = 2.4 × (KLOC)^1.05

Development Time = 2.5 × (Effort)^0.38

Average Staff = Effort / Development Time

Total Cost = Effort × Cost per Person-Month

## Example

Input:

KLOC = 10

Cost per Person-Month = ₹50,000

Output:

Effort = 26.94 Person-Months
Development Time = 8.91 Months
Average Staff = 3.02 Persons
Total Development Cost = ₹13,47,000

## Technology Used

- Java
- Basic COCOMO Model

## How to Run

1. Install Java JDK.
2. Open the project folder in VS Code or IntelliJ IDEA.
3. Compile the program:

```bash
javac COCOMO.java
