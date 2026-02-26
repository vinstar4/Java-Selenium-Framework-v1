package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {

        // Path of Excel file
        String path = ".\\testData\\Opencart_LoginData.xlsx";

        // Create ExcelUtility object
        ExcelUtility xlutil = new ExcelUtility(path);

        // Get row and column counts
        int totalrows = xlutil.getRowCount("Sheet1");
        int totalcols = xlutil.getCellCount("Sheet1", 1);

        // Create 2D array to store data
        String logindata[][] = new String[totalrows][totalcols];

        // Read data from Excel
        for (int i = 1; i <= totalrows; i++) {       // rows
            for (int j = 0; j < totalcols; j++) {    // columns
                logindata[i - 1][j] = xlutil.getCellData("Sheet1", i, j);
            }
        }

        return logindata;
    }
}
