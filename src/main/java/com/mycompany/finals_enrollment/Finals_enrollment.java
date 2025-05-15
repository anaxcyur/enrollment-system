/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finals_enrollment;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.Timer;

/**
 *
 * @author aname
 */
public class Finals_enrollment {
    // professors
    public static ArrayList<String> username = new ArrayList<String>();
    public static ArrayList<String> name = new ArrayList<String>();
    public static ArrayList<String> password = new ArrayList<String>();
    public static ArrayList<String> teach = new ArrayList<String>();
    public static String previousFrame = "";
    
        static {
        username.add("maria");
        password.add("rachel");
        name.add("maria");
        teach.add("BS Information Technology");
        
        username.add("imissyou");
        password.add("iloveyou");
        name.add("John Smith");
        teach.add("BS Nursing");
        
        username.add("caratdeul");
        password.add("seventeen");
        name.add("Joshua Hong");
        teach.add("BS Psychology");
    }
    
    // Student
    public static ArrayList<String> username1 = new ArrayList<String>();
    public static ArrayList<String> name1 = new ArrayList<String>();
    public static ArrayList<String> password1 = new ArrayList<String>();
    public static ArrayList<String> year = new ArrayList<String>();
    public static ArrayList<String> term = new ArrayList<String>();
    public static ArrayList<String> section = new ArrayList<String>();
    public static ArrayList<String> course = new ArrayList<String>();
    public static ArrayList<String> records = new ArrayList<>();
    
    static {
        username1.add("scoops");
        password1.add("leader123");
        name1.add("S.Coups");
        year.add("1st");
        term.add("2nd");
        section.add("401IT");
        course.add("BS Information Technology");
        
        username1.add("jeonghan");
        password1.add("angelhair");
        name1.add("Jeonghan");
        year.add("1st");
        term.add("2nd");
        section.add("401IT");
        course.add("BS Information Technology");
        
        username1.add("joshua");
        password1.add("gentleman");
        name1.add("Joshua");
        year.add("1st");
        term.add("2nd");
        section.add("401IT");
        course.add("BS Information Technology");
        
        username1.add("junhui");
        password1.add("china1");
        name1.add("Jun");
        year.add("1st");
        term.add("2nd");
        section.add("401IT");
        course.add("BS Information Technology");
        
        username1.add("hoshi");
        password1.add("tiger10");
        name1.add("Hoshi");
        year.add("1st");
        term.add("2nd");
        section.add("401IT");
        course.add("BS Information Technology");
    }
    
    //ATTEMPTS & TIMER
    public static int adminAttempts = 3;
    public static Timer adminTimer;
    public static int studentAttempts = 3;
    public static Timer studentTimer;
    public static int professorAttempts = 3;
    public static Timer professorTimer;
    
    //subjects for BSIT
    
        ArrayList<String> BSIT_1_1 = new ArrayList<>(Arrays.asList(
        "Understanding the Self",
        "Purposive Communication",
        "Mathematics in the Modern World",
        "Science, Technology and Society",
        "Fundamentals of Programming",
        "Computer Fundamentals and Office Productivity Tools",
        "Physical Education 1",
        "NSTP 1"
    ));

        ArrayList<String> BSIT_1_2 = new ArrayList<>(Arrays.asList(
        "Readings in Philippine History",
        "The Contemporary World",
        "Programming 2 (Object-Oriented Programming)",
        "Discrete Mathematics",
        "Data Structures and Algorithms",
        "Human-Computer Interaction",
        "Physical Education 2",
        "NSTP 2"
    ));

        ArrayList<String> BSIT_2_1 = new ArrayList<>(Arrays.asList(
        "Web Systems and Technologies",
        "Information Management (Database Systems 1)",
        "Operating Systems",
        "System Integration and Architecture",
        "Ethics",
        "Science, Technology, and Society",
        "Physical Education 3"
    ));

        ArrayList<String> BSIT_2_2 = new ArrayList<>(Arrays.asList(
        "Object-Oriented Programming",
        "Data Structures and Algorithms",
        "Human-Computer Interaction",
        "Networking 1 (Fundamentals of Networking)",
        "Integrative Programming and Technologies 1",
        "Readings in Philippine History",
        "Physical Education 4",
        "National Service Training Program 2 (NSTP 2)"
    ));
        ArrayList<String> BSIT_3_1 = new ArrayList<>(Arrays.asList(
        "Information Assurance and Security",
        "Web Systems and Technologies",
        "IT Elective 1",
        "Application Development and Emerging Technologies",
        "Integrative Programming and Technologies 1",
        "Technopreneurship",
        "Science, Technology, and Society",
        "Capstone Project 1"
    ));
        ArrayList<String> BSIT_3_2 = new ArrayList<>(Arrays.asList(
        "Multimedia Systems",
        "Systems Integration and Architecture",
        "IT Elective 2",
        "Capstone Project 2",
        "Mobile Application Development",
        "Ethics",
        "Advanced Database Systems"
    ));
        ArrayList<String> BSIT_4_1 = new ArrayList<>(Arrays.asList(
        "Internship / On-the-Job Training (OJT)",
        "Emerging Technologies",
        "Technopreneurship",
        "IT Elective 3",
        "Human-Computer Interaction"
    ));
        ArrayList<String> BSIT_4_2 = new ArrayList<>(Arrays.asList(
        "Capstone Project 2",
        "IT Elective 4",
        "Systems Integration and Architecture",
        "Cybersecurity and Risk Management",
        "Ethics in the IT Profession"
    ));

