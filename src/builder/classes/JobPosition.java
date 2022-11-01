package builder.classes;

import java.time.LocalDate;

public class JobPosition {
    private final LocalDate publishedDate;
    private final String title;
    private final boolean isRemote;
    private String description;
    private String location;
    private double salaryCap;
    private double yearsExperienceRequired;

    public static class Builder {
        //Required Parameters
        private final LocalDate publishedDate;
        private final String title;
        private final boolean isRemote;

        //Optional Parameters
        private String description = "description01";
        private String location = "Haifa,Street 15";
        private double salaryCap = 18.50;
        private double yearsExperienceRequired = 1.5;

        public Builder(LocalDate publishedDate, String title, boolean isRemote) {
            this.publishedDate = publishedDate;
            this.title = title;
            this.isRemote = isRemote;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder salaryCap(double salaryCap) {
            this.salaryCap = salaryCap;
            return this;
        }

        public Builder yearsExperienceRequired(double yearsExperienceRequired) {
            this.yearsExperienceRequired = yearsExperienceRequired;
            return this;
        }


        public JobPosition build() {
            return new JobPosition(this);
        }
    }

    private JobPosition(Builder builder) {
        this.publishedDate = builder.publishedDate;
        this.title = builder.title;
        this.isRemote = builder.isRemote;
        this.description = builder.description;
        this.location = builder.location;
        this.salaryCap = builder.salaryCap;
        this.yearsExperienceRequired = builder.yearsExperienceRequired;
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "publishedDate=" + publishedDate +
                ", title='" + title + '\'' +
                ", isRemote=" + isRemote +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", salaryCap=" + salaryCap +
                ", yearsExperienceRequired=" + yearsExperienceRequired +
                '}';
    }
}
