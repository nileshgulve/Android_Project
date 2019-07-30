package com.example.android.myquiz;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NG on 10/9/2017.
 */


    public class QuestionBank {

        // declare list of Question objects
        List<Question> list = new ArrayList<>();
        MyDataBaseHelper myDataBaseHelper;

        // method returns number of questions in list
        public int getLength() {
            return list.size();
        }

        // method returns question from list based on list index
        public String getQuestion(int a) {
            return list.get(a).getQuestion();
        }

        // method return a single multiple choice item for question based on list index,
        // based on number of multiple choice item in the list - 1, 2, 3 or 4
        // as an argument
        public String getChoice(int index, int num) {
            return list.get(index).getChoice(num - 1);
        }

        //  method returns correct answer for the question based on list index
        public String getCorrectAnswer(int a) {
            return list.get(a).getAnswer();
        }


        public void initQuestions(Context context) {
            myDataBaseHelper = new MyDataBaseHelper(context);
            list = myDataBaseHelper.getAllQuestionsList();//get questions/choices/answers from database

            if (list.isEmpty()) {//if list is empty, populate database with default questions/choices/answers
                myDataBaseHelper.addInitialQuestion(new Question("When did Google acquire Android ?",
                        new String[]{"2001", "2003", "2004", "2005"}, "2005"));
                myDataBaseHelper.addInitialQuestion(new Question("Whose trademark is the operating system UNIX?",
                        new String[]{"Motorola", "Microsoft", "BELL Laboratories", "AshtonTate"}, "BELL Laboratories"));
                myDataBaseHelper.addInitialQuestion(new Question("India’s first super computer is",
                        new String[]{"Agni", "Flow solverr", "Param", "Trisul"}, "Param"));
                myDataBaseHelper.addInitialQuestion(new Question("Who is considered to be The Father of Artificial Intelligence?",
                        new String[]{"Alan Turingt", "John McCarthy", "George Boole", "Allen Newell"}, "John McCarthy"));
                myDataBaseHelper.addInitialQuestion(new Question("A ......is approximately a million bytes.",
                        new String[]{"Kilobyte", "Terabyte", "Gigabyte", "Megabyte"}, "Megabyte"));
                myDataBaseHelper.addInitialQuestion(new Question("Which of the following has the smallest storage capacity ?",
                        new String[]{"data catridge", "zip disk", "hard disk", "floppy disk"}, "floppy disk"));
                myDataBaseHelper.addInitialQuestion(new Question("What is the full form of URL ?",
                        new String[]{"Uniform Reserve Loction", "Uniform Resource Locator", "Uniform Resolution Location", "United Resource Locator"}, "Uniform Resource Locator"));;
                myDataBaseHelper.addInitialQuestion(new Question("Don't be evil is the tag line of....",
                        new String[]{"Facebook", "Instagram", "Google", "Microsoft"}, "Google"));
                myDataBaseHelper.addInitialQuestion(new Question("What is the extension of PDF?",
                        new String[]{"Portable document format", "Portable disk feature", "Potable document floppy", "Portable data format"}, "Portable document format"));
                myDataBaseHelper.addInitialQuestion(new Question("Longhorn was the code name of ?",
                        new String[]{"Windows Xp", "Linux", "Microsoft", "Windos Vista"}, "Windos Vista"));
                myDataBaseHelper.addInitialQuestion(new Question("Whose motto is wisdom of mass principle?",
                        new String[]{"Facebook", "Quora", "Wikipedia", "Google"}, "Wikipedia"));
                myDataBaseHelper.addInitialQuestion(new Question("Which IT company's nickname is ' The Big Blue '",
                        new String[]{"IBM", "Facebook", "Infosys", "Google"}, "IBM"));
                myDataBaseHelper.addInitialQuestion(new Question("MS-DOS is the name of a/an",
                        new String[]{"Application software", "Hardware", "System software", "None of These"}, "System software"));
                myDataBaseHelper.addInitialQuestion(new Question("Which day is celebrated as world Computer Literacy Day?",
                        new String[]{"December 2", "February 2", "December 22", "November 2"}, "December 2"));
                myDataBaseHelper.addInitialQuestion(new Question("The fathers of the Internet is",
                        new String[]{"Tim Berners-Lee", "Charles Babbage", "Jack Smith ", "Vint Cerf"}, "Vint Cerf"));


                list = myDataBaseHelper.getAllQuestionsList();//get list from database again

            }
        }


    }


