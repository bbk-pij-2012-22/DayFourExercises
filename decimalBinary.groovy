println "Please enter an integer number to convert to binary: "
String str = System.console().readLine()
int userEntry = Integer.parseInt(str)
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
println decimal2binary(userEntry)
  