package org.example;

import static spark.Spark.get;

import org.example.rest.spark.AccountSpark;

public class CleanJavaApi {
    public static void main(String[] args) {
        AccountSpark.startAccount();
    }
}
