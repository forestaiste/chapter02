package com.forest.chapter02.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Forest on 4/26/2016.
 */
public interface Controller {
    String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
