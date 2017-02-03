package app;

import pluralsight.fourth_module.Meeting;

public class MeetingDemo {
    public static void main(String[] args) {
        Meeting meeting = new Meeting("Programming");

        meeting.setLocation("London");
        meeting.description = "some description";

        System.out.println(String.format("The meeting with topic %s is held in %s", meeting.getTitle(), meeting.getLocation()));

        System.out.println(Meeting.APP_VERSION);
    }
}
