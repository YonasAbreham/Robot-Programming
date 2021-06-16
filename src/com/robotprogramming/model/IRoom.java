package com.robotprogramming.model;

public interface IRoom {
    java.awt.Point getStartPosition();
    boolean contains(java.awt.Point position);
}
