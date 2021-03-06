package com.example.assigment1.assigment.controller;

import com.example.assigment1.assigment.entity.Food;
import com.example.assigment1.assigment.repository.JpaRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListFoodServlet extends HttpServlet {
    private JpaRepository<Food> repository = new JpaRepository<>(Food.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Food> list = repository.findAll();
        req.setAttribute("product", list);
        req.getRequestDispatcher("/admin/ListFood.jsp").forward(req,resp);
    }
}
