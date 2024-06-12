import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;


import static org.example.Class3.readLinesFromFile;
import static org.example.Class3.addPlusToStrings;
import static org.example.Class3.caesarCipherStrings;
import static org.example.Class3.joinAndReverse;

public class Class33 {

    @Test(groups = "Class3")
    public void testreadLinesFromFile() throws IOException {
        // Arrange
        String filePath = "UU.txt";
        String[] expectedResult = new String[]{"Салам Алекум"};
        // Act
        String[] actualResult = readLinesFromFile(filePath);
        // Assert
        Assert.assertEquals(actualResult, expectedResult, "The actual result array does not match the expected result.");
    }

    @Test(groups = "Class3")
    public void testaddPlusToStrings() throws IOException {
        // Arrange
        String filePath = "UU.txt";
        String[] expectedResult = new String[]{"С+а+л+а+м+ +А+л+е+к+у+м+"};
        // Act
        String[] actualResult = addPlusToStrings(readLinesFromFile(filePath));
        // Assert
        Assert.assertEquals(actualResult, expectedResult, "The actual result array does not match the expected result.");
    }

    @Test(groups = "Class3")
    public void testcaesarCipherStrings() throws IOException {
        // Arrange
        String filePath = "UU.txt";
        String[] expectedResult = new String[]{"Jsdse Sdxcle"};
        // Act
        String[] actualResult = caesarCipherStrings(readLinesFromFile(filePath));
        // Assert
        Assert.assertEquals(actualResult, expectedResult, "The actual result array does not match the expected result.");
    }

    @Test(groups = "Class3")
    public void testjoinAndReverse() throws IOException {
        // Arrange
        String filePath = "UU.txt";
        String[] expectedResult = new String[]{"мукелА малаС"};
        // Act
        String[] actualResult = new String[]{joinAndReverse(readLinesFromFile(filePath))};
        // Assert
        Assert.assertEquals(actualResult, expectedResult, "The actual result array does not match the expected result.");
    }


}
