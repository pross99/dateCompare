package calculater;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.Scanner;

@Controller
public class MyController {
    @GetMapping("/date")
    @ResponseBody

    public String date(){
        Date date = new Date();
        Scanner input = new Scanner(System.in);
        //date.diff.getYears() + date.diff.getMonths() + date.diff.getDays()
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2021,02,23);
        return "There are" +  date.findDifference(startDate,endDate) + " days between the two dates";
    }

}
