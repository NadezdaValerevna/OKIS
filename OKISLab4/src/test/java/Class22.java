import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.example.Class2.readFirstLineFromFile;
import static org.example.Class2.reverseWords;
import static org.example.Class2.camelCaseToSnakeCase;
import static org.example.Class2.removeVowels;
import static org.example.Class2. generateAnagram;

public class Class22 {

    @Test(groups = "Class2")
    public static void testreadFirstLineFromFile() throws IOException {
        //arange
        String filePath = "UU.txt";
        String expectedResult = "Салам Алекум";
        String str = readFirstLineFromFile(filePath);
        //act
        String actualResult;
        actualResult = str;
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "Class2")
    public static void testreverseWords() throws IOException {
        //arange
        String filePath = "UU.txt";
        String expectedResult = "малаС мукелА";
        String str = reverseWords(readFirstLineFromFile(filePath));
        //act
        String actualResult;
        actualResult = str;
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "Class2")
    public static void testremoveVowels() throws IOException {
        //arange
        String filePath = "UU.txt";
        String expectedResult = "Слм лкм";
        String str = removeVowels(readFirstLineFromFile(filePath));
        //act
        String actualResult;
        actualResult = str;
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "Class2")
    public static void testcamelCaseToSnakeCase() throws IOException {
        //arange
        String filePath = "UU.txt";
        String expectedResult = "салам алекум";
        String str = camelCaseToSnakeCase(readFirstLineFromFile(filePath));
        //act
        String actualResult;
        actualResult = str;
        //assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(groups = "Class2")
    public static void testgenerateAnagram() throws IOException {
        //arange
        String inputString = "Юдд345"; //лам Алекум
        //List<Character> expectedChars = List.of(new Character[]{'С', 'a', 'л', 'а', 'м', ' ', 'А', 'л', 'е', 'к', 'у', 'м'});
        Object[] expectedChars = new Character[]{'Ю', 'д', 'ш', '3', '4', '5'}; //, 'a', 'л', 'а', 'м', ' ', 'А', 'л', 'е', 'к', 'у', 'м'
        //List<Character> inputChars = inputString.chars().mapToObj(c -> (char) c).toList();

        //act
        String actualResult = generateAnagram(inputString);
        //List<Character> actualChars = actualResult.chars().mapToObj(c -> (char) c).toList();
        Object[] actualChars = actualResult.chars().mapToObj(c -> (char) c).toArray();

        //assert
        //Assert.assertNotEquals(actualResult, inputString);
        Assert.assertEqualsNoOrder(actualChars, expectedChars);

    }

}
