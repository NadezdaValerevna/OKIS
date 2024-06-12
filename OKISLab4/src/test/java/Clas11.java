import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;
import static org.example.Class1.IntegersFromFile;
import static org.example.Class1.doubleValue;
import static org.example.Class1.factorial;
import static org.example.Class1.reverseDigits;
import static org.example.Class1.isPrime;


public class Clas11 {

    @Test(groups = "Class1")
    public static void testIntegersFromFile() {
        //arange
        String filePath = "VV";
        int expectedResult = 5;
        List<Integer> integers = IntegersFromFile(filePath);
        //act
        int actualResult;
        int number = 0;
        for (Integer integer : integers) {
            number = integer;
        }
        actualResult = number;
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "Class1")
    public static void testdoubleValue() {
        //arange
        String filePath = "VV";
        List<Integer> integers = IntegersFromFile(filePath);
        int expectedResult = 10;
        //act
        int actualResult;
        int number = 0;
        for (Integer integer : integers) {
            number = integer;
        }
        actualResult = doubleValue(number);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "Class1")
    public static void testfactorial() {
        //arange
        String filePath = "VV";
        List<Integer> integers = IntegersFromFile(filePath);
        int expectedResult = 120;
        //act
        int actualResult;
        int number = 0;
        for (Integer integer : integers) {
            number = integer;
        }
        actualResult = factorial(number);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(groups = "Class1")
    public static void testreverseDigits() {
        //arange
        String filePath = "VV";
        List<Integer> integers = IntegersFromFile(filePath);
        int expectedResult = 5;
        //act
        int actualResult;
        int number = 0;
        for (Integer integer : integers) {
            number = integer;
        }
        actualResult = reverseDigits(number);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(groups = "Class1")
    public static void testisPrime() {
        //arrange
        String filePath = "VV";
        List<Integer> integers = IntegersFromFile(filePath);
        boolean False;
        boolean expectedResult = Boolean.parseBoolean("True");
        boolean actualResult;
        int number = 0;
        //act
        for (Integer integer : integers) {
            number = integer;
        }
        actualResult = isPrime(number);
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    
}
