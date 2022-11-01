package builder;

import builder.classes.JobPosition;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        JobPosition jobPosition = new JobPosition.Builder(LocalDate.of(2021, 10, 20), "FullStackDeveloper", true).location("Rambam 12, TLV").salaryCap(20.0).build();
        System.out.print(jobPosition.toString());
    }
}
