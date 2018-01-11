**Program Description**

The program will take in a list of orders for theater seats.

**Execution steps: 

1. Open command line and iterate through ~/theaterSeat/
2. Type "javac theaterdata\*.java theaterseat\*.java theatersearch\*.java" to compile the program
3. Type "jar cfm theaterseat.jar manifest.txt theaterdata theaterseat theatersearch” to make jar file
3. Type "java -jar theaterseat.jar” to execute the program
4. The program will indicate the path of the output file 

** Sample input&output

Sample input: 
  6 6  
  
  
  3 5 5 3 
  
  
  
  4 6 6 4 
  
  
  2 8 8 2 
  
  
  
  6 6 

Smith 2 Jones 5 Davis 6 Wilson 100 Johnson 3 Williams 4 Brown 8 Miller 12

Sample output:

Smith Row 1 Section 1 Jones Row 2 Section 2 Davis Row 1 Section 2 Wilson Sorry, we can't handle your party. Johnson Row 2 Section 1 Williams Row 1 Section 1 Brown Row 4 Section 2 Miller Call to split party.
