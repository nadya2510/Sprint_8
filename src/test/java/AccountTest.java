import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Description;



@RunWith(Parameterized.class)
public class AccountTest {
    private String name;
    private boolean checkOut;

    public AccountTest(String name, boolean checkOut) {
        this.name = name;
        this.checkOut = checkOut;
    }

    @Parameterized.Parameters
    public static Object[][] getAccountTest() {
        //Тестовые данные
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {" ТимотиШаламе", false},
                {"ТимотиШаламе ", false},
                {" ТимотиШаламе ", false},
                {" Тимоти Шаламе ", false},
                {"ТимотиШаламе", false},
                {" ", false},
                {"Т", false},
                {"Ти", false},
                {"Т и", true},
                {"Т им", true},
                {"Тимоти Шаламеууууу", true},
                {"Тимоти Шаламеууууун", true},
                {"Тимоти Шаламеуууууну", false},
        };
    }

    @Test
    @DisplayName("Check create order status code")
    @Description("Code test create order")
    public void checkOrdersCreateTest() {
        Account account = new Account(name);
        boolean checkActual = account.checkNameToEmboss();
        assertEquals("Ожидается:" + checkOut, checkOut, checkActual);
    }
}
