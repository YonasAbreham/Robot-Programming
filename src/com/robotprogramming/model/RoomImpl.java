package com.robotprogramming.model;

import java.awt.*;

public class RoomImpl implements IRoom {
    Point startPosition;

    public RoomImpl() {
    }

    @Override
    public Point getStartPosition() {
        return startPosition;
    }

    @Override
    public boolean contains(Point position) {
        return false;
    }
}
