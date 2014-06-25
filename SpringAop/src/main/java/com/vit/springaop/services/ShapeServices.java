/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vit.springaop.services;

import com.vit.springaop.model.Circle;
import com.vit.springaop.model.Triangle;

/**
 *
 * @author sujitl
 */
public class ShapeServices {

    private Circle circle;
    private Triangle triangle;

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

}
