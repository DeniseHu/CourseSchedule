package com.example.courseschedule;

import java.util.ArrayList;

public class courseProvider {
    private String id,weeks,lecture,lab, lecturetopics, labtopics;

    public courseProvider(String id,String weeks, String lecture, String lab, String lecturetopics, String labtopics){

        this.weeks = weeks;
        this.lecture = lecture;
        this.lab = lab;
        this.lecturetopics = lecturetopics;
        this.labtopics = labtopics;

    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getWeeks() {
        return weeks;
    }

    public void setWeeks(String weeks) {
        this.weeks = weeks;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public String getLab() {
        return lab;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public String getLecturetopics() {
        return lecturetopics;
    }

    public void setLecturetopics(String lecturetopics) {
        this.lecturetopics = lecturetopics;
    }

    public String getLabtopics() {
        return labtopics;
    }

    public void setLabtopics(String labtopics) {
        this.labtopics = labtopics;
    }

    public static ArrayList<courseProvider> getCourseInformation(){
        ArrayList<courseProvider> course = new ArrayList<>();
        course.add(new courseProvider("cp1","Week 1: 18 February", "Lecture","Lab", "Introduction & Android Fundamentals","Android Studio, Git & App basics"));
        course.add(new courseProvider("cp2","Week 2: 25 February","Lecture", "Lab", "Activities, Lifecycle & Intents", "Activities & Intents"));
        course.add(new courseProvider("cp3","Week 3: 4 March", "Lecture", "Lab", "Layouts & UI", "Designing a UI"));
        course.add(new courseProvider("cp4", "Week 4: 11 March", "Lecture", "Lab", "Lists & Adapters", "Displaying Items in a List"));
        course.add(new courseProvider("cp5", "Week5: 18 March", "Lecture", "Lab", "Fragments & Multi-layout Apps", "Fragments for Multi-layout Apps"));
        course.add(new courseProvider("cp6","Week 6: 25 March", "Lecture", "Lab", "APIs, Permissions & Libraries", "APIs & JSON"));
        course.add(new courseProvider("cp7", "Week 7: 1 April", "Lecture", "Lab", "Networking", "Networking"));
        course.add(new courseProvider("co8", "Week 8: 8 April", "Lecture", "Lab", "Threads & Async Tasks", "Async Tasks"));
        course.add(new courseProvider("cp9", "Week 9: 15 April", "Lecture", "Lab", "Data Saving", "Database"));
        course.add(new courseProvider("cp10", "Week 10: 22 April", "Lecture", "Lab", "Outlook & Course Summary", "Revision"));

        return course;
    }

}