        // subjects for BS Nursing
        
        ArrayList<String> BSN_1_1 = new ArrayList<>(Arrays.asList(
        "Understanding the Self",
        "Biochemistry",
        "Anatomy and Physiology 1",
        "Health Assessment",
        "Theoretical Foundations in Nursing",
        "Komunikasyon sa Akademikong Filipino",
        "Physical Education 1",
        "NSTP 1"
    ));

    ArrayList<String> BSN_1_2 = new ArrayList<>(Arrays.asList(
        "Reading in Philippine History",
        "Anatomy and Physiology 2",
        "Microbiology and Parasitology",
        "Fundamentals of Nursing Practice",
        "Nursing Informatics",
        "The Contemporary World",
        "Physical Education 2",
        "NSTP 2"
    ));
    
    ArrayList<String> BSN_2_1 = new ArrayList<>(Arrays.asList(
        "Community Health Nursing 1",
        "Nutrition and Diet Therapy",
        "Pharmacology 1",
        "Pathophysiology",
        "Health Education",
        "Purposive Communication",
        "Physical Education 3"
    ));

    ArrayList<String> BSN_2_2 = new ArrayList<>(Arrays.asList(
        "Community Health Nursing 2",
        "Pharmacology 2",
        "Care of Mother, Child, and Adolescent (Well Clients)",
        "Ethics",
        "Mathematics in the Modern World",
        "Physical Education 4"
    ));
    
        ArrayList<String> BSN_3_1 = new ArrayList<>(Arrays.asList(
        "Care of Mother, Child, and Adolescent (At-risk or with Problems)",
        "Care of Clients with Problems in Oxygenation, Fluid and Electrolyte Balance, and Metabolism",
        "Nursing Research 1",
        "Leadership and Management in Nursing 1",
        "Science, Technology and Society"
    ));

    ArrayList<String> BSN_3_2 = new ArrayList<>(Arrays.asList(
        "Care of Clients with Maladaptive Patterns of Behavior",
        "Care of Clients with Problems in Inflammatory and Immunologic Responses, Cellular Aberrations, Acute Biologic Crisis",
        "Nursing Research 2",
        "Leadership and Management in Nursing 2",
        "Art Appreciation"
    ));
    
    ArrayList<String> BSN_4_1 = new ArrayList<>(Arrays.asList(
        "Intensive Nursing Practicum 1",
        "Professional Adjustment",
        "Legal Aspects in Nursing",
        "Comprehensive Nursing Review 1"
    ));

    ArrayList<String> BSN_4_2 = new ArrayList<>(Arrays.asList(
        "Intensive Nursing Practicum 2",
        "Comprehensive Nursing Review 2",
        "Final Nursing Competency Appraisal",
        "Pre-Board Examination"
    ));
    
    // subjects for BS Psych
    
    ArrayList<String> PSYCH_1_1 = new ArrayList<>(Arrays.asList(
        "Understanding the Self",
        "General Psychology",
        "Biological Psychology",
        "Academic Writing 1 / Purposive Communication",
        "Mathematics in the Modern World",
        "Introduction to Philosophy / Ethics",
        "Physical Education 1",
        "NSTP 1"
    ));

    ArrayList<String> PSYCH_1_2 = new ArrayList<>(Arrays.asList(
        "The Contemporary World",
        "Psychological Statistics",
        "Developmental Psychology",
        "Experimental Psychology",
        "Readings in Philippine History",
        "Computer Applications in Psychology",
        "Physical Education 2",
        "NSTP 2"
    ));

    ArrayList<String> PSYCH_2_1 = new ArrayList<>(Arrays.asList(
        "Cognitive Psychology",
        "Abnormal Psychology",
        "Filipino Psychology (Sikolohiyang Pilipino)",
        "Social Psychology",
        "Theories of Personality",
        "Physical Education 3",
        "Science, Technology and Society"
    ));

    ArrayList<String> PSYCH_2_2 = new ArrayList<>(Arrays.asList(
        "Industrial/Organizational Psychology",
        "Psychological Assessment 1",
        "Research in Psychology 1",
        "Psychopharmacology",
        "Culture and Psychology",
        "Physical Education 4"
    ));

    ArrayList<String> PSYCH_3_1 = new ArrayList<>(Arrays.asList(
        "Research in Psychology 2",
        "Psychological Assessment 2",
        "Clinical Psychology",
        "Educational Psychology",
        "Health Psychology",
        "Capstone Project 1",
        "Introduction to Counseling"
    ));

    ArrayList<String> PSYCH_3_2 = new ArrayList<>(Arrays.asList(
        "Seminar in Current Issues in Psychology",
        "Environmental Psychology",
        "Group Dynamics",
        "Forensic Psychology",
        "Capstone Project 2",
        "Field Methods in Psychology"
    ));

    ArrayList<String> PSYCH_4_1 = new ArrayList<>(Arrays.asList(
        "Practicum / Internship in Psychology 1",
        "Professional Ethics in Psychology",
        "Organizational Behavior",
        "Advanced Topics in Psychology"
    ));

    ArrayList<String> PSYCH_4_2 = new ArrayList<>(Arrays.asList(
        "Practicum / Internship in Psychology 2",
        "Board Exam Review",
        "Comprehensive Examination",
        "Licensure Exam Preparation"
    ));



    public static void main(String[] args) {
        System.out.println("Hi");
    }
}
