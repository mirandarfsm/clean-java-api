package org.example.adapters;

import org.example.controllers.AccountController;
import org.example.controllers.Response;

import spark.Route;

public class SparkAdapter {

    private SparkAdapter() {
        throw new IllegalStateException("Utility class");
    }

    public static Route adaptPost(AccountController accountController) {
        return (req, res) -> {
            String token = req.params("token");
            Response response = accountController.add(token);
            res.status(response.getStatus());
            res.body(response.getBody());
            return res.body();
        };
    }

    public static Route adaptGet(AccountController accountController) {
        return (req, res) -> {
            Response response = accountController.getByToken(req.queryParams("token"));
            res.status(response.getStatus());
            res.body(response.getBody());
            return res.body();
        };
    }
}
