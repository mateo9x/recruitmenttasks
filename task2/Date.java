package com.mateo9x;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Date {
        final String DATE_FORMAT = "dd-MM-yyyy";
        private String date;
        private String year;
        private int yearNumber;

        private void enterData() {
            System.out.println("Enter date. Correct format is: dd-mm-yyyy");
            System.out.println("Only years between 2001-2099 will be accepted");
            Scanner dateScan = new Scanner(System.in);
            date = dateScan.nextLine();
        }


        private void checkDate() {
            try {
                DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
                dateFormat.setLenient(false);
                dateFormat.parse(date);
            } catch (ParseException e) {
                throw new IllegalArgumentException("Wrong format of date!");
            }
            year = date.substring(6, 10);
            yearNumber = Integer.parseInt(year);
            if (yearNumber < 2001 || yearNumber > 2099) {
                throw new IllegalArgumentException("Wrong year!");
            }
            System.out.println("Date: " + date + " is correct.");
        }


        private void analyzeDate() {
            while (true) {
                enterData();
                try {
                    checkDate();
                    break;
                } catch (IllegalArgumentException exception) {
                    System.out.println("Incorrect date! Enter date again.");
                }
            }
        }

        public void startCheck() {
            analyzeDate();
        }
    }
