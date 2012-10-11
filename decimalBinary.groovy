
int decimal2binary(int decimal)
{
def binaryResult = []
Integer power = 0
int result1 = 0
boolean finished = false
    while (!finished)
        {
        boolean divisible = true
        boolean running = true
        for (int y = 0; divisible; y++) 
            {
            if (decimal / 2**y  < 1)
                {
                power = y - 1
                divisible = false
                }
            }
        decimal = decimal - 2**power
        binaryResult.add(1)
        for (int x = (power -1); running ; x--)
            {
            if (2**x > decimal)
                {
                binaryResult.add(0)
                }
            else if (2**x <= decimal)
                {
                binaryResult.add(1)
                decimal = decimal - 2**x
                }
            if (x == 0)
                {
                running = false
                }
            }
        String result = binaryResult.join()
        result1 = Integer.parseInt(result)
        finished = true
        }
return result1;
}  
int binary2decimal(String str)
{
int decimalTotal = 0
int y = 0
for (x = str.length() - 1; x >= 0; x--)
    {
        String char1 = str.charAt(x)
        int int1 = Integer.parseInt(char1)
        if ((x == str.length() - 1) && (int1 == 1))
            {
            decimalTotal = decimalTotal + 1
            }
           else if (int1 == 1)
                {
                decimalTotal = decimalTotal + (1*(2**(y)))
                }
         y++;
    }
 return decimalTotal;
 }

 boolean exit = false
 while (!exit)
     { 
        println "Please choose from the following options...."
        println "To enter a decimal number and output the binary equivilent, enter 1."
        println "To enter a binary number and output its decimal equivilent, enter 2."
        println "To exit the program, enter 0."
        String userOption = System.console().readLine()
        int option = Integer.parseInt(userOption) 
        switch(option)
            {
            case 1: println "Please enter the decimal that you would like to convert: "
                 String s = System.console().readLine()
                 int D2B = Integer.parseInt(s)
                 int D2Bresult = decimal2binary(D2B)
                 println D2Bresult
                 break;
            case 2: println "Please enter the binary number that you would like convert: "
                 String s = System.console().readLine()
                 int B2Dresult = binary2decimal(s)
                 println B2Dresult
                 break;
            case 0: println "Exiting program...."
                 exit = true
                 break;
            default: println "That is an invalid choice. Please choose from the following options...."
                  println = "To enter a decimal number and output the binary equivilent, enter 1."
                  println = "To enter a binary number and output its decimal equivilent, enter 2."
                  println = "To exit the program, enter 3."
            }
    }
     