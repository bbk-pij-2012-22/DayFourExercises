

println "Please enter the total amount borrowed: "
String s = System.console().readLine()
double borrowed = Double.parseDouble(s)
println "Please enter the interest rate: "
s = System.console().readLine()
double interestRate = Double.parseDouble(s)
println "Please enter the number of years of the mortgage: "
s = System.console().readLine()
double noYears = Double.parseDouble(s)


    double total(double n, double x)
    {
        double totRepay = n * (1 + (x/100))
        return totRepay
    }

    double yearly(double n, double x, double y)
    {
        double totRepay =  n * (1 + (x/100))
        double yearlyPayment = n/y
        return yearlyPayment
    }

    double yearsTilCapital(double n, double x)
    {
     double totRepay = n * (1 + (x/100))
     double interest = total() - n
     double yearsOfInterest = interest / yearly()
     return yearsOfInterest
     }


 boolean finished = false
 while (!finished)
 {
     println "What would you like to do?"
     println "1 = calculate total owed"
     println "2 = calculate yearly payment"
     println "3 = calculate years until only capital remains."
     String str = System.console().readLine()
     int userEntry = Integer.parseInt(str)
     switch (userEntry)
     {
     case 1: finished = true
         double  x = total(borrowed, interestRate)
         println "You owe £" + x
         println "Thank you for using the program."
         break;
     case 2: finished = true
         double x = yearly(borrowed, interestRate, noYears)
         println "You will pay £" + x + "each year."
     case 3: finished = true
         int x = yearsTilCapital(borrowed, interestRate) 
         println "There are " + x + "until the interest is paid off."
     default: println "That is not a valid option."
     }
 }
 