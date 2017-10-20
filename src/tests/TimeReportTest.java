package tests;

import org.testng.annotations.Test;
import pages.EmployeesLogin;

public class TimeReportTest extends Main {
    @Test
    public void timeReport(){
        EmployeesLogin employeesLogin = new EmployeesLogin();
        employeesLogin.loginN()
                       .mondayReport();






        }


    }
