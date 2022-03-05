package org.example.rest.spark;

import static spark.Spark.get;
import static spark.Spark.post;

import org.example.adapters.SparkAdapter;
import org.example.factories.controllers.AccountControllerFactory;

public class AccountSpark {

    private AccountSpark() {
        throw new IllegalStateException("Utility class");
    }

    public static void startAccount() {
        post("/", SparkAdapter.adaptPost(AccountControllerFactory.makeAccountController()));
        get("/", SparkAdapter.adaptGet(AccountControllerFactory.makeAccountController()));
    }

}
